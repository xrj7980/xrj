package com.sample;


public class MovieRelationType {

  private long id;
  private long movieTypeId;
  private long movieId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMovieTypeId() {
    return movieTypeId;
  }

  public void setMovieTypeId(long movieTypeId) {
    this.movieTypeId = movieTypeId;
  }


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }

}
