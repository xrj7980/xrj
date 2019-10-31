package com.hawkeye.pojo;


public class Movie {

  private long id;
  private String movieMainTitle;
  private String movieSubheading;
  private long movieDuration;
  private String defaultImg;
  private String toStar;
  private String movieSynopsis;
  private long isUpperShelf;
  private long movieVersionId;
  private long movieRegionId;
  private java.sql.Timestamp releaseTime;
  private String version;

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getMovieMainTitle() {
    return movieMainTitle;
  }

  public void setMovieMainTitle(String movieMainTitle) {
    this.movieMainTitle = movieMainTitle;
  }


  public String getMovieSubheading() {
    return movieSubheading;
  }

  public void setMovieSubheading(String movieSubheading) {
    this.movieSubheading = movieSubheading;
  }


  public long getMovieDuration() {
    return movieDuration;
  }

  public void setMovieDuration(long movieDuration) {
    this.movieDuration = movieDuration;
  }


  public String getDefaultImg() {
    return defaultImg;
  }

  public void setDefaultImg(String defaultImg) {
    this.defaultImg = defaultImg;
  }


  public String getToStar() {
    return toStar;
  }

  public void setToStar(String toStar) {
    this.toStar = toStar;
  }


  public String getMovieSynopsis() {
    return movieSynopsis;
  }

  public void setMovieSynopsis(String movieSynopsis) {
    this.movieSynopsis = movieSynopsis;
  }


  public long getIsUpperShelf() {
    return isUpperShelf;
  }

  public void setIsUpperShelf(long isUpperShelf) {
    this.isUpperShelf = isUpperShelf;
  }


  public long getMovieVersionId() {
    return movieVersionId;
  }

  public void setMovieVersionId(long movieVersionId) {
    this.movieVersionId = movieVersionId;
  }


  public long getMovieRegionId() {
    return movieRegionId;
  }

  public void setMovieRegionId(long movieRegionId) {
    this.movieRegionId = movieRegionId;
  }


  public java.sql.Timestamp getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(java.sql.Timestamp releaseTime) {
    this.releaseTime = releaseTime;
  }

}
