package com.docgenerator.Strategies;

import java.io.FileWriter;

import com.docgenerator.Evidences.Evidence;
import com.docgenerator.Evidences.ImageEvidence;

public class ImageEvidenceStrategy implements EvidenceStrategy {
  public void putEvidenceInDocument(Evidence evidence, FileWriter fileWriter) {
    try {
      ImageEvidence imageEvidence = (ImageEvidence) evidence;
      fileWriter.append("- ### *Imagen:*\n  - " + imageEvidence.description + "<br><img src='" + imageEvidence.imageLink +"'></img><br>\n Enlace externo: <a>" + imageEvidence.externalLink + "</a>\n");
    } catch (Exception e) {
      System.out.println("Error while writing link evidence");
    }
  }
}
