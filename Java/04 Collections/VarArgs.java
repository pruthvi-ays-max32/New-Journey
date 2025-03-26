public class VarArgs {
  public static void main(String[] args) {
    sum(1,2,3);
    sum(4,5);
    sum();
    sum(2,4,7,8,9,6);
  }

  public static void sum(int... nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
      }
      System.out.println("Sum: " + sum);
  }

}
