package taxes;

public class YsnMinusIncom extends TaxSystem {

    public static int calInMin(int debit, int credit) {
        int meaning2 = (debit - credit) * 15 / 100;
        if(meaning2 >= 0) {
            return meaning2;
        } else {
            return 0;
        }
    }
}
