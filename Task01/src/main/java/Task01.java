public class Task01 {
    public static void main(String[] args) {
        System.out.println("hello");
        for (int i=1;i<100;i++){
            if (i % 3 == 0)
                System.out.print(i+ " ");
        }
        System.out.print("\n");
        for (int j=1;j<100;j++){
            if (j % 7 == 0)
                System.out.print(j+ " ");
        }
        System.out.print("\n");
        for (int k=1;k<100;k++){
            if (k % 21 == 0)
                System.out.print(k+ " ");
        }
    }
}
