package com.hawkeye.pojo;


public class CinemaRelationService {

  private long id;
  private long serviceId;
  private long cniemaId;
  private String serviceRemarks;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getServiceId() {
    return serviceId;
  }

  public void setServiceId(long serviceId) {
    this.serviceId = serviceId;
  }


  public long getCniemaId() {
    return cniemaId;
  }

  public void setCniemaId(long cniemaId) {
    this.cniemaId = cniemaId;
  }


  public String getServiceRemarks() {
    return serviceRemarks;
  }

  public void setServiceRemarks(String serviceRemarks) {
    this.serviceRemarks = serviceRemarks;
  }

}
