//Este problema foi resolvido utilizando Herança e Polimorfismo.
//Apesar de não serem estritamente padrões de projeto, e sim padrões de orientação a objetos,
//Além de serem conceitos vistos em sala, eles cumprem os requisitos deste exercicio,
//enquanto outro patterns adicionariam complexidade desnecessaria.
//O código permite tratar todos os tipos de transporte de forma genérica, como pedido.
//Além dos exemplos dado no exercicio (terrestre e aerea), foi adicionado transporte aquatico para provar o 
//funcionamento.

public class App {
    public static void main(String[] args) throws Exception {
        CalculadoraTarifa calcTerrestre = new Terrestre();
        Frete freteTerrestre = new Frete(calcTerrestre);
        System.out.println("Custo Terrestre: " + freteTerrestre.calcularCustoFinal(30));

        CalculadoraTarifa calcAerea = new Aerea();
        Frete freteAereo = new Frete(calcAerea);
        System.out.println("Custo Aereo: " + freteAereo.calcularCustoFinal(200));

        CalculadoraTarifa calcAquatica = new Aquatica();
        Frete freteAquatico = new Frete(calcAquatica);
        System.out.println("Custo Aquatico: " + freteAquatico.calcularCustoFinal(500));
    }
}
