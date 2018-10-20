package lesson_2;

public class ArrayImpl<T extends Object & Comparable> implements Array<T> {

    protected int currentSize;
    protected T[] data;

    public ArrayImpl(int size) {
        this.currentSize = 0;
        this.data = (T[]) new Object[size];
    }

    @Override
    public T getElement(int index) {
        return data[index];
    }

    @Override
    public void setElement(T value, int index) {
        this.data[index] = value;
    }

    @Override
    public void addElement(T value) {
        data[currentSize++] = value;
    }

    @Override
    public void display() {
        System.out.print ("Size is " + this.getSize () + " : ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print (data[i]+"; ");
        }
        System.out.println ();
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean deleteElement(T value) {
        System.out.print ("Deleting " + value);
        int targetIndex = find ( value );
        if (targetIndex == -1){
            System.out.println ("... false." );
            return false;
        }
        System.arraycopy ( data, targetIndex + 1, data, targetIndex, currentSize - 1 - targetIndex );
        currentSize--;
        System.out.println ("... success.");
        return true;
    }

    /**
     * поиск элемента
     *
     * @param value искомое значение
     * @return индекс первого найденного значения либо -1
     */
    @Override
    public int find(T value) {
        int targetIndex;
        for (targetIndex = 0; targetIndex < currentSize; targetIndex++) {
            if (data[targetIndex].equals (value))
                return targetIndex;
        }
        return -1;
    }

    @Override
    public void bubbleSort() {
        for (int i = 0; i < currentSize-1; i++) {
            for (int j = 0; j < currentSize - 1 - i; j++) {
                if (data[j].compareTo(data[j + 1]) > 0 ){
                    exchange ( j, j + 1 );
                }
            }
        }
    }

    private void exchange(int index1, int index2){
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    @Override
    public void insertSort() {
        T temp;
        int index;
        for (int i = 1; i < currentSize; i++) {
            temp = data[i];
            index = i;
            while (index > 0 && data[index-1].compareTo ( temp ) >= 0){
                data[index] = data[index - 1];
                index--;
            }
            data[index] = temp;
        }

    }

    @Override
    public void selectSort() {
        int minValueIndex;
        for (int i = 0; i < currentSize-1; i++) {
            minValueIndex = i;
            for (int j = i + 1; j < currentSize; j++) {
                if (data[j].compareTo ( data[minValueIndex] ) < 0 ){
                    minValueIndex = j;
                }
            }
            if (minValueIndex != i){
                exchange ( i, minValueIndex );
            }
        }
    }
}
