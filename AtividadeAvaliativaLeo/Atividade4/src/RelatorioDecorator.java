public abstract class RelatorioDecorator implements Relatorio {
    private Relatorio relatorio;

    public RelatorioDecorator(Relatorio relatorio){
        this.relatorio= relatorio;
    }

    @Override
    public void gerarRelatorio(){
        relatorio.gerarRelatorio();
    }
    
}
