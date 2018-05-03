package cedaniel200.vsts.model;

public class Data {

    public static final String OP_ADD = "add";

    private String op;
    private String path;
    private Object value;

    public Data() {
    }

    public Data(String op, String path, Object value) {
        this.op = op;
        this.path = path;
        this.value = value;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

