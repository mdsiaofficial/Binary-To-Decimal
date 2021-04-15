// Created by M1C843L


import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();        
        int dec = 0; // decimal
        int pO2 = 1; // PowerOf2
                
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == 49) { // ASCII: 48 = 0, 49 = 1
                dec += pO2; 
            }
            pO2 *= 2; // 1,2,4,8,16 etc.
        }
        System.out.println(dec);
    }
}
