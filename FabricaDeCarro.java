package application;

import entities.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FabricaDeCarro<T> {

    List<T> galpao = new ArrayList<>();

    public void montarCarro(T Carro){
        galpao.add(Carro);
    }

    public void printar(){

        if (galpao.isEmpty()){
            throw new IllegalStateException("está vazio");
        }else {

            for (int i=0 ; i < galpao.size(); i++){
                System.out.print(galpao.get(i));
            }

        }

    }

}
