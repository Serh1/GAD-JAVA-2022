package Lecture3_DesignPatterns.Ch6;

public class Person {
    private String name,job,university;
    private boolean drivingLicencse, isMarried;

    Person(Builder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicencse = builder.drivingLicencse;
        this.isMarried = builder.isMarried;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }
    public boolean hasLicense(){
        return drivingLicencse;
    }
    public boolean isMarried(){
        return isMarried;
    }

    public static class Builder {
        private String name,job,university;
        private boolean drivingLicencse, isMarried;

        public Builder(String name){
            this.name = name;
        }

        public Person build(){
            return new Person(this);
        }
        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public Builder setDrivingLicencse(boolean drivingLicencse) {
            this.drivingLicencse = drivingLicencse;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicencse=" + drivingLicencse +
                ", isMarried=" + isMarried +
                '}';
    }
}
