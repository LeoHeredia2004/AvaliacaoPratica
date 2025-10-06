public class ProcessarBoleto implements ProcessadorPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento boleto: " + valor);
    }
}
