package felix.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by felix on 7/5/16.
 */
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private Long idperson;
    private String personName;
    private int personAge;

    protected Person() {
    }

    public Person(Long idperson) {
        this.idperson = idperson;
    }

    public Long getIdperson() {
        return idperson;
    }

    public void setIdperson(Long idperson) {
        this.idperson = idperson;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idperson=" + idperson +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
