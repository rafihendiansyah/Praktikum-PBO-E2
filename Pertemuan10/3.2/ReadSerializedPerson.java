/* Nama File : ReadSerializedPerson.java
  Deskripsi : Program untuk membaca serialisasi objek Person
  Pembuat   : Rafi Althaf Hendiansyah / 24060123140158
  Tanggal   : 15/05/2025
*/

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;

        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();

            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
