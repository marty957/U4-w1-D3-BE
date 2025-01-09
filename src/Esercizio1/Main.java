package Esercizio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1= new Rettangolo(2,8);

        rettangolo1.Area();
        rettangolo1.Perimetro();

        Rettangolo rettangolo2= new Rettangolo(6,7);
        Rettangolo rettangolo3= new Rettangolo(54,82);
       Rettangolo.stampaRettangolo(rettangolo2);

       Rettangolo.stampaDueRettangoli(rettangolo1,rettangolo3);


    }
}