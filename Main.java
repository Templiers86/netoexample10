import taxes.TaxSystem;
import taxes.YsnIncom;
import taxes.YsnMinusIncom;

public class Main {
    public static void main(String[] args) {


        TaxSystem ysnIncom = new YsnIncom();
        TaxSystem ysnMinusIncomName = new YsnMinusIncom();
        Company company = new Company("барбершоп для пингвинов", ysnIncom);

        company.shiftMoney(200_000);
        company.shiftMoney(-50_000);
        company.payTaxes();

        company.setTaxSystem(ysnMinusIncomName);
        company.shiftMoney(100_000);
        company.shiftMoney(-10_000);
        company.payTaxes();
    }
}