import java.util.*;a
public class Arraylists
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        System.out.println("Enter the number of elements to be entered in the Arraylist\n");
        int n=s.nextInt();
        System.out.println("Enter the elements\n");
        for(int i=0;i<n;i++)
        l1.add(s.nextInt());
        System.out.println(l1);
        int choice=1;
        while(choice!=9)
        {
             System.out.println("Enter Your choice\n");
             choice=s.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter the index and element to be added\n");
            int index=s.nextInt();
            int val=s.nextInt();
            l1.add(index,val);
            System.out.println(l1);
            break;
            case 2:
            ArrayList<Integer> l2 = new ArrayList<Integer>();
            System.out.println("Enter the number of elements to be entered in the Arraylist\n");
            n=s.nextInt();
            for(int i=0;i<n;i++)
            l2.add(s.nextInt());
            l1.addAll(l2);
            System.out.println("The Combination of both the Arraylist is:\n");
            System.out.println(l1);
            break;
            case 3:
            System.out.println("Enter the index of which element is to be found\n");
            index=s.nextInt();
            System.out.println("The element present at "+index+" is "+l1.get(index)+"\n");
            break;
            case 4:
            System.out.println("Enter the element to find in the list\n");
            int element=s.nextInt();
            boolean status=l1.contains(element);
            if(status==true)
            System.out.println("Element is present in the List\n");
            else 
            System.out.println("Element is not present in the List\n");
            break;
            case 5:
            System.out.println("Enter the whose index is to be found\n");
            element=s.nextInt();
            System.out.println("The element "+element+" is present at "+l1.indexOf(element)+"\n");
            break;
            case 6:
            System.out.println("Enter the element to be removed from the list\n");
            element=s.nextInt();
            // l1.remove(element);
            // System.out.print("\nList after removing an Element:\t");
            // System.out.println(l1);
            Iterator<Integer> item = l1.iterator();
            while(item.hasNext())
            {
                if(item.next()==element)
                item.remove();
            }
            System.out.println("\nList after removing");
            System.out.println(l1);
            break;
            case 7:
            System.out.println("Enter the element and the index to be added in t    he list\n");
            element=s.nextInt();
            index=s.nextInt();
            l1.set(index,element);
            System.out.println(l1);
            break;
            case 8:
            System.out.println("Enter the staring index\n");
            int i=s.nextInt();
            System.out.println("Enter the ending index\n");
            int j=s.nextInt();
            ArrayList<Integer> l3 = new ArrayList<Integer>();
            l3= (ArrayList) l1.subList(i,j);
            System.out.println(l3);
            break;
            case 9:
            break;
    }
   }
  }
}