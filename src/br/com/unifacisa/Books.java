package br.com.unifacisa;

public class Books {

    private int id;
    private String name;
    private String observation;

    public Books(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /* Methods GET */
    public String getName() {
        return name;
    }

    public String getObservation() {
        return this.observation;
    }

    public int getId() {
        return id;
    }

    /* Methods SET */
    void setName(String name) {
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }

    void setObservation(String observation) {
        this.observation = observation;
    }

}
