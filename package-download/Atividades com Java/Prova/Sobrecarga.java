public class Sobrecarga{
    int x, y, z;
    public Sobrecarga(){
        this.x = 2;
        this.y = 3;
    }
    public Sobrecarga(int xis){
        this.y = 2;
        this.x = xis;
        this.z = this.x + this.y;
    }
    public static void main(String args[]){
        Sobrecarga overload1 = new Sobrecarga();
        Sobrecarga overload2 = new Sobrecarga(3);
        System.out.println(overload2.z);
    }
}