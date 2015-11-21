/**
 * Template Lab08 DDP
 */
import java.util.*;


public class Lab_08 {

    public static void semesterBaru(ArrayList<Fasilkomers> fasilkomers) {
        // TO DO: tambahkan method untuk menambahkan semester di semua object dalam Fasilkomers
        fasilkomers.forEach(Fasilkomers::tambahSemester);


    }

    public static void main(String[] args) {
        ArrayList<Fasilkomers> fasilkomers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String input = in.nextLine();
            StringTokenizer token = new StringTokenizer(input, " ");

            String command = token.nextToken();
            if (command.equalsIgnoreCase("TAMBAH_DOSEN")) {
                String nama = token.nextToken();
                String idDosen = token.nextToken();

                // TO DO: tambahkan dosen tersebut ke ArrayList fasilkomers
                fasilkomers.add(new Dosen(nama,idDosen));


                System.out.println(nama + " mulai bekerja sebagai dosen Fasilkom");
            } else if (command.equalsIgnoreCase("TAMBAH_MAHASISWA")) {
                String nama = token.nextToken();
                String idMahasiswa = token.nextToken();

                // TO DO: tambahkan mahasiswa tersebut ke ArrayList fasilkomers
                fasilkomers.add(new Mahasiswa(nama,idMahasiswa));

                System.out.println(nama + " berhasil menjadi mahasiswa Fasilkom");
            } else if (command.equalsIgnoreCase("STATUS")) {
                String nama = token.nextToken();

                // TO DO: iterasi semua dalam ArrayList Fasilkomers untuk mencari object yang dimaksud, kemudian panggil getStatus pada object tersebut
                boolean found = false;
                for (Fasilkomers mers : fasilkomers){
                    if(mers.getNama().equalsIgnoreCase(nama)) {
                        mers.getStatus();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println(nama + " tidak ditemukan");
                }


            } else if (command.equalsIgnoreCase("SEMESTER_BARU")) {
                semesterBaru(fasilkomers);
                System.out.println("Semester baru dimulai");
            }
        }
    }
}