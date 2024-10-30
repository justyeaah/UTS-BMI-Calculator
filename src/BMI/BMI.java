/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI;

import java.util.Scanner;

/**
 *
 * @author Aulia Febianca Dhevysistina
 */
public class BMI {
 Scanner scan = new Scanner(System.in);
 double tinggiBadan;
 double beratBadan;
 double hasil;
 
 public BMI(){}
 
public void dataBMI (){
    System.out.print("Masukkan tinggi badan anda (Cm) : ");
    tinggiBadan = scan.nextDouble();
    System.out.print("Masukkan berat badan anda (Kg) : ");
    beratBadan = scan.nextDouble();
}
public void hitungBMI (){
    hasil = beratBadan/((tinggiBadan/100)*(tinggiBadan/100));
    System.out.println("Hasil BMI anda adalah "+Math.nextUp(hasil));
    if (hasil < 18.5){
        System.out.println("Kategori BMI anda adalah Kekurangan Berat Badan");
    } else if (hasil >=18.5 && hasil < 24.9){
        System.out.println("Kategori BMI anda adalah Normal");
    } else if(hasil >=25 && hasil < 29){
        System.out.println("Kategori BMI anda adalah Kelebihan Berat Badan");
    } else {
        System.out.println("Kategori BMI anda adalah Obesitas, Ayo hidup sehat dan jaga pola makan");
    }    
}
}