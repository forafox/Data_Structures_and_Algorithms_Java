Информация взята из книги 
"Структуры данных и алгоритмы в Java"

Автор - Лафоре Роберт
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
1. Решение задачи "Треугольные числа" (Triangle)
2. Нахождение факториала числа (Factorial)
3. Анаграммы (Anagram)
4. Решение задачи "Ханойская башня" (TowerHanoi)
5. Степени числа (NumberPower)
6. Задача о рюкзаке (Knapsack)
### Сортировка слиянием
Реализация - MergeSort
   + Эффективность: Выполняется за время O(N*log(N))
#### Описание
Идея сортировки слиянием заключается в том, чтобы разделить массив пополам, отсортировать каждую половину, а затем слиять две половины в один отсортированный массив.
Используется рекурсия - половина делится на две четверти, каждая четверть сортируется по отдельности, после чего две четверти объединяются в отсортированную половину и тд.
## Нетривиальная сортировка
### Сортировка Шелла 
Реализация - ShellSort
   + Эффективность: Выполняется за время O(N*(log(N))^2)
#### Описание
Суть сортировки Шелла состоит в том, чтобы менять местами элементы, расположенные далеко друг от друга.
При использовании этого алгоритма мы делаем массив h-сортированным для большого значения h. 
Продолжаем уменьшать значение h, пока оно не станет равным 1. Массив называется h-сортированным, 
если все подмассивы каждого h-го элемента отсортированы.
Алгоритм состоит из 4 шагов
1. Инициализируем значение размера части (h).
2. Делим массив на меньшие части с одинаковым расстоянием до h.
3. Сортируем эти части с помощью сортировки вставкой.
4. Повторяем шаг 1, пока список не будет отсортирован.
####  Процесс разбиения 
Алгоритм быстрой сортировки основан на механизме разбиения.
Разбиением данных называется такое разделение на две группы, при котором в одну группу входят все элементы со значением
ключа выше заданного порога, а в другую - все элементы со значением ключа ниже заданного порога.
Реализация - Partition
## Быстрая сортировка
Реализация - QuickSort
   + Эффективность: O(N*log(N))
Алгоритм состоит из 3 основных шагов
1. Массив или подмассив разбивается на две группы: левую (с меньшими ключами) и правую (с большими ключами).
2. Рекурсивный вызов метода для сортировки левой группы.
3. Рекурсивный вызов метода для сортировки правой группы. 
После разбиения все элементы левого подмассива меньше элементов правого подмассива. Если отсортировать левый подмассив и правый
подмассив, то весь массив будет упорядочен. Как отсортировать эти подмассивы? Посредством рекурсивных вызовов.
## Двоичные деревья
Реализация - BinaryTreeImplementation (Некрасивая реализация)
   + Эффективность: O(log2(N))
## Красное-черные деревья
При вставке (или удалении) узла должны выполняться некоторые правила, которые мы будем называть красно-черными правилами.
Если эти правила выполняются, дерево остается сбалансированными. Краткий перечень этих правил:
1. Каждый узел окрашен в красный или черный цвет.
2. Корень всегда окрашен в черный цвет.
3. Если узел красный, то его потомки должны быть черными (хотя обратное не всегда истинно).
4. Все пути от корня к узлу или пустому потомку должны содержать одинаковое количество черных узлов.

Реализация - Отсутствует
   + Эффективность O(log2(N))
## Деревья 2-3-4
Дерево с большим количеством элементов данных и потомков называется __многопутевым деревом__.
Цифры 2,3 и 4 в названии дерева обозначают количество связей с потомками, которые могут содержаться в заданном узле.
Для не-листовых узлов возможны три конфигурации:
1. Узел с одним элементом данных всегда имеет двух потомков
2. Узел с тремя элементами данных всегда имеет трёх потомков.
3. Узел с тремя элементами данных всегда имеет четырёх потомков.

Реализация - Отсутствует
   + Эффективность O(logN)
## Хеш-таблицы
Хеш-таблицей называется структура данных, обеспечивающая очень быструю вставку и поиск.

Реализация - Отсутствует
   + Эффективность: Вставка и поиск O(1)

Если элемент данных не удается разместить в ячейке с индексом, вычисленным посредством хеш-функции, метод открытой адресации ищет в массиве другую ячейку.
Мы рассмотрим три разновидности открытой адресации, различающихся способом поиска следующей свободной ячейки:
__линейное пробирование__, __квадратичное пробирование__ и __двойное хеширование__.
1. Линейное пробирование
Алгоритм последовательно ищет пустые ячейки.
2. Квадратичное пробирование
Алгоритм проверяет ячейки, находящиеся на больших расстояниях.
3. Двойное хеширование
Алгоритм использует повторное хеширование ключа с другой хеш-функцией и использованием результата в качестве смещения.
## Пирамиды
Пирамидой называется двоичное дерево, обладающее следующими характеристиками:
1. Полнота. Все уровни дерева содержат все возможные узлы (хотя последний уровень может быть заполнен лишь частично)
2. Пирамида (обычно) реализуется на базе массива.
3. Для каждого узла в пирамиде выполняется основное условие, гласящее, что ключ каждого узла больше (либо равен) ключей его потомков.

Реализация - Отсутствует
   + Эффективность : O(logN)
### Пирамидальное дерево
__Пирамидальное дерево__ это полное (нет отсутствующих узлов) двоичное дерево
### Пирамидальная сортировка
Алгоритм строится на вставке всех неупорядоченных элементов в пирамиду обычным методом insert().
Затем многократные вызовы remove() извлекают элементы в порядке сортировки. 
   + Эффективность: O(N*log(N))
## Графы
### Обход в глубину
Реализация - Dfs
1. Посетить смежную вершину, не посещавшуюся ранее, пометить ее и занести в стек.
2. Если выполнение правила 1 невозможно, извлечь вершину из стека.
3. Если выполнение правил 1 и 2 невозможно, обход закончен.
### Обход в ширину
Реализация - Bfs
1. Посетить следующую вершину, не посещавшуюся ранее, смежную с текущей вершиной, пометить ее и занести в очередь.
2. Если выполнение правила 1 невозможно, извлечь вершину из очереди и сделать ее текущей вершиной.
3. Если выполнение правил 1 и 2 невозможно, обход завершен. 
### Минимальное остовное дерево(MST, Minimum Spanning Tree)
Граф с минимальным количеством ребер, необходимых для соединений вершин.
Реализация - Mst
### Направленный граф
Если каждое ребро графа обладает направлением, то данный граф является __направленным__.
### Топологическая сортировка
Реализация - Отсутствует
Алгоритм топологической сортировки создает список вершин. Упорядоченных таким образом, что при наличии пути от А к B вершина А
предшествует B в списке.
> Выполняется только с направленными ациклическими графами!

__Ациклические графы__ - направленные и не содержащие циклы.
1. Найти вершину, не имеющую преемников.
2. Удалить эту вершину из графа и вставить ее метку в начало списка.

__Алгоритм Уоршелла__ - алгоритм преобразования матрицы смежности в транзитивное замыкание графа. 

## Взвешенные графы.
Взвешенный граф - граф с характеристикой ребер (Вес)
### Алгоритм Дейкстры
Ключевые моменты
1. Каждый раз при отправке агента в новый город вы используете информацию, полученную от него, для обновления списка стоимости проезда.
В списке сохраняется только самый экономичный маршрут (из известных вам) от начальной точки до заданного города.
2. Новый агент всегда отправляется в город с самым экономичным маршрутом от начальной точки(а не с самым дешевым сегментом от любого города, в котором
уже есть агент, как при построении минимального остовного дерева)

