public class App {
    public static void main(String[] args) throws Exception {
        
        double ga1, ga2, ga3; 
        double premio = 780000;

        ga1 = premio * 0.46;
        ga2 = premio * 0.32;
        ga3 = premio - ga1 - ga2;

        System.out.printf("O primeiro ganhador receberá: R$ %.2f\n", ga1);
        System.out.printf("O segundo ganhador receberá: R$ %.2f\n" , ga2);
        System.out.printf("O terceiro ganhador receberá: R$ %.2f\n\n\n" , ga3);
    }
}
