package com.rasyidf.kontakku.database;

public class Teman {

  private String name;
  private String phone;

  public Teman(int id, String name, String address) {
    this.name = name;
    this.phone = address;
  }

  public Teman() {
    setName("");
    setPhone("");
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getPhone() {
    return phone;
  }

  public String getName() {
    return name;
  }
}
