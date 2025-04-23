/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IT20
 */
public class Mavenproject2 {
  
    
   



/**
 * Main application class
 */


    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        int sum = first + second;

        System.out.println(first + " + " + second + " = " + sum);
    }

    // Method to be tested
    public int add(int a, int b) {
        return a + b;
    }

    // Method to be tested
    public String getMessage() {
        return "Hello, NetBeans!";
    }
}
