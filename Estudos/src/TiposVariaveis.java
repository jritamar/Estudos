public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String nomeFuncionario = "Itamar Junior ";
        double salarioMinimo = 2500;
        double gratificacaoSalario01 = 0.15;
        double gratificacaoSalario02 = 0.20;
        double metaVenda = 100;

        if(metaVenda <= 100){
            double salarioFinal = salarioMinimo / (1 - gratificacaoSalario01);
            System.out.println("O salário de " + nomeFuncionario + "é "  + salarioFinal);
        }else{
            double salarioFinal = salarioMinimo / (1 - gratificacaoSalario02);
            System.out.println("O salário de " + nomeFuncionario + "é "  + salarioFinal);
        }                
    }
}
