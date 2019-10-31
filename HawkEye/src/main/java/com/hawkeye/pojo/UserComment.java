package com.hawkeye.pojo;


public class UserComment {

  private long id;
  private long themeId;
  private long themeType;
  private long userId;
  private String commentContent;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getThemeId() {
    return themeId;
  }

  public void setThemeId(long themeId) {
    this.themeId = themeId;
  }


  public long getThemeType() {
    return themeType;
  }

  public void setThemeType(long themeType) {
    this.themeType = themeType;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getCommentContent() {
    return commentContent;
  }

  public void setCommentContent(String commentContent) {
    this.commentContent = commentContent;
  }

}
