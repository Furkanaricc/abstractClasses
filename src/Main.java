public class Main {

    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculator[] gameCalculators = {new KidsGameCalculator(), new WomenGameCalculator(), new ManGameCalculator(),new OlderGameCalculator()};
        for (GameCalculator calculator : gameCalculators) {

            calculator.gameOver();
            calculator.hesapla();
        }

    }
}
