public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        double gratificacaoSalario = 0.15;

        double salarioFinal = salarioMinimo / (1 - gratificacaoSalario);
        
        System.out.println(salarioFinal);
    }
}
