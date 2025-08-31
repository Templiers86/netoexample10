package taxes;

public class YsnMinusIncom extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        int meaning2 = debit - credit;
        if (meaning2 < 0) meaning2 = 0;
        return meaning2 * 15 / 100;

    }
}



