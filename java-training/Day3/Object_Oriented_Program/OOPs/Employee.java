package Object_Oriented_Program.OOPs;

public class Employee {
    public int emp_id;
    public String emp_name;
    public String joining_date;
    public char desig_code;
    public String dept;
    public int basic;
    public int hra;
    public int it;

    public Employee(int emp_id, String emp_name, String joining_date, char desig_code, String dept, int basic, int hra, int it) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.joining_date = joining_date;
        this.desig_code = desig_code;
        this.dept = dept;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }

    @Override
    public String toString() {
        return
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", joining_date='" + joining_date + '\'' +
                ", desig_code=" + desig_code +
                ", dept='" + dept + '\'' +
                ", basic=" + basic +
                ", hra=" + hra +
                ", it=" + it ;
    }

    public String getName( ) {
        return this.emp_name;
    }

    public char getDesig_code() {
        return desig_code;
    }

    public int getSalary(int id) {
//        int index = getIndex(id);
//        if(index == -1) return -1;
//        return (basic[index] + hra[index] - it[index] + calcDA(index));
        return basic+hra+it;
    }


    public String getDept() {
        return dept;
    }

    public boolean empExists(int id) {
//        if(getIndex(id) != -1)
            return true;
//        else
//            return false;
    }

    public String getDesignation(int id) {
        char d = getDesig_code();
        switch(d) {
            case 'e': return "Engineer";
            case 'c': return "Consultant";
            case 'k': return "Clerk";
            case 'r': return "Receptionist";
            case 'm': return "Manager";
        }
        return null;
    }

//    public String getEmp_name() {
//        return emp_name;
//    }
//
//    public String getJoining_date() {
//        return joining_date;
//    }
//
//
//    public int getBasic() {
//        return basic;
//    }
//
//    public int getHra() {
//        return hra;
//    }
//
//    public int getIt() {
//        return it;
//    }
}
