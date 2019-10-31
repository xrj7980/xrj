package com.hawkeye.pojo;


public class OrderSeat {

  private long id;
  private long ticketOrder;
  private long seatId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getTicketOrder() {
    return ticketOrder;
  }

  public void setTicketOrder(long ticketOrder) {
    this.ticketOrder = ticketOrder;
  }


  public long getSeatId() {
    return seatId;
  }

  public void setSeatId(long seatId) {
    this.seatId = seatId;
  }

}
