public class Employee extends Person    //Employee is a Person
    Private double Salary;
    Priva Date employmentDate;
    public Employee( String mylastName,
                String myFirstName,Date my BirthDate,
                double mySalery, Date myEmploymentDate)
    {
        call constructor of superclass with three parameter
            super(myLastName, myFirsName, myBirthDate);
        salery= mySalery;
        date= myDate;
    }

    public double getSalery()
    {
        return salery;
    }

    public Date getEmployeementDate()
    {
        return employmentDate;
    }
    public void setSalery(double mySalery)
        //...
