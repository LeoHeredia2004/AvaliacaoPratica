public class Frete {
    private CalculadoraTarifa calculadora;
    
    public Frete(CalculadoraTarifa calculadora) {
        this.calculadora = calculadora;
    }
    
    public double calcularCustoFinal(double valor) {
        return calculadora.calcularTarifa(valor);
    }
}
