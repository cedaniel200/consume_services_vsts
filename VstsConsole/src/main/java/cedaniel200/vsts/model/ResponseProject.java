package cedaniel200.vsts.model;

import java.util.List;

public class ResponseProject {

    private int count;
    private List<Project> value;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Project> getValue() {
        return value;
    }

    public void setValue(List<Project> value) {
        this.value = value;
    }
}
