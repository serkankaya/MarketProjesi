package market.adminpaneli;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SQLITEDB {

    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;

    private String dbName = "Marketdb.db";
    private String dbFolder = "db/";
    private String driver = "org.sqlite.JDBC";
    private String url = "jdbc:sqlite:";

    public SQLITEDB() {

    }

    public SQLITEDB(String dbName) {
        this.dbName = dbName;
    }

    public Statement baglan() {
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + dbFolder + dbName);
            st = con.createStatement();
//            System.out.println("SQLite Bağlantısı Başarılı");
        } catch (Exception e) {
            System.out.println("SQLite Bağlantısı Başarısız");
            System.out.println("hatası :" + e);
        }
        return st;
    }

    public int ekleFnc(String tblName, String[] veriler) {
        int result = 0;
        String sorgu = veriler[0];
        for (int i = 1; i < veriler.length; i++) {
            sorgu += "','" + veriler[i];
        }
        String a = "insert into " + tblName + " values(null,'" + sorgu + "')";
        try {
            result = baglan().executeUpdate(a);

        } catch (Exception e) {
            System.out.println("Ekleme Hatası : " + e);
        }
        return result;
    }

    public ResultSet dataFnc(String tblName) {
        try {
            rs = baglan().executeQuery("select * from " + tblName);
        } catch (Exception e) {
        }
        return rs;
    }
    public ResultSet stokToplamDataFnc(String tblName) {
        try {
            rs = baglan().executeQuery("select sum(satis_adedi) as stoktoplami  from " + tblName);
        } catch (Exception e) {
        }
        return rs;
    }
    public ResultSet urunSatislariToplami(String tblName) {
        try {
            rs = baglan().executeQuery("select sum(satis_fiyati) as satisfiyattoplami  from " + tblName);
        } catch (Exception e) {
        }
        return rs;
    }
    public ResultSet uruneGoreSatisToplami(String tblName) {
        try {
            rs = baglan().executeQuery("select satis_adedi*satis_fiyati  as satisfiyattoplami2  from " + tblName);
        } catch (Exception e) {
        }
        return rs;
    }
    
     public ResultSet sepetToplam(String tblName) {
        try {
            rs = baglan().executeQuery("select COUNT(SatisGunSonu.satis_id) as satistoplami from " + tblName);
        } catch (Exception e) {
        }
        return rs;
    }

    public void kapat() {
        try {
            con.close();
            st.close();

        } catch (Exception e) {
            System.err.println("Kapatma Hatası : " + e);
        }
    }

}
