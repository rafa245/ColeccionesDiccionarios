package Ejercicio2;

import java.util.ArrayList;

public class ArrayListAleatorio {
  public static void main(String[] args) {
    int tamaņoLista = (int) (Math.random()*((20 - 10) + 1)+10);
    ArrayList<Integer> arrayAleatorio = new ArrayList<Integer>();
    
    System.out.println("Tamaņo del ArrayList: "+tamaņoLista);
    for(int i = 0; i<tamaņoLista;i++) {
      arrayAleatorio.add((int) (Math.random()*101));
      System.out.println(i+".   "+arrayAleatorio.get(i));
    }
  
  }
}
