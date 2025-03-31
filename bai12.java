/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;
 public class bai12 {
    public static boolean sodoixung(int so) {
        int sogoc = so;
        int sodaonguoc = 0;
        while (so > 0) {
            int chuso = so % 10;
            sodaonguoc = sodaonguoc * 10 + chuso; 
            so /= 10; 
        }
        return sogoc == sodaonguoc; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int so = scanner.nextInt();
        if (sodoixung(so)){
            System.out.println(so + " la so doi xung.");
        } else {
            System.out.println(so + " khong la so doi xung.");
    }
} 
 }
 



