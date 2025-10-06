//Classe extra de demonstração.

public class Aquatica extends CalculadoraTarifa {
    @Override
    public double calcularTarifa(double milhasNauticas){
        return milhasNauticas * 1.5;
    }
}
