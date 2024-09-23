package br.com.targettrust.snack.enumerations;

public enum StatusFileira {
    VAZIA("Vazia"),COM_PRODUTO("Com Produto");

   private final String statusfileira;
     StatusFileira(String statusfileira) {
        this.statusfileira = statusfileira;
    }


    public String getStatusfileira() {
         return statusfileira;
    }

}
