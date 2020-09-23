package br.com.unifacisa;

public class Students {
    private int id;
    private String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /* Methods GET */
    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    /* Methods SET */
    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }
}
