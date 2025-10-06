public class DocumentoModelo implements Cloneable {
    
    private String tipo;
    private String cores;
    private String cliente;

    public DocumentoModelo(String tipo, String cores) {
        this.tipo = tipo;
        this.cores = cores;
        this.cliente = "Cliente Padrão";
        System.out.println("Criando novo documento do ZERO: " + tipo + " com cores " + cores);
        try { Thread.sleep(500); } catch (InterruptedException e) {} 
    }

    @Override
    public DocumentoModelo clone() {
        try {
            return (DocumentoModelo) super.clone(); 
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e); 
        }
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void setCores(String cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Documento: " + tipo + ", Cliente: " + cliente + ", Cores: " + cores;
    }
}
