
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
        Dice dice3 = new Dice(10);
        System.out.println("Part 2: ");
        System.out.println(dice3.getSides());
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
        System.out.println(dice1.getSides());
        System.out.println(dice1.getName());
        dice1.roll();
        System.out.println("At this moment the face of the dice is: " + dice1.getSideUp());
        System.out.println("The name of this dice is: " + dice1.getName());
        System.out.println("Side up before roll: " + dice1.getSideUp());
        dice1.roll();
        System.out.println("Side up after roll: " + dice1.getSideUp());

        System.out.println("Highest value of dice: " + dice1.highestValue());

    }
}
