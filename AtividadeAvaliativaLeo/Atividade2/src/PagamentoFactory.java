public class PagamentoFactory {
    
    public static ProcessadorPagamento fabricarProcessador(String tipo){
        if(tipo.equalsIgnoreCase("pix")){
            return new ProcessarPix();
        }else if(tipo.equalsIgnoreCase("credito")){
            return new ProcessarCredito();
        }else if(tipo.equalsIgnoreCase("boleto")){
            return new ProcessarBoleto();
        }

        throw new IllegalArgumentException("Forma de pagamento invalido");
    }

}
