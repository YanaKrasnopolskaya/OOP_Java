ДЗ 1.
Задание:
1) Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
2) Создать по два класса
   наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
3) В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)
4) В файле readme.md в репозитории гитхаб описать
   какие проблемы в таком проектировании Вы увидели,
   а также там же написать возникшие при выполнении дз вопросы
   (если они есть)

Ответ:

Я думаю, что данное построение  класса Animal не совсем правильное. Он должен быть
ответственен только за базовые действия животных. 
Добавление методов для конкретных видов передвижения приводит к сложности в том плане, что
если появится новый вид передвижения, то придется изменять класс Animal и все его наследники.
Правильнее было бы описывать метод передвидения в классе самого животного.

ДЗ 2.
Задание:
1) Создать класс Doctor и подумать над его состоянием и поведением. 
2) Создать класс Nurse(медсестра) и подумать над его состоянием и поведением.

3) Создайте интерфейсы Goable, Flyable, Swimable. У интерфейсов должны быть
методы получения скорости заданного действия: double run(), double fly(), double swim()

4) Добавьте наследников этим интерфейсам, но таким образом,
чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)

5) Создать класс ВетеринарнаяКлиника (VeterinaryClinic)
У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих и всех летающих, 
а также методы для работы с персоналом клиники.

ДЗ 3.
Задание:
1) Добавить интерфейс Copmparable<Pharmacy> к классу Pharmacy. Переопределить метод compareTo()
подсказка: можно добавить, а можно не добавлять в класс поля;

2) Создать несколько экземпляров Pharmacy, добавить их в ArrayList,
написать метод, выводящий Pharmacy в отсортированном виде.
