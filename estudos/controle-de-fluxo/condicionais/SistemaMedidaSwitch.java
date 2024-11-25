// estrutura switch case

public class SistemaMedidaSwitch {
    public static void main(String[] args) {

        /* Tradicional
		String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MEDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
		*/

        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break; // interrompe e sai da instrução
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default: // caso não entre em nenhum dos casos acima, vai para o método padrão
                System.out.println("INDEFINIDO");
        }
    }
}