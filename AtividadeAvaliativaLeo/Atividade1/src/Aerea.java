public class Aerea extends CalculadoraTarifa {
    @Override
    public double calcularTarifa(double peso){
        return peso * 10.0;
    }
}
