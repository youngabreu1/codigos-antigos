public class Calculadora {

  private int numero1;
  private int numero2;

  public Calculadora() {
    this.numero1 = 1;
    this.numero2 = 1;
  }

  public Calculadora(int numero){
    this();
    this.setNumero1(numero);
  }

  public int getNumero1(){
    return this.numero1;
  }

  public void setNumero1(int n){
    if(n == 0){
      throw new Error("Numero não pode ser zero");
    }
    this.numero1 = n;
  }

  public int getNumero2(){
    return this.numero2;
  }

  public void setNumero2(int n){
    if(n == 0){
      throw new Error("Numero não pode ser zero");
    }
    this.numero2 = n;
  }

}
