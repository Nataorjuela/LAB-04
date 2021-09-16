/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author natao
 */
public class ScoreException extends Exception{
    public static final String INCORRECT_PARAMETERS = "valores negativos";
    public ScoreException(String mensaje){
        super(mensaje);
    }
}
