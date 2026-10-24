src/main/java/compiler/ScanError.java
  package com.compilergroup.compilexm;

/**
 * Represents a single lexical error found while scanning.
 */
public class ScanError {

    public enum ErrorType {
        INVALID_CHARACTER,
        UNTERMINATED_STRING,
        MALFORMED_NUMBER
    }

    private final ErrorType type;
    private final String message;
    private final int line;
    private final int column;
    private final int length;

    /**
     * @param type    the category of error
     * @param message a human-readable description
     * @param line    the line where the error starts (1-based)
     * @param column  the column where the error starts (1-based)
     * @param length  how many characters the error covers (used for the caret underline)
     */
    public ScanError(ErrorType type, String message, int line, int column, int length) {
        this.type = type;
        this.message = message;
        this.line = line;
        this.column = column;
        this.length = Math.max(1, length);
    }

    public ErrorType getType() { return type; }

    public String getMessage() { return message; }

    public int getLine() { return line; }

    public int getColumn() { return column; }

    public int getLength() { return length; }

    @Override
    public String toString() {
        return String.format("[line %d, col %d] %s: %s", line, column, type, message);
    }
}

  
