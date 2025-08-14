/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalRecords;

/**
 *
 * @author Bim
 */
public class vaccineRecord {

    private String vName;
    private int numDoses, numBoosters, patientID;

    public vaccineRecord() {
        
        this.patientID = 0;
        this.vName = "";
        this.numDoses = 0;
        this.numBoosters = 0;
    }

    public vaccineRecord(int patientID, String vName, int numDoses, int numBoosters ) {
        this.patientID = patientID;
        this.vName = vName;
        this.numDoses = numDoses;
        this.numBoosters = numBoosters;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public int getNumDoses() {
        return numDoses;
    }

    public void setNumDoses(int numDoses) {
        this.numDoses = numDoses;
    }

    public int getNumBoosters() {
        return numBoosters;
    }

    public void setNumBoosters(int numBoosters) {
        this.numBoosters = numBoosters;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    @Override
    public String toString() {
        return "vaccineRecord{" + ",vName=" + vName + ", numDoses=" + numDoses + ", numBoosters=" + numBoosters + ", patientID=" + patientID + '}';
    }

}
