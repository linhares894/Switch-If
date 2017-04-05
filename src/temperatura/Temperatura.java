
package temperatura;

import java.util.Scanner;


public class Temperatura {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        
        boolean transporte = false;
        String material;
        double temperatura;
        
        //ENTRADA
        
        System.out.println("Especifique o material: ");
        material = console.nextLine();
        
        System.out.println("Especife a temperatura: ");
        temperatura = console.nextDouble();
        
        //PROCESSAMENTO
        
        switch (material) {
            case "A":
            if (temperatura >= 10 && temperatura <=17){
            transporte = true;
            }else {
            transporte = false;        
            }
            break;
            
            case "B":
            if (temperatura >= 11 && temperatura <=16){
            transporte = true;
            }else {
            transporte = false;        
            }
            break;
            
            case "C":
            if (temperatura >= 12 && temperatura <=15){
            transporte = true;
            }else {
            transporte = false;        
            }
            break;
            
            case "D":
            if (temperatura >= 13 && temperatura <=14){
            transporte = true;
            }else {
            transporte = false;        
            }
            break;
        }
            
            //SAIDA
            if(transporte) {
                System.out.println("Pode transportar");
            }else {
                System.out.println("Não pode transportar");
            }
            
            
            
            
        }
    }
            
        
    
    
