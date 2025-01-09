package Esercizio3;

public class Cliente {

    private int codiceCliente;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    public Cliente(int codiceCliente, String nomeCognome, String email, String dataIscrizione){
        this.codiceCliente=codiceCliente;
        this.nomeCognome=nomeCognome;
        this.email=email;
        this.dataIscrizione=dataIscrizione;
    }
    public void getClient(String nome){
        if (nome.equals(this.nomeCognome)) {
            System.out.println(this.nomeCognome);

        }
};

}
