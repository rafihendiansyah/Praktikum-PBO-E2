/*  Nama File   : Student.java
 *  Deskripsi   : Kelas Student yang merupakan subclass dari kelas Person.
 *  Pembuat     : Rafi Althaf Hendiansyah
 *  NIM         : 24060123140158
 *  Tanggal     : 24 April 2025
 */

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public boolean isAsleep(int hr) { // override
        return 2 < hr && 8 > hr;
    }
}
