package com.docgenerator.Strategies;

import java.io.FileWriter;

import com.docgenerator.Evidences.Evidence;
import com.docgenerator.Evidences.LinkEvidence;

public class LinkEvidenceStrategy implements EvidenceStrategy {
  public void putEvidenceInDocument(Evidence evidence, FileWriter fileWriter) {
    try {
      LinkEvidence linkEvidence = (LinkEvidence) evidence;
      fileWriter.append("- ### *Enlace:*\n  - " + linkEvidence.description + "<br>" + linkEvidence.externalLink + "\n");
    } catch (Exception e) {
      System.out.println("Error while writing link evidence");
    }
  }
}
