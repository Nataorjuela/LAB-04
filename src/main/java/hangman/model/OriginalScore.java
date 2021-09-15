/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author natao
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
    public int calculateScore(int correctCount,int incorrectCount) throws ScoreException{
        if(incorrectCount>0){
          int finalScore = finalScore-incorrectCount*10;
        
         
        return finalScore;}
}
