import java.io.*;
import java.util.*;

public class Person {
    private int age;	
    String str = "Age is not valid, setting age to 0.";
    String str1 = "You are young.";
    String str2 = "You are a teenager.";
    String str3 = "You are old.";
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
          age = initialAge;
          if(age < 0){
              System.out.println(str);
            //   age = 0;
          }
        }

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(age < 13){
            System.out.println(str1);
        }  
        else if((age >= 13) && (age < 18)){
            System.out.println(str2);
        }
        else{
            System.out.println(str3);
        }
    }
    public void yearPasses() {
  		// Increment this person's age.
        age++;
	}

	public static void main(String[] args) {
