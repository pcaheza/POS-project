package POSPD;

import java.util.Collection;

/**
 * 
 * The Cashiers make the sale to the customers. The system shall provide a way to add, update and delete Cashiers.
 */
public class Cashier {

    /**
     * specify number of cashier
     */
    private String number;
    /**
     * this indicate the password of the cashier
     */
    private String password;
    /**
     * this specify the session of the cashier when his in and out the system
     */
    private Collection<Session> sessions;
    /**
     * person represents customers who purchase and pay all items purchased in store to cashiers.
     */
    private Person person;

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Session> getSessions() {
        return this.sessions;
    }

    public void setSessions(Collection<Session> sessions) {
        this.sessions = sessions;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * 
     * @param number
     * @param person
     * @param password
     */
    public Cashier(String number, Person person, String password) {
       
    }

    /**
     * 
     * @param session
     */
    public void addSession(Session session) {
        // TODO - implement Cashier.addSession
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param session
     */
    public void removeSession(Session session) {
        // TODO - implement Cashier.removeSession
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param password
     */
    public Boolean isAuthorized(String password) {
        // TODO - implement Cashier.isAuthorized
        throw new UnsupportedOperationException();
    }

    
    public Cashier() {
       
    }

	@Override
	public String toString() {
		return "[number=" + number + ", person=" + person + "]\n";//TODO can we show few details of the person
	}
    
    

}