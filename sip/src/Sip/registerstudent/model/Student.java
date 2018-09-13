package sip.registerstudent.model;

import javax.swing.JOptionPane;

public class Student 
{

    private String regno;
    private String name;
    private String contactNo;
    private String email;
    private String hostel;
    private String room;
    private String category;
    private String gender;
    private String adhar;
    private String semester;
    private String day;
    private String month;
    private String year;
    private String pass;
    private String subject;
    private String attendance;
    private String batch;
    private String stat;
    private String cgp;
    private String mark;
    private String academic;
    

    public Student() 
    {
    }

    public Student(String regno, String name, String contactNo, String email, String hostel, String room, String category, String gender, String adhar, String semester, String day, String month, String year, String pass ) 
    {
        this.regno = regno;
        this.name = name;
        this.contactNo = contactNo;
        this.email = email;
        this.hostel =hostel;
        this.room=room;
        this.category=category;
        this.gender=gender;
        this.adhar=adhar;
        this.semester=semester;
        this.day=day;
        this.month=month;
        this.year=year;
        this.pass=pass;        
    }

    public Student(String batch,String regno,String subject, String attendance) 
    {
        this.batch=batch;
        this.regno=regno;
        this.subject=subject;
        this.attendance=attendance;
    }

    public Student(String academic, String regno, String subject, String mark, String cgp, String stat) 
    {
        this.academic=academic;
        this.regno=regno;
        this.subject=subject;
        this.mark=mark;
        this.cgp=cgp;
        this.stat=stat;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getHostel() {
        return hostel;
    }
    
    public void setHostel(String hostel) {
        this.hostel = hostel;
    }
    
    public String getRoom() {
        return room ;
    }

    public void setRoom(String room ) {
        this.room = room;
    }
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar ;
    }
    
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day =day ;
    }
    
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month =month ;
    }
    
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year =year ;
    }
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass ) {
        this.pass =pass ;
    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject ) {
        this.subject =subject ;
    }
    
    public String getAttendance() {
        return attendance;
    }

    public void setAttencance(String attendance ) {
        this.attendance = attendance ;
    }
    
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch ) {
        this.batch =batch ;
    }
    
    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic ) {
        this.academic =academic ;
    }
    
    public String getMark() {
        return mark;
    }

    public void setMark(String mark ) {
        this.mark =mark ;
    }
    
    public String getCgp() {
        return cgp;
    }

    public void setCgp(String cgp ) {
        this.cgp =cgp ;
    }
    
    public String getStat() {
        return stat;
    }

    public void setStat(String stat ) {
        this.stat =stat ;
    }
    
    /*
    Repace ???? with the required new database column feild
    public String get????() {
        return ????;
    }

    public void set????(String ???? ) {
        this.???? =???? ;
    }
    */
}
