package com.realtrade.clientconnectivity.dto;

import javax.persistence.*;
    @Entity
    @Table(name = "admin",schema = "realtrading")
    public class Admin {
//        @Id
//        @SequenceGenerator(
//                name = "admin_id_sequence",
//                sequenceName = "admin_id_sequence",
//                allocationSize = 1
//        )
//        @GeneratedValue(
//                strategy = GenerationType.SEQUENCE,
//                generator = "admin_id_sequence"
//        )
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="adminid")
        private int id;
        private  String firstname;
        private String lastname;
        private String email;
        private String password;



        public String toString() {
            return "Admin{" +
                    "id=" + id +
                    ", firstname='" + this.firstname + '\'' +
                    ", lastname='" + this.lastname + '\'' +
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
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
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
