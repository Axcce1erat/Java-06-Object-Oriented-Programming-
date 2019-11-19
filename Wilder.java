// Create a Wilder class
public class Wilder {
    // Adds the attributes String firstname and boolean present
    private String firstName;
    private boolean present;

    // Create a constructor to initialise firstname and present
    public Wilder (String firstname, boolean present){
        this.firstName = firstname;
        this.present = present;
    }

    // Add getters and setters for all attributes, according to the conventions

    //Getters
    public String getFirstname(){
        return this.firstName;
    }
    public boolean getPresent(){
        return  this.present;
    }

    //Setters
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }
    public void setPresent(boolean present) {
        this.present = present;
    }

    //Add a whoAmI() method that returns the text "My name is firstname and I am present" or "My name is firstname and I am not present", depending on the state of the attributes firstname and present
    public String whoAmI(){
        return "My name is " + this.firstName + " and I am " + (this.getPresent() ? "present." : "not present.");
    }
}
