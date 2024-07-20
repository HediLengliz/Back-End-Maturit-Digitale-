package models;

import jakarta.persistence.*;

@Entity
public class UserDefinedFieldValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_defined_field_id")
    private UserDefinedField userDefinedField;

    @ManyToOne
    @JoinColumn(name = "processus_id")
    private Processus processus;

    public UserDefinedFieldValue(Long id, UserDefinedField userDefinedField, Processus processus) {
        this.id = id;
        this.userDefinedField = userDefinedField;
        this.processus = processus;
    }

    public UserDefinedFieldValue() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDefinedField getUserDefinedField() {
        return userDefinedField;
    }

    public void setUserDefinedField(UserDefinedField userDefinedField) {
        this.userDefinedField = userDefinedField;
    }

    public Processus getProcessus() {
        return processus;
    }

    public void setProcessus(Processus processus) {
        this.processus = processus;
    }
}
