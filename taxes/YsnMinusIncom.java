package taxes;

public class YsnMinusIncom extends TaxSystem {
    @Override
    public static int YsnMinusIncom(int debit, int credit) {
        int tax = (debit - credit) * 15 / 100;
        if(tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
