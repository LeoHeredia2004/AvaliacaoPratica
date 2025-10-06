//O método escolhido para esse exercicio foi o catory method
//Pois através da facotry, podemors criar os diferentes tipos de processadores de pagamento
//Sem ter conhecimento direto de cada um individualmente
//Apenas da facotry e da interface.

public class App {
    public static void main(String[] args) throws Exception {
        
        ProcessadorPagamento procCartao = PagamentoFactory.fabricarProcessador("CREDITO");
        procCartao.processarPagamento(500.0);
            
        ProcessadorPagamento procPIX = PagamentoFactory.fabricarProcessador("pix");
        procPIX.processarPagamento(120.50);

        ProcessadorPagamento procBoleto = PagamentoFactory.fabricarProcessador("boleto");
        procBoleto.processarPagamento(90.0);
            
    }
}
