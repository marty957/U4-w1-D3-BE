package Esercizio3;

public class Articolo {

    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int nPezziDisponibili;

    public Articolo(int codiceArticolo, String descrizioneArticolo, int prezzo, int nPezziDisponibili){
        this.codiceArticolo=codiceArticolo;
        this.descrizioneArticolo=descrizioneArticolo;
        this.prezzo=prezzo;
        this.nPezziDisponibili=nPezziDisponibili;

    }

    public String getArticle(Articolo a){
        return a.descrizioneArticolo;
    }
    public int getArticleCode(Articolo a){
        return a.codiceArticolo;
    }
    public int getArticlePrice(Articolo a){
        return a.prezzo;
    }


}
