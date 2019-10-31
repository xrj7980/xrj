package com.hawkeye.pojo;


public class User {

  private long id;
  private String name;
  private String phone;
  private long sex;
  private java.sql.Date birthday;
  private long lifeStateId;
  private long interestId;
  private String personalizedSignature;
  private long isHeadPortrait;
  private String headPortraitRoute;
  private String password;


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


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public long getLifeStateId() {
    return lifeStateId;
  }

  public void setLifeStateId(long lifeStateId) {
    this.lifeStateId = lifeStateId;
  }


  public long getInterestId() {
    return interestId;
  }

  public void setInterestId(long interestId) {
    this.interestId = interestId;
  }


  public String getPersonalizedSignature() {
    return personalizedSignature;
  }

  public void setPersonalizedSignature(String personalizedSignature) {
    this.personalizedSignature = personalizedSignature;
  }


  public long getIsHeadPortrait() {
    return isHeadPortrait;
  }

  public void setIsHeadPortrait(long isHeadPortrait) {
    this.isHeadPortrait = isHeadPortrait;
  }


  public String getHeadPortraitRoute() {
    return headPortraitRoute;
  }

  public void setHeadPortraitRoute(String headPortraitRoute) {
    this.headPortraitRoute = headPortraitRoute;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
