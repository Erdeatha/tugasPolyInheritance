/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.polymorphism;

/**
 *
 * @author Putra
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Ucup", "Jl. Merdeka", "08123456789", "ucup@example.com");
        Student student = new Student("Adi", "Jl. Sudirman", "08123456780", "adi@example.com", Student.FRESHMAN);
        MyDate hireDate = new MyDate(2020, 5, 20);
        Employee employee = new Employee("Budi", "Jl. Thamrin", "08123456781", "budi@example.com", "Kantor A", 5000000, hireDate);
        Faculty faculty = new Faculty("Citra", "Jl. Gatot Subroto", "08123456782", "citra@example.com", "Kantor B", 6000000, hireDate, 40, "Profesor");
        Staff staff = new Staff("Dewi", "Jl. Ahmad Yani", "08123456783", "dewi@example.com", "Kantor C", 4000000, hireDate, "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
