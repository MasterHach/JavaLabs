public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }
    public void add(E element) {
        if (this.content.size() < this.capacity) {
            super.add(element);
        }
    }
    public String toString() {
        return this.content.toString() + ". Capacity: " + this.capacity;
    }
    public int getCapacity() {
        return this.capacity;
    }
}
