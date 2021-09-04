public class BonusMilesService {
    public int calculate(double price)
    {
        int milePrice = 20;
        int countMile = (int) price/milePrice;
        return countMile;
    }
}