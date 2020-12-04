package be.multimedi.softwaretesters.arrays;

/**
 * @author Yannick Van Ham
 * created on Tuesday, 24/11/2020
 */
public class MainApp {
    public static void main(String[] args) {

        // 02.01 Arrays
        // Convenient way to list multiple instances of the same data type
        String colour1 = "red";
        String colour2 = "orange";
        String colour3 = "yellow";
        String colour4 = "green";
        String colour5 = "blue";
        String colour6 = "indigo";
        String colour7 = "violet";

        String[] rainbow = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};


        // 02.02 You can declare and initialise arrays in many ways
        // You can declare an array of unspecified length
        String[] daysOfTheWeek;

        // You can declare an array and initialize its length
        String[] monthsOfTheYear = new String[12];

        // Once you've done that you can initialize its values
        monthsOfTheYear[0] = "January";
        monthsOfTheYear[1] = "February";
        monthsOfTheYear[2] = "March";
        // ...
        monthsOfTheYear[11] = "December";

        // You can also initialize its values immediately using curly braces, in which case you don't need to
        // explicitly set its length, it will dynamically set it
        int[] primeNumbers = {2, 3, 5, 7, 11};

        // Arrays are technically objects so you can technically invoke an instance by using new keyword
        String[] greetings = new String[]{"hi", "hello", "hola", "bon jour", "hallo"};
        String[] footballTeamMemberNames = new String[11];

        // 02.03 Accessing arrays
        // You can access an array's element by using square brackets and its index
        // Note: Arrays are zero-indexed, meaning you start counting from 0 not from 1
        String[] dwarves = {"Sneezy", "Bashful", "Sleepy", "Happy", "Grumpy", "Doc"};
        display("My favourite dwarf is " + dwarves[dwarves.length - 1]);

        // 02.04 Arrays are immutable so once you set the length you cannot simply add or remove positions
        String[] playingCardSuits = new String[4];
        playingCardSuits[0] = "Hearts";
        playingCardSuits[1] = "Diamonds";
        playingCardSuits[2] = "Clubs";
        playingCardSuits[3] = "Spades";
        // playingCardSuits[4] = "Stars"; // doesn't compile

        // This makes dynamic addition/removal of elements to your array very inconvenient

        String[] guestList = {"Michael Shannon", "Henry Witherton", "Sara Sherwood", "Michaela Stone"};
        String weddingCrasher = "Jonathan Barnes";

        // Declare a new array with previous array's length plus one
        String[] newGuestList = new String[guestList.length + 1];

        // Copy over the contents from the previous array into the new one
        for (int i = 0; i < guestList.length; i++) {
            newGuestList[i] = guestList[i];
        }

        // Assign the new value to the final element in the new array
        newGuestList[newGuestList.length - 1] = weddingCrasher;

        // 02.05 Multi-dimensional arrays
        // It's possible to have arrays of arrays (of arrays, of arrays, ...)


        String[][] planeetLand = new String[2][5];
        for (String[] planeet : planeetLand) {
            for (String land : planeet) {
                System.out.println(planeet + land);
            }
        }
        for (int i = 0; i < planeetLand.length; i++) {
            for (String land : planeetLand[i]) {
                System.out.println("Dit is de " + i + "de planeet, land: " + land);
            }
        }

        String[][] chessBoard = new String[8][8];

        System.out.println("Chess board:");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                char letter = (char) ('A' + i);
                String letterAsString = String.valueOf(letter);
                int number = j + 1;
                chessBoard[i][j] = new String(letterAsString + number);
                System.out.print(chessBoard[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    private static void display(Object object) {
        System.out.println(object);
    }
}
