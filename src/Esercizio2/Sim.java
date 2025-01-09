package Esercizio2;

public class Sim {

    private String numeroDiTelefono;
    private String credito="0";

    Chiamate callDefault=new Chiamate(0,0);
    Chiamate[] lastFiveCalls= {callDefault,callDefault,callDefault,callDefault,callDefault};
    ;


    public Sim(String numeroDiTelefono){
        this.numeroDiTelefono=numeroDiTelefono;
        Chiamate[] lastFiveCalls= {callDefault,callDefault,callDefault,callDefault,callDefault};
        credito="0";

    }

    public void NewSimInfo(){
        System.out.println("numero della Sim: " + this.numeroDiTelefono + " Credito: " + this.credito + " numero ultime chiamate: ");
              for(int i=0;i<this.lastFiveCalls.length;i++){
                  System.out.println("numero di telefono: " + lastFiveCalls[i].numero + " durata: " + lastFiveCalls[i].minuti);
              };
        }

    }

