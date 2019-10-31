package com.hawkeye.pojo;


public class UserWallet {

  private long id;
  private long userId;
  private long paymentPwd;
  private String identityCard;
  private double walletBalance;
  private long walletState;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getPaymentPwd() {
    return paymentPwd;
  }

  public void setPaymentPwd(long paymentPwd) {
    this.paymentPwd = paymentPwd;
  }


  public String getIdentityCard() {
    return identityCard;
  }

  public void setIdentityCard(String identityCard) {
    this.identityCard = identityCard;
  }


  public double getWalletBalance() {
    return walletBalance;
  }

  public void setWalletBalance(double walletBalance) {
    this.walletBalance = walletBalance;
  }


  public long getWalletState() {
    return walletState;
  }

  public void setWalletState(long walletState) {
    this.walletState = walletState;
  }

}
