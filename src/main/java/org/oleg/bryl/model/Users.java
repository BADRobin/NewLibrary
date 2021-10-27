package org.oleg.bryl.model;

import javax.persistence.*;


@Entity
public class Users {

    @Id
    @GeneratedValue
    private int     user_id;
    private String  username;
    private String  password;
    private boolean enabled;
    private int     people_id;

    public Users(int user_id, String username, String password, boolean enabled, int people_id) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.people_id = people_id;
    }

    public Users() {

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getPeople_id() {
        return people_id;
    }

    public void setPeople_id(int people_id) {
        this.people_id = people_id;
    }
}
