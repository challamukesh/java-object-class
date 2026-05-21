# java-object-class
Java Object Class methods with examples and explanations

# Java Object Class

## What is Object Class?

Object class is the parent class of all classes in Java.

Every Java class inherits Object class methods.

---

# Methods of Object Class

| Method | Purpose |
|--------|---------|
| toString() | Convert object into readable string |
| equals() | Compare objects |
| hashCode() | Generate hash value |
| getClass() | Get runtime class info |
| clone() | Create copy of object |
| wait() | Pause thread |
| notify() | Wake thread |
| notifyAll() | Wake all waiting threads |

---

# Example of toString()

```java
class Student {
    int id = 101;

    public String toString() {
        return "Student ID: " + id;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
    }
}
```
