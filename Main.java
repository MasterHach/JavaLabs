public class Main {
    public static void main(String[] args) {
        WaitList<Integer> dec1 = new WaitList<>();
        for (int i = 0; i < 6; i++) {
            dec1.content.add(i);
        }
        System.out.println("In dec: " + dec1.content);
        dec1.content.remove();
        System.out.println("In dec: " + dec1.content);
        dec1.content.remove(5);
        System.out.println("In dec: " + dec1.content);

        BoundedWaitList<Integer> dec2 = new BoundedWaitList<>(5);
        System.out.println(dec2.getCapacity());
        for (int i = 0; i < 4; i++) {
            dec2.content.add(i*3);
        }
        System.out.println(dec2.toString());
        dec2.content.add(100);
        dec2.content.add(101);
        System.out.println(dec2.toString());

        WaitList<Integer> lst3 = new UnfairWaitList<>();
        lst3.content.add(1);
        lst3.content.add(2);
        lst3.content.add(3);
        System.out.print("List without removes elements: " + lst3.content + "\n");
        lst3.content.remove(2);
        lst3.content.remove(3);
        System.out.print("List with removes elements: " + lst3.content + "\n");
    }
}
