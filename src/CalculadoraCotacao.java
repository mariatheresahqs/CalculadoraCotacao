package src;

import java.util.Locale;
import java.util.Scanner;

import util.*;

public class CalculadoraCotacao{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Moeda moeda = new Moeda();

        System.out.println("\n-------------------------------------------------------------------\n");
        System.out.print("Digite o valor do dólar: ");
        moeda.dolar = sc.nextDouble();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Digite o número da operação que você deseja realizar: ");
        System.out.println("1. Compra baseada em um valor em dólar");
        System.out.println("2. Compra baseada em um valor em reais");
        System.out.print("Operação: ");
        moeda.operacaoEscolhida = sc.nextInt();
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Digite o valor de compra: ");
        moeda.valorCompra = sc.nextDouble();
        System.out.println("-------------------------------------------------------------------");
        System.out.print(moeda.toSting());
        
        sc.close();
    }
}