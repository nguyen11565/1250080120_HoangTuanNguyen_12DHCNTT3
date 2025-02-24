/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;
public class bai3 {
      public static void main(String[] args){
          
 Scanner scanner = new Scanner(System.in);

        System.out.print("nhap nhiet do f: ");
        double f = scanner.nextDouble();

        double c = (f-32) / 1.8;

        System.out.println(f+ " do f = " + c + " do c");

    }
}