package com.hawkeye.pojo;


public class MovieTicket {

  private long id;
  private long order;
  private String ticketCode;
  private String qrcodeRoute;
  private long movieId;
  private long cinemaId;
  private long movieHallId;
  private double ticketPrice;
  private java.sql.Timestamp projectionTime;
  private long payState;
  private java.sql.Timestamp foundTime;
  private java.sql.Timestamp modifyTime;
  private long uId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrder() {
    return order;
  }

  public void setOrder(long order) {
    this.order = order;
  }


  public String getTicketCode() {
    return ticketCode;
  }

  public void setTicketCode(String ticketCode) {
    this.ticketCode = ticketCode;
  }


  public String getQrcodeRoute() {
    return qrcodeRoute;
  }

  public void setQrcodeRoute(String qrcodeRoute) {
    this.qrcodeRoute = qrcodeRoute;
  }


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }


  public long getCinemaId() {
    return cinemaId;
  }

  public void setCinemaId(long cinemaId) {
    this.cinemaId = cinemaId;
  }


  public long getMovieHallId() {
    return movieHallId;
  }

  public void setMovieHallId(long movieHallId) {
    this.movieHallId = movieHallId;
  }


  public double getTicketPrice() {
    return ticketPrice;
  }

  public void setTicketPrice(double ticketPrice) {
    this.ticketPrice = ticketPrice;
  }


  public java.sql.Timestamp getProjectionTime() {
    return projectionTime;
  }

  public void setProjectionTime(java.sql.Timestamp projectionTime) {
    this.projectionTime = projectionTime;
  }


  public long getPayState() {
    return payState;
  }

  public void setPayState(long payState) {
    this.payState = payState;
  }


  public java.sql.Timestamp getFoundTime() {
    return foundTime;
  }

  public void setFoundTime(java.sql.Timestamp foundTime) {
    this.foundTime = foundTime;
  }


  public java.sql.Timestamp getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(java.sql.Timestamp modifyTime) {
    this.modifyTime = modifyTime;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }

}
