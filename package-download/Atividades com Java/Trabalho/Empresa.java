/* Desenvolva uma classe na linguagem de programação Java com nome Empresa com o seguinte 
atributos: nome fantasia (string e público), razão social(string string e público), cnpj(string e privado)
e faturamento (float). Elabore um método construtor que inicialize o faturamento com valor R$ 
10000,00 e o cnpj como 00.000.000-0001/00. Elabore um método que receba o cnpj e defina ele no
atributo da classe.*/

//
public class Empresa{
    public String nomeFantasia, razaoSocial;
    private String cnpj;
    float faturamento;
     static void recCnpj(String x){
         String receber = x;
    }

    public static void main(String[] args){
    Empresa empresa = new Empresa();
    empresa.faturamento = 10000;
    empresa.cnpj = "00.000.000-0001/00";
    empresa.nomeFantasia = "Doctum";
    empresa.razaoSocial = "Educacao";
    recCnpj(empresa.cnpj);
     System.out.printf("Nome da empresa: %s \nRazao social: %s\n Faturamento: %f\n CNPJ: %s\n",empresa.nomeFantasia, empresa.razaoSocial, empresa.faturamento, empresa.cnpj);

}
}