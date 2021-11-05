import java.util.concurrent.ConcurrentLinkedDeque;

public class UnfairWaitList<E> extends WaitList<E>{
    private ConcurrentLinkedDeque<E> content2;
    public UnfairWaitList() {
        this.content2 = new ConcurrentLinkedDeque<>();
    }
    public void remove(E element) {
        if (this.content.peek() != element) {
            this.content.remove(element);
            this.content2.add(element);
        }

    }
    public void moveToBack(E element) {
        if (this.content.peek() == element) {
            this.content.add(this.content.poll());
        }
    }
    public void add(E element) {
        if (!(this.content2.contains(element))) {
            super.add(element);
        }
    }
}
