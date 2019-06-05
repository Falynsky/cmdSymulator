import java.util.Scanner;

public class ConsoleMenu {

    public void start(Folder one){
        Scanner in = new Scanner(System.in);
        String input;
        Folder used = one;

        do{
            System.out.print(used.getParentPath() + '>');
            input = in.nextLine();

            if(input.equals("dir")||input.equals("DIR")){
                used.write();
            } else if (input.equals("cd")||input.equals("CD")){
                System.out.println(used.getParentPath());
            }
            else if (input.equals("cd..")||input.equals("CD..")){
                if(used.parent != null){
                    used = (Folder) used.parent;
                }
            }
            else if (input.matches("(cd [a-zA-Z0-9]+.)")){
                input = input.substring(3,input.length());
                Folder newObject = (Folder) used.checkChildren(input);
                if(newObject != null) used = newObject;
                else System.out.println("Unknown path! :/");
            }
            else if (!input.equals("exit")){
                System.out.println("Unknown command! :/");
            }


        }while (!(input.equals("exit")));
    }
}
