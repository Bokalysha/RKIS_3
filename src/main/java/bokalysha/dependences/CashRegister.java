package bokalysha.dependences;

/**
 * Класс CashRegister представляет объект кассового аппарата, в котором хранятся деньги.
 * Он реализует интерфейс ObjectInformation.
 */
public class CashRegister implements ObjectInformation {
    private double money;

    /**
     * Метод создает новый объект CashRegister с указанной суммой денег.
     *
     * @param money начальная сумма денег в кассе.
     */
    public CashRegister(double money) {
        this.money = money;
    }

    /**
     * Метод создает новый объект CashRegister с начальной суммой.
     */
    public CashRegister() {
        this.money = 0.0;
    }

    /**
     * Инициализация ресурсов кеша.
     */
    public void init() {
        System.out.println("CashRegister initialized");
    }

    /**
     * Завершение работы с ресурсами кеша.
     */
    public void cleanup() {
        System.out.println("CashRegister cleaned up");
    }

    /**
     * Метод устанавливает количество денег в кассовом аппарате на указанное значение.
     *
     * @param money новая сумма денег в кассовом аппарате.
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * Метод возвращает строковое представление суммы денег в кассовом аппарате.
     *
     * @return строковое представление суммы денег в кассовом аппарате
     */
    @Override
    public String getInfo() {
        return "Money in cash register: " + money + "$";
    }
}
