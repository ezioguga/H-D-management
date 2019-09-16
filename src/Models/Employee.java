package Models;

public class Employee {
    private int empID;
    private String name;
    private String address;
    private String email;
    private String username;
    private String password;
    private String DOB;
    private String gender;
    private int phoneNo;
    private double salary;
    private String NIC;

    public Employee(int empID, String name, String address, String email, String username, String password, String DOB, String gender, int phoneNo,double salary,String NIC) {
        this.empID = empID;
        this.name = name;
        this.address = address;
        this.email = email;
        this.username = username;
        this.password = password;
        this.DOB = DOB;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.salary=salary;
        this.NIC=NIC;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
    
    

    
}
 