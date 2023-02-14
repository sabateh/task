public class loop1 {
    public static void main(String[] args) {
        boolean workday=true;
        int day=1;
        while (workday) {
            if(day<=5){
                System.out.println("day off");
            }else {
                System.out.println("no need");
                workday=false;
            }
            day++;

        }
    }
}
