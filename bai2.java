/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapp;
import java.util.Scanner;

   public class bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("chieu rong: ");
        double chieuRong = scanner.nextDouble();

        System.out.print("chieu cao: ");
        double chieuCao = scanner.nextDouble();
       
        double dienTich = chieuRong * chieuCao;
        
        System.out.println("Dien tich hcn : " + dienTich);
       
    }
}