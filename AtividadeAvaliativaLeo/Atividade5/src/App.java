//Este exercicio foi resolvido com o model Prototype
//Permitindo a criacao de novos objetos a partir de um modelo existente.

public class App {
    public static void main(String[] args) throws Exception {
        
        DocumentoModelo modeloProposta = new DocumentoModelo("Proposta Comercial", "Azul e Cinza");

        DocumentoModelo propostaClienteA = modeloProposta.clone();
        propostaClienteA.setCliente("Tech Solutions");
        propostaClienteA.setCores("Verde e Branco");
        
        DocumentoModelo propostaClienteB = modeloProposta.clone();

        propostaClienteB.setCliente("Global Corp");
        
        System.out.println("\n--- Relatórios Finais ---");
        System.out.println(modeloProposta);
        System.out.println(propostaClienteA);
        System.out.println(propostaClienteB);
    }
}
