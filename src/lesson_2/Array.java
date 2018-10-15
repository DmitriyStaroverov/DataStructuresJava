package lesson_2;

public interface Array {

    String getElement(int index);

    void setElement(String value, int index);

    void addElement(String value);

    void display();

    int getSize();

    boolean deleteElement(String value);

    /**
     * поиск элемента
     *
     * @param value искомое значение
     * @return индекс первого найденного значения либо -1
     */
    int find(String value);

}
