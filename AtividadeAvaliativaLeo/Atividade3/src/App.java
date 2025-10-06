//O padrão escolhido foi o Observer,
//Através desse padrão, os leitores são notificados sobre novas noticias automaticamente
//Sem que o site precise policiar cada leitor

public class App {
    public static void main(String[] args) throws Exception {
        TopicoNoticias topicoEsportes = new TopicoNoticias();

        Leitor maria = new Leitor("Maria");
        Leitor joao = new Leitor("João");
        
        topicoEsportes.registrarObservador(joao);
        topicoEsportes.registrarObservador(maria);
        
        topicoEsportes.notificarObservadores("Novo recorde mundial na maratona!");
        topicoEsportes.removerObservador(joao);
        topicoEsportes.notificarObservadores("Time local ganha campeonato!");
    }
}
