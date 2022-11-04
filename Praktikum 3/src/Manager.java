public class Manager extends Pegawai{
    private double tunjangan;

    public void settunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    public double gettunjangan(){
        return tunjangan;
    }
    
    public void cetakTunjangan(){
        System.out.println("Tunjangan  : Rp.20000" + this.tunjangan);
    }
}

