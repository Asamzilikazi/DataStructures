package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-03-25.
 */
public class PatientList {

    String name;
    String diagnosis;

    public PatientList(){}

    public PatientList(String nm, String diagno)
    {
        name = nm;
        diagnosis = diagno;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setDiagnosis(String course){
        this.diagnosis = course;
    }

    public  String getName(){
        return name;
    }

    public String getCourse(){
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Patient Name: " + name + "\n" + "Diagnosis Name: " + diagnosis;
    }
}
