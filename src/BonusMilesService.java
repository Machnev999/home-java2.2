public class BonusMilesService {
    public int calculate(int price) {
        int milePrice = 20;
        int countMile = price / milePrice;
        return countMile;
    }
}
