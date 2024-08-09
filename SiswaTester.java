//Driver class

package Siswa;

public class SiswaTester {
    public static void main(String[] args) {
        // object
        // Class object = new constructor
        Siswa lam = new Siswa();
        Siswa zam = new Siswa();
        Siswa nibras = new Siswa();
        Siswa gus = new Siswa();
        Siswa meno = new Siswa();

        lam.id = 19;
        lam.nama = "gilam";
        lam.ipk = 100;
                
        zam.id = 22;
        zam.nama = "azzam";
        zam.ipk = 100;

        nibras.id = 29;
        nibras.nama = "ibra";
        nibras.ipk = 100;
        
        gus.id = 26;
        gus.nama = "burhan";
        gus.ipk = 100;

        meno.id = 24;
        meno.nama = "moreno";
        meno.ipk = 0;
        
        System.out.println("nama : "+lam.nama);        
        System.out.println("nomor absen : "+lam.id);
        System.out.println("nilai : "+lam.ipk);

        System.out.println("nama : "+zam.nama);
        System.out.println("nomor absen : "+zam.id);
        System.out.println("nilai : "+zam.ipk);

        System.out.println("nama : "+nibras.nama);
        System.out.println("nomor absen : "+nibras.id);
        System.out.println("nilai : "+nibras.ipk);

        System.out.println("nama : "+gus.nama);
        System.out.println("nomor absen : "+gus.id);
        System.out.println("nilai : "+gus.ipk);

        System.out.println("nama : "+meno.nama);
        System.out.println("nomor absen : "+meno.id);
        System.out.println("nilai : "+meno.ipk);
        
    }
}