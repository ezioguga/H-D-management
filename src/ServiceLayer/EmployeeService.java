/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import DatabaseLayer.DataBaseConnection;
import Models.Employee;

/**
 *
 * @author rambo
 */
public class EmployeeService {

    private DataBaseConnection conn;

    public EmployeeService() {

        conn = DataBaseConnection.getSingleConnection();

    }

    public boolean InsertEmployee(Employee st) {
        try {
            String query = "Insert into Employee values('" + st.getName()
                    + "','" + st.getAddress() + "'," + st.getSalary() + ",'" + st.getNIC() + "'," + st.getPhoneNo() +  "','" + st.getEmail() + "','" + st.getUsername() + "','" + st.getPassword() + "')";
            boolean result = conn.InsertQuery(query);
            return result;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;

        }
    }
}
