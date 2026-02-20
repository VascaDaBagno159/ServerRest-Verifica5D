/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class DaFareService {
    
    /**
     * Calcola se il numero è pari o dispari
     * 
     * @param numero
     * @param giocata
     * @param 
     * @param 
     * @return 
     * @throws IllegalArgumentException se ...
     */
    public static boolean logicaDiCalcolo(int numero,String giocata) 
            throws IllegalArgumentException {
        
       
        // Controllo se i parametri passati sono validi
                if (!parametriValidi()) {
            throw new IllegalArgumentException("Operatore non può essere vuoto");
        }
        
        try {
            
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Opzione non valida. Opzione deve essere DA FARE");
        }
        
         if( numero % 2 == 0 ){
            return true;
         }else if(numero % 2 != 0 ){
            return false;
         }
        return false;
         
    }

    // Metodo di validazione dei parametri (da implementare)
    private static boolean parametriValidi()
    {
        
        return false;
    }
}
