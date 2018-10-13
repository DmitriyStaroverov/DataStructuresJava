package lesson_2;

public interface Array {

    int getElement(int index);

    void setElement(int value, int index);

    void addElement(int value);

    void display();

    int getSize();

    boolean deleteElement(int value);

    /**
     * поиск элемента
     *
     * @param value искомое значение
     * @return индекс первого найденного значения либо -1
     */
    int find(int value);

}
