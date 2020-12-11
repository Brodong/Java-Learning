# Java-learning

# Collection

# 1 List

## 1.1 LinkedList

### 包

import java.util.LinkedList;

### 创建

```java
public class Linked_List_Add {
    public static void main(String args[]) {
        LinkedList<String> name = new LinkedList<String>();
    }
}
```

### 增

| index | add                                            | description                                                                           |
| :---: | :--------------------------------------------- | :------------------------------------------------------------------------------------ |
|   1   | public boolean add(E e)                        | 链表末尾添加元素，返回是否成功，成功为 true，失败为 false                             |
|   2   | public void add(int index, E element)          | 向指定位置(index)插入元素                                                             |
|   3   | public boolean addAll(Collection c)            | 将一个集合的所有元素添加到链表后面，返回是否成功，成功为 true，失败为 false           |
|   4   | public boolean addAll(int index, Collection c) | 将一个集合的所有元素添加到链表的指定位置后面，返回是否成功，成功为 true，失败为 false |
|   5   | public void addFirst(E e)                      | 元素添加到头部                                                                        |
|   6   | public void addLast(E e)                       | 元素添加到尾部                                                                        |
|   7   | public boolean offer(E e)                      | 向链表末尾添加元素，返回是否成功，成功为 true，失败为 false                           |
|   8   | public boolean offerFirst(E e)                 | 头部插入元素，返回是否成功，成功为 true，失败为 false                                 |
|   9   | public boolean offerLast(E e)                  | 尾部插入元素，返回是否成功，成功为 true，失败为 false                                 |

```java
public class Linked_List_Add {
    public static void main(String args[]) {
        LinkedList<String> name = new LinkedList<String>();

        // 1 插入数据
        name.add("Anna");
        name.add("ben");
        name.add("Chill");
        System.out.println(name);
        // [Anna, ben, Chill]

        // 2 在指定位置插入数据
        name.add(2, "Cucchi");
        System.out.println(name);
        // [Anna, ben, Cucchi, Chill]

        // 3 在链表末尾插入集合的所有数据
        LinkedList<String> name2 = new LinkedList<String>();
        name2.add("Sandra");
        name2.add("Yana");
        name2.add("Iena");
        name.addAll(name2);
        System.out.println(name);
        // [Anna, ben, Cucchi, Chill, Sandra, Yana, Iena]

        // 4 在链表指定位置插入集合的所有数据
        name.addAll(0, name2);
        System.out.println(name);
        // [Sandra, Yana, Iena, Anna, ben, Cucchi, Chill, Sandra, Yana, Iena]

        // 5 在头部插入
        name.addFirst("First");
        System.out.println(name);
        // [First, Sandra, Yana, Iena, Anna, ben, Cucchi, Chill, Sandra, Yana, Iena]

        // 6 在尾部插入
        name.addLast("Last");
        System.out.println(name);
        // [First, Sandra, Yana, Iena, Anna, ben, Cucchi, Chill, Sandra, Yana, Iena, Last]

        // 7 在末尾插入
        name.offer("Offer");
        System.out.println(name);
        // [First, Sandra, Yana, Iena, Anna, ben, Cucchi, Chill, Sandra, Yana, Iena, Last, Offer]

        // 8 在头部插入
        name.offerFirst("Head");
        System.out.println(name);
        // [Head, First, Sandra, Yana, Iena, Anna, ben, Cucchi, Chill, Sandra, Yana, Iena, Last, Offer]

        // 9 在末尾插入
        name.offerLast("Tail");
        System.out.println(name);
        // [Head, First, Sandra, Yana, Iena, Anna, ben, Cucchi, Chill, Sandra, Yana, Iena, Last, Offer, Tail]
    }
}

```

### 删

| id  | delete                          | description                                           |
| :-: | :------------------------------ | :---------------------------------------------------- |
|  1  | public void clear()             | 清空链表                                              |
|  2  | public E removeFirst()          | 删除并返回第一个元素                                  |
|  3  | public E removeLast()           | 删除并返回最后一个元素                                |
|  4  | public boolean remove(Object o) | 删除某一元素，返回是否成功，成功为 true，失败为 false |
|  5  | public E remove(int index)      | 删除指定位置的元素                                    |
|  6  | public E poll()                 | 删除并返回第一个元素                                  |
|  7  | public E remove()               | 删除并返回第一个元素                                  |

