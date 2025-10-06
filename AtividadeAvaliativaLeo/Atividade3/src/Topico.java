public interface Topico {
    void registrarObservador(Observador o);
    void removerObservador(Observador o);
    void notificarObservadores(String msg);
}
