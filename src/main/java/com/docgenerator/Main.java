package com.docgenerator;

import java.io.File;
import java.io.FileWriter;

import com.docgenerator.Evidences.*;

public class Main {
    private final static String DOCUMENT_FILENAME = "document.md";

    public static void main(String[] args) {
        Evidence[] evidences = new Evidence[] {
                new LinkEvidence(1, "Enlace a Google", "2021-01-01", "https://www.google.com"),
                new DocumentEvidence(2, "Documento sobre la ecologia", "2021-01-02", "https://www.google.com/document"),
                new ImageEvidence(8, "Imagen de la luna", "2021-01-03",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Full_Moon_Luc_Viatour.jpg/280px-Full_Moon_Luc_Viatour.jpg",
                        "www.google.com"),
                        new LinkEvidence(1, "Enlace a Google", "2021-01-01", "https://www.google.com")
        };

        try {
            File file = new File(DOCUMENT_FILENAME);
            file.createNewFile();

            FileWriter fileWriter = new FileWriter(DOCUMENT_FILENAME);

            DocumentGenerator.generateDocument(evidences, fileWriter);

            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error generating document: " + e.getMessage());
        }

    }
}