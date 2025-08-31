package taxes;

public class YsnIncom extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * 6 / 100;

    }
}
