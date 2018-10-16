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
}
