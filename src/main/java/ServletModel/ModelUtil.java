package ServletModel;

import Bean.Employee;
import Data.Data;

import java.util.HashMap;

public class ModelUtil {
    public static int addEmployee(String name, String mobile, String password) {
        HashMap<Integer, Employee> database = Data.getDatabase();
        int id = database.size()+1;
        Employee employee = new Employee(id,name,password,mobile);
        database.put(id,employee);
        Data.setDatabase(database);
        return id;
    }

    public static int loginValidate(Integer id, String password) {
        HashMap<Integer, Employee> database = Data.getDatabase();

        Employee employee = null ;
        employee = database.get(id);

        if(employee == null) return 1;
        else if(!employee.getPassword().equals(password)) return 2;
        else return 3;
    }

}
