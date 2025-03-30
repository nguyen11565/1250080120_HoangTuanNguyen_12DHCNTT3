/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
public class bai9 {
    public static int tinhtongchuso(int n) {
        int tong = 0;
        while (n != 0) {
            tong += n % 10;
            n /= 10; 
        }
        return tong;
    }
    public static int tinhtichchuso(int n) {
        int tich = 1;
        while (n != 0) {
            tich *= n % 10; 
            n /= 10; 
        }
        return tich;
    }
    public static void main(String[] args) {
        int so = 1234; 
        System.out.println("tong cac chu so " + so + " là: " + tinhtongchuso(so));
        System.out.println("tich cac chu so " + so + " là: " + tinhtichchuso(so));
    }
}

