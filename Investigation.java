public class Investigation {

    private Suspect[] suspects;

     private int actualCulpritId = 5;

     private int attempts = 0;

     private final int MAX_ATTEMPTS = 3;

     public Investigation(Suspect[] suspects) {
        this.suspects = suspects;
    }

     public Suspect searchSuspect(int suspectId) {

        for (Suspect suspect : suspects) {

            if (suspect.suspectId == suspectId) {
                return suspect;
            }
        }

        return null;
    }

     public void investigateSuspect(int suspectId) {

        Suspect suspect = searchSuspect(suspectId);

        if (suspect == null) {
            System.out.println("Suspect ID not found.");
            return;
        }

        System.out.println("\n===== SUSPECT INVESTIGATION =====");
        suspect.displayDetails();
    }

     public void accuseSuspect(int suspectId) {

        if (attempts >= MAX_ATTEMPTS) {
            System.out.println("INVESTIGATION FAILED!");
            System.out.println("You have used all three attempts.");
            System.out.println("The culprit escaped.");
            return;
        }

        attempts++;

        Suspect accused = searchSuspect(suspectId);

        if (accused == null) {
            System.out.println("Invalid suspect ID.");
            return;
        }

        System.out.println("\nYou accused: " + accused.name);

        if (suspectId == actualCulpritId) {

            System.out.println("\nCASE SOLVED!");
            System.out.println("You identified the culprit.");
            System.out.println("The missing question paper has been recovered.");

             attempts = MAX_ATTEMPTS;

        } else {

            System.out.println("Incorrect accusation.");
            System.out.println("Attempts remaining: "
                    + (MAX_ATTEMPTS - attempts));

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("\nINVESTIGATION FAILED!");
                System.out.println("You have used all three attempts.");
                System.out.println("The culprit escaped.");
            }
        }
    }
}
