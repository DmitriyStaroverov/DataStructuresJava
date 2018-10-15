package lesson_2;

public class OrderedArray extends ArrayImpl {

    public OrderedArray(int size) {
        super ( size );
    }

    @Override
    public void setElement(int value, int index) {
        throw new UnsupportedOperationException (  );
    }

    @Override
    public void addElement(int value) {
        int index = 0;
        for (index = 0; index < currentSize; index++) {
            if (data[index] >= value) break;
        }
        for (int i = currentSize; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        currentSize++;
    }

    @Override
    public int find(int value) {
        int low = 0; // нижняя граница
        int high = currentSize - 1 ; // верхняя граница диапазона
        int mid = 0;
        while (low < high){
            mid = (low + high) / 2;
            if (data[mid] == value){
                return mid;
            }
            if (data[mid] < value){
                low= mid + 1;
            }
            if (data[mid] > value){
                high = mid;
            }
        }
        return -1;
    }
}
