# Объектно-ориентированное программирование (семинары)
## Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

1. ### Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
2. ### Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
3. ### В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
4. ### Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

> Формат сдачи: ссылка на гитхаб проект


## Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования

### Реализовать класс Market и все методы, которые он обязан реализовывать.
### Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдаёт заказы)

> Формат сдачи: ссылка на гитхаб проект

## Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования

1. ### Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
2. ### Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
3. ### Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
4. ### Модифицировать класс Контроллер, добавив в него созданный сервис;
5. ### Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.

> Формат сдачи: ссылка на гитхаб проект

## Урок 4. ООП: Обобщения. ч1


1. ### Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
2. ### Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
3. ### Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.

> Формат сдачи: ссылка на гитхаб проект

## Урок 5. От простого к практике

1. ### Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
2. ### Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
3. ### Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
4. ### Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.

> Формат сдачи: ссылка на гитхаб проект

## Урок 6. ООП Дизайн и Solid

### Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
### Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.

> Формат сдачи: ссылка на гитхаб проект

