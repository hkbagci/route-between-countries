package tr.com.hkerembagci.routebetweencountries.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {
    @JsonProperty("common")
    public String getCommon() {
        return this.common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    String common;

    @JsonProperty("official")
    public String getOfficial() {
        return this.official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    String official;

    @JsonProperty("native")
    public Native getNative() {
        return this.cNative;
    }

    public void setNative(Native cNative) {
        this.cNative = cNative;
    }

    Native cNative;
}
