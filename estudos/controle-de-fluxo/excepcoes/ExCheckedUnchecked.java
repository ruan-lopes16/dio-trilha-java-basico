package excepcoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExCheckedUnchecked {
    public static void main(String[] args) {

        // Number valor = Double.valueOf("a1.75");
        // tentando converter o valor para um numero
        // valueOf, pega uma string e transforma para um Double

        /* RuntimeExcepcion - essa excecao é algo que não precisa de preocupar em tratar
        erro pode acontecer mas não consegue validar sem antes acontecer uma vez
         */

        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            // tenta converter este valor para um Valor
        } catch (ParseException e) {
            throw new RuntimeException(e);

        }

        System.out.println(valor);
    }
}

/*
Checked e Unchecked - o fato de ao tentar usar um metodo, esse metodo determina que vc precisa tratar um erro imediatamente
RuntimeException - o erro pode acontecer mas não tratou, o erro pode ser não tão recorrente
 */