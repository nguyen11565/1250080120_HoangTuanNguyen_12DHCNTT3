/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;
public class bai7 {
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.println("nhap mon ly ");
          double ly = scanner.nextDouble();
          System.out.println("nhap mon hoa");
          double hoa = scanner.nextDouble();
          System.out.println("nhap so sinh");
          double sinh = scanner.nextDouble();
          System.out.println("nhap mon toan ");
          double toan = scanner.nextDouble();
          System.out.println("nhap mon may tinh");
          double maytinh = scanner.nextDouble();
         
           double tong = ly + hoa + sinh + toan + maytinh;
      
           double tyle = (tong/ 50) * 100; 

        System.out.println("ty le: " + tyle + "%");
     
        String hang;
        if (tyle > 90) {
            hang ="a";
        } 
        else if (tyle > 80) {
            hang = "b";
        } else if (tyle > 70) {
            hang = "c";
        } else if (tyle> 60) {
            hang = "d";
        } else if (tyle > 40) {
            hang = "E";
        } else {
            hang = "F";
        }
        System.out.println("hang: " + hang);
    }
}
