package web.model;

import javax.persistence.*;

@Entity
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "age")
        private int age;

        @Column(name = "street")
        private String street;

        @Column(name = "password")
        private String password;

        public User() {
        }

        public User(String name, int age, String street) {
            this.name = name;
            this.age = age;
            this.street = street;
        }

        public User(Long id, String name, int age, String street) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.street = street;
        }

        public User(Long id, String name, int age, String street, String password) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.street = street;
            this.password = password;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }
}
