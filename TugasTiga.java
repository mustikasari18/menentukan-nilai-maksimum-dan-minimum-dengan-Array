/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasduajava;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TugasTiga {
    public static void main(String[] args) {
        System.out.println("Menentukan nilai maksimum dan nilai minimum menggunakan array dan apanila user memberi inputan -1 maka akan keluar");
        Scanner sc = new Scanner(System.in);
        int x[] = new int[100];
        int jumlah=100,stop=0;
        for(int i=0; i<jumlah; i++){
            System.out.print("Masukkan Array isi : " +(i+1)+ " = " );
            x[i] = sc.nextInt();
            if(x[i]== -1){
                jumlah = -1;
                stop = i;
                
                System.out.println("Proses Berakhir");
            }
        }
        int max = x[0], min = x[0];
        for(int i=0; i<stop;i++){
            if(x[i]>max){
                max = x[i];
            }
            else if(x[i]<min){
                min = x[i];
            }
        }
        System.out.println(" ");
        System.out.println("Nilai maksimum : " +max);
        System.out.println("Nilai minimum : " + min);
    } 
}
