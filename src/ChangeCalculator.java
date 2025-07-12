public class ChangeCalculator {
    public static void main(String[] args) {
        int a = 10, b = 20; // Cost breakdown
        int purchase = a + b; // Total purchase
        int amountGiven = 500;

        int returnAmt = amountGiven - purchase;
        System.out.println("Return Amount: " + returnAmt);

        int[] denominations = {500, 100, 50, 10};

        for (int denom : denominations) {
            int count = returnAmt / denom;
            if (count > 0) {
                System.out.println(denom + " * " + count);
                returnAmt -= count * denom;
            }
        }

        if (returnAmt > 0) {
            System.out.println("Remaining unreturned amount: " + returnAmt);
        }
    }
}
