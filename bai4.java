/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;
 public class bai4 {
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);

          System.out.print("nhap nam : ");
        int nam = scanner.nextInt();

        boolean namnhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);

        if (namnhuan) {
            System.out.println(nam + " nam nhuan");
        } else {
            System.out.println(nam + " khong la nam nhuan ");
        }
    }
}