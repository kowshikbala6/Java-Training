import java.util.Arrays;

public class Test {

    int a[] = new int[10];
    int b[]={0,2,6,8,9};
    int c[][]={{1,2},{25,36}};
    public static void main(String[] args) {
        Test tt = new Test();
        int s = tt.b[2];
        int y[]={0,2,6,8,9,1};
        int s1=tt.c[1][1];
        String a ="kowshik";
        String b = String.valueOf(a.charAt(2));
        System.out.println(a.charAt(3));
        int l=a.length();
        String rev="";
        for( int i=l-1; i>=0; i--)
        {
            rev =rev+a.charAt(i);
        }
        System.out.println(rev);
        System.out.println(Arrays.toString(y));
        Arrays.sort(y);
        System.out.println(Arrays.toString(y));
    }
}
