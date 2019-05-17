public class NewFile extends PatternClass {

    NewFile(String name, PatternClass parent) {
        super(name, parent);
        super.type = "FILE";
    }

    @Override
    protected String getParentPath() {
        if (parent != null) {
            return parent.getParentPath() + "\\" + name;
        }
        else return "C:\\" + name;
    }

    @Override
    public void write() {
        System.out.println(type + ":  " + name);
    }

}
