package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SecondSmallestElementExample
{
    public static int getSmallestElement(int inputArray[])
    {
        //it does not allow duplicates and also sorts the elements at the time of insertion
        //collections add only obejects
        SortedSet<Integer> elementSet = new TreeSet<Integer>();

        for(int i : inputArray)
        {
            elementSet.add(new Integer(i)); //auto-boxing and auto-unboxing
        }
        System.out.println(elementSet);

        Object o[] = elementSet.toArray();
        return (Integer)o[1];
    }
    public static void main(String args[])
    {
        int inputArray[] = {10,23,10,45,56,67,76,56,34,10,107};
        int secondSamllestElement=getSmallestElement(inputArray);
        System.out.println("Result : "+secondSamllestElement);

    }
}
