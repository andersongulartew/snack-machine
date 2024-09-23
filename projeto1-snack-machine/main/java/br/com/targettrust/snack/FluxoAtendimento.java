package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.FormaPagamento;
import br.com.targettrust.snack.domain.PagamentoCartao;
import br.com.targettrust.snack.domain.PagamentoDinheiro;
import br.com.targettrust.snack.domain.Produto;
import br.com.targettrust.snack.exceptions.ProdutoNaoEncontradoException;

import java.util.*;

public class FluxoAtendimento {

    public void executar(List<Produto>produtos) {


        System.out.println("## Fluxo de atendimento:");
        System.out.println("Informe o código do produto");

        Scanner scanner = new Scanner(System.in);
        Long codigo = scanner.nextLong();


        Optional<Produto> produto1 = produtos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst();

        Produto produtoDesejado = produto1.orElseThrow(() ->
                (new ProdutoNaoEncontradoException("Produto não encontrado")));

        System.out.println("Produto escolhido foi : "+ produtoDesejado.getDescricao()+" - Preço a pagar : "+produtoDesejado.getPreco());

        System.out.println("Qual será a forma de pagamento?");
        System.out.println("Se for cartão de crédito/débito, informe 1");
        System.out.println("Se for dinheiro, informe 2");
        int formaPagamento = scanner.nextInt();

       FormaPagamento pagamento = null;
       System.out.println("Confirme a forma de pagamento : ");
       Float pagamento1 = scanner.nextFloat();
        if (formaPagamento == 1) {
            pagamento = new PagamentoCartao();

        } else if (formaPagamento == 2) {
            pagamento = new PagamentoDinheiro();
        }
        pagamento.realizarPagamento(pagamento1);



        scanner.close();
    }


}








