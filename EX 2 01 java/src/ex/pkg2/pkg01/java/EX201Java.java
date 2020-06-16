
package ex.pkg2.pkg01.java;

import java.util.Scanner;


public class EX201Java {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero");
        int n = entrada.nextInt();
        System.out.println(n<3? "O numero e menor que 3": "O numero e maior que 3");

    }
    
}
