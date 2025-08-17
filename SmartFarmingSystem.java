/*
 * VILLOCINO NESMARK A.
 * CSC 104 JKUV1
 */
abstract class Makina {
    protected String makinaID;

    public Makina(String makinaID) {
        this.makinaID = makinaID;
    }

    public abstract void kontrolar(String ORAS);

    public void status() {
        System.out.println("Makina " + makinaID + " is ready.");
    }
}


class Traktora extends Makina {

    public Traktora(String makinaID) {
        super(makinaID);
    }

    public void kontrolar(String ORAS) {
        if (ORAS.equalsIgnoreCase("morning")) {
            System.out.println("Ang Traktora " + makinaID + " kay nagsugod na ug lihok buntag sayo.");
        } else if (ORAS.equalsIgnoreCase("afternoon")) {
            System.out.println("Ang Traktora " + makinaID + " kay nagsugod na ug panghipos kay hapon na.");
        } else {
            System.out.println("Ang Traktora " + makinaID + " kay nagpahulay na.");
        }
    }
}


class SprayerDrone extends Makina {

    public SprayerDrone(String makinaID) {
        super(makinaID);
    }

    public void kontrolar(String ORAS) {
        if (ORAS.equalsIgnoreCase("evening")) {
            System.out.println("Ang SprayerDrone " + makinaID + " kay gihunong na ang operasyon kay gabii na.");
        } else {
            System.out.println("During " + ORAS +" ang SprayerDrone " + makinaID + " kay nagsugod na ug pang-spray sa tanom.");
        }
    }
}


// FarmScheduler class
class FarmScheduler {

    public void activateMachine(Makina m, String ORAS) {
        m.status();
        m.kontrolar(ORAS);
        System.out.println();
    }
}


// Main class
public class SmartFarmingSystem {

    public static void main(String[] args) {
        FarmScheduler scheduler = new FarmScheduler();

        Makina makina1 = new Traktora("ID-0001");
        Makina makina2 = new SprayerDrone("ID-0002");

        scheduler.activateMachine(makina1, "morning");
        scheduler.activateMachine(makina2, "morning");

        scheduler.activateMachine(makina1, "afternoon");
        scheduler.activateMachine(makina2, "afternoon");

        scheduler.activateMachine(makina1, "evening");
        scheduler.activateMachine(makina2, "evening");
    }
}
