/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;
public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ngay:");
        String nhapngay = scanner.nextLine();
        String[] parts = nhapngay.split("/");
        if (parts.length == 3) {
            int ngay = Integer.parseInt(parts[0]);
            System.out.println("ngay: " + ngay);
            int thang = Integer.parseInt(parts[1]);
            System.out.println("thang: " + thang);
            int nam = Integer.parseInt(parts[2]);
            System.out.println("nam: " + nam);
        } else {
            System.out.println("dinh ngay khong hop le");
        }
}
}
