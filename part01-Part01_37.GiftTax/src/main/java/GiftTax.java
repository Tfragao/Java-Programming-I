
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        double tax;
        
        /*
         Varaibles naming gave some warning with match pattern, 
         the code that eas submit to server and pass all the test was with
         raw numbers instead of the below variables constant
        */
        final int GIFT_FIVE_THOUSAND = 5000;
        final int GIFT_TWENTY_FIVE_THOUSAND = 25000;
        final int GIFT_FIFTY_FIVE_THOUSAND = 55000;
        final int GIFT_TWO_HUNDRED_THOUSAND = 200000;
        final int GIFT_ONE_MILLION = 1000000;
        final int TAX_LOWER_LIMIT_100 = 100;
        final int TAX_LOWER_LIMIT_1700 = 1700;
        final int TAX_LOWER_LIMIT_4700 = 4700;
        final int TAX_LOWER_LIMIT_22100 = 22100;
        final int TAX_LOWER_LIMIT_142100 = 142100;
        final double TAX_RATE_8_PERCENT = 0.08; 
        final double TAX_RATE_10_PERCENT = 0.1;
        final double TAX_RATE_12_PERCENT = 0.12;
        final double TAX_RATE_15_PERCENT = 0.15;
        final double TAX_RATE_17_PERCENT = 0.17;
        
        if (gift < GIFT_FIVE_THOUSAND)
        {
            System.out.println("No tax!");
        } 
        else if (gift >= GIFT_FIVE_THOUSAND && gift < GIFT_TWENTY_FIVE_THOUSAND)
        {
            tax = (TAX_LOWER_LIMIT_100 + (gift- GIFT_FIVE_THOUSAND) * TAX_RATE_8_PERCENT);
            System.out.println("Tax:" + tax);
        } 
        else if (gift >= GIFT_TWENTY_FIVE_THOUSAND && gift < GIFT_FIFTY_FIVE_THOUSAND)
        {
            tax = (TAX_LOWER_LIMIT_1700 + (gift - GIFT_TWENTY_FIVE_THOUSAND) * TAX_RATE_10_PERCENT);
            System.out.println("Tax:" + tax);
        } 
        else if (gift >= GIFT_FIFTY_FIVE_THOUSAND && gift < GIFT_TWO_HUNDRED_THOUSAND)
        {
            tax = (TAX_LOWER_LIMIT_4700 + (gift - GIFT_FIFTY_FIVE_THOUSAND) * TAX_RATE_12_PERCENT);
            System.out.println("Tax:" + tax);
        } 
        else if (gift >= GIFT_TWO_HUNDRED_THOUSAND && gift < GIFT_ONE_MILLION)
        {
            tax = (TAX_LOWER_LIMIT_22100 + (gift - GIFT_TWO_HUNDRED_THOUSAND) * TAX_RATE_15_PERCENT);
            System.out.println("Tax:" + tax);
        } 
        else if (gift >= GIFT_ONE_MILLION)
        {
            tax = (TAX_LOWER_LIMIT_142100 + (gift - GIFT_ONE_MILLION) * TAX_RATE_17_PERCENT);
            System.out.println("Tax:" + tax);
        }
    }
}
