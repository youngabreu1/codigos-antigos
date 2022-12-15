import java.util.Scanner;

public class Main{
   static int n1, n2;

    static Scanner teclado=new Scanner(System.in);
    public static void main(String args[]){
        Soma adicao = new Soma();
         System.out.printf( "Insira o primeiro valor: \n");
         n1=teclado.nextInt();
         System.out.printf( "Insira o segundo valor: \n");
         n2=teclado.nextInt();
          System.out.printf( "O resultado da soma é: %d\n",Soma.Adicao(n1,n2));
    }
}