package models;

import jakarta.persistence.*;

@Entity
public class Processus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean applicable;
    private Boolean digital;
    private Float digitalizationPercentage;
    private Integer importance;
    private Float maxScore;
    private String name;
    private String observation;

    @ManyToOne
    @JoinColumn(name = "domaine_id")
    private Domaine domaine;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Processus parent;

    public Processus(Boolean applicable, Boolean digital, Float digitalizationPercentage, Integer importance, Float maxScore, String name, String observation, Domaine domaine, Processus parent, Long id) {
        this.applicable = applicable;
        this.digital = digital;
        this.digitalizationPercentage = digitalizationPercentage;
        this.importance = importance;
        this.maxScore = maxScore;
        this.name = name;
        this.observation = observation;
        this.domaine = domaine;
        this.parent = parent;
        this.id = id;
    }

    public Processus() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public void setApplicable(Boolean applicable) {
        this.applicable = applicable;
    }

    public Boolean getDigital() {
        return digital;
    }

    public void setDigital(Boolean digital) {
        this.digital = digital;
    }

    public Float getDigitalizationPercentage() {
        return digitalizationPercentage;
    }

    public void setDigitalizationPercentage(Float digitalizationPercentage) {
        this.digitalizationPercentage = digitalizationPercentage;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public Float getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Float maxScore) {
        this.maxScore = maxScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public Processus getParent() {
        return parent;
    }

    public void setParent(Processus parent) {
        this.parent = parent;
    }
}
