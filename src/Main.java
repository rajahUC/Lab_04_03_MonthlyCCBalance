import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        final int CREDIT_CARD_BALANCE = 5000;
        final double INTEREST_RATE = 0.17;
        double monthOneInterest = 0;
        double monthTwoInterest = 0;

        monthOneInterest = CREDIT_CARD_BALANCE * INTEREST_RATE;
        System.out.println("The interest due after one month is " + monthOneInterest);

        monthTwoInterest = (CREDIT_CARD_BALANCE + monthOneInterest) * INTEREST_RATE;
        System.out.println("The interest due after two months is " + monthTwoInterest);
    }
}