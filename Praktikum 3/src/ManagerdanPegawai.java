public class ManagerdanPegawai {
    public static void main(String[] args){
        Manager budi = new Manager();

        budi.setNama("Budi Utomo");
        budi.setGajiPokok(8000000);
        budi.cetakInfo();

        Programer agus = new Programer();
        agus.setNama("Agus Subroto");
        agus.setGajiPokok(5000000);
        agus.cetakInfo();

        
    }
}
