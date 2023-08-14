
public class Test27 {

    public static void main(String[] args) {
        int m = 36;

        int[][] p0 = {
            {7, 9, 16},
            {5, 21, 11},
            {0, 27, 22},
            {2, 4, 15},
            {6, 25, 14},
            {3, 17, 28},
            {6, 34, 15},
            {15, 7, 15},
            {4, 15, 12},
            {28, 18, 3},
            {2, 33, 30},
            {12, 11, 10},
            {14, 28, 7},
            {5, 32, 4},
            {25, 11, 1},
            {7, 30, 23},
            {23, 27, 7},
            {7, 8, 3},
            {20, 29, 10},
            {5, 19, 18},
            {18, 24, 15},
            {7, 12, 26},
            {13, 32, 22},
            {0, 13, 9},
            {6, 11, 5},
            {32, 26, 4},
            {18, 23, 14},
            {12, 10, 9},
            {18, 5, 12},
            {7, 31, 11},
            {18, 16, 16},
            {10, 22, 25},
            {2, 3, 27},
            {0, 35, 23},
            {3, 25, 3},
            {1, 6, 34},
            {2, 29, 14},
            {3, 7, 5},
            {25, 10, 11},
            {27, 9, 8},
            {1, 2, 34},
            {25, 14, 7},
            {25, 13, 7},
            {29, 28, 7},
            {23, 19, 4},
            {3, 18, 24},
            {0, 28, 5},
            {8, 23, 6},
            {17, 26, 13},
            {6, 10, 6},
            {1, 32, 2},
            {9, 1, 16},
            {30, 1, 6},
            {0, 14, 8},
            {7, 5, 5},
            {2, 15, 2},
            {3, 20, 27},
            {9, 7, 2},
            {25, 8, 5},
            {6, 30, 1},
            {22, 15, 13},
            {22, 21, 4},
            {27, 4, 5},
            {15, 8, 3},
            {0, 5, 6},
            {31, 31, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {22, 17, 9},
            {6, 2, 17},
            {8, 25, 9},
            {3, 22, 2},
            {14, 15, 16},
            {26, 31, 2},
            {2, 10, 21},
            {14, 16, 22},
            {15, 30, 21},
            {0, 28, 16},
            {13, 14, 18},
            {0, 16, 3},
            {2, 18, 16},
            {30, 4, 5},
            {12, 4, 10},
            {6, 26, 8},
            {9, 6, 20},
            {17, 24, 10},
            {15, 23, 12},
            {16, 26, 15},
            {14, 7, 21},
            {4, 35, 13},
            {17, 35, 18},
            {16, 20, 4},
            {9, 5, 1},
            {16, 34, 6},
            {4, 8, 15},
            {21, 8, 4},
            {4, 12, 12},
            {2, 33, 19},
            {24, 1, 5},
            {2, 6, 3},
            {11, 3, 5},
            {3, 27, 21},
            {2, 17, 7},
            {14, 22, 10},
            {18, 13, 2},
            {6, 22, 7},
            {10, 5, 15},
            {22, 21, 12},
            {1, 9, 19},
            {19, 12, 11},
            {16, 3, 3},
            {11, 24, 6},
            {3, 19, 15},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {22, 21, 2},
            {25, 21, 3},
            {14, 26, 1},
            {9, 20, 3},
            {18, 6, 1},
            {35, 25, 1},
            {9, 33, 1},
            {25, 2, 3},
            {12, 13, 2},
            {13, 28, 3},
            {25, 26, 1},
            {13, 27, 3},
            {18, 1, 3},
            {3, 21, 1},
            {29, 23, 3},
            {24, 33, 2},
            {3, 15, 2},
            {31, 33, 1},
            {9, 17, 2},
            {9, 22, 2},
            {21, 19, 2},
            {17, 16, 1},
            {23, 34, 3},
            {3, 34, 3},
            {23, 24, 3},
            {27, 32, 3},
            {14, 6, 2},
            {1, 16, 1},
            {6, 5, 3},
            {15, 7, 1},
            {21, 28, 1},
            {16, 23, 1},
            {6, 35, 2},
            {9, 21, 3},
            {25, 9, 3},
            {0, 29, 1},
            {24, 10, 3},
            {9, 15, 1},
            {15, 14, 3},
            {12, 31, 1},
            {16, 18, 1},
            {5, 25, 2},
            {23, 26, 2},
            {7, 1, 2},
            {33, 2, 3},
            {8, 18, 2},
            {27, 34, 1},
            {11, 28, 2},
            {23, 30, 1},
            {1, 22, 2},
            {11, 12, 2},
            {12, 21, 3},
            {9, 2, 3},
            {6, 3, 1},
            {6, 17, 1},
            {2, 5, 2},
            {4, 6, 1},
            {22, 14, 2},
            {26, 35, 2},
            {12, 26, 1},
            {12, 30, 2},
            {29, 26, 2},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {11, 20, 12},
            {17, 24, 13},
            {4, 2, 14},
            {14, 34, 17},
            {8, 13, 12},
            {7, 14, 16},
            {11, 17, 12},
            {14, 5, 7},
            {8, 35, 15},
            {28, 28, 1},
            {16, 23, 15},
            {13, 32, 12},
            {13, 12, 19},
            {31, 18, 4},
            {29, 21, 7},
            {0, 16, 6},
            {0, 28, 14},
            {5, 26, 12},
            {18, 7, 16},
            {26, 29, 2},
            {29, 29, 4},
            {31, 13, 4},
            {22, 10, 11},
            {20, 3, 13},
            {12, 18, 17},
            {26, 27, 1},
            {14, 19, 19},
            {8, 3, 7},
            {11, 33, 19},
            {2, 25, 13},
            {13, 16, 19},
            {18, 4, 12},
            {5, 10, 17},
            {21, 22, 2},
            {10, 1, 20},
            {11, 23, 2},
            {20, 13, 6},
            {2, 21, 19},
            {0, 8, 10},
            {11, 8, 8},
            {24, 31, 4},
            {30, 2, 6},
            {3, 15, 19},
            {0, 22, 6},
            {23, 5, 11},
            {34, 32, 1},
            {6, 29, 8},
            {2, 9, 6},
            {27, 35, 5},
            {23, 9, 13},
            {21, 6, 6},
            {29, 28, 3},
            {2, 2, 2},
            {0, 30, 1},
            {0, 11, 12},
            {22, 27, 1},
            {25, 11, 10},
            {8, 20, 1},
            {26, 15, 9},
            {9, 9, 10},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {13, 10, 3},
            {19, 5, 5},
            {29, 2, 2},
            {34, 6, 1},
            {24, 5, 5},
            {4, 34, 6},
            {22, 34, 3},
            {25, 3, 3},
            {28, 34, 1},
            {17, 14, 1},
            {20, 3, 3},
            {18, 9, 6},
            {13, 8, 5},
            {25, 24, 3},
            {6, 18, 4},
            {9, 7, 1},
            {25, 10, 6},
            {5, 31, 5},
            {4, 17, 2},
            {8, 2, 4},
            {4, 3, 6},
            {2, 15, 1},
            {5, 14, 1},
            {22, 16, 5},
            {13, 24, 2},
            {5, 33, 2},
            {16, 21, 2},
            {16, 16, 2},
            {17, 26, 1},
            {6, 8, 3},
            {10, 14, 6},
            {30, 34, 2},
            {34, 30, 2},
            {22, 20, 3},
            {14, 29, 5},
            {29, 35, 5},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}