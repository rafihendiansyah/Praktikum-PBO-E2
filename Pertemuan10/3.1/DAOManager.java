/* Nama File : DAOManager.java  
  Deskripsi : Pengelola DAO dalam program
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 15/05/2025
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
