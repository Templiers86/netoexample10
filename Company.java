import taxes.TaxSystem;

public class Company {

    private String title; // Название
    private int debit = 0; // Доход
    private int credit = 0; // Расход
    private TaxSystem taxSystem; // Система налогооблажения

    public void setTaxSystem(TaxSystem taxSystem){
        this.taxSystem = taxSystem;

    }
    // Конструктор, debit и credit изначально равны нулю
    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;

    }
    public void shiftMoney(int amount) {
        if(amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        } else {
            System.out.println("Количество равно нулю");
        }
    }

    public void payTaxes(){
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Контора " + title + " выплатила налог " + tax + " фантиков" );
        debit = 0;
        credit = 0;
    }
}
