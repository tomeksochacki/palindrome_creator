public class Count {
    public static void main(String[] args) {

        Count count = new Count();
        int rekurencja = count.countSum(4);

        System.out.println("Sum: " + rekurencja);

    }

    public int countSum(int number){
        if (number<=1){
            return 1;
        } else {
            return number + countSum(number -1);
        }

    }
}
