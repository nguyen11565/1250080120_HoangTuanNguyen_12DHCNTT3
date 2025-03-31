/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
 import java.util.Scanner;
public class bai13 {
    public static int demsotu(String str) {
        String[] words = str.trim().split("\\s+");
        return (str.isEmpty()) ? 0 : words.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String chuoi = scanner.nextLine();
        int sotu = demsotu(chuoi);
        System.out.println("so tu trong chuoi: " + sotu);
    }
}
