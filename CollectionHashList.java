import java.util.*;
public class CollectionReplay
  {
    public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println(".............................");
      System.out.println("Using array..................");
      int a[]=new int[5];
      System.out.println("Enter array elements :");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.print("Array elements are");
      for(int i=0;i<5;i++)
      {
      System.out.print("  " +a[i]);
      }
      System.out.println();
      System.out.println(".............................");
      System.out.println(".............................");
      System.out.println();
      System.out.println("Arraylist usage generic......");
      System.out.println();
      System.out.println("List allow duplicate elements ");
      System.out.println();
      ArrayList<Integer> i=new ArrayList<Integer>();
      ArrayList<String> s=new ArrayList<String>();
      i.add(10);
      i.add(10);
      i.add(30);
      s.add("EC027");
      s.add("Shruthi");
      s.add("10");
      System.out.println(" "+i);
      System.out.println();
      System.out.println(" "+s);
      System.out.println();
      System.out.println("Not in list format of integer use for each");
      System.out.println();
      for(Integer obj:i)
        {
          System.out.println(" "+obj);
        }
      System.out.println(".............................");
      System.out.println(".............................");
      System.out.println("Hetergenous storing using ArrayList");
      System.out.println();
      ArrayList g=new ArrayList();
      g.add(10);
      g.add(20);
      g.add(30);
      g.add("EC027");
      g.add("Shruthi");
      g.add("10");
      g.add(10);
      g.add('c');
      System.out.println(g);
      Iterator itr=g.iterator();
      while(itr.hasNext())
      {
      System.out.println(" "+itr.next());
      }
      System.out.println(".............................");
      System.out.println(".............................");
      System.out.println("Using set interface..........");
      System.out.println();
      System.out.println("Set doesn't allow duplicate elements ");
      System.out.println();
      HashSet h=new HashSet();
      HashSet<Integer> hs=new HashSet<Integer>();
      h.add(10);
      h.add("Mish");
      h.add(10);
      h.add("10");
      h.add('a');
      hs.add(10);
      hs.add(10);
      hs.add(5);
      System.out.println(" "+h);
      System.out.println();
      System.out.println(" "+hs);
      System.out.println();
      for(Integer o: hs)
        {
          System.out.println(" "+hs);
        }
      System.out.println(".............................");
    }
  }
