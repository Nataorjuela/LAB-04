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
 * @pos La $i-ésima$ letra correcta se bonifica con $5^i$ y  Se penaliza con 8 puntos cada letra incorrecta.
 * @throws puntaje menos a 0
 */
public class PowerScore implements GameScore {
    @Override
    public int CalculateScore(int correctCount,int incorrectCount)throws ScoreException{
        int finalScore = 0;
        if(correctCount < 0 || incorrectCount < 0) {
            throw new ScoreException(ScoreException.INCORRECT_PARAMETERS);}
        if(correctCount > 0){
            for(int i = 1; i < correctCount; i++){
                finalScore = (int)(finalScore + Math.pow(5,i));
            }
        }
        if(incorrectCount > 0 ){
            finalScore = finalScore - 8 * incorrectCount;
        }
        if (finalScore >= 500){ 
            finalScore = 500;}
        if (finalScore < 0){
            finalScore = 0;}
        
        return finalScore;
    }      
}
