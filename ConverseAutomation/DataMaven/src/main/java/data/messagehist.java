package data;

import java.time.LocalDate;

public class messagehist {

	public String firstName;
    public String lastName;
    private LocalDate startDate;
 
    public void messagehist(String firstName, String lastName, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }
 
    public String name() {
        return this.firstName + " " + this.lastName;
    }
 
    public LocalDate getStart() {
        return this.startDate;
    }

}
