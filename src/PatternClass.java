abstract class PatternClass {

    String name;
    String type;
    PatternClass parent;

    PatternClass(String name, PatternClass parent) {
        this.name = name;
        this.parent = parent;
    }

    public abstract void write();

    protected abstract String getParentPath();
}
