## Фреймворк Spring (семинары)

### Урок 8. Spring AOP, управление транзакциями.

Базовое задание:

Домашнее задание выполнить для одного из пройденных семинаров в проекте с Базой Данных.

Вам необходимо разработать механизм регистрации действий пользователя в вашем Spring Boot приложении. 

Используйте Spring AOP для создания журнала действий, в котором будет сохраняться информация о том, 

какие методы сервиса вызывались, кем и с какими параметрами.

Создайте аннотацию @TrackUserAction.

Реализуйте aspect, который будет регистрировать действия пользователя, 

когда вызывается метод, отмеченный этой аннотацией.

Примените аннотацию @TrackUserAction к нескольким методам в слое сервиса.

Результат регистрации вывести на консоль.


#### Скрины работы приложения:

![1](https://github.com/PavelLogeiko/Spring_HW08/blob/main/images/1.png)

![2](https://github.com/PavelLogeiko/Spring_HW08/blob/main/images/2.png)

![3](https://github.com/PavelLogeiko/Spring_HW08/blob/main/images/3.png)

![4](https://github.com/PavelLogeiko/Spring_HW08/blob/main/images/4.png)

![5](https://github.com/PavelLogeiko/Spring_HW08/blob/main/images/5.png)

![6](https://github.com/PavelLogeiko/Spring_HW08/blob/main/images/6.png)
