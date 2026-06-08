package main.models;

public class trips {
    
    public String startTime;
    public String endTime;
    public double miles;
    public commission comm;

    public Trip(String startTime, String endTime, double miles, double[] incentives) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.miles = miles;
        this.comm = new commission(incentives[0], incentives[1], incentives[2]);
    }

    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }

    public String getEndTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; };

    public double getMiles() { return miles; }
    public void setMiles(double miles) { this.miles = miles; }

    public commission getCommision() { return comm; }
}
