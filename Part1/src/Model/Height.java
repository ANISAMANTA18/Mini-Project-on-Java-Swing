package Model;

public class Height {
    private int feet;
    private int inches;

    // Constructor
    public Height() {
        feet = 0;
        inches = 0;
    }

    //  Constructor Overloading
    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    //  Mutator & Accessor Method
    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    //  ToString Method
    public String toString() {
        return feet + "'" + inches + "''";
    }
}
