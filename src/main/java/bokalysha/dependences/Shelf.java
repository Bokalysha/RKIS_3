package bokalysha.dependences;

/**
 * Класс Shelf представляет объект стеллажа, на котором хранятся товары.
 * Он реализует интерфейс ObjectInformation.
 */
public class Shelf implements ObjectInformation {
    private String product;

    /**
     * Метод создает новый объект Shelf с указанным товаром.
     *
     * @param product начальный товар на стеллаже.
     */
    public Shelf(String product) {
        this.product = product;
    }

    /**
     * Метод создает новый объект Shelf с начальным товаром.
     */
    public Shelf() {
        this.product = "default";
    }

    /**
     * Инициализация стеллажа.
     */
    public void init() {
        System.out.println("Shelf initialized");
    }

    /**
     * Завершение работы с продуктом на стеллаже.
     */
    public void cleanup() {
        System.out.println("Shelf cleaned up");
    }

    /**
     * Метод устанавливает товар на стеллаже.
     *
     * @param product новый товар на стеллаже.
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Метод возвращает строковое представление товаров на стеллаже.
     *
     * @return строковое представление товаров на стеллаже.
     */
    @Override
    public String getInfo() {
        return "Shelf contain: " + product;
    }

    /**
     * Фабричный метод для создания продукта с указанным именем.
     *
     * @param product имя товара.
     * @return объект продукта с указанным именем.
     */
    static public Shelf factoryShelfProduct(String product) {
        return new Shelf(product);
    }
}
