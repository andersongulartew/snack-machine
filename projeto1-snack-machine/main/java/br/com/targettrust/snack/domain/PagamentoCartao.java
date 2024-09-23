package br.com.targettrust.snack.domain;

import java.util.Scanner;

public class PagamentoCartao extends FormaPagamento{
    @Override
    public float realizarPagamento(Float valor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero do cartão");
        Integer numero = sc.nextInt();
        System.out.println("Informe a validade do cartao");
        Integer validade = sc.nextInt();
        System.out.println("Informe a CVV");
        Integer CVV = sc.nextInt();


        System.out.println("Pagamento realizado com cartão de credito no valor de : " + valor);

        sc.close();

        return 0;
    }
}
