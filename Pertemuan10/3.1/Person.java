/* Nama File : Person.java
  Deskripsi : Merepresentasikan data person
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 15/05/2025
*/

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
