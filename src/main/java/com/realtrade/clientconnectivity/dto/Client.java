package com.realtrade.clientconnectivity.dto;


import javax.persistence.*;

@Entity
@Table(name = "client",schema = "realtrading")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="clientid")
    private int id;
    private  String firstname;
    private String lastname;
    private String email;
    private String password;
    private int status;
    private int accountnumber;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountNumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }




    public String toString() {
        return "Client{" +
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
