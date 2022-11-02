package br.com.exercicio1;
import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Insira o dividendo"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Insira o divisor"));
        try{
            divide(dividendo,divisor);
        }catch (Exception ExcecaoDivisaoPorZero){
            JOptionPane.showMessageDialog(null, "Nao pode ser dividido por zero!");
        }
    }
    public static void divide(int dividendo, int divisor){
        JOptionPane.showMessageDialog(null, "Divisao: " + (dividendo/divisor));
    }
}
