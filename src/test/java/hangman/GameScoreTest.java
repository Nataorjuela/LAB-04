/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;
import hangman.model.*;
import org.junit.Assert;
import org.junit.Test;

/*
 *
 * @author natao
 * CLASES EQUIVALENCIA:
 * 1.OriginalScore:
 * correctCount-10 donde correctCount=100 and correctCount>=0
 * incorrectCount+10 donde incorrectCount=0 and incorrectCount<=100

 * 2.BonusScore:
 * correctCount+10 donde correctCount=0 
 * incorrectCount+5 donde incorrectCount=0 or correctCount=0

 * 3.PowerBonusScore:
 * correctCount+5**i donde correctCount=0 and correctCount<501
 * incorrectCount+8 donde incorrectCount=0 or correctCount=0;
*/
public class GameScoreTest {
    //verificar que el puntaje es el correcto con dos letras incorrectas y dos letras correctas.
    @Test
    public void validateOriginalScoreCorrectCount()throws ScoreException {
        GameScore play=new OriginalScore();
        int finalScore=play.CalculateScore(5,0);
        Assert.assertTrue(finalScore==100);
    }
    
      @Test
    public void validOriginalScore() throws ScoreException {
        GameScore play = new OriginalScore();
        int finalScore = play.CalculateScore(2,2);
        Assert.assertTrue(finalScore == 80);
    }
    @Test
    public void validOriginalScoreIncorrectLetters() throws ScoreException {
        GameScore play = new OriginalScore();
        int finalScore = play.CalculateScore(1,10);
        Assert.assertTrue(finalScore == 0);
    }

    @Test
    public void validBonusScoreCorrectLetters() throws ScoreException {
        GameScore play = new BonusScore();
        int finalScore = play.CalculateScore(10,0);
        Assert.assertTrue(finalScore == 100);
    }

    @Test
    public void validBonusScore() throws ScoreException {
        GameScore play = new BonusScore();
        int finalScore = play.CalculateScore(10,8);
        Assert.assertTrue(finalScore == 60);
    }

    @Test
    public void validBonusScoreCorrectMinScore() throws ScoreException {
        GameScore play = new BonusScore();
        int finalScore = play.CalculateScore(10,20);
        Assert.assertTrue(finalScore == 0);
    }

    @Test
    public void validPowerScoreCorrectLetters() throws ScoreException {
        GameScore play = new PowerScore();
        int finalScore = play.CalculateScore(3,0);
        Assert.assertTrue(finalScore == 155);
    }

    @Test
    public void validPowerScoreCorrectMinScore() throws ScoreException {
        GameScore play = new PowerScore();
        int finalScore = play.CalculateScore(0,1);
        Assert.assertTrue(finalScore == 0);
    }

    @Test
    public void validPowerScoreCorrectMaxScore() throws ScoreException {
        GameScore play = new PowerScore();
        int finalScore = play.CalculateScore(5,1);
        Assert.assertTrue(finalScore == 500);
    }
    
    @Test
    public void validateIncorrectParameters() {
        GameScore play;
        try {
            play = new OriginalScore();
            play.CalculateScore(-15, -2);
            Assert.assertTrue(false);
        } catch (ScoreException e) {
            Assert.assertTrue(true);
        }
        try {
            play = new PowerScore();
            play.CalculateScore(-2, -10);
            Assert.assertTrue(false);
        } catch (ScoreException e) {
            Assert.assertTrue(true);
        }

        try {
            play = new BonusScore();
            play.CalculateScore(-5, -1);
            Assert.assertTrue(false);
        } catch (ScoreException e) {
            Assert.assertTrue(true);
        }
    }
    
}
