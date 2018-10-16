package lesson_2;

public interface Array<T extends Object & Comparable> {

    T getElement(int index);

    void setElement(T value, int index);

    void addElement(T value);

    void display();

    int getSize();

    boolean deleteElement(T value);

    /**
     * поиск элемента
     *
     * @param value искомое значение
     * @return индекс первого найденного значения либо -1
     */
    int find(T value);

}
