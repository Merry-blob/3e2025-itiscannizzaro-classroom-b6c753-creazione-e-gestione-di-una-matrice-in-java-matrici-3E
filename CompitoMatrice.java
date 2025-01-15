import java.util.Arrays;
import java.util.Scanner;

public class CompitoMatrice {
    public static void main(String[] args){
        int colonne = 0, righe = 0, obliquo = 0, question = 0;
        Scanner input = new Scanner(System.in);
        int[][]Matrice = new int[3][3];
        while (question < 1 || question > 3){
            System.out.println("Inserire opzione: COLONNE(1)  RIGHE(2)  OBLIQUO(3)");
            question = input.nextInt();
            if (question < 1 || question > 3){
                System.out.println("ERRORE - SOLO VALORI 1, 2, 3 SOLO VALIDI");
            }
        }
        switch (question){
            case 1:
                while (colonne < 1 || colonne > 3){
                    System.out.println("Inserire numero della colonna (1, 2, 3)");
                    colonne = input.nextInt();
                    if (colonne < 1 || colonne > 3){
                        System.out.println("ERRORE - SOLO VALORI 1, 2, 3 SOLO VALIDI");
                    }
                }
                colonne -= 1;
                for (int i = 0; i < Matrice[0].length; i++){
                    for (int u = 0; u < Matrice[i].length; u++){
                        if(colonne == i){
                            Matrice[u][i] = 1;
                        }
                    }
                }
                break;
            case 2:
                while (righe < 1 || righe > 3){
                    System.out.println("Inserire numero della riga (1, 2, 3)");
                    righe = input.nextInt();
                    if (righe < 1 || righe > 3){
                        System.out.println("ERRORE - SOLO VALORI 1, 2, 3 SOLO VALIDI");
                    }
                }
                righe -= 1;
                for (int i = 0; i < Matrice[0].length; i++){
                    for (int u = 0; u < Matrice[i].length; u++){
                        if(righe == i){
                            Matrice[i][u] = 1;
                        }
                    }
                }
                break;
            case 3:
                while (obliquo < 1 || obliquo > 3){
                    System.out.println("Inserire numero della linea SINISTRA(1)  DESTRA(2)");
                    obliquo = input.nextInt();
                    if (obliquo < 1 || obliquo > 3){
                        System.out.println("ERRORE - SOLO VALORI 1, 2 SOLO VALIDI");
                    }
                }
                obliquo -= 1;
                if (obliquo == 0){
                    for (int i = 0, o = 0; i < Matrice[0].length; i++, o++){
                        Matrice[i][o] = 1;
                    }
                }else{
                    for (int i = 0, o = 2; i < Matrice[0].length; i++, o--){
                        Matrice[i][o] = 1;
                    }
                }
                break;
        }
        System.out.println(Arrays.toString(Matrice[0]));
        System.out.println(Arrays.toString(Matrice[1]));
        System.out.println(Arrays.toString(Matrice[2]));
    }
}
