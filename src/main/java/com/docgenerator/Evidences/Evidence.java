package com.docgenerator.Evidences;

public abstract class Evidence {
  public Number id;
  public String description;
  public String uploadDate;

  public Evidence(Number id, String description, String uploadDate) {
    this.id = id;
    this.description = description;
    this.uploadDate = uploadDate;
  }
}
