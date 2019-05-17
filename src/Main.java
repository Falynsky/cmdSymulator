import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Folder main = new Folder("main", null);

        Folder one = new Folder("one", main);
        Folder two = new Folder("two", main);

        main.addElement(one);
        main.addElement(two);

        Folder oneOne = new Folder("oneOne", one);
        one.addElement(oneOne);

        Folder oneOneOne = new Folder("oneOneOne", oneOne);
        oneOne.addElement(oneOneOne);

        Folder twoOne = new Folder("twoOne", two);
        Folder twoTwo = new Folder("twoTwo", two);

        two.addElement(new NewFile("TestaX.jpeg", two));

        two.addElement(twoOne);
        two.addElement(twoTwo);

        ConsoleMenu menu = new ConsoleMenu();

        menu.start(main);
    }
}
