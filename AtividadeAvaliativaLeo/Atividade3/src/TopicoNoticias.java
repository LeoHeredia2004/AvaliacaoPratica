import java.util.ArrayList;
import java.util.List;

public class TopicoNoticias implements Topico {
    private List<Observador> observadores;

    public TopicoNoticias(){
        this.observadores = new ArrayList<>();
    } 

    @Override
    public void registrarObservador(Observador o){
        this.observadores.add(o);
    }

    @Override
    public void removerObservador(Observador o){
        this.observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String msg){
        for(Observador o : this.observadores){
            o.atualizar(msg);
        }
    }


}
