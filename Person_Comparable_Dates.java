/**
 * Person_Comparable_Dates class does the following:
 * 
 *  (1) implements "Comparable" and thus, YOU write the "compareTo()" method.
 *                    Rem:  public int compareTo(Object x)
 *                    
 *  (2) has the needed instance variables: myFirstName & myLastName of type String,
 *                                         myBirthDate of type Date (Compositioned inside of Person
 *                                                                   in other words, Person "hasA" Date)  
 *  (3) has the needed constructors: default and regular that takes in 2 Strings for the name &
 *                                   3 ints for the Date object.
 *                                   
 *  (4) has getMyBirthDate() that returns the Person's myBirthDate. 
 *  
 *  (5) has a toString() method
 *  
*/
import java.util.*;
public class Person_Comparable_Dates implements Comparable<Person_Comparable_Dates>  // >>> Your Code Here <<<
{
    //>>>>>>>>>>>>>>>>>>  YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<<<<<<
    private String firstName;
    private String lastName;
    private Date myBirthDate;
    
    public Person_Comparable_Dates(String firstName, String lastName, int month, int day, int year)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        myBirthDate = new Date(month, day, year);
    }
    public Person_Comparable_Dates()
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myBirthDate = myBirthDate;
    }
    
    //========================accessor========================
    public Date getMyBirthDate()
    {
        return this.myBirthDate;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    
    public String toString()
    {
        return "First Name: " + firstName + "/t Last Name: " + lastName + "/t Birthday: " + myBirthDate.toString();
    }
    
    public int compareTo(Person_Comparable_Dates pDate)
    {
        if(this.getMyBirthDate().getYear() == pDate.getMyBirthDate().getYear() && this.getMyBirthDate().getMonth() == pDate.getMyBirthDate().getMonth())
        {
            return this.getMyBirthDate().getDay() - pDate.getMyBirthDate().getDay();
        }
        else if(this.getMyBirthDate().getYear() == pDate.getMyBirthDate().getYear())
        {
            return this.getMyBirthDate().getMonth() - pDate.getMyBirthDate().getMonth();
        }
        else
        {
            return this.getMyBirthDate().getYear() - pDate.getMyBirthDate().getYear();
        }
    }
}
