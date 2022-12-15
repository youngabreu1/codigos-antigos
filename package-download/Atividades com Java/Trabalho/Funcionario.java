/*Elabora uma classe na linguagem de programação Java com nomeFunc Funcionário que contenha os 
atributos públicos: nomeFunc (string), cargo (string) e salário (float). Implemente um método construtor 
para essa classe que iniciaria o salário igual a R$ 1100,00. Elabore um método que imprima na tela
todos os atributos na classe. Elabore ainda um método que retorne o salário do funcionário.*/ 
public class Funcionario{
    String nomeFunc, cargo;
    float salario;
     public static float print(String s1, String s2, float n1){
        System.out.printf("Nome: %s \nCargo: %s \nSalario: %f",s1, s2, n1);
        return(n1);
     }
    public static void main(String[] args){
    Funcionario funcionario = new Funcionario();
    funcionario.salario = 1100;
    funcionario.nomeFunc = "Gabriel Carlos";
    funcionario.cargo = "Estudante";
    print(funcionario.nomeFunc, funcionario.cargo, funcionario.salario);
    }

}