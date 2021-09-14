public class BonusMilesService {
    public int calculate(int ticketCostRub) {
        int oneMileCostRub = 20;
        int milesAmount = ticketCostRub / oneMileCostRub;
        return milesAmount;
    }
}

