public class ClueManager {

    String[] clues = {
        "The office door was opened at 2:15 PM.",
        "CCTV shows someone entering the office.",
        "A torn piece of paper was found near the printer.",
        "A suspect's ID card was found inside the office.",
        "The printer was used shortly before the question paper disappeared."
    };

    boolean[] collected = new boolean[5];

    public void displayAvailableClues() {

        System.out.println("\n===== AVAILABLE CLUES =====");

        for (int i = 0; i < clues.length; i++) {

            if (!collected[i]) {
                System.out.println((i + 1) + ". " + clues[i]);
            }
        }
    }

    public void collectClue(int clueNumber) {

        if (clueNumber < 1 || clueNumber > clues.length) {
            System.out.println("Invalid clue number.");
            return;
        }

        int index = clueNumber - 1;

        if (collected[index]) {
            System.out.println("Clue " + clueNumber + " has already been collected.");
            return;
        }

        collected[index] = true;

        System.out.println("Clue collected successfully!");
        System.out.println("Clue " + clueNumber + ": " + clues[index]);
    }

    public void displayCollectedClues() {

        System.out.println("\n===== COLLECTED CLUES =====");

        boolean found = false;

        for (int i = 0; i < clues.length; i++) {

            if (collected[i]) {
                System.out.println((i + 1) + ". " + clues[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No clues have been collected yet.");
        }
    }
}
