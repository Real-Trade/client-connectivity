package com.realtrade.clientconnectivity.dto;

import javax.persistence.*;
    @Entity
    @Table(name = "admin",schema = "public")
    public class Admin {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="admin_id")
        private int id;
        private  String first_name;
        private String last_name;
        private String email;
        private String password;
        private int status;

        public String toString() {
            return "Admin{" +
                    "id=" + id +
                    ", firstname='" + this.first_name + '\'' +
                    ", lastname='" + this.last_name + '\'' +
                    ", email='" + this.email + '\'' +
                    ", password='" + this.password + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstname() {
            return first_name;
        }

        public void setFirstname(String firstname) {
            this.first_name = firstname;
        }

        public String getLastname() {
            return last_name;
        }

        public void setLastname(String lastname) {
            this.last_name = lastname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
}
