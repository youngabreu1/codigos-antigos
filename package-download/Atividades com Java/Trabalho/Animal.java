/*3. Implemente na linguagem de programação Java um classe com nomeAnimal Animal que contenha os 
atributos: espécie, nomeAnimal, raça e cor. Todos são do tipo texto (string), implemente ainda métodos 
para imprimir cada um dos atributos da classe. Defina todos como públicos.*/
import java.util.Scanner;
public class Animal{
    static Scanner teclado=new Scanner(System.in);
    String especie, nomeAnimal, raca, cor;
    public static void print(String s1, String s2, String s3, String s4){
         System.out.printf( "Especie do animal: %s \n Nome do animal: %s \n Raca do animal: %s \n Cor do animal: %s", s1, s2 ,s3, s4);
    }

    public static void main(String[] args){
        Animal animal = new Animal();
        System.out.println("\nInsira a especie do animal: "); 
        animal.especie = teclado.nextLine();
         System.out.println("\nInsira o nome do animal: "); 
        animal.nomeAnimal = teclado.nextLine();
         System.out.println("\nInsira a raca do animal: "); 
        animal.raca = teclado.nextLine();
         System.out.println("\nInsira a cor do animal: "); 
        animal.cor = teclado.nextLine();
        print(animal.especie, animal.nomeAnimal, animal.raca, animal.cor);
    }
}