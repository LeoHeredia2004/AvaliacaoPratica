public class ProcessarCredito implements ProcessadorPagamento {
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento no credito: " + valor);
    }
}
