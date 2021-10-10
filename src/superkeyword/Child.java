package superkeyword;

import java.sql.SQLOutput;

public class Child extends Father{

    // super keyword in constructor
    public Child(){
        super( 20);
    }
    // super keywords in method
    public void higherEducation(){
        super.educated();

    }
    // super keywords in variables
    public void athleticSkills(){
        int numberOfSport = super.numberOfSport;
        System.out.println("child is practising "+numberOfSport+" sports");
    }

}
