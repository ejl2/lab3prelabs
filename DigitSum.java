

public class DigitSum{

private int currentSum = 0;

  public static void main(String[] args){
    sumOfDigits(1234);
  }

  public int sumOfDigits(int n){
    if(n/10 >= 10){
      currentSum = (currentSum + n%10);
      sumOfDigits(n/10);
    }
    return currentSum;
  }
}
