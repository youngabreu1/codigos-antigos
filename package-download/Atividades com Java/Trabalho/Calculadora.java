/*2. Desenvolva um classe na linguagem de programação Java com nome Calculadora que contenha 
os métodos: somar, subtrair, dividir e multiplicar. Todos os métodos devem receber dois atributos e 
imprimir o resultado da operação, conforme cada método. Todos os métodos devem ser públicos.*/
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Calculadora {
     static Scanner teclado=new Scanner(System.in);
     public static int somar(int n1, int n2){
        int res;
        res=n1+n2;
        System.out.println( "Resultado da soma: \n" + res);
        return(res);
       
    }
    public static int subtrair(int n1, int n2){
        int res;
        res=n1-n2;
        System.out.println( "Resultado da subtracao: \n" + res);
        return(res);
       
    }

    public static int multiplicar(int n1, int n2){
        int res;
        res=n1*n2;
        System.out.println( "Resultado da multiplicacao: \n" + res);
        return(res);
       
    }

    public static float dividir(int n1, int n2){
        float res;
        res=n1/n2;
        System.out.println( "Resultado da divisao: \n" + res);
        return(res);
       
    }

      public static void main(String ags[]){
        int v1,v2;
        System.out.println("Digite o primeiro numero");  
	      v1=teclado.nextInt(); 
        System.out.println("Digite o segundo numero");  
	      v2=teclado.nextInt();  
        teclado.close();
        somar(v1,v2);
        subtrair(v1,v2);
        multiplicar(v1,v2);    
        dividir(v1,v2);
     }
    
}
