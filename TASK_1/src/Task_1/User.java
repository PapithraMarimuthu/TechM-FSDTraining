package Task_1;
//11. Object Class Methods
import java.util.*;
class User {
 private String name;
 private int age;

 // Constructor to initialize user properties
 public User(String name, int age) {
     this.name = name;
     this.age = age;
 }

 @Override
 public String toString() {
     return "User{name='" + name + "', age=" + age + "} "; // Return string representation of User
 }

 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true; // Same object, return true
     if (!(obj instanceof User)) return false; // Check if obj is a User
     User user = (User) obj; // Cast the object to User
     return age == user.age && Objects.equals(name, user.name); // Compare name and age
 }
}

