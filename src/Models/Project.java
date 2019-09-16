package Models;

public class Project {
   private int proID;
   private String proName;
   private String StartDate;
   private String lastDate;
   private String Description;
   private double advance;

    public Project(int proID, String proName, String StartDate, String lastDate, String Description, double advance) {
        this.proID = proID;
        this.proName = proName;
        this.StartDate = StartDate;
        this.lastDate = lastDate;
        this.Description = Description;
        this.advance = advance;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
   
   

}
