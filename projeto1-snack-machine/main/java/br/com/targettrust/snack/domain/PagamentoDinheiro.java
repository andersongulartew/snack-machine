package br.com.targettrust.snack.domain;

import java.util.Scanner;

public class PagamentoDinheiro extends FormaPagamento{
    @Override
    public float realizarPagamento(Float valor) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Insira o valor em dinheiro");
        Float valorDinheiro = sc.nextFloat();
        //System.out.println("Precisara de Troco: " );
        if(valorDinheiro >= valor){
            Float troco = valorDinheiro - valor;
            System.out.println("Pagamento realizado com sucesso, seu troco é : " + troco);
        }else{
            System.out.println("Valor Insuficiente");
        }
        sc.close();
        return 0;
    }
}
