package br.com.targettrust.snack.domain;


import br.com.targettrust.snack.enumerations.StatusSnackMachine;

import java.util.List;

public class SnackMachine {

    private StatusSnackMachine status;
    private List<Fileira> fileiras;

    private Long numeroMaximoFileiras;

    public SnackMachine(List<Fileira> fileiras) {
        this.fileiras = fileiras;

    }

    public List<Fileira> getFileiras() {
        return fileiras;
    }

    public void setFileiras(List<Fileira> fileiras) {
        this.fileiras = fileiras;
    }


    @Override
    public String toString() {
        return "SnackMachine{" +
                "fileiras=" + fileiras +
                ", status=" + status +
                ", numeroMaximoFileiras=" + numeroMaximoFileiras +
                '}';
    }
}


