/**
 * Created by HarridiIlman on 21/11/2015.
 */
public class Fasilkomers {

    private String nama;
    private String id;
    private int semester;
    private String status;

    Fasilkomers(String nama, String id, String status){
        this.nama = nama;
        this.id = id;
        semester = 1;
        this.status = status;
    }

    public void tambahSemester(){
        semester++;
    }

    public String getNama(){
        return nama;
    }


    public void getStatus() {
        String tulisStatus;
        if(status.equalsIgnoreCase("Mahasiswa")){
            if(semester > 10){
                tulisStatus = "mahasiswa abadi";
            }else if(semester > 6){
                tulisStatus = "mahasiswa tingkat akhir";
            }else{
                tulisStatus = "mahasiswa tingkat " + ((semester+1)/2);
            }
            System.out.println(nama + " adalah " + tulisStatus + " dengan NPM " + id + " semester " + semester);
        }else{
            if(semester/2 >= 5){
                tulisStatus = "guru besar";
            }else if(semester/2 >= 3){
                tulisStatus = "dosen senior";
            }else{
                tulisStatus = "dosen muda";
            }
            System.out.println(nama + " adalah " + tulisStatus + " dengan NIP " + id + " yang telah bekerja selama " + semester/2 + " tahun");
        }

    }
}
