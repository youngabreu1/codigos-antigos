import java.util.Scanner;
public class Contato {
    String nome, telefone;
    int idade;
    static Scanner teclado=new Scanner(System.in);
    static public void main(String args[]){
        Contato contato = new Contato();
        System.out.println("Informe o nome de contato");  
	    contato.nome=teclado.nextLine(); 
        System.out.println("Digite o telefone de contato");  
	    contato.telefone=teclado.nextLine(); 
        System.out.println("Informe a idade do contato");  
	    contato.idade=teclado.nextInt();   
        teclado.close();
        System.out.printf("Dados do contato:\nNome: %s\nTelefone: %s\nIdade: %d\n",contato.nome, contato.telefone, contato.idade);

    }
}