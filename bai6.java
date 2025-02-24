/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.println("nhap canh a");
          double a = scanner.nextDouble();
          System.out.println("nhap cach b");
          double b = scanner.nextDouble();
          System.out.println("nhap so c");
          double c = scanner.nextDouble();
           if (a + b > c && a + c > b && b + c > a) {
           System.out.println("tam giac hop le");
           } 
           else {
          System.out.println("tam giac khong hop le");
        }
    }
}
