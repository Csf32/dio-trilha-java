package POO.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
         * Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
         * 
         * modelo = gol - consumo = 14,4 km/L
         */

        System.out.println("Crie um dicionário que relacione os modelos e seus repctivos consumos:");

        Map<String, Double> carros = new HashMap<>();
        carros.put("Gol", 18.0);
        carros.put("BMW X1", 9.0);
        carros.put("Volvo xc 40", 17.2);
        carros.put("Mobi", 16.2);
        carros.put("Duster", 10.2);

        System.out.println(carros);

        System.out.println();
        System.out.println("Substitua o consumo do gol por 15,2 km/L:");
        carros.put("Gol", 15.2);
        System.out.println(carros);

        System.out.println();
        System.out.println("Confira se o modelo tucson está no dicionário: " + carros.containsKey("Tucson"));

        System.out.println();
        System.out.println("Exiba o consumo do volvo: " + carros.get("Volvo xc 40"));

        System.out.println();
        System.out.println("Exiba os modelos: " + carros.keySet());

        System.out.println();

        System.out.println("Exiba os consumos dos carros: " + carros.values());

        System.out.println();

        Double consumoEconomico = Collections.max(carros.values());

        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloEconomico = "";

        for (Map.Entry<String, Double> entry : entries) {

            if (entry.getValue().equals(consumoEconomico)) {
                modeloEconomico = entry.getKey();
                System.out.println(" O modelo mais econômico é: " + modeloEconomico + " e o consumo mais econômico é: "
                        + consumoEconomico);
            }
        }

        System.out.println();
        System.out.println("Exiba o modelo menos econômico e o seu consumo");

        Double consumoMenosEconomico = Collections.min(carros.values());

        String modeloMenosEconomico = "";

        for (Map.Entry<String, Double> entry2 : carros.entrySet()) {

            if (entry2.getValue().equals(consumoMenosEconomico)) {
                modeloMenosEconomico = entry2.getKey();
                System.out.println(" O modelo menos econômico é: " + modeloMenosEconomico
                        + " e o consumo menos econômico é: " + consumoMenosEconomico);
            }

        }

        System.out.println();
        System.out.println("Exiba a soma dos consumos");

        double somar = 0;
        for (Map.Entry<String, Double> soma : carros.entrySet()) {

            somar += soma.getValue();
        }
        System.out.println("A soma dos consumos é: " + somar + " km/L");
        System.out.println("A média dos consumos é: " + somar / carros.size() + " km/L");

        System.out.println();
        System.out.println("Remova os modelos com consumo igual a 15 km/L");

        Iterator<Double> iterator = carros.values().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(9.0)) {
                iterator.remove();
            }
        }
        System.out.println(carros);

        System.out.println();
        System.out.println("Exiba os carros na ordem em que foram informados: ");

        Map<String, Double> carros2 = new LinkedHashMap<>();
        carros.put("Gol", 18.0);
        carros.put("BMW X1", 9.0);
        carros.put("Volvo xc 40", 17.2);
        carros.put("Mobi", 16.2);
        carros.put("Duster", 10.2);

        System.out.println(carros2);

        System.out.println();
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");

        Map<String, Double> carros3 = new TreeMap<>(carros);

        System.out.println(carros3);

        System.out.println();
        System.out.println("Apague o dicionário de carros");
        carros.clear();
        System.out.println(carros);
        System.out.println("Confira se o dicionário está vazio: " + carros.isEmpty());

    }

}
