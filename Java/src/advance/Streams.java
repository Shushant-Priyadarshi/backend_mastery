package advance;

/*Streams in Java :
    A Stream in Java is like a pipeline 🚀 that allows you to process data in a clean
    and functional way. Instead of writing loops, you can filter, map, sort, and collect
    data efficiently.
*/

import java.util.*;

public class Streams {

    //without stream
    private  static void getEven(List<Integer> list){
        for(Integer i:list){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    //with stream
    private static  void getOdd(List<Integer> list){
        //implementing       anonymous fun. using lambda expression
        //                              ⬇️
        list.stream().filter(li -> li%2!=0).forEach(System.out::print);

    }


    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        getEven(list);
        System.out.println();
        getOdd(list);
    }
}
