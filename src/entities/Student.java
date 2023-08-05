package entities;

import java.util.List;
import java.util.Map;

public class Student {
        private String name;
        private int registration;
        private Map<String, Double> grades;

        public Student(){
        }

    public Student(String name, int registration, Map<String, Double> grades) {
        this.name = name;
        this.registration = registration;
        this.grades = grades;
    }

    public String getNome() {
            return name;
        }

        public void setNome(String name) {
            this.name = name;
        }

        public int getMatricula() {
            return registration;
        }

        public void setMatricula(int matricula) {
            this.registration = matricula;
        }

        public double calculaMean() {
            return grades.values().
                    stream().
                    reduce(0.0, Double::sum) / grades.size();
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                ", grades=" + grades +
                '}';
    }
}
