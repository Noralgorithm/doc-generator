package com.docgenerator.Evidences;

public class LinkEvidence extends Evidence {
  public String externalLink;

  public LinkEvidence(Number id, String description, String uploadDate, String externalLink) {
    super(id, description, uploadDate);
    this.externalLink = externalLink;
  }
}
