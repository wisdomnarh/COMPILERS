package com.compilergroup.compilexm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collects errors raised during scanning and prints a readable report.
 */
public class ErrorReporter {

    private final List<ScanError> errors = new ArrayList<>();

    /** Records an error. Scanning continues so that all errors can be reported. */
    public void report(ScanError error) {
        errors.add(error);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public int getErrorCount() {
        return errors.size();
    }

    public List<ScanError> getErrors() {
        return Collections.unmodifiableList(errors);
    }

    /**
     * Prints every collected error, showing the offending source line
     * with a caret underline, followed by a summary count.
     */
    public void printReport(String source) {
        if (errors.isEmpty()) {
            System.out.println("Scan completed with no errors.");
            return;
        }

        String[] lines = source.split("\n", -1);

        System.err.println("===== Scan Errors =====");
        for (ScanError error : errors) {
            System.err.println(error);

            int index = error.getLine() - 1;
            if (index >= 0 && index < lines.length) {
                String text = lines[index].replace("\r", "");
                System.err.println("    " + text);
                System.err.println("    " + " ".repeat(Math.max(0, error.getColumn() - 1))
                        + "^".repeat(Math.min(error.getLength(),
                        Math.max(1, text.length() - error.getColumn() + 1))));
            }
        }
        System.err.println("-----------------------");
        System.err.println(errors.size() + (errors.size() == 1 ? " error" : " errors") + " found.");
    }
}

