public class DiscountRate {
    private static final double serviceDiscountRatePremium = 0.2;
    private static final double serviceDiscountRateGold = 0.15;
    private static final double serviceDiscountRateSilver = 0.1;
    private static final double productDiscountRatePremium = 0.1;
    private static final double productDiscountRateGold = 0.1;
    private static final double productDiscountRateSilver = 0.1;
    public static double getServiceDiscountRate (String type) {
        double rate = 0;
        switch (type) {
            case "Premium":
                rate = serviceDiscountRatePremium;
                break;
            case "Gold":
                rate = serviceDiscountRateGold;
                break;
            case "Silver":
                rate = serviceDiscountRateSilver;
                break;
            default:
                rate = 1;
                break;
        }
        return rate;
    }
    public static double getProductDiscountRate (String type) {
        double rate = 0;
        switch (type) {
            case "Premium":
                rate = productDiscountRatePremium;
                break;
            case "Gold":
                rate = productDiscountRateGold;
                break;
            case "Silver":
                rate = productDiscountRateSilver;
                break;
            default:
                rate = 1;
                break;
        }
        return rate;
    }
}
