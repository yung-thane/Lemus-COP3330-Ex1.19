/*
 *  UCF COP3330 Fall 2021 Assignment 1.19 Solution
 *  Copyright 2021 Ronald Lemus
 */



import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String [] arg){
        System.out.print("Please enter your weight in pounds. ");
        Scanner weightInp = new Scanner(System.in);
        double weight = weightInp.nextInt();

        System.out.print("Please enter your height in inches. ");
        Scanner heightInp = new Scanner(System.in);
        double height = heightInp.nextInt();

        double BMI = (weight / (height * height) * 703);
        double overweight = 25;
        double underweight = 18.5;

        if(BMI >= overweight )
            System.out.printf("Your BMI is %.1f.\nYou are overweight. You should see your doctor.", BMI);

        if (BMI <= underweight )
            System.out.printf("Your BMI is %.1f.\n You are underweight. You should see your doctor.", BMI);

        else
            System.out.printf("Your BMI is %.1f.\nYou are within the ideal range.", BMI);


    }
}
