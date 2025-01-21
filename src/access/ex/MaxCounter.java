package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(max > count) {
            count++;
        } else {
            System.out.println("최대값이므로 증가가 불가능합니다.");
            return;
        }
    }

    public int getCount() {
        return count;
    }
}
