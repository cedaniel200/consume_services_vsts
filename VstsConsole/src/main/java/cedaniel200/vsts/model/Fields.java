package cedaniel200.vsts.model;

import com.google.gson.annotations.SerializedName;

public class Fields {

    public static final String TITLE = "/fields/System.Title";
    public static final String REPRO_STEPS = "/fields/Microsoft.VSTS.TCM.ReproSteps";
    public static final String PRIORITY = "/fields/Microsoft.VSTS.Common.Priority";
    public static final String SEVERITY = "/fields/Microsoft.VSTS.Common.Severity";
    public static final String RELATIONS = "/relations/-";

    @SerializedName("System.AreaPath")
    private String areaPath;

    @SerializedName("System.TeamProject")
    private String teamProject;

    @SerializedName("System.IterationPath")
    private String iterationPath;

    @SerializedName("System.WorkItemType")
    private String workItemType;

    @SerializedName("ystem.State")
    private String state;

    @SerializedName("System.Reason")
    private String reaso;

    @SerializedName("System.CreatedDate")
    private String createdDate;

    @SerializedName("System.CreatedBy")
    private String createdBy;

    @SerializedName("System.ChangedDate")
    private String changedDate;

    @SerializedName("System.ChangedBy")
    private String changedBy;

    @SerializedName("System.Title")
    private String title;

    @SerializedName("Microsoft.VSTS.Common.StateChangeDate")
    private String stateChangeDate;

    @SerializedName("Microsoft.VSTS.Common.Priority")
    private String priority;

    @SerializedName("Microsoft.VSTS.Common.Severity")
    private String severity;

    @SerializedName("Microsoft.VSTS.Common.ValueArea")
    private String valueArea;

    @SerializedName("Microsoft.VSTS.TCM.ReproSteps")
    private String reproSteps;

    public static String getTITLE() {
        return TITLE;
    }

    public static String getReproSteps() {
        return REPRO_STEPS;
    }

    public void setReproSteps(String reproSteps) {
        this.reproSteps = reproSteps;
    }

    public static String getPRIORITY() {
        return PRIORITY;
    }

    public static String getSEVERITY() {
        return SEVERITY;
    }

    public static String getRELATIONS() {
        return RELATIONS;
    }

    public String getAreaPath() {
        return areaPath;
    }

    public void setAreaPath(String areaPath) {
        this.areaPath = areaPath;
    }

    public String getTeamProject() {
        return teamProject;
    }

    public void setTeamProject(String teamProject) {
        this.teamProject = teamProject;
    }

    public String getIterationPath() {
        return iterationPath;
    }

    public void setIterationPath(String iterationPath) {
        this.iterationPath = iterationPath;
    }

    public String getWorkItemType() {
        return workItemType;
    }

    public void setWorkItemType(String workItemType) {
        this.workItemType = workItemType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReaso() {
        return reaso;
    }

    public void setReaso(String reaso) {
        this.reaso = reaso;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(String changedDate) {
        this.changedDate = changedDate;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStateChangeDate() {
        return stateChangeDate;
    }

    public void setStateChangeDate(String stateChangeDate) {
        this.stateChangeDate = stateChangeDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getValueArea() {
        return valueArea;
    }

    public void setValueArea(String valueArea) {
        this.valueArea = valueArea;
    }
}