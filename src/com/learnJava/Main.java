package com.learnJava;

import javafx.collections.transformation.SortedList;
import sun.nio.cs.Surrogate;

import javax.annotation.Generated;
import java.lang.reflect.Array;
import java.util.*;

import static com.learnJava.Print.*;

public class Main {



     static class Values implements Comparable<Values>{

         public int value ;
        Values( int newValue){
            this.value = newValue;
        }

         @Override
         public int compareTo(Values obj) {

             return value > obj.value ? 1 : -1 ;
         }

         @Override
        public String toString() {
            return "Values{" +
                    "value=" + value +
                    '}';
        }
    }
    public static void main(String[] args) throws Exception {
	// write your code here

        // Collection cool = new ArrayList() <== array without idx;
        // List list = new ArrayList()/LinkedList() <== array with idx ;
        // Victor v = new Victor() <== vector capacity increased 100% and thread safe while arraylist not and increase 50% ;

        // we can implement stack using linkedList methods ;
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Set set = new HashSet() <==  Random Sequence ;
        //Set set = new LinkedHashSet()  <== insertion order ,
        // Set set = new TreeSet() <== Sorted Order ;
        //Set set = new TreeSet();

        // Queue
        Deque<Integer> deque = new LinkedList<>();

        // Stack
        Stack<Integer> stack = new Stack<>();


        Queue<Integer> queue = new LinkedList<>();
        queue.add(22);
        queue.add(12);
        queue.add(44);
        print(queue);
        print(queue.remove());
        print(queue);
        print(queue.peek());



        // Map map = new HashTable() <== synchronized + thread safe ;
        // Map map = new Hashmap() <== not synchronized + don't care about thread save , no order ;
        // Map map = new LinkedHashMap() <== provide order of insertion;

        Map<String , Integer> getEm = new LinkedHashMap<>() ;

        getEm.put("one" , 1);
        getEm.put("two" , 1);
        getEm.put("three" , 1);
        print(getEm);


        ArrayList<Integer> arrayList = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(24);
        list.add(55);
        list.add(1235);
        list.add(1);

        Map<Integer , String> map = new HashMap<>();
        map.put(1 , "dante");
        map.put(2 , "Nero");
        map.put(3 , "V");

        print(map.keySet());
        print(map);


//        Iterator itr = list.iterator(); // move forward only;
//        ListIterator listItr = list.listIterator(); // mov bidirectional ;
//
//        print(listItr.previous());
//        Collections.sort(list);

        /*
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1>o2 ? 1 : -1 ;
            }
        };*/
        //        Collections.sort(list , (a,b) -> a > b ? 1 : -1 );



//        Collections.sort(list);
//        Collections.reverse(list);
//        Collections.shuffle(list);

//        print(list);


        String[] names = {"ahmad" , "ali" , "ali" , "ahmad" ,"Ali", "ali" , "nader"};
        List<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));

        Map<String , Integer> result = new TreeMap<>();

        print(namesList);
        print(result);
        for(String name : names){
            Integer flag = result.get(name);
            result.put(name , flag == null ? 1 : flag + 1);
        }

        print(result);
        print(result.containsKey("ali"));

        result.forEach( (k,v) -> {
            print( k == "ahmad" ? "yep": "nope");
        } );

//
//        Map<Integer , Map> newMap = new HashMap<>();
//
//        newMap.put(1 , result);
//        print(newMap);
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(55);
//        stack.push(33);
//        stack.push(33);
//        stack.pop();
//        print(stack);
//        print(stack.peak());
//        print(stack.test());
//
//        LinkedList<Integer> myList = new LinkedList<>();
//        myList.add(22);
//        for(Integer a : myList){
//            print(a);
//        }

        try {
            int none = 5/0 ;

        }
        catch (ArithmeticException e){
            print("Got ya !");
        }
        catch (Exception e){
        print("Error !!! "+ e);
        }

//        Scanner scanner = new Scanner(System.in) ;
//        String input = scanner.next();
//        print(input);

//        String verb = System.console().readLine();
//        print(verb);



        Print[] news = new Print[5];
        print(Arrays.toString(news));

        int[] inta = new int[]{1 , 9,3 ,3 ,6};
        Arrays.sort(inta);


        print(Arrays.toString(inta));
        Arrays.fill(inta , 99);
        print(Arrays.toString(inta));
        print(Arrays.equals(inta , inta));

        int[][] multi = {{1,1} , {2,2,2}};
        print(Arrays.deepToString(multi));





    }
    }


// Q ? - checked Exception ?

    // - Scanner vs BufferReader ?


    // Notes

    // - Iterator Faster than Collection because Collection had more methods
    // - iterator vs forEach :: we can't modify collection in forEach but we can in iterator ;

