public class Programer extends Pegawai{
    private double bonus;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }
    public void cetakBonus(){
        System.out.println("Bouns      : Rp.10000" + this.bonus);
    }
}
