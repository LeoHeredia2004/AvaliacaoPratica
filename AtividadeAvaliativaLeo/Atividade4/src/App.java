//O padrão decrator foi o escolhido para esse exercicio
//Pois com ele podemos criar a classe base (RelatorioBase) e adicionar os "Decoradores"
//Conforme necessário.

public class App {
    public static void main(String[] args) throws Exception {
        Relatorio relatorioBase = new RelatorioBase();
        
        Relatorio relatorioA = new EstatisticasDecorator(relatorioBase);
        relatorioA.gerarRelatorio();
        System.out.println("------------------------------");
        
        Relatorio relatorioB = new GraficosDecorator(new EstatisticasDecorator(relatorioBase));
        
        relatorioB.gerarRelatorio();
    }
}
