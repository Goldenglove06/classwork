import java.util.Scanner;

public class Library {
    Scanner q = new Scanner(System.in);

    public void OneDimensionalArray() {
        System.out.print("how wide? ");
        int y = q.nextInt();
        String[] width = new String[y];
        int i = 0;
        while (i < y) {
            width[i] = "x";
            System.out.print(width[i]);
            i = i + 1;


        }
    }


    public void TwoDimensionalArray() {
        String[][] grid = new String[3][3];//creates a 3x3 2d array
        int turns = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = "[ ]";
                System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
        System.out.println("do you want to be naughts(0) or crosses(1)? ");
        int icon = q.nextInt();
        String[] symbol = new String[2];
        if (icon == 1) {
            symbol[0] = "[x]";
            symbol[1] = "[0]";
        } else {
            symbol[0] = "[0]";
            symbol[1] = "[x]";
        }
        while (turns < 9) {
            for (int player = 0; player < 2; ) {
                System.out.println("what is the  x-coordinate? ");
                int x = q.nextInt();
                System.out.println("what is the  y-coordinate? ");
                int y = q.nextInt();
                if (grid[x][y] != "[ ]") {
                    System.out.println("invalid position choose another coordinate");
                } else {
                    grid[x][y] = symbol[player];
                    player++;

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (grid[x][y] != grid[i][j]) {
                                System.out.print(grid[i][j]);
                            } else {
                                System.out.print(grid[x][y]);
                            }

                        }
                        System.out.println("");
                    }
                    turns++;//increments by 1
                }
            }
        }
    }
}

