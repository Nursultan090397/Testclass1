import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <String>();
        list.add("Alfa");
        list.add("Delta");
        list.add("Charli");

        System.out.println("Spisok: " + list);

        System.out.println("Zamenyaem: " + list.get(1) + "\n");
        list.set (1,"Bravo");
        list.forEach((x)->System.out.println("Element: " + x));

        }

    }
