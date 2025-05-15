/* Nama File : MySQLPersonDAO.java 
  Deskripsi : Implementasi PersonDAO untuk MySQL
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 15/05/2025
*/
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo", "root", "");

        // Kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Tutup koneksi database
        con.close();
    }
}
