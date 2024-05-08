package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrinterQueueSimulation {
//    You are tasked with writing a method called printerQueueSimulation/PrinterQueueSimulation
//    that simulates a printer queue for a busy office.
//    The goal is to manage the order in which documents are printed based on their arrival time.
//    Your method should return the total number of printed documents.
//
//    Instructions:
//    1.Create a method that takes a list of document names (strings) as input.
//   2. Create a queue to represent the printer queue.
//   3. Iterate over the list of document names and add each document to the printer queue.
//   4. Print a message for each document indicating that it has arrived and joined the printer queue.
//    5.Simulate the printing process by continuously dequeuing documents from the printer queue until it becomes empty.
//    6.For each document, print a message indicating that the printer is printing the document.
//   7. For each document, print a message indicating that it has finished printing.
//   8. After printing each document, increment the total number of printed documents.
//   9. Print a message indicating the total number of printed documents.
//   10. Return the total number of printed documents.

    public static void main(String[] args) {
        // Tests
        List<String> documentsList2 = new ArrayList<>(List.of("Candidate Resume", "Candidate Cover Letter", "Candidate References"));
        System.out.println("TEST: Expected: 3 | Actual: " + printerQueueSimulation(documentsList2));

        System.out.println("-------------------");

        List<String> documentsList1 = new ArrayList<>(List.of("Document 1", "Document 2", "Document 3", "Document 4", "Document 5"));
        System.out.println("TEST: Expected: 5 | Actual: " + printerQueueSimulation(documentsList1));

        System.out.println("-------------------");

        List<String> documentsList3 = new ArrayList<>(List.of("Visit PocketLintForCash.com!", "Win a Free Vacation to Hawaii!", "12 Things Your Cat Does While You're At Work!", "Spam! Spam! Spam!"));
        System.out.println("TEST: Expected: 4 | Actual: " + printerQueueSimulation(documentsList3));

    }
    public static int printerQueueSimulation(List<String> documents){
        Queue<String> queue = new LinkedList<>();
        for (String document : documents){
            queue.offer(document);
            System.out.println("==> '" + document + "' arrived and joined the printer queue");
        }
        int totalPrintedDocuments = 0;
        while(!queue.isEmpty()){
            String document = queue.poll();
            System.out.println("... Printer printing '" + document + "' ...");
            System.out.println("Document finished printing ");
            totalPrintedDocuments++;
        }
        System.out.println("**** Total Documents printed: " + totalPrintedDocuments + " ****");
        return totalPrintedDocuments;
    }

}
