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
    @Override
    public int CalculateScore(int correctCount, int incorrectCount) throws ScoreException{
        int finalScore = 0;
        if(correctCount < 0 || incorrectCount < 0) {
             throw new ScoreException(ScoreException.INCORRECT_PARAMETERS);}
        if(correctCount > 0){ 
            finalScore =finalScore + 10 * correctCount;
        }
                    if(incorrectCount > 0){
                        finalScore =  finalScore - 5 * incorrectCount;
                    }
                    if(finalScore < 0){ 
                        finalScore = 0;
                    }
                    return finalScore;
                }
        }

