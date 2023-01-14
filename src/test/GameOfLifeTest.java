package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.*;

public class GameOfLifeTest {
    @Test
    public void teste1() {
        int[][] entrada = {
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 0 },
                { 0, 0, 1, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 1, 0, 0, 0, 1 },
                { 1, 0, 0, 1, 1, 1 }
        };

        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 1, 1 },
                { 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 0 }
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test2() {

        int[][] entrada = {
                { 0, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 0 },
                { 0, 1, 1, 1, 0, 0 },
                { 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);
        int[][] saidaEsperada = {
                { 0, 0, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test3() {

        int[][] entrada = {
                { 1, 0, 0, 1, 0, 1 },
                { 0, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 0 },
                { 1, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 0, 1, 0 },
                { 0, 0, 1, 1, 1, 1 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 0, 0, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 1, 0, 0, 0, 1, 1 },
                { 1, 0, 1, 0, 0, 0 },
                { 0, 1, 1, 1, 1, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test4() {

        int[][] entrada = {
                { 0, 0, 0, 1, 1, 0 },
                { 0, 0, 1, 1, 0, 0 },
                { 0, 1, 0, 0, 0, 1 },
                { 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 1 },
                { 1, 0, 1, 1, 0, 0 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test5() {

        int[][] entrada = {
                { 1, 1, 1, 0, 1, 0 },
                { 1, 1, 0, 0, 0, 1 },
                { 0, 1, 0, 1, 1, 1 },
                { 0, 1, 0, 1, 0, 1 },
                { 0, 1, 0, 0, 1, 0 },
                { 1, 0, 0, 1, 1, 1 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);
        int[][] saidaEsperada = {
                { 1, 0, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test6() {

        int[][] entrada = {
                { 0, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 1 },
                { 1, 1, 0, 1, 1, 1 },
                { 1, 1, 0, 1, 1, 0 },
                { 1, 1, 0, 0, 1, 0 },
                { 1, 1, 0, 0, 0, 1 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 0, 1, 0, 0, 0 },
                { 1, 0, 0, 1, 0, 1 },
                { 0, 1, 0, 0, 0, 1 },
                { 0, 1, 0, 1, 1, 1 },
                { 0, 1, 0, 1, 0, 1 },
                { 1, 1, 1, 0, 1, 1 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test7() {

        int[][] entrada = {
                { 0, 1, 0, 1, 1, 1 },
                { 0, 0, 1, 0, 1, 0 },
                { 0, 1, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 1 },
                { 0, 0, 0, 1, 0, 0 },
                { 1, 1, 1, 1, 1, 0 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 0, 0, 1, 1, 1 },
                { 0, 0, 1, 0, 1, 1 },
                { 0, 1, 1, 0, 1, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 1, 0, 0, 0, 1, 0 },
                { 1, 1, 1, 1, 1, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test8() {

        int[][] entrada = {
                { 1, 0, 1, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1 },
                { 0, 1, 0, 1, 1, 0 },
                { 0, 1, 0, 1, 0, 1 },
                { 0, 1, 0, 0, 1, 0 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 1, 1, 0, 0, 0 },
                { 1, 0, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test9() {

        int[][] entrada = {
                { 0, 0, 0, 0, 1, 1 },
                { 0, 1, 0, 0, 1, 0 },
                { 1, 1, 1, 1, 1, 1 },
                { 0, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 0, 0, 0, 1, 0, 1 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);
        int[][] saidaEsperada = {
                { 0, 0, 0, 0, 1, 1 },
                { 1, 0, 1, 0, 0, 0 },
                { 1, 0, 0, 1, 0, 0 },
                { 1, 0, 1, 1, 0, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test10() {

        int[][] entrada = {
                { 1, 1, 1, 1, 0, 0 },
                { 0, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 1, 1, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 1, 0 },
                { 0, 0, 1, 1, 1, 0 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 1, 1, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test11() {

        int[][] entrada = {
                { 1, 1, 0, 0, 0, 1 },
                { 0, 1, 0, 1, 0, 0 },
                { 1, 1, 0, 0, 0, 1 },
                { 0, 0, 1, 0, 0, 0 },
                { 1, 1, 0, 1, 0, 0 },
                { 1, 1, 0, 1, 1, 1 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test12() {

        int[][] entrada = {
                { 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 1, 1 },
                { 0, 1, 1, 0, 1, 1 },
                { 1, 0, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 0 },
                { 0, 0, 1, 0, 0, 0 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 1, 1, 0 },
                { 0, 0, 1, 1, 1, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test13() {

        int[][] entrada = {
                { 0, 1, 1, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 0 },
                { 0, 1, 1, 0, 1, 1 },
                { 0, 1, 1, 1, 1, 1 },
                { 1, 1, 0, 1, 1, 0 },
                { 0, 0, 1, 1, 0, 1 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 1, 0, 1, 0, 1, 1 },
                { 1, 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 0, 1, 0, 1, 1 },
                { 0, 0, 1, 1, 0, 1 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test14() {

        int[][] entrada = {
                { 1, 1, 1, 0, 0, 0 },
                { 1, 1, 1, 0, 0, 0 },
                { 1, 0, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 0 },
                { 0, 0, 1, 0, 1, 1 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);
        int[][] saidaEsperada = {
                { 1, 0, 1, 0, 0, 0 },
                { 1, 0, 1, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 1, 1 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test15() {

        int[][] entrada = {
                { 0, 1, 0, 1, 1, 1 },
                { 1, 0, 0, 0, 1, 0 },
                { 1, 1, 1, 1, 1, 0 },
                { 0, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 1 },
                { 1, 1, 1, 0, 0, 0 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 0, 0, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 1, 1 },
                { 0, 1, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test16() {

        int[][] entrada = {
                { 1, 0, 1, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 0, 1, 1, 1, 1, 0 },
                { 1, 0, 1, 1, 0, 0 },
                { 0, 0, 1, 0, 1, 0 },
                { 0, 1, 1, 0, 0, 1 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 1, 0 },
                { 0, 0, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 0, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

    @Test
    public void test17() {
        int[][] entrada = {
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 0, 1, 1, 1, 1 },
                { 1, 0, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 0, 1 },
                { 0, 1, 0, 1, 0, 0 },
        };
        GameOfLife jogoDaVida = new GameOfLife(6, entrada);

        int[][] saidaEsperada = {
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 1 },
                { 0, 1, 0, 0, 0, 0 },
                { 0, 1, 0, 1, 1, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 0, 0 },
        };

        assertArrayEquals(saidaEsperada, jogoDaVida.nextGenMat());
    }

}
