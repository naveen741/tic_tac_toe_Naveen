package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ________
 */
public class TicTacToeTest {

    @Test
    public void simpleNoWinnerBoard() throws Exception {
    	TicTacToeBoard answer=new TicTacToeBoard("O...X.X..");
        assertEquals(Evaluation.NOWINNER, answer.evaluate());
        TicTacToeBoard answer1=new TicTacToeBoard("XXX...oo.");
        assertEquals(Evaluation.XWINS, answer1.evaluate());
        TicTacToeBoard answer2=new TicTacToeBoard("...Xxx.oo");
        assertEquals(Evaluation.XWINS, answer2.evaluate());
        TicTacToeBoard answer3=new TicTacToeBoard("oo....xxx");
        assertEquals(Evaluation.XWINS,answer3.evaluate());
        TicTacToeBoard answer4=new TicTacToeBoard("x..x..xoo");
        assertEquals(Evaluation.XWINS, answer4.evaluate());
        TicTacToeBoard answer5=new TicTacToeBoard(".x..xoox.");
        assertEquals(Evaluation.XWINS,answer5.evaluate());
        TicTacToeBoard answer6=new TicTacToeBoard("..xoox..x");
        assertEquals(Evaluation.XWINS, answer6.evaluate());
        TicTacToeBoard answer7=new TicTacToeBoard("x...x.oox");
        assertEquals(Evaluation.XWINS, answer7.evaluate());
        TicTacToeBoard answer8=new TicTacToeBoard("..x.x.xoo");
        assertEquals(Evaluation.XWINS, answer8.evaluate());
        TicTacToeBoard answer10=new TicTacToeBoard("oxooxooxo");
        assertEquals(Evaluation.UNREACHABLESTATE, answer10.evaluate());

    }
}
