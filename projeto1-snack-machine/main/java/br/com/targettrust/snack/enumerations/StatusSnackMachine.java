package br.com.targettrust.snack.enumerations;

public enum StatusSnackMachine {
    DISPONIVEL("Disponivel"),EM_MANUTENCAO("Em Manutenção");

    private  String statussnack;
    StatusSnackMachine(String statussnack) {
        this.statussnack = statussnack;
    }
    public String getStatussnack() {
        return statussnack;
    }
}
