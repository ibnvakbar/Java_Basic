import java.util.Scanner;

public class Dungeon {
    public static final String PETA_DUNGEON_HEADER = "Peta Dungeon %s#";
    public static final String SUCCESS = "Bisa keluar";
    public static final String UNSUCCESS = "Tidak bisa keluar";
    private int numArtefact = 0;
    private char arMapChar[][];
    private int n, m, noDungeon;
    private boolean escape = false;
    private int start[];


    public Dungeon(int noDungeon, int n, int m, char arMapCHar[][]) {
        this.n = n;
        this.m = m;
        this.arMapChar = arMapCHar;
        this.noDungeon = noDungeon;
        start = findS();
        findPath(start[0], start[1]);
    }

    private boolean findPath(int i, int j) {
        if (i < 0 || i > n - 1 || j < 0 || j > m - 1) return false;

        if (arMapChar[i][j] == 'X') {
            escape = true;
            return true;
        }

        if (arMapChar[i][j] == 'A') {
            arMapChar[i][j] = 'o';
            numArtefact++;
            // If find_path North of x,y is true, return true.
            if (findPath(i, j - 1) == true) return true;

            // If find_path East of x,y is true, return true.
            if (findPath(i + 1, j) == true) return true;

            // If find_path South of x,y is true, return true.
            if (findPath(i, j + 1) == true) return true;

            // If find_path West of x,y is true, return true.
            if (findPath(i - 1, j) == true) return true;
        }

        // If x,y is not open, return false.
        if (arMapChar[i][j] != '.' && arMapChar[i][j] != 'S') return false;

        // Mark x,y part of solution path.
        arMapChar[i][j] = '+';

        // If find_path North of x,y is true, return true.
        if (findPath(i, j - 1) == true) return true;

        // If find_path East of x,y is true, return true.
        if (findPath(i + 1, j) == true) return true;

        // If find_path South of x,y is true, return true.
        if (findPath(i, j + 1) == true) return true;

        // If find_path West of x,y is true, return true.
        if (findPath(i - 1, j) == true) return true;

        // Unmark x,y as part of solution path.
        arMapChar[i][j] = 'x';

        return false;
    }

    public void showAr() {
        for (char x[] : arMapChar) {
            for (char z : x) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
    }

    public int getNumArtefact() {
        return numArtefact;
    }

    public boolean isEscape() {
        return escape;
    }

    public int[] findS() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arMapChar[i][j] == 'S') {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public int getNoDungeon() {
        return noDungeon;
    }

    public static Dungeon compareDungeon(Dungeon dungeon[]) {
        Dungeon tmp = dungeon[0];
        int tmpArtefact = 0;
        for (Dungeon d : dungeon) {
            if (tmpArtefact < d.getNumArtefact() && d.isEscape()) {
                tmpArtefact = d.getNumArtefact();
                tmp = d;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Dungeon dungeon[];
        char mapChar[][];
        int t, n, m;
        String map;
        Scanner scn = new Scanner(System.in);
        t = scn.nextInt();
        dungeon = new Dungeon[t];
        for (int i = 0; i < t; i++) {
            n = scn.nextInt();
            m = scn.nextInt();
            mapChar = new char[n][m];

            for (int j = 0; j < n; j++) {
                mapChar[j] = scn.next().toCharArray();
            }
            dungeon[i] = new Dungeon(i + 1, n, m, mapChar);

        }

        for (Dungeon d : dungeon) {
            System.out.println(String.format(PETA_DUNGEON_HEADER, d.getNoDungeon()));
            System.out.println(d.getNumArtefact());
            System.out.println(d.isEscape() ? SUCCESS : UNSUCCESS);
        }
        System.out.println(String.format("Dungeon yang dipilih adalah dungeon nomor %d", compareDungeon(dungeon).getNoDungeon()));
    }
}