/**
 * Created by rush on 8/3/16.
 */
public class homeworkMain {

    public static void main (String[] args) {

        //Declaring all the variables
        int age = 22;
        String name = "Jim";
        String gun = "Mossberg 930";
        String truck = "Ford Ranger";
        String ducks = "Wood duck, Merganser, Mallard";
        String shortCut = "backroads of west point lake";
        int numDucks = 4;
        int buddyDucks = 13;
        double milesDriven = 40.2;
        String yeah = "Yee yeeh";

        //This adds two variables
        int totalDucks = numDucks + buddyDucks;

        System.out.println("This is a dialog of a game warden");
        System.out.println("GW: You are " + age + " , are you lying " + name);
        System.out.println("Jim: No sir");
        System.out.println("GW: You have a nice " + gun + ". You use it a lot? ");
        System.out.println("Jim: Oh yeah hunt all over with my " + gun);
        System.out.println("GW:Your " + truck + "looks dirty for only traveling " + milesDriven + " here");
        System.out.println("Jim: I took a shortcut through " + shortCut);
        System.out.println("GW:You came to hunt ducks and those are " + ducks + " very nice");
        System.out.println("Jim: Yeah they are");
        System.out.println("GW:You got " + numDucks + " good your under the limit and your buddies got " + buddyDucks + " good your under" );
        System.out.println("Jim: Following the rules sir");
        System.out.println("GW:Your total is " + totalDucks + " which is good for the area!");
        System.out.println("Jim: Yes sir " + yeah + yeah);

    }


}
