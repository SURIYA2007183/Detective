public class Suspect {

    int suspectId;
    String name;
    String location;
    String alibi;

     public Suspect(int suspectId, String name, String location, String alibi) {
        this.suspectId = suspectId;
        this.name = name;
        this.location = location;
        this.alibi = alibi;
    }

     public void displayDetails() {
        System.out.println("ID       : " + suspectId);
        System.out.println("Name     : " + name);
        System.out.println("Location : " + location);
        System.out.println("Alibi    : " + alibi);
        System.out.println("-----------------------------");
    }

     public static Suspect[] createSuspects() {

        Suspect[] suspects = new Suspect[5];

        suspects[0] = new Suspect(
                1,
                "Apeksha",
                "Computer Lab",
                "Working on a project"
        );

        suspects[1] = new Suspect(
                2,
                "Greeshma",
                "Library",
                "Studying"
        );

        suspects[2] = new Suspect(
                3,
                "Suprith",
                "Staff Room",
                "Meeting a faculty member"
        );

        suspects[3] = new Suspect(
                4,
                "Suriya",
                "Canteen",
                "Having lunch"
        );

        suspects[4] = new Suspect(
                5,
                "Brad Pitt",
                "Department Office",
                "Collecting documents"
        );

        return suspects;
    }

     public static void displayAllSuspects(Suspect[] suspects) {

        System.out.println("\n===== ALL SUSPECTS =====");

        for (Suspect suspect : suspects) {
            suspect.displayDetails();
        }
    }
}