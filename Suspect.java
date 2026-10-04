
public class Suspect {
 
    String suspectId;
    String suspectName;
    String location;
    String alibi;

     public Suspect(String suspectId, String suspectName,
                   String location, String alibi) {

        this.suspectId = suspectId;
        this.suspectName = suspectName;
        this.location = location;
        this.alibi = alibi;
    }

   
    public void displayDetails() {

        System.out.println("Suspect ID: " + suspectId);
        System.out.println("Name: " + suspectName);
        System.out.println("Location: " + location);
        System.out.println("Alibi: " + alibi);
        System.out.println("--------------------");
    }

   
    public static void displayAll(Suspect[] suspects) {

        for (Suspect suspect : suspects) {
            suspect.displayDetails();
        }
    }

     public static void main(String[] args) {

        Suspect s1 = new Suspect(
            "S001", "Suriya", "Bangalore", "At home"
        );

        Suspect s2 = new Suspect(
            "S002", "Suprith", "Mysore", "At college"
        );

        Suspect s3 = new Suspect(
            "S003", "Apeksha", "Tumkur", "At a restaurant"
        );

        Suspect s4 = new Suspect(
            "S004", "Greeshma", "Bangalore", "With a friend"
        );

        Suspect s5 = new Suspect(
            "S005", "Brad Pitt", "Mandya", "Travelling"
        );

        Suspect[] suspects = {s1, s2, s3, s4, s5};

         s1.displayDetails();

         displayAll(suspects);
    }
}
