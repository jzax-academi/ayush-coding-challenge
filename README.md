# ayush-coding-challenge

### **Objective**
Write a Java program that reads a paragraph of text and returns the top `N` most frequently occurring words.

### **Instructions**
1. **Read a block of text** (either as a string input or from a file).
2. **Process the text**: 
   - Remove punctuation.
   - Convert all words to lowercase.
   - Split the text into words.
3. **Count the frequency** of each word.
4. **Return the top `N` most frequent words**, sorted in descending order of frequency.

### **Input**
- A `String` containing a paragraph of text.
- An integer `N` representing how many top frequent words to return.

### **Output**
- A `List<String>` containing the `N` most frequent words.

### **Example**
#### **Input:**
```java
String text = "Java is great. Java is popular. Java is powerful and Java is fun!";
int N = 2;
```

#### **Output:**
```java
["java", "is"]
```

### **Constraints**
- Ignore case sensitivity (treat "Java" and "java" as the same).
- Ignore punctuation (`.,!?;:`).
- If multiple words have the same frequency, return them in alphabetical order.

### **Bonus**
- Add a **unit test** to validate the solution.

---

### **Evaluation Criteria**
- **Correctness**: Does the program correctly identify the top N words?
- **Code Efficiency**: Does it use appropriate data structures?
- **Code Readability**: Is the code well-structured and commented?
- **Edge Cases**: Does it handle empty strings, special characters, and case sensitivity?

---

### **Submission Guidelines**
- Fork this **GitHub repository**.
- Implement the solution in a file named `WordFrequencyCounter.java`.
- Add to this **README** with instructions on how to run your code.
- (Optional) Write a unit test using **JUnit**.
- Submit a **Pull Request (PR)** or share your GitHub repository link.


-----------------------------
### **TODO: Fill out code running instructions**
