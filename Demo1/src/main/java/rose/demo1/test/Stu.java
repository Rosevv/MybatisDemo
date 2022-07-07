package rose.demo1.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private double math;
    private double english;
    private Date hireDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hire_date) {
        this.hireDate = hire_date;
    }

    @Override
    public String toString() {
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
        String format = sd.format(hireDate);
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", math=" + math +
                ", english=" + english +
                ", hireDate=" + format +
                '}';
    }
}
