/*
 * VILLOCINO NESMARK A.
 * CSC 104 JKUV1
 */
class MANLALARO {
    protected String ign;

    public MANLALARO(String PANGALAN) {
        this.ign = PANGALAN;
    }

    public void MAGDUWA() {
        System.out.println("MANLALARO " + ign + " nag-andam para sa duwa...");
    }
}

class SNIPER extends MANLALARO {

    public SNIPER(String PANGALAN) {
        super(PANGALAN);
    }

    public void MAGDUWA() {
        System.out.println("Ang SNIPER nga si " + ign + " nagtago na ug nag-andam na para sa pagpamusilay...");
    }
}

class BRAWLER extends MANLALARO {

    public BRAWLER(String PANGALAN) {
        super(PANGALAN);
    }

    public void MAGDUWA() {
        System.out.println(" Ang BRAWLER nga si " + ign + " nangandam na para sa duol nga away!");
    }
}

class Tournament_Manager {

    public void simulate_Game(MANLALARO o) {
        o.MAGDUWA();
    }
}

// ----- Main class -----
public class Gaming_Tournament_System {

    public static void main(String[] args) {

        Tournament_Manager Nesmark = new Tournament_Manager();

        MANLALARO player1 = new SNIPER("NESTOR");
        MANLALARO player2 = new BRAWLER("JIXON");

        Nesmark.simulate_Game(player1);
        Nesmark.simulate_Game(player2);

        // Exchange IGN names
        String temp = player1.ign;
        player1.ign = player2.ign;
        player2.ign = temp;

        System.out.println();

        Nesmark.simulate_Game(player1);
        Nesmark.simulate_Game(player2);
    }
}
