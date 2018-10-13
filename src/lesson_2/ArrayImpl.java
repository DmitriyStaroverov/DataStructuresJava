package lesson_2;

public class ArrayImpl implements Array {

    protected int currentSize;
    protected int[] data;

    public ArrayImpl(int size) {
        this.currentSize = 0;
        this.data = new int[size];
    }

    @Override
    public int getElement(int index) {
        return data[index];
    }

    @Override
    public void setElement(int value, int index) {
        this.data[index] = value;
    }

    @Override
    public void addElement(int value) {
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
    public boolean deleteElement(int value) {
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
    public int find(int value) {
        int targetIndex;
        for (targetIndex = 0; targetIndex < currentSize; targetIndex++) {
            if (data[targetIndex] == value)
                return targetIndex;
        }
        return -1;
    }
}
