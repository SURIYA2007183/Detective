public class DetectiveGame {

    public static void main(String[] args) {

        Suspect[] suspects = Suspect.createSuspects();

        ClueManager clueManager = new ClueManager();
        Investigation investigation = new Investigation(suspects);

        int[] menuChoices = {
            1, 2, 3, 4, 5, 6
        };

        int investigateId = 3;

        int clueNumber = 4;

        int accusationId = 5;

        int choiceIndex = 0;

        boolean running = true;

        while (running && choiceIndex < menuChoices.length) {

            int choice = menuChoices[choiceIndex];

            System.out.println("\n=================================");
            System.out.println("     DETECTIVE INVESTIGATION");
            System.out.println("=================================");
            System.out.println("1. View Suspects");
            System.out.println("2. Investigate Suspect");
            System.out.println("3. Collect Clue");
            System.out.println("4. View Collected Clues");
            System.out.println("5. Accuse Suspect");
            System.out.println("6. Exit");

            System.out.println("\nSelected option: " + choice);

            switch (choice) {

                case 1:
                    Suspect.displayAllSuspects(suspects);
                    break;

                case 2:
                    System.out.println(
                            "Investigating Suspect ID: " + investigateId
                    );
                    investigation.investigateSuspect(investigateId);
                    break;

                case 3:
                    System.out.println(
                            "Collecting Clue Number: " + clueNumber
                    );
                    clueManager.displayAvailableClues();
                    clueManager.collectClue(clueNumber);
                    break;

                case 4:
                    clueManager.displayCollectedClues();
                    break;

                case 5:
                    System.out.println(
                            "Accusing Suspect ID: " + accusationId
                    );
                    investigation.accuseSuspect(accusationId);
                    break;

                case 6:
                    System.out.println("\nInvestigation terminated.");
                    System.out.println("Thank you, Detective!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }

            choiceIndex++;
        }
    }
}
