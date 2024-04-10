import static org.junit.jupiter.api.Assertions.*;

class MagicSquareTest {

    private int[][] array2d;
    private int[][] array2d2;
    private int[][] array2d3;
    private int[][] array2d4;
    private int[][] array2d5;
    private int[][] array2d6;
    private int[][] array2d7;
    private int[][] array2d8;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        array2d = new int[][] {
                {2,7,6},
                {9,5,1},
                {4,3,8}
        };

        array2d2 = new int[][] {
                {4,9,2},
                {3,5,7},
                {8,1,6}
        };

        array2d3 = new int[][] {
                {2,16,13,3},
                {11,5,8,10},
                {7,9,12,6},
                {14,4,1,15}
        };

        array2d4 = new int[][] {
                {1,23,16,4,21},
                {15,14,7,18,11},
                {24,17,13,9,2},
                {20,8,19,12,6},
                {5,3,10,22,25}
        };

        array2d5 = new int[][] {
                {7,6,2},
                {5,1,9},
                {3,8,4}
        };

        array2d6 = new int[][] {
                {1,6,8},
                {9,2,4},
                {5,7,3}
        };

        array2d7 = new int[][] {
                {2,16,13,3},
                {11,15,8,0},
                {7,9,12,6},
                {14,4,1,15}
        };

        array2d8 = new int[][] {
                {1,23,16,4,21},
                {15,14,7,18,11},
                {24,0,13,9,2},
                {20,8,19,12,6},
                {5,3,10,22,25}
        };

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        array2d = null;
        array2d2 = null;
        array2d3 = null;
        array2d4 = null;
        array2d5 = null;
        array2d6 = null;
        array2d7 = null;
        array2d8 = null;
    }

    @org.junit.jupiter.api.Test
    void calculateCheckSum() {
        assertTrue(MagicSquare.calculateCheckSum(array2d) == 15);
        assertTrue(MagicSquare.calculateCheckSum(array2d2) == 15);
        assertTrue(MagicSquare.calculateCheckSum(array2d3) == 34);
        assertTrue(MagicSquare.calculateCheckSum(array2d4) == 65);
        assertTrue(MagicSquare.calculateCheckSum(array2d5) == 15);
        assertTrue(MagicSquare.calculateCheckSum(array2d6) == 15);
        assertTrue(MagicSquare.calculateCheckSum(array2d7) == 34);
        assertTrue(MagicSquare.calculateCheckSum(array2d8) == 65);
    }

    @org.junit.jupiter.api.Test
    void magicRows() {
        assertTrue(MagicSquare.magicRows(array2d, MagicSquare.calculateCheckSum(array2d)) == true);
        assertTrue(MagicSquare.magicRows(array2d2, MagicSquare.calculateCheckSum(array2d2)) == true);
        assertTrue(MagicSquare.magicRows(array2d3, MagicSquare.calculateCheckSum(array2d3)) == true);
        assertTrue(MagicSquare.magicRows(array2d4, MagicSquare.calculateCheckSum(array2d4)) == true);
        assertTrue(MagicSquare.magicRows(array2d5, MagicSquare.calculateCheckSum(array2d5)) == true);
        assertTrue(MagicSquare.magicRows(array2d6, MagicSquare.calculateCheckSum(array2d6)) == true);
        assertTrue(MagicSquare.magicRows(array2d7, MagicSquare.calculateCheckSum(array2d7)) == true);
        assertTrue(MagicSquare.magicRows(array2d8, MagicSquare.calculateCheckSum(array2d8)) == false);
    }

    @org.junit.jupiter.api.Test
    void magicColumns() {
        assertTrue(MagicSquare.magicColumns(array2d, MagicSquare.calculateCheckSum(array2d)) == true);
        assertTrue(MagicSquare.magicColumns(array2d2, MagicSquare.calculateCheckSum(array2d2)) == true);
        assertTrue(MagicSquare.magicColumns(array2d3, MagicSquare.calculateCheckSum(array2d3)) == true);
        assertTrue(MagicSquare.magicColumns(array2d4, MagicSquare.calculateCheckSum(array2d4)) == true);
        assertTrue(MagicSquare.magicColumns(array2d5, MagicSquare.calculateCheckSum(array2d5)) == true);
        assertTrue(MagicSquare.magicColumns(array2d6, MagicSquare.calculateCheckSum(array2d6)) == true);
        assertTrue(MagicSquare.magicColumns(array2d7, MagicSquare.calculateCheckSum(array2d7)) == false);
        assertTrue(MagicSquare.magicColumns(array2d8, MagicSquare.calculateCheckSum(array2d8)) == false);
    }
    @org.junit.jupiter.api.Test
    void magicDiagonals() {
        assertTrue(MagicSquare.magicDiagonals(array2d, MagicSquare.calculateCheckSum(array2d)) == true);
        assertTrue(MagicSquare.magicDiagonals(array2d2, MagicSquare.calculateCheckSum(array2d2)) == true);
        assertTrue(MagicSquare.magicDiagonals(array2d3, MagicSquare.calculateCheckSum(array2d3)) == true);
        assertTrue(MagicSquare.magicDiagonals(array2d4, MagicSquare.calculateCheckSum(array2d4)) == true);
        assertTrue(MagicSquare.magicDiagonals(array2d5, MagicSquare.calculateCheckSum(array2d5)) == false);
        assertTrue(MagicSquare.magicDiagonals(array2d6, MagicSquare.calculateCheckSum(array2d6)) == false);
        assertTrue(MagicSquare.magicDiagonals(array2d7, MagicSquare.calculateCheckSum(array2d7)) == false);
        assertTrue(MagicSquare.magicDiagonals(array2d8, MagicSquare.calculateCheckSum(array2d8)) == true);
    }
    @org.junit.jupiter.api.Test
    void isMagic() {
        assertTrue(MagicSquare.isMagic(array2d) == true);
        assertTrue(MagicSquare.isMagic(array2d2) == true);
        assertTrue(MagicSquare.isMagic(array2d3) == true);
        assertTrue(MagicSquare.isMagic(array2d4) == true);
        assertTrue(MagicSquare.isMagic(array2d5) == false);
        assertTrue(MagicSquare.isMagic(array2d6) == false);
        assertTrue(MagicSquare.isMagic(array2d7) == false);
        assertTrue(MagicSquare.isMagic(array2d8) == false);
    }

}