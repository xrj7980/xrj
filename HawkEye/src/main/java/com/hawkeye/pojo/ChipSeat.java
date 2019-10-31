package com.hawkeye.pojo;


public class ChipSeat {

  private long id;
  private long chipFormationId;
  private long seatId;
  private long seatState;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getChipFormationId() {
    return chipFormationId;
  }

  public void setChipFormationId(long chipFormationId) {
    this.chipFormationId = chipFormationId;
  }


  public long getSeatId() {
    return seatId;
  }

  public void setSeatId(long seatId) {
    this.seatId = seatId;
  }


  public long getSeatState() {
    return seatState;
  }

  public void setSeatState(long seatState) {
    this.seatState = seatState;
  }

}
