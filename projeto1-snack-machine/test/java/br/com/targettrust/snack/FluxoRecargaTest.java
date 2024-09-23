package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.Produto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FluxoRecargaTest {

    @Test
    void testexecutar() {
        FluxoRecarga f = new FluxoRecarga();

        try {

            List<Produto> produto = f.executar();

            assertEquals(12, produto.size());
//            Produto produto1 = produto.get(0);
//            assertEquals(Long.valueOf(10), produto1.getCodigo());
//            assertEquals("Salgadinho Ruffles", produto1.getDescricao());
//            assertEquals(Float.valueOf(2.76f), produto1.getPreco(), 0);
//            assertEquals(Long.valueOf(5), produto1.getQuantidade());
//
//            Produto produto2 = produto.get(1);
//            assertEquals(Long.valueOf(20), produto2.getCodigo());
//            assertEquals("Snack de maça", produto2.getDescricao());
//            assertEquals(Float.valueOf(1.30f), produto2.getPreco(), 0);
//            assertEquals(Long.valueOf(6), produto2.getQuantidade());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}