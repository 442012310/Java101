public class Exam{
    public static void main(String[] args) {
        int counter = 100;
        for (;counter >= -100;counter--){
            if (counter % 2 != 0){
                System.out.println(counter + " is odd");
            }else {
                System.out.println(counter + " is even");
            }
        }
    }
}
