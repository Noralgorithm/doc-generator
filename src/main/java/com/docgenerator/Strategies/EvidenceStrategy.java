package com.docgenerator.Strategies;

import java.io.FileWriter;

import com.docgenerator.Evidences.Evidence;

public interface EvidenceStrategy {
  void putEvidenceInDocument(Evidence evidence, FileWriter fileWriter);
}
