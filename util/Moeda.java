package util;

public class Moeda {
    public double dolar;
    public double valorCompra;
    public int operacaoEscolhida;
    public static final double IOF = 0.06;

    public double valorReal(){
       return 1.0/dolar;
    }

    public String operacao(){
        if (operacaoEscolhida ==1) return "Valor, em reais, da compra é: " ;
        else return "Valor, em dólar, da compra é: ";
    }

    public double convOperacao(){
        if(operacaoEscolhida==1) return convDolarReal();
        else return convRealDolar();
    }

    public double convDolarReal(){
        return dolar*valorCompra + dolar*valorCompra*IOF;
    }

    public double convRealDolar(){
        return valorReal()*valorCompra + valorCompra*dolar*IOF;
    }

    public String toSting(){
        return "\n"
        + "Valor dólar: "
        + dolar
        +"\nValor do real: "
        + String.format("%.2f\n", valorReal())
        +"\n"
        + operacao()
        + String.format("%.2f\n", convOperacao())
        +"\n";
    }
}
