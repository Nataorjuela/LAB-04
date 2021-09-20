/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author natao
 *  @param CorrectCount numero de letras correctas
 *  @param IncorrectCount numero de letras incorrectas
 *  @return score
 * @pre
 * Es el esquema actual, se inicia con 100 puntos.
 *No se bonifican las letras correctas.
 * @pos
 *Se penaliza con 10 puntos con cada letra incorrecta.
  @throws si el puntaje es menor a 0 
  * CLASES EQUIVALENCIA:
 * 1.OriginalScore:
 * finalScore-10 donde incorrectCount>0 and correctCount>0
 */
public class OriginalScore implements GameScore {
    @Override
    public int CalculateScore(int correctCount,int incorrectCount) throws ScoreException{
        int finalScore=100;
         if(correctCount < 0 || incorrectCount < 0) {throw new ScoreException(ScoreException.INCORRECT_PARAMETERS);}
        if(incorrectCount>0){
         finalScore = finalScore-incorrectCount*10;
        }
        if(correctCount == 0 ){ 
            finalScore = 0;}
        return finalScore;
    }
}
