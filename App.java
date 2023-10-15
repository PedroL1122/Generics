package application;

import entities.Carro;
import entities.Honda;
import entities.Mercedes;
import services.FabricaDeCarro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        FabricaDeCarro fab = new FabricaDeCarro();

        Corolla car1 = new Corolla("Altis Hybrid", "Preto", "2023");
        Honda car2 = new Honda("City", "Branco", "2021");

        fab.montarCarro(car1);

        fab.montarCarro(car2);


        fab.printar();
    }
}
