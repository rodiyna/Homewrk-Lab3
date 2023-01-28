import java.util.Arrays;

public class Clone {
    private  int[] num={1,2,3,4,5};

    public int[] getNum() {
        return this.num;
    }

    public static void main(String[] args) {
        Clone a= new Clone();
        int array[]= new int[5];
        array=a.getNum();
        array[2]=22;
        System.out.println(Arrays.toString(a.getNum()));
    }
}
