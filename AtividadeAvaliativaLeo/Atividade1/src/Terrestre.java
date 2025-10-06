public class Terrestre extends CalculadoraTarifa {
    @Override
    public double calcularTarifa(double kms){
        return kms * 5.0;
    }
}
