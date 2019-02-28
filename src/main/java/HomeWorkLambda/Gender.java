package HomeWorkLambda;

public enum Gender {
MALE("male"), FEMALE("female"), UNKNOWN("N/A");
private String name;
Gender(String name) {this.name=name;}

public String getName() {
    return name;
}
}
