public class loop {
    public static void main(String[] args) {

        int num=10;
        while (num<20){
            System.out.println(num<20);
            if(num<15){
                System.out.println("num is still less than 15");
            }else {
                System.out.println("num is greater than15" );
            }
            System.out.println(num);
            num++;

        }
    }
}
