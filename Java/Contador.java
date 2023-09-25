public class Contador {
    public static void main(String[] args) {
        for (int carneirinho = 1; carneirinho <= 20; carneirinho++) {

            if (carneirinho == 13)
                // break;
                continue;

            System.out.println(carneirinho + "° carneirinho");
        }

    }

}
