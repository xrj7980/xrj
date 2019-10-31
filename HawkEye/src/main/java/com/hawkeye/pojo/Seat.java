package com.hawkeye.pojo;


public class Seat {

  private long id;
  private long cinemaHallId;
  private String seatName;
  private long row;
  private long column;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCinemaHallId() {
    return cinemaHallId;
  }

  public void setCinemaHallId(long cinemaHallId) {
    this.cinemaHallId = cinemaHallId;
  }


  public String getSeatName() {
    return seatName;
  }

  public void setSeatName(String seatName) {
    this.seatName = seatName;
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