```java
public class Linked_List_Delete {
    public static void main(String args[]) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Anna");
        name.add("Ben");
        System.out.println(name);

        // 1 清空链表
        name.clear();
        System.out.println(name);
        // []

        name.add("John");
        name.add("Ella");
        name.add("Yana");
        name.add("Jima");
        name.add("Zip");
        System.out.println(name);
        // [John, Ella, Yana, Jima, Zip]

        // 2 删除并返回第一个元素
        System.out.println("remove first: " + name.removeFirst());
        System.out.println(name);
        // remove first: John
        // [Ella, Yana, Jima, Zip]

        // 3 删除并返回最后一个元素
        System.out.println("remove last: " + name.removeLast());
        System.out.println(name);
        // remove last: Zip
        // [Ella, Yana, Jima]

        // ４删除具体的某一个元素
        name.remove("Ella");
        System.out.println(name);
        // [Yana, Jima]

        // 5 删除指定位置的元素
        name.remove(0);
        System.out.println(name);
        // [Jima]

        // 6 删除并返回第一个元素
        name.add("Summer");
        System.out.println(name.poll());
        System.out.println(name);
        // Jima
        // [Summer]

        // 7 删除并返回第一个元素
        System.out.println(name.remove());
        System.out.println(name);
        // [Summer]
        // []
    }
}
```

### 查

| id  | search                            | description                          |
| :-: | :-------------------------------- | :----------------------------------- |
|  1  | public boolean contains(Object o) | 判断是否含有某一元素                 |
|  2  | public E get(int index)           | 返回指定位置的元素                   |
|  3  | public E getFirst()               | 返回第一个元素                       |
|  4  | public E getLast()                | 返回最后一个元素                     |
|  5  | public int indexOf(Object o)      | 查找指定元素从前往后第一次出现的索引 |
|  6  | public int lastIndexOf(Object o)  | 查找指定元素最后一次出现的索引       |
|  7  | public E peek()                   | 返回第一个元素                       |
|  8  | public E element()                | 返回第一个元素                       |
|  9  | public E peekFirst()              | 返回头部元素                         |
| 10  | public E peekLast()               | 返回尾部元素                         |

```java
public class Linked_List_Search {
    public static void main(String args[]) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Anna");
        name.add("Bala");
        name.add("Chille");

        // 1 判断是否有某一个元素
        System.out.println(name.contains("Anna"));
        System.out.println(name.contains("Summer"));
        // true
        // false

        // 2 输出指定位置的元素
        System.out.println(name.get(1));
        // Bala

        // 3 输出第一个元素
        System.out.println(name.getFirst());
        // Anna

        // 4 输出最后一个元素
        System.out.println(name.getLast());
        // Chille

        // 5 查找某一个元素从左到右的索引
        System.out.println(name.indexOf("Chille"));
        // 2

        // 6 查找某一个元素从右到左的索引
        System.out.println(name.lastIndexOf("Anna"));
        // 0

        // 7 输出第一个元素
        System.out.println(name.peek());
        // Anna

        // 8 输出第一个元素
        System.out.println(name.element());
        // Anna

        // 9 输出头部元素
        System.out.println(name.peekFirst());
        // Anna

        // 10 输出尾部元素
        System.out.println(name.peekLast());
        // Chille

    }
}
```

### 改

| id  | update                             | description        |
| :-: | :--------------------------------- | :----------------- |
|  1  | public E set(int index, E element) | 设置指定位置的元素 |

```java
public class Linked_List_Update {
    public static void main(String args[]) {
        LinkedList<String> name = new LinkedList<String>();

        name.add("Yana");
        System.out.println(name);
        // [Yana]

        name.set(0, "Anna");
        System.out.println(name);
        // [Anna]
    }
}
```

### 其他

| id  | others                                      | description                          |
| :-: | :------------------------------------------ | :----------------------------------- |
|  1  | public Object clone()                       | 克隆该列表                           |
|  2  | public Iterator descendingIterator()        | 返回倒序迭代器                       |
|  3  | public int size()                           | 返回链表元素个数                     |
|  4  | public ListIterator listIterator(int index) | 返回从指定位置开始到末尾的迭代器     |
|  5  | public Object[] toArray()                   | 返回一个由链表元素组成的数组         |
|  6  | public T[] toArray(T[] a)                   | 返回一个由链表元素转换类型而成的数组 |

```java
public class Linked_List_Others {
    public static void main(String args[]) {
        LinkedList<String> name = new LinkedList<String>();

        name.add("Anna");
        name.add("Nnna");
        name.add("Yana");

        // 1 克隆列表
        LinkedList<String> new_name = new LinkedList<String>();
        new_name = (LinkedList<String>)name.clone();
        System.out.println(new_name);
        // [Anna, Nnna, Yana]

        // 2 Iterator迭代器
        Iterator it = name.descendingIterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        // Yana Nnna Anna

        // 3 链表元素个数
        int size = name.size();
        System.out.println("Length of List: " + size);
        // Length of List: 3

        // 4 从指定位置开始到末尾的迭代器
        it = name.listIterator(1);
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        // Nnna Yana

        // 5 将链表转换为数组 toArray()方法
        Object[] array = name.toArray();
        System.out.println("Array" + array);

        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println();
        // Array[Ljava.lang.Object;@6bc7c054
        // Anna Nnna Yana

        name.add("Jima");

        // 6 将链表转换为数组 toArray(T[] a)方法
        array = name.toArray(array);
        // System.out.println(name.toArray(array));
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println();
        // Anna Nnna Yana Jima
    }
}
```
