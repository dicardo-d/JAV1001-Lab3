public class Dice {
    private int sideup;
    private int sides;
    private String name;        

    public Dice() {
        sides = 6;
        name = "d6";
        roll();
    }

    public Dice(int sides){
        this.sides = sides;
        this.name = "d" + sides;
        roll();
    }

    public Dice(int sides, String name){
        this.sides = sides;
        this.name = name;
        roll();
    }
    public void roll() {
        int roundRandom = (int) Math.round(Math.random() * 10);
        if (roundRandom == 0) {
            this.sideup = 1;
        } else {
            this.sideup = (int) Math.round((roundRandom * this.sides) / 10);
            this.sideup = this.sideup == 0 ? 1 : this.sideup;
        }
    }
    // Getters
    public int getSides() {
        return this.sides;
    }

    public String getName() {
        return name;
    }

    public void getSides(int sides) {
        this.sides = sides;
    }

    public int getSideUp() {
        return this.sideup;
    }

    public int highestValue(){
        return this.sides;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}

// die.sides // error
// die.getSides()