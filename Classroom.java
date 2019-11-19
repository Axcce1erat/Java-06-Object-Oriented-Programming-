public class Classroom {
    static void main (String[] args){
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
