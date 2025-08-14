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
public class Patient {

    private int id, age;
    private String name, gender, contact, address;

    public Patient() {
        this.id = 0;
        this.age = 0;
        this.name = "";
        this.gender = "";
        this.contact = "";
        this.address = "";
    }

    public Patient(int id, int age, String name, String gender, String contact, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.contact = contact;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", contact=" + contact + ", address=" + address + '}';
    }

}
