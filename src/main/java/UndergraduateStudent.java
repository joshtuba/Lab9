/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class UndergraduateStudent extends Student{
    private int year;

    public UndergraduateStudent(int year, String studentID, String firstName, String lastname) {
        super(studentID, firstName, lastname);
        this.year = year;
    }

        
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
