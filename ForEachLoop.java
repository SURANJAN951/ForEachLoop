import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLoop {
    public static void main(String[] args)
    {
        List<Integer> list2= Arrays.asList(2,4,5,8,9);
        System.out.println(list2);

        //for(Integer i:list2)
        //{
        //    System.out.println(i);
        //}
        //here comes the role of for each loop, we can print the data easily

        //Consumer<Integer> cons=i -> System.out.println(i); Lambda expression

        list2.forEach(i-> System.out.println(i));
    }
}
