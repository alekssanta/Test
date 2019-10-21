import java.io.File;
import java.util.*;

public class Task02 {

    public static int[] myArrayX= new int[10];
    public static int[] myArrayS= new int[10];
    public static int[] myArrayM= new int[10];
    public static int[] myArrayAll= new int[10];
    private static int[] array;
    private static Queue<Integer> listAll;

    private static void initArray() { // создание значений массива
        Arrays.stream(array).filter(i -> i % 3 == 0).forEach(i -> myArrayX.equals(i));
        Arrays.stream(array).filter(i -> i % 7 == 0).forEach(i -> myArrayS.equals(i));
        Arrays.stream(array).filter(i -> i % 21 == 0).forEach(i -> myArrayM.equals(i));
        Arrays.stream(array).forEach(i -> listAll.add(i));
    }




    public static void main(String[] args) {
        System.out.println(myArrayX.hashCode());
    }
}

class comandline {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в командную строку!");
        System.out.println("Для получения справки введите help");
        Scanner sc = new Scanner(System.in); //Тут делаем,чтобы можно было что нибудь ввести в командную строку
        String comand = sc.nextLine();
        if(comand.equals("help")){
            System.out.println("Список поддерживаемых команд:");
            System.out.println("init array- инициализация списков набором значений array");
            System.out.println("print - печать всех списков");
            System.out.println("print type - печать конкретного списка, где type принимает значения X,S,M");
            System.out.println("anyMore - выводит на экран были ли значения не вошедшие ни в один список, возможные значения true, false");
            System.out.println("чистка списка , где type принимает значения X,S,M");
            System.out.println("merge - слить все списки в один вывести на экран и очистить все списки");
            System.out.println("help - вывод справки по командам");

        }



        String co = sc.nextLine();//Тут вводим новый стринг чтобы можно было чтонибудь ввести после хелп
        if(comand.equals("print") || co.equals("help")|| co.equals("print")){
            String list[] = new File(".").list();
            int myarrayX = 0;
            int myarrayS = 0;
            int myarrayM = 0;
            for(int i = 0; i < list.length; i++)
                System.out.println(myarrayX+ myarrayS+myarrayM);
        }


    }

}