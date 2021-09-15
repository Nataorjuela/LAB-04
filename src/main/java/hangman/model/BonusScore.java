/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author natao
 * @pre El juego inicia en 0 puntos.
 * @pos Se bonifica con 10 puntos cada letra correcta y Se penaliza con 5 puntos cada letra incorrecta.
 * @throws puntaje menor a 0 
 * 
 */
public class BonusScore implements GameScore{
    public int calculateScore(int correctCount,int incorrectCount){
    return 0;
    }
}
