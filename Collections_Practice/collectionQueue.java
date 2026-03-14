import java.util.*;

public class collectionQueue{
    
public static void main(String[] args) {
    
Queue<Integer> list = new LinkedList<>();
list.add(10);
list.add(20);
list.add(30);


Iterator<Integer> it = list.iterator();
while(it.hasNext()){
    System.out.print(it.next()+" ");
}


}

}
 