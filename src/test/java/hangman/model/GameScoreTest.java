/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;
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
    //correctCount-10 donde correctCount=100 and correctCount>=0
    @Test
    public void validateOriginalScoreCorrectCount() {
        int correctCount=0;
        int incorrectCount=100;
        int puntaje=GameScore.calculateScore(correctCount,incorrectCount);
        Assert.assertEquals(puntaje,0);
        
    }
}
