public class GraficosDecorator extends RelatorioDecorator{
    public GraficosDecorator(Relatorio relatorio){
        super(relatorio);
    }

    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();

        System.out.println("Graficos: ...");
    }
}
