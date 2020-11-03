package pub.wii.cook.java.collections;

import org.apache.commons.lang3.tuple.Pair;

import java.util.TreeSet;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeSet<Pair<Integer, Integer>> ts = new TreeSet<>(
                (o1, o2) -> o2.getRight().equals(o1.getRight())
                        ? o1.getLeft() - o2.getLeft()
                        : o1.getRight() - o2.getRight()
        );
        ts.add(Pair.of(2, 2));
        ts.add(Pair.of(1, 2));
        ts.add(Pair.of(4, 0));
        ts.add(Pair.of(3, 2));
        ts.add(Pair.of(5, 1));
        System.out.println(ts);
        Pair<Integer, Integer> poll = ts.pollFirst();
        System.out.println(ts);
        assert poll != null;
        System.out.println(poll);
        ts.add(Pair.of(poll.getLeft(), poll.getRight() + 10));
        System.out.println(ts);

        System.out.println();
        poll = ts.pollFirst();
        System.out.println(ts);
        assert poll != null;
        System.out.println(poll);
        ts.add(Pair.of(poll.getLeft(), poll.getRight() + 2));
        System.out.println(ts);
    }
}
