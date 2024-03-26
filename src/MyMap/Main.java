package MyMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMap map = new MyMap<Integer, String>();
        int key;
        String value;

        do{
            System.out.println("[1] Put [2] Get [3] Remove");
            System.out.print("Enter Operation: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter key: ");
                    key = sc.nextInt();
                    if(key == 0){
                        break;
                    }
                    System.out.print("Enter value: ");
                    sc.nextLine();
                    value = sc.nextLine();
                    map.put(key, value);

                    System.out.println("New key and value added:");
                    System.out.println(map.keys);
                    System.out.println(map.values);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter to get key: ");
                    key = sc.nextInt();
                    System.out.println("Value of key " + key + ": " + map.get(key));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter to remove key: ");
                    key = sc.nextInt();
                    System.out.println("Removed value " + map.remove(key) + " of key " + key);
                    System.out.println();
                    break;
                default:
                    return;
            }
        }while(true);
    }
}