package Client;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int l = 0;
        int i = 1;
        Stock stock1 = new Stock(SQL.remplirStock());

        for(int j = 0; j < 20; j++)
        {
            stock1.afficherStock(j,i);
            i++;
        }
    }
}