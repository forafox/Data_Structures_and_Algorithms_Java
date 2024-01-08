## Массивы
### Примеры использования массивов
1. LowArrayApp
2. Класс HighArrayApp
3. Класс OrderedArrayApp
### Простая сортировка
#### Пузырьковая сортировка
##### Краткое описание
Алгоритм начинается с позиции 0 и выполняется по следующим правилам
1. Сравнить двух игроков
2. Если левый игрок выше, поменять местами
3. Перейти на одну позицию вправо.

Продолжается до тех пор, пока не будет достигнут правый край шеренги
4. После того как первый отсортированный элемент окажется на своем месте, 
вернуться к началу массива.

Процесс продолжается до тех пор, пока все элементы не будут упорядочены.
##### Сложность
- Количество перестановок O(N^2)
- Количество сравнений O(N^2)
- Общая сложность O(N^2)
#### Сортировка методом выбора
##### Краткое описание
В сортировке методом выбора вы последовательно перебираете всех игроков и выбираете(отсюда и название)
самого низкорослого их них. Этот игрок меняется местами с тем, который стоит в крайней левой позиции (0). Левый игрок отсортирован, и в дальнейшем уже перемещаться не будет. Обратите внимание: в этом алгоритме отсортированные игроки собираются слева
(нижние индексы), тогда как при пузырьковой сортировке они собираются справа.
Следующий проход начинается с позиции 1, а обнаруженный минимальный элемент меняется местами с элементом в позиции 1.
Процесс продолжается до тех пор, пока не будут отсортированы все игроки.
##### Сложность 
- Количество перестановок O(N*(N-1)/2) ;O(N^2)- в общем виде
- Количество сравнений O(N^2)
- Общая сложность O(N^2)

Сортировка выбором выполняется за время O(N^2), как и пузырьковая. Но сортировка методом выбора выполняется быстрее из-за
меньшего количество перестановок. Для меньших значений N сортировка методом выбора может работать заметно быстрее. Особенно
если перестановка выполняется намного медленнее сравнения.
#### Сортировка методом вставки
##### Краткое описание
1. Обход массива слева направо, аналогично пузырьковой - сравнение соседних элементов, меняя их местами, если левое значение больше правого. В итоге наибольшее число будет перемещено в конец массива.
2. Обход массива в обратном направлении (справа налево), начиная с элемента, который находится перед последним отсортированным. На этом этапе элементы также сравниваются между собой
и меняются местами, чтобы наименьшее значение всегда было слева. В итоге наименьшее число будет перемещено в начало массива.
##### Сложность
- Количество перестановок O(N*(N-1)/2); O(N^2)- в общем виде
- Количество сравнений O(N*(N-1)/2); O(N^2)- в общем виде
- Общая сложность O(N^2)

Количество операций копирования приблизительно совпадает с количеством сравнений. Однако копирование занимает меньше времени, чем перестановка, так что для случайных
данных этот алгоритм работает вдвое быстрее пузырьковой сортировки и быстрее сортировки методом выбора.

Данный алгоритм работает гораздо эффективнее для данных, уже прошедших предварительную сортировку.В этом случае алгоритм выполняется за время O(N)
## Стек и очереди
### Пример использования стека
1. Перестановка букв в слове (ReverseApp)
2. Поиск парных скобок (BracketsApp)
### Пример использования очереди
1. Реализация очереди без счетчика элементов (QueueApp)

> Дек - двусторонняя очередь. И вставка, и удаление происходит с обоих концов.Соответстующие методы могут называться
__insertLeft()/insertRight()__ и __removeLeft()/removeRight()__.

>Если ограничиться методами __insertLeft()/removeLeft()__ (или их эквивалентами для правого конца),дек работает как стек.
Если же ограничиться методами __insertLeft()/removeRight()__ (или противоположной парой), он работает как очередь.

2. Реализация Приоритетной очереди (PriorityQueue)

> Является более специализированной структурой данных, чем стек или очередь. Имеется начало и конец, а элементы извлекаются от начала.
Но элементы упорядочиваются по ключу, так что элемент с наименьшим значением ключа всегда находится в начале ( в некоторых реализациях - в конце)

## Связанные списки
### Пример использования связанных списков
1. Простой связанный список (SingleEnded)
   1. Вставка элемента в начале списка
   2. Удаление элемента в начале списка
   3. Перебор списка для вывода содержимого
2. Двусторонние списки(DoubleEnded)
> Двосторонний список похож на обычный связанный список с одной дополнительной возможностью: в нем хранится ссылка не только на первый, но и на
> последний элемент. 

> Эффективность: O(N). Но работает быстрее массива, потому что не требует перемещения элементов при вставке или удалении. Расширяем.
3. Сортированные списки (-)
> Данные хранятся в упорядоченном виде.

> Эффективность: Вставка или удаление выполняются за O(N). Но обращение к наименьшим значениям O(1), потому что оно всегда находится в начале списка.
4. Двусвязные списки (DoubleLinklist)
> Позволяет перемещаться по списку как в прямом, так и в обратном направлении. Каждый элемент хранит ссылку на два других элемента вместо одного. 
Первая указывает на следующий элемент, а вторая на предыдущий.
## Итераторы
1. - 
## Рекурсия
1. Решение задачи "Треугольные числа"
2. Нахождение факториала числа
3. Анаграммы 
4. Решение задачи "Ханойская башня"

