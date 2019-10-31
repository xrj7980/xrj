package com.hawkeye.pojo;


public class Cinema {

  private long id;
  private String cinemaName;
  private String detailedAddress;
  private String cinemaLandline;
  private long cinemaBrandId;
  private long cityId;
  private long areaId;
  private long streetId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCinemaName() {
    return cinemaName;
  }

  public void setCinemaName(String cinemaName) {
    this.cinemaName = cinemaName;
  }


  public String getDetailedAddress() {
    return detailedAddress;
  }

  public void setDetailedAddress(String detailedAddress) {
    this.detailedAddress = detailedAddress;
  }


  public String getCinemaLandline() {
    return cinemaLandline;
  }

  public void setCinemaLandline(String cinemaLandline) {
    this.cinemaLandline = cinemaLandline;
  }


  public long getCinemaBrandId() {
    return cinemaBrandId;
  }

  public void setCinemaBrandId(long cinemaBrandId) {
    this.cinemaBrandId = cinemaBrandId;
  }


  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public long getAreaId() {
    return areaId;
  }

  public void setAreaId(long areaId) {
    this.areaId = areaId;
  }


  public long getStreetId() {
    return streetId;
  }

  public void setStreetId(long streetId) {
    this.streetId = streetId;
  }

}
