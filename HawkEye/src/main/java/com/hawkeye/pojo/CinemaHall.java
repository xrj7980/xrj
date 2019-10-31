package com.hawkeye.pojo;


public class CinemaHall {

  private long id;
  private String cinemaHallName;
  private long cinemaId;
  private String layout;
  private long row;
  private long column;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCinemaHallName() {
    return cinemaHallName;
  }

  public void setCinemaHallName(String cinemaHallName) {
    this.cinemaHallName = cinemaHallName;
  }


  public long getCinemaId() {
    return cinemaId;
  }

  public void setCinemaId(long cinemaId) {
    this.cinemaId = cinemaId;
  }


  public String getLayout() {
    return layout;
  }

  public void setLayout(String layout) {
    this.layout = layout;
  }


  public long getRow() {
    return row;
  }

  public void setRow(long row) {
    this.row = row;
  }


  public long getColumn() {
    return column;
  }

  public void setColumn(long column) {
    this.column = column;
  }

}
