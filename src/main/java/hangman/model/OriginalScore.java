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
  @throws si el puntaje es meor a 0 
 
 */
public class OriginalScore extends GameScore {
    public int calculateScore(int correctCount,int incorrectCount){
         correctCount=100;
         
    return 0;}
}
