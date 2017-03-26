package za.ac.mzilikazi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by mandisi on 2017-03-26.
 */
public class TestPatientList {

        PatientList patient1;
        PatientList patient2;
        PatientList patient3;

        @Before
        public void setUp() throws Exception {
            patient1 = new PatientList("Cindy Smith", "Depression");
            patient2 = new PatientList("Ben Thompson", "Anxiety");
            patient3 = new PatientList("Mandy Brown", "Stress");
        }

        @After
        public void tearDown() throws Exception {

        }

        @Test
        public void testStudentList() throws Exception {
            List patientList = new ArrayList();

            patientList.add(patient1.getName());
            patientList.add(patient2.getName());
            patientList.add(patient3.getName() + "\n");

            System.out.print("Patients admitted: " + patientList + "\n");
            System.out.print("The number of admitted patients is: " + patientList.size() + "\n");

            patientList.remove(0);
            System.out.print("Patients admitted after one patient is discharged: " + patientList);
            System.out.print("The number of admitted patients now is: " + patientList.size());

            Assert.assertEquals("Cindy Smith", patient1.getName());
        }
}
