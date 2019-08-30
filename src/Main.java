import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Adesh on 29-08-2019
 */

public class Main {

    public static void main(String[] args) {
        Player Adesh = new Player("Adesh",100,100);
        System.out.println(Adesh.toString());
        save(Adesh);

        Adesh.setHitpoints(80);
        Adesh.setWeapon("Arrow");
        System.out.println(Adesh);
        save(Adesh);
        load(Adesh);

    }




    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void save(ISavable sob){
        for(int i=0;i<sob.write().size();i++){
            System.out.println("Saving "+sob.write().get(i));
        }
    }

    public static void load(ISavable ob){
        ArrayList<String> values = readValues();
        ob.read(values);
    }



}
