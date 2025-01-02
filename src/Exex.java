public class Exex {
    public static void main(String args[]) {

        int[] num_list = {3, 4, 5, 2, 1};
        int answer = 0;
        int mul = 1, sum = 0;

        for (int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }

        if (mul < sum) {
            answer = 1;
        }

        System.out.println(answer);
        System.out.println(mul);
        System.out.println(sum);

    }
}

