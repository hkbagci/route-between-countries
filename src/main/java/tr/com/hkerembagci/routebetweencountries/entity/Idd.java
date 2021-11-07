package tr.com.hkerembagci.routebetweencountries.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

class Idd {
    @JsonProperty("root")
    public String getRoot() {
        return this.root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    String root;

    @JsonProperty("suffixes")
    public List<String> getSuffixes() {
        return this.suffixes;
    }

    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
    }

    List<String> suffixes;
}