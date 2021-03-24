package com.realtrade.clientconnectivity.dto;

import javax.persistence.*;

@Entity
@Table(name = "client",schema = "public")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="client_id")
    private int id;
    private  String first_name;
    private String last_name;
    private String email;
    private String password;
    private int status;

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    private int account_number;
    private String created_at;
    private String update_at;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccountNumber(int accountnumber) {
        this.account_number = accountnumber;
    }

    public String toString() {
        return "Client{" +
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirstname(String firstname) {
        this.first_name = firstname;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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
