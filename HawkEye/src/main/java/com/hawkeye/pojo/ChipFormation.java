package com.hawkeye.pojo;


public class ChipFormation {

  private long id;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp dispersionTime;
  private long movieId;
  private long cniemaHallId;
  private double price;
  private String languageVersion;
  private String chipFormationSeat;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getDispersionTime() {
    return dispersionTime;
  }

  public void setDispersionTime(java.sql.Timestamp dispersionTime) {
    this.dispersionTime = dispersionTime;
  }


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }


  public long getCniemaHallId() {
    return cniemaHallId;
  }

  public void setCniemaHallId(long cniemaHallId) {
    this.cniemaHallId = cniemaHallId;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getLanguageVersion() {
    return languageVersion;
  }

  public void setLanguageVersion(String languageVersion) {
    this.languageVersion = languageVersion;
  }


  public String getChipFormationSeat() {
    return chipFormationSeat;
  }

  public void setChipFormationSeat(String chipFormationSeat) {
    this.chipFormationSeat = chipFormationSeat;
  }

}
