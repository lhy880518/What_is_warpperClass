import java.util.ArrayList;
import java.util.List;

public class WrapperClassTest {
    public static void main(String[] args) {

        //wrapper class의 한 종류인 Integer객체 생성
        //생성자에 정수값을 넣어서 Integer 객체의 내부 멤버를 초기화 시킨다.
        Integer obj = new Integer(129);

        byte a = obj.byteValue();
        System.out.println(a);

        short b = obj.shortValue();
        System.out.println(b);

        int c = obj.intValue();
        System.out.println(c);

        long d = obj.longValue();
        System.out.println(d);

        float e = obj.floatValue();
        System.out.println(e);

        double f = obj.doubleValue();
        System.out.println(f);

        String snum = Integer.toString(255);
        System.out.println(snum);

        String hnum = Integer.toHexString(255);
        System.out.println(hnum);

        Integer inum1 = Integer.valueOf(snum);
        System.out.println(inum1);

        int inum2 = Integer.parseInt(snum);
        System.out.println(inum2);

        int i3 = obj.intValue();
        System.out.println(i3);

        int i4 = obj;
        System.out.println(i4);

        int compareResult1 = obj.compareTo(new Integer(100));
        System.out.println(compareResult1);

        int compareResult2 = Integer.compare(255, 100);
        System.out.println(compareResult2);

        int max = Integer.MAX_VALUE;
        System.out.println(max);

        int min = Integer.MIN_VALUE;
        System.out.println(min);

        Integer i1 = new Integer(i4);
        System.out.println(i1);

        Integer i2 = 100;
        System.out.println(i2);

        List<Integer> li = new ArrayList<>();
        for(int i=1 ; i < 50 ; i += 2){
            li.add(i);
        }

        for(Integer i : li){
            System.out.printf("%d", i.intValue());
            System.out.println();
        }

    }
}
