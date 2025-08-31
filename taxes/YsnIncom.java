package taxes;

public class YsnIncom extends TaxSystem  {

    public static int calIn(int debit){
        int meaning1 = debit * 6 /100;
        if(meaning1 >= 0) {
            return meaning1;
        } else {
            return 0;

        }
    }
}
