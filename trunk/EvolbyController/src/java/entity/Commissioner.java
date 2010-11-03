/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author lordondrak
 */
@Entity
public class Commissioner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id   
    private String login;    
    @ManyToMany
    private Collection<Election> elections;
    private String firstName;
    private String lastName;
   @ManyToMany
    private List<ElectionEvent> eventsToEndVoting;
    public String getFirstName() {
        return firstName;
    }

    public List<ElectionEvent> getEventsToEndVoting() {
        return eventsToEndVoting;
    }

    public void setEventsToEndVoting(List<ElectionEvent> eventsToEndVoting) {
        this.eventsToEndVoting = eventsToEndVoting;
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

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Collection<Election> getElections() {
        return elections;
    }

    public void setElections(Collection<Election> elections) {
        this.elections = elections;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Commissioner)) {
            return false;
        }
        Commissioner other = (Commissioner) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Commissioner[id=" + login + "]";
    }

}
