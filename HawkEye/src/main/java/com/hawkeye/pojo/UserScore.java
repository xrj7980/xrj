package com.hawkeye.pojo;


public class UserScore {

  private long id;
  private double score;
  private long isBuyTickets;
  private String content;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }


  public long getIsBuyTickets() {
    return isBuyTickets;
  }

  public void setIsBuyTickets(long isBuyTickets) {
    this.isBuyTickets = isBuyTickets;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
