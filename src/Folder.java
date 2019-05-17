import java.util.ArrayList;

public class Folder extends PatternClass {

    private ArrayList<PatternClass> elements = new ArrayList();

    Folder(String name, Folder parent) {
        super(name, parent);
        super.type = "DIR";
    }

    void addElement(PatternClass j) {
        elements.add(j);
    }

    public PatternClass check(String input) {
        for (PatternClass j : elements) {
            if (j.type.equals("DIR") && j.name.equals(input)) return j;
        }
        return null;
    }

    @Override
    protected String getParentPath() {
        if (parent != null) {
            return parent.getParentPath() + "\\" + name;
        } else return "C:\\" + name;
    }

    @Override
    public void write() {
        for (PatternClass j : elements) {
            System.out.println(j.type + "\t" + j.name);
        }
    }
}
