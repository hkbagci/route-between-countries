package tr.com.hkerembagci.routebetweencountries.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

class Demonyms {
    @JsonProperty("eng")
    public Eng getEng() {
        return this.eng;
    }

    public void setEng(Eng eng) {
        this.eng = eng;
    }

    Eng eng;

    @JsonProperty("fra")
    public Fra getFra() {
        return this.fra;
    }

    public void setFra(Fra fra) {
        this.fra = fra;
    }

    Fra fra;
}
