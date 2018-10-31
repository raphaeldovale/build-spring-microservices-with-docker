package net.dovale.okta.microservicesdocker.data.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String teacherName;
    private int workload;

    public Course(String name, String teacherName, int workload) {
        this.name = name;
        this.teacherName = teacherName;
        this.workload = workload;
    }

    public Course() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
}
