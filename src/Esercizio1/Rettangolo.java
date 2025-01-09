package Esercizio1;

public class Rettangolo {

    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza){
           this.altezza=altezza;
           this.larghezza=larghezza;
    }
     public int Area(){

         return  (this.altezza*this.larghezza);

     }
     public int Perimetro(){

         return  (this.altezza+this.larghezza)*2;
     }
     public static void stampaRettangolo(Rettangolo a){
         System.out.println("il perimentro è: ");
         System.out.println(a.Perimetro());
         System.out.println("l'area è: ");
         System.out.println(a.Area());
     }
     public static int stampaDueRettangoli(Rettangolo a,Rettangolo b){
         System.out.println("il perimetro del primo rettangolo: ");
         System.out.println(a.Perimetro());
         System.out.println("l'area del primo rettangolo: ");
         System.out.println(a.Area());
         System.out.println("il perimetro del secondo rettangolo: ");
         System.out.println(b.Perimetro());
         System.out.println("l'area del secondo rettangolo: ");
         System.out.println(b.Area());

         int total= a.Perimetro()+a.Area()+b.Area()+b.Perimetro();
         System.out.println("la somma totale di perimetri e aree è: " + total);
         return total;

     }
}
