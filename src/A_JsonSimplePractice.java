import org.json.simple.JSONObject;

public class A_JsonSimplePractice {

    public static void main(String[] args) {
        A_JsonSimplePractice makeJsonPractice = new A_JsonSimplePractice();
    }

    public A_JsonSimplePractice() {
        // create your own JSON object
        JSONObject file = new JSONObject();
        file.put("Full Name", "Ritu Sharma");
        file.put("Student ID", 1704310046);
        file.put("Tuition Fees", 65400);
        file.put("Major", "CS");
        file.put("Grade Level", "Junior");

        // print the whole JSON
        System.out.println("JOSN: " + file);

        // extract one value from the JSON
        System.out.println("Tuition cost: " + file.get("Tuition Fees"));
        System.out.println("Name: " + file.get("Full Name") + "Major: " + file.get("Major"));

    }
}

// Modify the JSON object to include "Major" and "Grade Level"
// extract and print the student name and their major in one line.