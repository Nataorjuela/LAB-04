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
public interface GameScore{
   public int CalculateScore(int correctCount,int incorrectCount)throws ScoreException;
}