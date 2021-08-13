import java.util.Scanner; // biblioteca para leitura

public class TestaVetores {
    public static void main(String[] args){
        int c[] = new int [5];
/*
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        c[3] = 4;
        c[4] = 5;
*/
        Scanner entrada = new Scanner(System.in); 
        for(int j=0; j<c.length; j++){
            System.out.println("Entre com o " + (j+1) + "o elemento: ");
            c[j] = entrada.nextInt(); // lê o elemento e salva como int
        }       

        // printando elementos com for
        System.out.println("Elementos do array: ");
        for (int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }
        
        // printando elementos com for aprimorado
        System.out.println("Array (for aprimorado): ");
        for(int elem:c){
            System.out.println(elem);
        }
    }
}
