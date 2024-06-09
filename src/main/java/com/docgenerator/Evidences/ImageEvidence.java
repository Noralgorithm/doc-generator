package com.docgenerator.Evidences;

public class ImageEvidence extends Evidence {
  public String imageLink;
  public String externalLink;

  public ImageEvidence(Number id, String description, String uploadDate, String imageLink, String externalLink) {
    super(id, description, uploadDate);
    this.imageLink = imageLink;
    this.externalLink = externalLink;
  }
}
