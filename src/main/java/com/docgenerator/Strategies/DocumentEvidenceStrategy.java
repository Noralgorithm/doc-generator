package com.docgenerator.Strategies;

import java.io.FileWriter;

import com.docgenerator.Evidences.Evidence;
import com.docgenerator.Evidences.DocumentEvidence;

public class DocumentEvidenceStrategy implements EvidenceStrategy {
  public void putEvidenceInDocument(Evidence evidence, FileWriter fileWriter) {
    try {
      DocumentEvidence documentEvidence = (DocumentEvidence) evidence;
      fileWriter.append("- ### *Documento:*\n  - " + documentEvidence.description + "<br> Enlace al documento: <a>" + documentEvidence.documentLink + "</a>\n");
    } catch (Exception e) {
      System.out.println("Error while writing link evidence");
    }
  }
}
