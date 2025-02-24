/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;
public class bai5 {
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.println("nhap so a");
          double a = scanner.nextDouble();
          System.out.println("nhap so b");
          double b = scanner.nextDouble();
          System.out.println("nhap so c");
          double c = scanner.nextDouble();
        
          if (a<b && a<c ){
          System.out.println(+a"la gia tri nho nhat");
          }
          else if (b<a && b<c){
              System.out.println(+b"la gia tri nho nhat");
          }
          else{
               System.out.println(+c"la gia tri nho nhat");
          }
     }
}
