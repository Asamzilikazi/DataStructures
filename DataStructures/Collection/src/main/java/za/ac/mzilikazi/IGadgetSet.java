package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-03-26.
 */
public class IGadgetSet {

    private String appliance;

    public IGadgetSet(String appliance){
        this.appliance = appliance;
    }

    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }

    public String getAppliance() {
        return appliance;
    }

    @Override
    public String toString() {
        return "(IGadget set{" +
                "Appliance='" + appliance + "}";

    }
}
