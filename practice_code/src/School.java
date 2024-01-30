import java.util.Scanner;
public class School {}
     /*   Scanner s = new Scanner(System.in);
        public void age10() {
            System.out.print("how old are you ");
            int age = s.nextInt();
            System.out.print("whats your name? ");
            String name = s.next();
            System.out.println("wait so ur " + name + " and your");
        }
        public void TwoDimensionalArray() {
            int x = 0;
            int y = 0;
            int turns = 0;

            String[][] grid = new String[3][3];//creates a 3x3 2d array
            String[] symbol = new String[2];

            PrintGrid(grid);

            System.out.print("do you want to be naughts(0) or crosses(1)? ");
            int icon = s.nextInt();

            Selection(symbol, icon);

            while (turns < 9) {
                for (int player = 0; player < 2; ) {
                    boolean o = CoordinateValidation(x, y, grid, symbol, player);
                    if(o==true){
                        System.out.println(player);
                        IconImplementer(x, y, grid, symbol);
                        System.out.println(turns);
                        player++;
                        turns++;

                    } else{ System.out.println(turns);
                }
            }
        }
    }
        public void PrintGrid(String[][]g) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    g[i][j] = "[ ]";
                    System.out.print(g[i][j]);
                }
                System.out.println("");
            }
        }
        public void Selection(String[]s, int icon1){
            if (icon1 == 1) {
                s[0] = "[x]";
                s[1] = "[0]";
            } else {
                s[0] = "[0]";
                s[1] = "[x]";
            }
        }
        public boolean CoordinateValidation(int x, int y, String[][]g, String[] sy, int p) {
            System.out.println("what is the  x-coordinate? ");
            x = s.nextInt();
            System.out.println("what is the  y-coordinate? ");
            y = s.nextInt();
            if (g[x][y] != "[ ]") {
                System.out.println("invalid position choose another coordinate");
                return false;
            } else {
                g[x][y] = sy[p];
                return true;
            }
        }
        public void IconImplementer (int x,int y,String[][]g,String[]s){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (g[x][y] != g[i][j]) {
                        System.out.print(g[i][j]);
                    } else {
                        System.out.print(g[x][y]);
                    }
                }
                System.out.println("");
            }
        }
        public void WinCheck(String[][]g,String[]sy,int p){
        for (int u=0;u<3;u++)
            for(int z=0;int z<3,z++){
            if (g[z][u]
            }






        }
        public int max2(int n1, int n2) {
            if (n1 > n2) {
                //   n1++;
                return n1;
            } else {
                //   n2++;
                return n2;
            }
        }
        public void testmax() {
            int n1 = 4;
            int n2 = 6;
            int biggest = 0;
            biggest = max2(n1, n2);
            System.out.println(biggest);
            System.out.println(n2);
        }
        public void testArea() {
            int i = 0;
            String[][] test = new String[3][3];
            while (i < 3) {
                test[i][2] = "ham";
                if (test[i][2] != "jndsjo") {

                    System.out.println("aouvndou");
                    i++;
                }
            }
        }
    }

*/
