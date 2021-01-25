package com.augy.gameoflife;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class GameoflifeApplicationTests {
    private final int[][] initialGrid =
            {
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                    {0, 0, 1, 0, 0, 0, 1, 0, 0, 0,},
                    {0, 1, 0, 1, 0, 0, 1, 0, 0, 0,},
                    {0, 0, 1, 0, 0, 0, 1, 0, 0, 0,},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                    {0, 1, 1, 0, 0, 0, 0, 0, 0, 0,},
                    {0, 1, 1, 0, 0, 0, 0, 0, 0, 0,},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            };

    @Test
    void test1Iteration() {
        var engine = new GameOfLifeEngine(10, 10);
        int[][] firstGen = engine.nextGeneration(initialGrid);
        int[][] expected =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 1, 0, 1, 0, 1, 1, 1, 0, 0,},
                        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 1, 1, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 1, 1, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                };
        assertArrayEquals(expected, firstGen);
    }

    @Test
    void test2Iteration() {
        var engine = new GameOfLifeEngine(10, 10);
        int[][] res = initialGrid;
        for (int i = 1; i <= 2; i++) {
            res = engine.nextGeneration(res);
        }

        assertArrayEquals(initialGrid, res);
    }

}
