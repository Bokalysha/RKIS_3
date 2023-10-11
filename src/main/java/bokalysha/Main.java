package bokalysha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Класс Main представляет собой основной класс программы.
 */
public class Main {
    /**
     * Основной метод программы, который запускает приложение.
     *
     * @param args массив строковых аргументов командной строки.
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Shop shop = context.getBean("shopBean", Shop.class);

        shop.shopInclude();


        context.close();
    }
}
