package bokalysha;

import bokalysha.dependences.Seller;
import bokalysha.dependences.CashRegister;
import bokalysha.dependences.Shelf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Конфигурационный класс Spring, определяющий бины компонентов и их инициализацию.
 */
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    /**
     * Создает и настраивает бин для продавца (seller).
     * Использует методы инициализации и завершения "init" и "cleanup".
     *
     * @return Бин для seller.
     */
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public Seller sellerBean() {
        return new Seller();
    }

    /**
     * Создает и настраивает бин для кеша в кассе (CashRegister) с заданным размером.
     * Использует методы инициализации и завершения "init" и "cleanup".
     *
     * @return Бин для CashRegister.
     */
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public CashRegister cashBean() {
        return new CashRegister(199.99);
    }

    /**
     * Создает и настраивает бин для полки с товаром (Shelf) с указанным именем продуктом через фабрчный метод.
     * Использует методы инициализации и завершения "init" и "cleanup".
     *
     * @return Бин для Shelf.
     */
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public Shelf shelfBean() {
        return Shelf.factoryShelfProduct("Milk");
    }

    /**
     * Создает и настраивает бин для магазина (Shop),
     * используя ранее определенные бины для продовца, кеша в кассе и полки с товаром.
     * Использует методы инициализации и завершения "init" и "cleanup".
     *
     * @return Бин для Shop.
     */
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public Shop shopBean() {
        return new Shop(sellerBean(), cashBean(), shelfBean());
    }
}

