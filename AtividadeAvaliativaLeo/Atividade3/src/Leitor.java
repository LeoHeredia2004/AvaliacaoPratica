public class Leitor implements Observador {
    public String nome;

    public Leitor(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(String msg){
        System.out.println("Noticias de " + this.nome + "Atualizadas: " + msg);
    }
}
