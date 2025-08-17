/*
 * VILLOCINO NESMARK A.
 * CSC 104 JKUV1
 */

 
interface RESPONDER {
    void RESPONDE(String LOKASYON);
}


class BUMBERO implements RESPONDER{
    public void RESPONDE(String LOKASYON) {
        System.out.println("Mga tawo: Tabang sunoggg!!!");
        System.out.println("Ang Bumbero kay padulong na sa " + LOKASYON + " para mupalong sa sunog.\n");
        
    }
}

class MEDIKO implements RESPONDER {
    public void RESPONDE(String LOKASYON) {
        System.out.println("Mga tawo: Tabang napaso ko!!!");
        System.out.println("Ang mga Mediko padulong  na sa " + LOKASYON + " para mutambal sa mga nasamdan.\n");
       
    }
}


class Command__Center {
    public void Dispatch_Unit(RESPONDER p, String LOKASYON) {
        p.RESPONDE(LOKASYON);
    }
}


public class Emergency_Response_System {
    public static void main(String[] args) {
        Command__Center center = new Command__Center();

        RESPONDER bumbero = new BUMBERO();
        RESPONDER mediko = new MEDIKO();

        center.Dispatch_Unit(bumbero, "Barangay 1");
        center.Dispatch_Unit(mediko, "Barangay 2");

        center.Dispatch_Unit(bumbero, "Purok 5");
        center.Dispatch_Unit(mediko, "Zone 3");
    }
}
