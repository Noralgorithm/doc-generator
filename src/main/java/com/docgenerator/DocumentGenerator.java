package com.docgenerator;

import java.io.FileWriter;

import com.docgenerator.Evidences.*;
import com.docgenerator.Strategies.*;

public class DocumentGenerator {
  static public void generateDocument(Evidence[] evidences, FileWriter fileWriter) {
    putHeader(fileWriter);

    EvidenceStrategy strategy = null;

    for (Evidence evidence : evidences) {
      if (evidence instanceof LinkEvidence) {
        strategy = new LinkEvidenceStrategy();
      } else if (evidence instanceof ImageEvidence) {
        strategy = new ImageEvidenceStrategy();
      } else if (evidence instanceof DocumentEvidence) {
        strategy = new DocumentEvidenceStrategy();
      }

      strategy.putEvidenceInDocument(evidence, fileWriter);
    }
  }

  static private void putHeader(FileWriter fileWriter) {
    try {
      fileWriter.append("# Reporte de GREEN METRIC:\n" + "\n" + "## Evidencias:\n");
    } catch (Exception e) {
      System.out.println("Error while wrintg file header");
    }
  }
}
