package pac.stringexa;

import java.util.Arrays;

public class IMP {

	public static void main(String[] args) {
     
     
     String mystring="aaabbaacccddd";
        StringBuilder sb = new StringBuilder();
        char[] mychar = mystring.toCharArray();
        int count = 1;
        for(int i=0; i<mychar.length-1;i++) {
            //System.out.println("mychar[p1]: "+mychar[i]+" mychar[p2]: "+mychar[i+1]);
            if(mychar[i] == mychar[i+1]) {
                count = count+1;
                //System.out.println("count: "+count);
            }
            else {
                sb.append(mychar[i]);
                sb.append(count);
                count = 1;
            }
            if(i==(mychar.length)-2) {
                sb.append(mychar[i]);
                sb.append(count);
            }
        }
        System.out.println(sb.toString());
    }

    

	}


