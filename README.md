ДЗ 1.
Я думаю, что данное построение  класса Animal не совсем правильное. Он должен быть
ответственен только за базовые действия животных. 
Добавление методов для конкретных видов передвижения приводит к сложности в том плане, что
если появится новый вид передвижения, то придется изменять класс Animal и все его наследники.
Правильнее было бы описывать метод передвидения в классе самого животного.

ДЗ 2.
Наверное мы еще будем это делать, мне бы хотелось всё красивее оформить, а именно добавить ещё класс ЛЕЧЕНИЕ,
в него добавлять методы поступления пациента, к какому врачу он определён, назначение лечения, выписка и тд.
А то получается всё в ветклинике запихано, хотя там тоже должна быть общая информация о самой клинике, о врачах и пациентах.