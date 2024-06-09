package com.docgenerator.Evidences;

public class DocumentEvidence extends Evidence {
  public String documentLink;

  public DocumentEvidence(Number id, String description, String uploadDate, String documentLink) {
    super(id, description, uploadDate);
    this.documentLink = documentLink;
  }
}
