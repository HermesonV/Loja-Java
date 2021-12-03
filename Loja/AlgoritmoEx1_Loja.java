/*
Programador: Hermeson Vieira
Data: 23/09/2021
 */
import javax.swing.*;
public class AlgoritmoEx1_Loja {
    public static void main (String args[]){
        int i;
        double qtd[] = new double[5];
        double preço[] = new double [5];
        double tg = 0, tv, co;
        //Processamento de dados
        for (i =0; i < 5; i++){
            qtd[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade do " + (i+1) + "° produto:"));
            preço[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do " + (i+1) + "° produto"));    
        }
        for (i =0; i < 5; i++){
            tv = qtd[i] * preço[i];
            System.out.println("Quantidade vendida do " + (i+1) + "° produto: " + qtd[i]);
            System.out.println("Valor do " + (i+1) + "° produto: " + preço[i]);
            System.out.println("Total geral da venda: " + tv);
            tg = tg + tv;
        }
        co = tg * 0.05;
        System.out.println("Valor total das vendas: " + tg);
        System.out.println("Valor da comissão: " + co);        
    }    
}
