public class Arrays {

    public static void main(String[] args) {
        int[][] matriz = new int[4][7];
        matriz[0][0] = 1;matriz[1][0] = 1;matriz[0][1] = 1;matriz[2][1] = 1;
        matriz[0][2] = 0;matriz[1][2] = 0;matriz[2][2] = 1;matriz[3][2] = 1;
        matriz[0][3] = 1;matriz[1][3] = 0;matriz[2][3] = 0;matriz[3][3] = 0;
        matriz[0][4] = 1;matriz[1][4] = 1;matriz[2][4] = 1;matriz[3][4] = 0;
        matriz[0][5] = 1;matriz[1][5] = 0;matriz[2][5] = 1;matriz[3][5] = 1;
        matriz[0][6] = 1;matriz[1][6] = 0;matriz[2][6] = 0;matriz[3][6] = 1;
        
        System.out.println("Tabela Verdade\n----------------------------------------------------------------------");
        System.out.printf("    %s    |    %s    |   %s    |  %s  |  %s  |  %s | %s |", "p", "q", "~p", "p ^ q", "p v q", "p -> q", "p <-> q");
        System.out.println("");
        for (int i=0; i<4; i++) {
            for (int j=0; j<7; j++) {
                System.out.printf("    %d    |", matriz[i][j]);
            }
            System.out.println("");
        }
    }
}