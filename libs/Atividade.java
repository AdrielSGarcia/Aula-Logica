package libs;

public class Atividade {
    public static void verificarToldo(int w,int x, int y, int z){
        if(x != 0 || x != 1 || w != 0 || w != 1 || y != 0 || y != 1 || z != 0 || z != 1){
            System.out.println("Valores incorretos!");
        }else if( w == 0 && x == 0 && y == 0 && z == 0){
            System.out.println("Toldo não abaixa");
        } else if(w == 0 && x == 0 && y == 0 && z == 1){
            System.out.println("Toldo não abaixa");
        } else if(w == 1 && x == 0 && y == 0 && z == 1){
            System.out.println("Toldo não abaixa");
        } else{
            System.out.println("Toldo abaixa");
        }
    }
}
