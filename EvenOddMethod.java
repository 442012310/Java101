public class EvenOddMethod{
    static void evenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");   
        }
    }
    public static void main(String[] args) {
		int num = 0;
		while (num <= 10){
		evenOdd(num);
		++num;
		}
	}
}
