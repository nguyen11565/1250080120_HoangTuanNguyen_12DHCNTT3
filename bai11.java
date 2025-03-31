/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
   public class bai11 {
    public static int daonguocso(int n) {
        int sodaonguoc = 0;
        n = Math.abs(n);
        while (n > 0) {
            int chuso = n % 10; 
            sodaonguoc = sodaonguoc * 10 + chuso; 
            n /= 10; 
    }
    }
    public static void main(String[] args) {
        int so = 1234;
        System.out.println("So dao nguoc " + so + " la: " + daonguocso(so));
} 
}

