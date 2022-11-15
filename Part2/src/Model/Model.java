package Model;

public class Model {
    //  Default Constructor
    public Model() {
        //  Create Football Player Objects
        FootballPlayer F1 = new FootballPlayer(6, "Malik Golden", "S", new Height(6, 0),
                205, "Hartford, Conn.", "Cheshire Academy");
        FootballPlayer F2 = new FootballPlayer(38, "Desi Davis", "CB",
                new Height(5, 11), 172, "Admore, Pa.", "Harriton");
        FootballPlayer F3 = new FootballPlayer(28, "Troy Apke", "S", new Height(6, 1),
                198, "Mt. Lebanon, Pa.", "Mount Lebanon");

        OffensiveLine O = new OffensiveLine(F1, F2, F3);

        //  Print Offensive Line Player Details
        System.out.println(O.toString());

        //  Print Average Weight of Offensive Line 3 Player Details
        System.out.println("------------------\nAverage Weight of 3 Player = " + O.averageWeight());
    }
}