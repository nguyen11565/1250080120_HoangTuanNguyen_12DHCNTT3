/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;
public class bai8 {
    public static int timchusodautien(int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
    public static int timchusotancung(int n) {
        return Math.abs(n) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap 1 so nguyen: ");
        int n = scanner.nextInt();
        System.out.println("chu so dau: " + timchusodautien(n));
        System.out.println("chu so tan cung: " + timchusotancung(n));
       
}  
}
