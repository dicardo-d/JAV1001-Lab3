// A0254753 Divya Vasudev Khemani
// A00252915 Gupreet Kaur Sidhu


public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the dice game\n");

        // default
        Dice dice = new Dice();
        System.out.println("Part 1:");
        System.out.println("This is a Default Constructor:");
        System.out.println("Number of sides are: " + dice.getSides());
        dice.roll();
        System.out.println("At this moment the face of the dice is: " + dice.getSideUp());
        System.out.println("The name of this dice is: " + dice.getName());
        System.out.println("Side up before roll: " + dice.getSideUp());
        dice.roll();
        System.out.println("Side up after roll: " + dice.getSideUp());

        System.out.println("Highest value of dice: " + dice.highestValue() + "\n");


       //  1 paramter constuctor
        Dice dice3 = new Dice(20);
        System.out.println("Part 2: ");
        System.out.println("Number of sides: " + dice3.getSides());
        dice3.roll();
        System.out.println("At this moment the face of the dice is: " + dice3.getSideUp());
        System.out.println("The name of this dice is: " + dice3.getName());
        System.out.println("Side up before roll: " + dice3.getSideUp());
        dice3.roll();
        System.out.println("Side up after roll: " + dice3.getSideUp());

        System.out.println("Highest value of dice: " + dice3.highestValue()+ "\n");

        
        // 2 parameter constructor
        Dice dice1 = new Dice(12, "Divya's Dice Game");
        System.out.println("Part 3: "
        );
        System.out.println("Number of sides: " + dice1.getSides());
        dice1.roll();
        System.out.println("At this moment the face of the dice is: " + dice1.getSideUp());
        System.out.println("The name of this dice is: " + dice1.getName());
        System.out.println("Side up before roll: " + dice1.getSideUp());
        dice1.roll();
        System.out.println("Side up after roll: " + dice1.getSideUp());

        System.out.println("Highest value of dice: " + dice1.highestValue());

        findSameDiceNumber();
        
    }

    public static void findSameDiceNumber() {
        Dice[] diceArray = new Dice[5];
        for (int i = 0; i < diceArray.length; i++) {
            diceArray[i] = new Dice();
        }
        int oldValue = -1;
        int count = 0;
        boolean absent = true;
        do {
            absent = false;
            for (Dice dice : diceArray) {
                dice.roll();
                int sideUp = dice.getSideUp();
                if (oldValue == -1) {
                    oldValue = sideUp;
                } else if (oldValue != sideUp) {
                    absent = true;
                    break;
                } else {
                    oldValue = sideUp;
                }
            }
            if (absent) {
                count += 1;
            }
        } while (absent);
        System.out.println("\n Yipee! 5 same value found at: " + count);
    }

}
