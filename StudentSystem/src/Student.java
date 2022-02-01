import java.io.Serializable;

    public class Student implements Serializable {

        // declaring instance variables
        private int id;
        private String name;
        private String gender;
        private int age;

        // constructor

        public Student(int id, String name, String gender, int age) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        // getter setter methods
        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return this.gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        //toString method
        public String toString() {
            return String.format("%nName: %s%nID: %s%nGender: %s%nAge: %s", name, id, gender, age);
        }

    }


