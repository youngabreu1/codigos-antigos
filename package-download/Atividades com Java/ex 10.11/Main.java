class Main{
    public static void main(String args[]){
        PessoaFisica pf = new PessoaFisica();
        pf.cpf = "157986";
        pf.idade = 19;
        pf.nome = "Gabriel";
        pf.endereco = "aquela rua la";
        System.out.printf("----Pessoa Física ----\n");
             System.out.printf("CPF: %s\n", pf.cpf);
             System.out.printf("Idade: %d\n", pf.idade);
             System.out.printf("Nome: %s\n", pf.nome);
             System.out.printf("Endereço: %s\n", pf.endereco);

        PessoaJuridica pj = new PessoaJuridica();
        pj.cnpj = "1588889";
        pj.idade = 30;
        pj.nome = "balacobaco";
        pj.endereco = "aquele trem la";

        System.out.printf("----Pessoa Juridica ----\n");

        System.out.printf("CNPJ: %s\n", pj.cnpj);
             System.out.printf("Idade: %d\n", pj.idade);
             System.out.printf("Nome: %s\n", pj.nome);
             System.out.printf("Endereço: %s\n", pj.endereco);
    }
}