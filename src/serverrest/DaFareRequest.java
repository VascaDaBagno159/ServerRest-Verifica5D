/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class DaFareRequest {
    
    private String giocata;
    private String numero;
    
    // Costruttore vuoto necessario per GSON
    public DaFareRequest() {
    }
    
    // Costruttore con parametri  
     public DaFareRequest(String giocata, String numero) {
        this.giocata = giocata;
        this.numero = numero;
    }
   

    // Getter
    public String getNumero() {
        return numero;
    }
    public String getGiocata() {
        return giocata;
    }
    // Setter
    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // ToString

    @Override
    public String toString() {
        return "DaFareRequest{" + "giocata=" + giocata + ", numero=" + numero + '}';
    }
    
  

  
}