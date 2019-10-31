package com.hawkeye.pojo;


public class MovieInformation {

  private long id;
  private String informationTitle;
  private java.sql.Timestamp releaseTime;
  private long browseNumber;
  private long movieId;
  private long fabulousNumber;
  private String informationContent;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getInformationTitle() {
    return informationTitle;
  }

  public void setInformationTitle(String informationTitle) {
    this.informationTitle = informationTitle;
  }


  public java.sql.Timestamp getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(java.sql.Timestamp releaseTime) {
    this.releaseTime = releaseTime;
  }


  public long getBrowseNumber() {
    return browseNumber;
  }

  public void setBrowseNumber(long browseNumber) {
    this.browseNumber = browseNumber;
  }


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }


  public long getFabulousNumber() {
    return fabulousNumber;
  }

  public void setFabulousNumber(long fabulousNumber) {
    this.fabulousNumber = fabulousNumber;
  }


  public String getInformationContent() {
    return informationContent;
  }

  public void setInformationContent(String informationContent) {
    this.informationContent = informationContent;
  }

}
