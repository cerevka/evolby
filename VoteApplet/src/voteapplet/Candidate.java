/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package voteapplet;

/**
 *
 * @author lordondrak
 */
public class Candidate {

    private String login;
    private String firstName;
    private String lastName;

    public Candidate(){}
    public Candidate(String login, String firstName, String lastName){
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

}
