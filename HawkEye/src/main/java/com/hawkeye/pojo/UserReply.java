package com.hawkeye.pojo;


public class UserReply {

  private long id;
  private long commentId;
  private long targetUserId;
  private long replyUserId;
  private String replyContent;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }


  public long getTargetUserId() {
    return targetUserId;
  }

  public void setTargetUserId(long targetUserId) {
    this.targetUserId = targetUserId;
  }


  public long getReplyUserId() {
    return replyUserId;
  }

  public void setReplyUserId(long replyUserId) {
    this.replyUserId = replyUserId;
  }


  public String getReplyContent() {
    return replyContent;
  }

  public void setReplyContent(String replyContent) {
    this.replyContent = replyContent;
  }

}
