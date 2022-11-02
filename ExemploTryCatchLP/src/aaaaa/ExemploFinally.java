package aaaaa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExemploFinally {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int dividendo, divisor;
            System.out.println("Digite o valor do dividendo: ");
            dividendo = s.nextInt();
            System.out.println("Digite o valor do divisor: ");
            divisor = s.nextInt();

            if(divisor == 0){
                System.out.println("Não é possivel fazer uma divisao por zero!");
            }

            System.out.println(dividendo+ " / " + divisor + " = " + (dividendo/divisor));

        }catch (Exception ex){
            System.out.println("Erro:" + ex.getMessage());

        }finally {
            System.out.println("Bloco Finally.");
        }
    }
}
