import taxes.TaxSystem;

public class Company {

    private String title; // Название
    private int debit; // Доход
    private int credit; // Расход
    private TaxSystem taxSystem; // Система налогооблажения

    // Конструктор, debit и credit изначально равны нулю
    public Company(String title, int debit, int credit, TaxSystem taxSystem) {
        this.title = title;
        this.debit = 0;
        this.credit = 0;
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


}
