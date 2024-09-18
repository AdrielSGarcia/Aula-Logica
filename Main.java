import libs.*;

public class Main{
    public static void main(String[] args){
        Entrada.abrir();

        int w = Entrada.lerInteiro("Insira 1 se faz Sol ou 0 se estiver de noite");
        int x = Entrada.lerInteiro("Insira 1 se está chovendo ou 0 se não estiver");
        int y = Entrada.lerInteiro("Insira 1 se faz vento ou 0 se não estiver ventando");
        int z = Entrada.lerInteiro("Insira 1 se faz frio ou 0 se não fizer frio");
        
        Atividade.verificarToldo(w, x, y, z);
    }
}