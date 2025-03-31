/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
public class bai10 {
    public static int demSo(int n) {
        if (n == 0) return 1; 
        int dem = 0;
        n = Math.abs(n); 

        while (n > 0) {
            n /= 10; 
            dem++;  
        }
        return dem;
    }
      int so = 1234567;
    public static void main(String[] args) {
        System.out.println("so chu so" + so + " la: " + demSo(so));
    }
}
