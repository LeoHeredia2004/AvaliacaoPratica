public class EstatisticasDecorator extends RelatorioDecorator {
    
    public EstatisticasDecorator(Relatorio relatorio){
        super(relatorio);
    }

    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();

        System.out.println("Estatisticas: ...");
    }
}
