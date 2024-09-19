package test;

import dominio.ContaBancaria;
import dominio.Pessoa;
import dominio.Tenis;
import dominio.TipoPagamento;

public class PagamentoTest {
    public static void main(String[] args) {
        Pessoa cliente = new Pessoa("João Pedro", 22);
        ContaBancaria contaBancaria = new ContaBancaria(cliente);
        Tenis tenis = new Tenis(cliente, "Air Jordan", 1500, TipoPagamento.CREDITO);

        contaBancaria.abrirConta(123456, 171201);
        contaBancaria.imprime();
        System.out.println("---------------------------------");
        tenis.imprime();
        System.out.println(TipoPagamento.CREDITO.jurosParcela(tenis.getValor()));
        tenis.parcelas();

        System.out.println("---------------------------------");

        Pessoa cliente1 = new Pessoa("Nicoli", 19);
        ContaBancaria contaBancaria1 = new ContaBancaria(cliente1);
        Tenis tenis1 = new Tenis(cliente1, "Vert", 650, TipoPagamento.DEBITO);

        contaBancaria1.abrirConta(987654, 150505);
        contaBancaria1.imprime();
        System.out.println("---------------------------------");
        tenis1.imprime();
        tenis1.parcelas();

        System.out.println("---------------------------------");
        Pessoa cliente2 = new Pessoa("Lucas", 17);
        ContaBancaria contaBancaria2 = new ContaBancaria(cliente2);
        Tenis tenis2 = new Tenis(cliente2, "Air Force", 700, TipoPagamento.PIX);

        contaBancaria2.abrirConta(147258, 123789);
        contaBancaria2.imprime();
        System.out.println("---------------------------------");
        tenis2.imprime();
        System.out.println(TipoPagamento.PIX.descontoPagamento(tenis2.getValor()));
        tenis2.parcelas();
    }
}
