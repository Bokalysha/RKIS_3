# Практическая работа №3
## Spring, внедрение зависимостей. Способ 2
**Цель работы:** Ознакомиться с механизмом внедрения зависимостей в Spring.

**Общая постановка задачи:** Необходимо создать приложение, в котором будут объявлены Spring-конфигурации при помощи аннотаций и класса-конфигурации. Снабдить спроектированные классы init- и destroy-методами, а также использовать фабричный метод для любого из классов.

В каждом варианте есть сущность (класс), необходимо создать интерфейс (самостоятельно на усмотрение студента) и классы, его имплементирующие. Объекты классов, имплементирующих данный интерфейс, будут передаваться в качестве зависимостей. Выполнить связывание и получить объекты из контекста. Продемонстрировать результаты в простейшем консольном приложении.

*Необходимо:*

1. Реализовать внедрение простых значений через конструктор.
2. Реализовать внедрение зависимости по ссылке через конструктор.
3. Интерфейс должен содержать как минимум один метод.
4. Классы, имплементирующие интерфейс, должны содержать как минимум одно поле (у разных классов - разные).
5. Зависимый класс должен содержать метод, который на основе вызова метода у зависимости выводил бы некоторое сообщение в консоль (Например для класса Автомобиля, в который внедряются Двигатели. Они могут выдавать свою мощность, а автомобиль может выводить сообщение, с какой скоростью он может двигаться).
6. Реализовать внедрение простых значений из внешнего файла через setter.

## Сборка и результат
_Вариант №2: Магазин._

**Сборка проекта:**
1. Распаковать проект
2. Перейдя в дирректорию, в которой находится работа, проверить наличие [Maven](https://maven.apache.org/download.cgi)
```
mvn -version
```
3. Cкомпилировать проект
```
mvn compile
```
4. Запустить программу
```
mvn exec:java
```
