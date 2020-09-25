import java.util.Scanner;
public class Dado{
  public static void main (String args[]){

   int [] dados = {1,2,3,4,5,6};
   int cero = 0;
   
   Scanner esperarTecla = new Scanner(System.in);
   System.out.println("Presione ENTER para tirar los dados");
   esperarTecla.nextLine();

   int random = (int)(Math.random() * (dados.length + 1 ));
   int randomu = (int)(Math.random() * (dados.length + 1));
   if (random == 0){
     random ++;
   }else if (randomu == 0){
     randomu++;
   }
    System.out.print ("[" + random + "]");
    System.out.print ("[" + randomu + "]");

 }
} 