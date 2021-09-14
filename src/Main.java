public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int ticketCostRub =50;
        int milesAmount = service.calculate(ticketCostRub);
        System.out.println(milesAmount);
    }
}
