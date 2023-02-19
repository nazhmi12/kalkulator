/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WIN10
 */
public class overloading {
    //Java program for Method overloading
        //Method with 2 parameter
        static int Multiply(int b,int a)
        {
            return a * b;
        }
        //Method with the same name but 2 double parameter
        static double  Multiply(double a,double b)
        {
            return a * b;
        }
        
           
}
class main{
    public static void main(String []args)
    {
        System.out.println(overloading.Multiply(10,13));
        System.out.println(overloading.Multiply(5.5,6.3));
    }
}
