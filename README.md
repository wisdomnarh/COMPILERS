
# COMPILER_GROUP_ONE

## Project Overview

This project is a Java-based compiler developed as a group assignment.

The first phase focuses on the scanner (lexical analyzer), which reads source code and identifies tokens according to the course mini-language specification.

## Requirements

- JDK 17 or later recommended
- Maven build tool
- Shared private GitHub repository

## Scanner Components

- `Main.java` — Program entry point
- `Token.java` — Token representation
- `TokenType.java` — Token categories
- `Scanner.java` — Scanner implementation
- `ScanError.java` — Scanning error reporting

## Project Scope

The current phase is Phase 1: Scanner.

Later phases are:
1. Parser
2. Semantic Analysis / IR Generator
3. Code Generator
4. Optimizer

## Build and Run

Compile the project:

```bash
mvn compile
```

Run the main class:

```bash
mvn exec:java -Dexec.mainClass="compiler.Main"
```

The scanner's token-recognition algorithm must be completed according to the course specification before it can scan programs successfully.

## AI Assistance Disclosure

Document permitted AI assistance inline in the relevant source files and commits, following the course academic integrity policy. The group is responsible for its implementation decisions and algorithmic logic.

## Deadline

Phase 1 — Scanner: 25 October 2026.

