package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class fabrica {
    public static void main(String[] args) {
        Impressora testeImpressora1 = new Deskjet();
        testeImpressora1.imprimir(); // IMPRIMINDO DESKJET...

        Impressora testeImpressora2 = new Laserjet();
        testeImpressora2.imprimir(); // IMPRIMINDO LASERJET...

        Impressora testeImpressora3 = new EquipamentoMultifuncional();
        testeImpressora3.imprimir(); // IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL

        //

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressoraEm = em;
        Digitalizadora digitalizadoraEm = em;
        Copiadora copiadoraEm = em;

        impressoraEm.imprimir(); // IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL
        digitalizadoraEm.digitalizar(); // DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL
        copiadoraEm.copiar(); // COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL

        //

        Deskjet deskjet = new Deskjet();
        Impressora impressoraDj = deskjet;
        // Digitalizadora digitalizadoraDj = deskjet; // da erro, pois deskjet herda somente de Impressora
        // Copiadora copiadoraDj = deskjet; // da erro, pois deskjet herda somente de Impressora

        impressoraDj.imprimir();

        //

        Scanner scanner = new Scanner();
        Digitalizadora digitalizadora = scanner;

        digitalizadora.digitalizar();

    }
}