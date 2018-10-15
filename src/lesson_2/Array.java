package lesson_2;

public interface Array {

    Integer getElement(int index);

    void setElement(Integer value, int index);

    void addElement(Integer value);

    void display();

    int getSize();

    boolean deleteElement(Integer value);

    /**
     * поиск элемента
     *
     * @param value искомое значение
     * @return индекс первого найденного значения либо -1
     */
    int find(Integer value);

}
