package domain;

public class Customer {
    // Приватні атрибути класу
    private int ID;           // Унікальний ідентифікатор клієнта
    private boolean isNew;    // Показує чи клієнт новий (true) чи постійний (false)
    private double total;     // Загальна сума замовлень клієнта за рік

    public Customer() {
        this.ID = 1;         // Встановлюємо початковий ID
        this.isNew = true;   // За замовчуванням клієнт вважається новим
        this.total = 1000.0; // Початкова сума замовлень
    }

    public void displayCustomerInfo() {
        // Виводимо ID клієнта
        System.out.println("Customer ID: " + ID);
        
        // Виводимо статус клієнта
        System.out.println("Customer status: " + isNew);
        
        // Виводимо загальну суму покупок клієнта
        System.out.println("Total purchases are: " + total);
    }

    public boolean setID(int newID) {
        if (newID > 0) {
            this.ID = newID;
            return true;
        }
        return false;
    }

    public void setStatus(boolean status) {
        this.isNew = status;
    }

    public boolean setTotal(double newTotal) {
        if (newTotal >= 0) {
            this.total = newTotal;
            return true;
        }
        return false;
    }
}



