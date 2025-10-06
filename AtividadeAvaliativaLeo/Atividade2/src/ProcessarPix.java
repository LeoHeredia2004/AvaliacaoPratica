public class ProcessarPix implements ProcessadorPagamento {
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento pix: " + valor);
    }
    
}
