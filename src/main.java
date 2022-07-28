public class main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80; // вес в килограммах
        double height = 1.75; // рост в метрах
        double imt = service.calculate(weight, height); // индекс массы тела

        System.out.println("Индекс массы тела составляет: " + imt);


    }

}
