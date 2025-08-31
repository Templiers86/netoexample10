package taxes;

public class YsnIncom extends TaxSystem  {

    public static int YsnIncom(int debit){
        int tax = debit * 6 /100;
        if(tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
