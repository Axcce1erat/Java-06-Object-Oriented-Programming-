//Create a Classroom class with a main() method
public class Classroom {
    static void main (String[] args){
        //Add references to several instances of the Wilder class inside the main() method of Classroom
        Wilder[] wilders = {
                new Wilder("Markus", true),
                new Wilder("Susan", false),
                new Wilder("Berthold", true),
                new Wilder ("Max", false)
        };
        for (Wilder wilder: wilders){
            System.out.println(wilder.whoAmI());
        }
    }
}
