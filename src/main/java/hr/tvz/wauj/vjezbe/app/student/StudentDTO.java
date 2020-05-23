package hr.tvz.wauj.vjezbe.app.student;

public class StudentDTO {
    
    private final String firstName;
    private final String lastName;
    private final String jmbag;
    private final Integer numberOfECTS;
    private final boolean tuitionShouldBePaid;

    public StudentDTO(String firstName, String lastName, String jmbag, Integer numberOfECTS, boolean tuitionShouldBePaid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jmbag = jmbag;
        this.numberOfECTS = numberOfECTS;
        this.tuitionShouldBePaid = tuitionShouldBePaid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJmbag() {
        return jmbag;
    }

    public Integer getNumberOfECTS() {
        return numberOfECTS;
    }

    public boolean isTuitionShouldBePaid() {
        return tuitionShouldBePaid;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jmbag='" + jmbag + '\'' +
                ", numberOfECTS=" + numberOfECTS +
                ", tuitionShouldBePaid=" + tuitionShouldBePaid +
                '}';
    }
}
