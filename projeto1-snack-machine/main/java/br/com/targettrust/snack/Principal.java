package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.Produto;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) throws Exception {

        FluxoRecarga recarga = new FluxoRecarga();
        recarga.executar();
        List<Produto>  lista = recarga.executar();

        FluxoAtendimento atendimento = new FluxoAtendimento();
        atendimento.executar(lista);
//        atendimento.executar(recarga.executar());

    }
}
