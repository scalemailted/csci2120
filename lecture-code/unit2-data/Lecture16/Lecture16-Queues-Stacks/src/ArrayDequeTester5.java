import java.util.ArrayDeque;
public class ArrayDequeTester5 {
    public static void main(String[] args) {
        ArrayDeque<String> dq= new ArrayDeque<String>();

        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Poping Stack: ");

        for(String weekday: weekdays)
            dq.push(weekday);
        while(dq.peek() != null){
            System.out.println(dq.pop());
        }
    }
}
