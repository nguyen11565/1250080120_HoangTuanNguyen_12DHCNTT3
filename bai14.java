/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;
public class bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine().trim();
        if (chuoi.isEmpty()) {
            System.out.println("so tu trong chuoi: 0");
        } else {
            String[] words = chuoi.split("\\s+");
            System.out.println("so tu trong chuoi: " + words.length);
        }            
    }    
}
