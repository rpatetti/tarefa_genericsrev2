package exercicio_modulo_17rev2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> carros = new ArrayList<>();

        Carro carro1 = new GM("Onix");
        Carro carro2 = new Honda("Civic");

        carros.add(carro1);
        carros.add(carro2);

        for (Carro carro : carros) {
            System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
            carro.acelerar();
        }
    }
}


