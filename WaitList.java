import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedDeque<E> content;
    public WaitList() {
        this.content = new ConcurrentLinkedDeque<>();
    }
    public WaitList (Collection<E> c) {
        this.content = new ConcurrentLinkedDeque<>(c);
    }
    public String toString() {
        return this.content.toString();
    }
    public void add(E element) {
        this.content.add(element);
    }
    public E remove() {
        return this.content.poll();
    }
    public boolean contains(E element) {
        return this.content.contains(element);
    }
    public boolean containsAll(Collection<E> c){
        return this.content.containsAll(c);
    }
    public boolean isEmpty() {
        return this.content.isEmpty();
    }
}
