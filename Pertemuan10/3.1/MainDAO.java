/* Nama File : MainDAO.java
  Deskripsi : Main program untuk akses DAO
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 15/05/2025
*/

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
