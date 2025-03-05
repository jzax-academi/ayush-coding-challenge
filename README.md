# WordFrequencyCounter

This project provides a Java class, `WordFrequencyCounter`, that identifies the top N most frequent words in a given text. It also includes JUnit tests to ensure the class functions correctly.

## Functionality

The `WordFrequencyCounter` class has a method `getTopNWords(String text, int N)` that performs the following:

*   Takes a string `text` and an integer `N` as input.
*   Converts the input text to lowercase.
*   Removes punctuation from the text.
*   Splits the text into individual words.
*   Counts the frequency of each word.
*   Sorts the words by frequency in descending order (most frequent first). If words have the same frequency, they are sorted alphabetically.
*   Returns a list of the top `N` words.
*   Handles edge cases such as empty input text and non-positive values of N.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) installed (version 8 or higher recommended).
### Dependencies

*   [JUnit](https://junit.org/junit4/) (version 4.13.2)
*   [Hamcrest](http://hamcrest.org/JavaHamcrest/) (version 1.3)

These dependencies are included as `.jar` files in the `lib/` directory.

## How to Run

1.  **Open the project in VS Code.**

2.  **Configure Java Tooling:** Ensure you have the Java Development Kit (JDK) installed and configured in VS Code.  Install the "Extension Pack for Java" by Microsoft for the best experience.

3.  **Compile the Code:** VS Code with the Java extension should automatically detect and compile your Java files. 

4.  **Run the Tests:** In VS Code, navigate to the `wfcJunitTest.java` file. You should see a "Run" or "Run Tests" option above each test method or class.  Click this option to execute the JUnit tests.

## Example Usage (from `WordFrequencyCounter.java`)

The `WordFrequencyCounter.java` file also contains a `main` method with example usages.  To run these examples:

1.  **Open the project in VS Code.**

2.  **Run the `main` Method:** Open the `WordFrequencyCounter.java` file in VS Code and click the "Run" option that appears above the `main` method.

## Limitations

*   The code assumes that words are separated by whitespace. This means it might not handle certain edge cases well, such as hyphenated words or text with unusual spacing.

*   The code only considers basic ASCII punctuation. It might not correctly handle more complex Unicode punctuation or other special characters.
