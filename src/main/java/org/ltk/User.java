package org.ltk;

public class User {
  private String name;
  private String surname;
  private String email;
  private String phone;
  private String address;
  private int age;
  private String job;

  public User() {

  }

  public User(String name, String surname, String email, String phone, String address, int age,
      String job) {
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.age = age;
    this.job = job;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", email='" + email + '\'' +
        ", phone='" + phone + '\'' +
        ", address='" + address + '\'' +
        ", age=" + age +
        ", job='" + job + '\'' +
        '}';
  }
}
