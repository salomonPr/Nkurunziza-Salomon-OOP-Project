package insurance;

import java.time.LocalDate;

public class Person {
    private String personId, fullName, email, phone;
    private LocalDate dob;

    public Person(String id, String name, LocalDate dob, String email, String phone) {
        this.personId = id;
        this.fullName = name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
    }

    public boolean isValid() {
        return email.contains("@") && phone.length() == 10;
    }

    // Getters omitted for brevity
    public String getFullName() { return fullName; }

}

