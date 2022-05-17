package arrayprogramming;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public static void main(String[] args ){

      StdDetails s1 = new StdDetails();
      s1.sno=1;
      s1.sname="rocky";

      StdDetails s2 = new StdDetails();
      s2.sno=2;
      s2.sname="sridhi";

      List<StdDetails> list = new ArrayList<>();
      list.add(s1);
      list.add(s2);
      for (int i=0; i<list.size();i++)
      {
          if (list.get(i).sname.equals("rocky")){
              System.out.println("print:" +list.get(i).sname);
          }
      }


  }

}
