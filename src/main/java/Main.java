
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class Main {
    public static void main(String[] args) {
        double len = 0;
        double wid = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        //Land Tract 1
        System.out.println("Enter Land Tract's 1 length");
        len = keyboard.nextDouble();
        System.out.println("Enter Land Tract's 1 width");
        wid = keyboard.nextDouble();
        
        LandTract landTract1 = new LandTract(len, wid);
        
        
        //LandTract 2
        System.out.println("Enter Land Tract's 2 length");
        len = keyboard.nextDouble();
        System.out.println("Enter Land Tract's 2 width");
        wid = keyboard.nextDouble();
        
        LandTract landTract2 = new LandTract(len, wid);
        
        //Demonstration
        System.out.println("");
        System.out.println("Land Tract 1's area is: " + landTract1.getArea());
        System.out.println("Land Tract 2's area is: " + landTract2.getArea());
        
        if (landTract1.equals(landTract2)) {
            System.out.println("Land Tract 1 and 2 are identical");
        } else {
            System.out.println("Land Tract 1 and 2 are NOT identical");
        }
        
        
        
        
    }
}
