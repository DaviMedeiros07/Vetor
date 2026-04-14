import javax.swing.JOptionPane;
public class Vetor {

    public static void main(String[] args) {
        
        double media;
        int soma = 0;
        int numeros [] = new int [20];
        
        for(int i = 0;i < 20; i++){
            
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            
            soma = soma + numeros[i];
        }
        System.out.println("Soma: " + soma);
        
        media = soma / 20;
        System.out.println("Media: " + media);
        }
    }

