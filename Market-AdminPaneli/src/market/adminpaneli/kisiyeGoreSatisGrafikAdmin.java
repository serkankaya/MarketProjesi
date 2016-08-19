package market.adminpaneli;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class kisiyeGoreSatisGrafikAdmin extends ApplicationFrame {

    /**
     * Default constructor.
     *
     * @param title the frame title.
     */
    public kisiyeGoreSatisGrafikAdmin(String title) {
        super(title);
        setContentPane(createDemoPanel());

    }

    /**
     * Creates a sample dataset.
     *
     * @return A sample dataset.
     */
    private static PieDataset createDataset() {
        ArrayList<String> satisRaporUrunID = new ArrayList<>();
        ArrayList<String> satisRaporUrunAdi = new ArrayList<String>();
        ArrayList<String> satisRaporUrun_kategori = new ArrayList<String>();
        ArrayList<String> satisRaporBarkod = new ArrayList<String>();
        ArrayList<String> satisRaporSatis_adedi = new ArrayList<String>();
        ArrayList<String> satisRaporSatanPersonelID = new ArrayList<String>();
        TreeSet<String> benzersizUrunAdi = new TreeSet();
        TreeSet<String> benzersizUrunID = new TreeSet();
        Map<String, Integer> satisRaporSatis_fiyati = new HashMap<String, Integer>();

        int ayniKisiyeAitSatisToplami = 0;
        SQLITEDB db = new SQLITEDB();
        try {

//            ResultSet rs2 = db.dataFnc("satislar");
            ResultSet rs3 = db.dataFnc("satislar");
//            while (rs2.next()) {
//                benzersizUrunAdi.add(rs2.getString("urun_adi"));
//            }
            while (rs3.next()) {
                benzersizUrunID.add(rs3.getString("urun_adi"));
            }
//            for (String kisi : benzersizUrunAdi) {
                for (String urunid : benzersizUrunID) {
                ResultSet rs = db.uruneGoreSatisToplami("satislar where satan_personel_id='" + adminPanel.raporIcınKisiSecimi.toString() + "' and urun_adi='"+urunid+"'");
                while (rs.next()) {

                    satisRaporSatis_fiyati.put(urunid, Integer.valueOf(rs.getString("satisfiyattoplami2")));

                }
                }
//            }
            db.kapat();
        } catch (Exception e) {
        }

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Integer> entrySet : satisRaporSatis_fiyati.entrySet()) {
            String isim = entrySet.getKey();
            Integer kisiyeGoreCiro = entrySet.getValue();

            System.out.println(isim + " Adlı Kişinin Satış Toplamı : " + kisiyeGoreCiro);
            String duzenlenmisIsım = isim + " : " + kisiyeGoreCiro + " TL";
            dataset.setValue(duzenlenmisIsım, new Double(kisiyeGoreCiro));
        }
        return dataset;
    }

    /**
     * Creates a chart.
     *
     * @param dataset the dataset.
     *
     * @return A chart.
     */
    private static JFreeChart createChart(PieDataset dataset) {

        JFreeChart chart = ChartFactory.createPieChart(
                adminPanel.raporIcınKisiSecimi+" Kullanıcı isimli Çalışanın Satışları(CİRO)", // chart title
                dataset, // data
                true, // include legend
                true,
                false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage(adminPanel.raporIcınKisiSecimi+" Kullanıcı isimli Çalışanın Satışı Bulunmuyor ...");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        return chart;

    }

    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     *
     * @return A panel.
     */
    public static JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

    /**
     * Starting point for the demonstration application.
     *
     * @param args ignored.
     */
    public static void main(String[] args) {
        kisiyeGoreSatisGrafikAdmin demo = new kisiyeGoreSatisGrafikAdmin("Personel Satış Raporu");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);

        demo.setVisible(true);

    }
     @Override
    public void windowClosing(final WindowEvent evt) {
        if (evt.getWindow() == this) {
            dispose();

        }
    }

}
