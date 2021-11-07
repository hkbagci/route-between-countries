package tr.com.hkerembagci.routebetweencountries.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */

public class Root{
    @JsonProperty("name")
    public Name getName() {
        return this.name; }
    public void setName(Name name) {
        this.name = name; }
    Name name;
    @JsonProperty("tld")
    public List<String> getTld() {
        return this.tld; }
    public void setTld(List<String> tld) {
        this.tld = tld; }
    List<String> tld;
    @JsonProperty("cca2")
    public String getCca2() {
        return this.cca2; }
    public void setCca2(String cca2) {
        this.cca2 = cca2; }
    String cca2;
    @JsonProperty("ccn3")
    public String getCcn3() {
        return this.ccn3; }
    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3; }
    String ccn3;
    @JsonProperty("cca3")
    public String getCca3() {
        return this.cca3; }
    public void setCca3(String cca3) {
        this.cca3 = cca3; }
    String cca3;
    @JsonProperty("cioc")
    public String getCioc() {
        return this.cioc; }
    public void setCioc(String cioc) {
        this.cioc = cioc; }
    String cioc;
    @JsonProperty("independent")
    public boolean getIndependent() {
        return this.independent; }
    public void setIndependent(boolean independent) {
        this.independent = independent; }
    boolean independent;
    @JsonProperty("status")
    public String getStatus() {
        return this.status; }
    public void setStatus(String status) {
        this.status = status; }
    String status;
    @JsonProperty("unMember")
    public boolean getUnMember() {
        return this.unMember; }
    public void setUnMember(boolean unMember) {
        this.unMember = unMember; }
    boolean unMember;
    @JsonProperty("currencies")
    public Currencies getCurrencies() {
        return this.currencies; }
    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies; }
    Currencies currencies;
    @JsonProperty("idd")
    public Idd getIdd() {
        return this.idd; }
    public void setIdd(Idd idd) {
        this.idd = idd; }
    Idd idd;
    @JsonProperty("capital")
    public List<String> getCapital() {
        return this.capital; }
    public void setCapital(List<String> capital) {
        this.capital = capital; }
    List<String> capital;
    @JsonProperty("altSpellings")
    public List<String> getAltSpellings() {
        return this.altSpellings; }
    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings; }
    List<String> altSpellings;
    @JsonProperty("region")
    public String getRegion() {
        return this.region; }
    public void setRegion(String region) {
        this.region = region; }
    String region;
    @JsonProperty("subregion")
    public String getSubregion() {
        return this.subregion; }
    public void setSubregion(String subregion) {
        this.subregion = subregion; }
    String subregion;
    @JsonProperty("languages")
    public Languages getLanguages() {
        return this.languages; }
    public void setLanguages(Languages languages) {
        this.languages = languages; }
    Languages languages;
    @JsonProperty("translations")
    public Translations getTranslations() {
        return this.translations; }
    public void setTranslations(Translations translations) {
        this.translations = translations; }
    Translations translations;
    @JsonProperty("latlng")
    public List<Double> getLatlng() {
        return this.latlng; }
    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng; }
    List<Double> latlng;
    @JsonProperty("landlocked")
    public boolean getLandlocked() {
        return this.landlocked; }
    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked; }
    boolean landlocked;
    @JsonProperty("borders")
    public List<String> getBorders() {
        return this.borders; }
    public void setBorders(List<String> borders) {
        this.borders = borders; }
    List<String> borders;
    @JsonProperty("area")
    public double getArea() {
        return this.area; }
    public void setArea(double area) {
        this.area = area; }
    double area;
    @JsonProperty("flag")
    public String getFlag() {
        return this.flag; }
    public void setFlag(String flag) {
        this.flag = flag; }
    String flag;
    @JsonProperty("demonyms")
    public Demonyms getDemonyms() {
        return this.demonyms; }
    public void setDemonyms(Demonyms demonyms) {
        this.demonyms = demonyms; }
    Demonyms demonyms;
}

class Nld{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Pap{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Prs{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Pus{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tuk{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Por{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Eng{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
    @JsonProperty("f")
    public String getF() {
        return this.f; }
    public void setF(String f) {
        this.f = f; }
    String f;
    @JsonProperty("m")
    public String getM() {
        return this.m; }
    public void setM(String m) {
        this.m = m; }
    String m;
}

class Swe{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Sqi{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Cat{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ara{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Grn{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Spa{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Hye{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Smo{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Fra{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
    @JsonProperty("f")
    public String getF() {
        return this.f; }
    public void setF(String f) {
        this.f = f; }
    String f;
    @JsonProperty("m")
    public String getM() {
        return this.m; }
    public void setM(String m) {
        this.m = m; }
    String m;
}

class Bar{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Aze{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Rus{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Run{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Deu{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ben{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Bul{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Bos{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Hrv{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Srp{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Bel{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Bjz{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Aym{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Que{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Msa{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Dzo{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nor{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tsn{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Sag{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Gsw{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ita{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Roh{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Zho{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Kon{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Lin{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Lua{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Swa{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Rar{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Zdj{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ell{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tur{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ces{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Slk{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Dan{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tir{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ber{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Mey{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Est{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Amh{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Fin{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Fij{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Hif{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Fao{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Kat{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nfr{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Pov{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Kal{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Cha{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Hat{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Hun{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ind{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Glv{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Hin{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tam{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Gle{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Fas{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Arc{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ckb{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Isl{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Heb{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Jam{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nrf{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Jpn{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Kaz{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Kir{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Khm{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Gil{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Kor{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Lao{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Sin{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Sot{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Lit{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ltz{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Lav{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ron{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Mlg{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Div{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Mah{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Mkd{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Mlt{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Mya{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Cnr{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Mon{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Cal{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Mfe{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nya{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Afr{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Her{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Hgm{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Kwn{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Loz{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ndo{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Pih{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Niu{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nno{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nob{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Smi{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nep{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nau{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Mri{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nzs{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Urd{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Fil{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Pau{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Hmo{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tpi{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Pol{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Kin{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Som{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Slv{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ssw{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Crs{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tha{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tgk{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tkl{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tet{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ton{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tvl{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ukr{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Uzb{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Lat{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Vie{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Bis{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nbl{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nso{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Tso{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ven{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Xho{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Zul{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Bwg{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Kck{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Khi{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Ndc{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Nde{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Sna{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Toi{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Zib{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Native{
    @JsonProperty("nld")
    public Nld getNld() {
        return this.nld; }
    public void setNld(Nld nld) {
        this.nld = nld; }
    Nld nld;
    @JsonProperty("pap")
    public Pap getPap() {
        return this.pap; }
    public void setPap(Pap pap) {
        this.pap = pap; }
    Pap pap;
    @JsonProperty("prs")
    public Prs getPrs() {
        return this.prs; }
    public void setPrs(Prs prs) {
        this.prs = prs; }
    Prs prs;
    @JsonProperty("pus")
    public Pus getPus() {
        return this.pus; }
    public void setPus(Pus pus) {
        this.pus = pus; }
    Pus pus;
    @JsonProperty("tuk")
    public Tuk getTuk() {
        return this.tuk; }
    public void setTuk(Tuk tuk) {
        this.tuk = tuk; }
    Tuk tuk;
    @JsonProperty("por")
    public Por getPor() {
        return this.por; }
    public void setPor(Por por) {
        this.por = por; }
    Por por;
    @JsonProperty("eng")
    public Eng getEng() {
        return this.eng; }
    public void setEng(Eng eng) {
        this.eng = eng; }
    Eng eng;
    @JsonProperty("swe")
    public Swe getSwe() {
        return this.swe; }
    public void setSwe(Swe swe) {
        this.swe = swe; }
    Swe swe;
    @JsonProperty("sqi")
    public Sqi getSqi() {
        return this.sqi; }
    public void setSqi(Sqi sqi) {
        this.sqi = sqi; }
    Sqi sqi;
    @JsonProperty("cat")
    public Cat getCat() {
        return this.cat; }
    public void setCat(Cat cat) {
        this.cat = cat; }
    Cat cat;
    @JsonProperty("ara")
    public Ara getAra() {
        return this.ara; }
    public void setAra(Ara ara) {
        this.ara = ara; }
    Ara ara;
    @JsonProperty("grn")
    public Grn getGrn() {
        return this.grn; }
    public void setGrn(Grn grn) {
        this.grn = grn; }
    Grn grn;
    @JsonProperty("spa")
    public Spa getSpa() {
        return this.spa; }
    public void setSpa(Spa spa) {
        this.spa = spa; }
    Spa spa;
    @JsonProperty("hye")
    public Hye getHye() {
        return this.hye; }
    public void setHye(Hye hye) {
        this.hye = hye; }
    Hye hye;
    @JsonProperty("smo")
    public Smo getSmo() {
        return this.smo; }
    public void setSmo(Smo smo) {
        this.smo = smo; }
    Smo smo;
    @JsonProperty("fra")
    public Fra getFra() {
        return this.fra; }
    public void setFra(Fra fra) {
        this.fra = fra; }
    Fra fra;
    @JsonProperty("bar")
    public Bar getBar() {
        return this.bar; }
    public void setBar(Bar bar) {
        this.bar = bar; }
    Bar bar;
    @JsonProperty("aze")
    public Aze getAze() {
        return this.aze; }
    public void setAze(Aze aze) {
        this.aze = aze; }
    Aze aze;
    @JsonProperty("rus")
    public Rus getRus() {
        return this.rus; }
    public void setRus(Rus rus) {
        this.rus = rus; }
    Rus rus;
    @JsonProperty("run")
    public Run getRun() {
        return this.run; }
    public void setRun(Run run) {
        this.run = run; }
    Run run;
    @JsonProperty("deu")
    public Deu getDeu() {
        return this.deu; }
    public void setDeu(Deu deu) {
        this.deu = deu; }
    Deu deu;
    @JsonProperty("ben")
    public Ben getBen() {
        return this.ben; }
    public void setBen(Ben ben) {
        this.ben = ben; }
    Ben ben;
    @JsonProperty("bul")
    public Bul getBul() {
        return this.bul; }
    public void setBul(Bul bul) {
        this.bul = bul; }
    Bul bul;
    @JsonProperty("bos")
    public Bos getBos() {
        return this.bos; }
    public void setBos(Bos bos) {
        this.bos = bos; }
    Bos bos;
    @JsonProperty("hrv")
    public Hrv getHrv() {
        return this.hrv; }
    public void setHrv(Hrv hrv) {
        this.hrv = hrv; }
    Hrv hrv;
    @JsonProperty("srp")
    public Srp getSrp() {
        return this.srp; }
    public void setSrp(Srp srp) {
        this.srp = srp; }
    Srp srp;
    @JsonProperty("bel")
    public Bel getBel() {
        return this.bel; }
    public void setBel(Bel bel) {
        this.bel = bel; }
    Bel bel;
    @JsonProperty("bjz")
    public Bjz getBjz() {
        return this.bjz; }
    public void setBjz(Bjz bjz) {
        this.bjz = bjz; }
    Bjz bjz;
    @JsonProperty("aym")
    public Aym getAym() {
        return this.aym; }
    public void setAym(Aym aym) {
        this.aym = aym; }
    Aym aym;
    @JsonProperty("que")
    public Que getQue() {
        return this.que; }
    public void setQue(Que que) {
        this.que = que; }
    Que que;
    @JsonProperty("msa")
    public Msa getMsa() {
        return this.msa; }
    public void setMsa(Msa msa) {
        this.msa = msa; }
    Msa msa;
    @JsonProperty("dzo")
    public Dzo getDzo() {
        return this.dzo; }
    public void setDzo(Dzo dzo) {
        this.dzo = dzo; }
    Dzo dzo;
    @JsonProperty("nor")
    public Nor getNor() {
        return this.nor; }
    public void setNor(Nor nor) {
        this.nor = nor; }
    Nor nor;
    @JsonProperty("tsn")
    public Tsn getTsn() {
        return this.tsn; }
    public void setTsn(Tsn tsn) {
        this.tsn = tsn; }
    Tsn tsn;
    @JsonProperty("sag")
    public Sag getSag() {
        return this.sag; }
    public void setSag(Sag sag) {
        this.sag = sag; }
    Sag sag;
    @JsonProperty("gsw")
    public Gsw getGsw() {
        return this.gsw; }
    public void setGsw(Gsw gsw) {
        this.gsw = gsw; }
    Gsw gsw;
    @JsonProperty("ita")
    public Ita getIta() {
        return this.ita; }
    public void setIta(Ita ita) {
        this.ita = ita; }
    Ita ita;
    @JsonProperty("roh")
    public Roh getRoh() {
        return this.roh; }
    public void setRoh(Roh roh) {
        this.roh = roh; }
    Roh roh;
    @JsonProperty("zho")
    public Zho getZho() {
        return this.zho; }
    public void setZho(Zho zho) {
        this.zho = zho; }
    Zho zho;
    @JsonProperty("kon")
    public Kon getKon() {
        return this.kon; }
    public void setKon(Kon kon) {
        this.kon = kon; }
    Kon kon;
    @JsonProperty("lin")
    public Lin getLin() {
        return this.lin; }
    public void setLin(Lin lin) {
        this.lin = lin; }
    Lin lin;
    @JsonProperty("lua")
    public Lua getLua() {
        return this.lua; }
    public void setLua(Lua lua) {
        this.lua = lua; }
    Lua lua;
    @JsonProperty("swa")
    public Swa getSwa() {
        return this.swa; }
    public void setSwa(Swa swa) {
        this.swa = swa; }
    Swa swa;
    @JsonProperty("rar")
    public Rar getRar() {
        return this.rar; }
    public void setRar(Rar rar) {
        this.rar = rar; }
    Rar rar;
    @JsonProperty("zdj")
    public Zdj getZdj() {
        return this.zdj; }
    public void setZdj(Zdj zdj) {
        this.zdj = zdj; }
    Zdj zdj;
    @JsonProperty("ell")
    public Ell getEll() {
        return this.ell; }
    public void setEll(Ell ell) {
        this.ell = ell; }
    Ell ell;
    @JsonProperty("tur")
    public Tur getTur() {
        return this.tur; }
    public void setTur(Tur tur) {
        this.tur = tur; }
    Tur tur;
    @JsonProperty("ces")
    public Ces getCes() {
        return this.ces; }
    public void setCes(Ces ces) {
        this.ces = ces; }
    Ces ces;
    @JsonProperty("slk")
    public Slk getSlk() {
        return this.slk; }
    public void setSlk(Slk slk) {
        this.slk = slk; }
    Slk slk;
    @JsonProperty("dan")
    public Dan getDan() {
        return this.dan; }
    public void setDan(Dan dan) {
        this.dan = dan; }
    Dan dan;
    @JsonProperty("tir")
    public Tir getTir() {
        return this.tir; }
    public void setTir(Tir tir) {
        this.tir = tir; }
    Tir tir;
    @JsonProperty("ber")
    public Ber getBer() {
        return this.ber; }
    public void setBer(Ber ber) {
        this.ber = ber; }
    Ber ber;
    @JsonProperty("mey")
    public Mey getMey() {
        return this.mey; }
    public void setMey(Mey mey) {
        this.mey = mey; }
    Mey mey;
    @JsonProperty("est")
    public Est getEst() {
        return this.est; }
    public void setEst(Est est) {
        this.est = est; }
    Est est;
    @JsonProperty("amh")
    public Amh getAmh() {
        return this.amh; }
    public void setAmh(Amh amh) {
        this.amh = amh; }
    Amh amh;
    @JsonProperty("fin")
    public Fin getFin() {
        return this.fin; }
    public void setFin(Fin fin) {
        this.fin = fin; }
    Fin fin;
    @JsonProperty("fij")
    public Fij getFij() {
        return this.fij; }
    public void setFij(Fij fij) {
        this.fij = fij; }
    Fij fij;
    @JsonProperty("hif")
    public Hif getHif() {
        return this.hif; }
    public void setHif(Hif hif) {
        this.hif = hif; }
    Hif hif;
    @JsonProperty("fao")
    public Fao getFao() {
        return this.fao; }
    public void setFao(Fao fao) {
        this.fao = fao; }
    Fao fao;
    @JsonProperty("kat")
    public Kat getKat() {
        return this.kat; }
    public void setKat(Kat kat) {
        this.kat = kat; }
    Kat kat;
    @JsonProperty("nfr")
    public Nfr getNfr() {
        return this.nfr; }
    public void setNfr(Nfr nfr) {
        this.nfr = nfr; }
    Nfr nfr;
    @JsonProperty("pov")
    public Pov getPov() {
        return this.pov; }
    public void setPov(Pov pov) {
        this.pov = pov; }
    Pov pov;
    @JsonProperty("kal")
    public Kal getKal() {
        return this.kal; }
    public void setKal(Kal kal) {
        this.kal = kal; }
    Kal kal;
    @JsonProperty("cha")
    public Cha getCha() {
        return this.cha; }
    public void setCha(Cha cha) {
        this.cha = cha; }
    Cha cha;
    @JsonProperty("hat")
    public Hat getHat() {
        return this.hat; }
    public void setHat(Hat hat) {
        this.hat = hat; }
    Hat hat;
    @JsonProperty("hun")
    public Hun getHun() {
        return this.hun; }
    public void setHun(Hun hun) {
        this.hun = hun; }
    Hun hun;
    @JsonProperty("ind")
    public Ind getInd() {
        return this.ind; }
    public void setInd(Ind ind) {
        this.ind = ind; }
    Ind ind;
    @JsonProperty("glv")
    public Glv getGlv() {
        return this.glv; }
    public void setGlv(Glv glv) {
        this.glv = glv; }
    Glv glv;
    @JsonProperty("hin")
    public Hin getHin() {
        return this.hin; }
    public void setHin(Hin hin) {
        this.hin = hin; }
    Hin hin;
    @JsonProperty("tam")
    public Tam getTam() {
        return this.tam; }
    public void setTam(Tam tam) {
        this.tam = tam; }
    Tam tam;
    @JsonProperty("gle")
    public Gle getGle() {
        return this.gle; }
    public void setGle(Gle gle) {
        this.gle = gle; }
    Gle gle;
    @JsonProperty("fas")
    public Fas getFas() {
        return this.fas; }
    public void setFas(Fas fas) {
        this.fas = fas; }
    Fas fas;
    @JsonProperty("arc")
    public Arc getArc() {
        return this.arc; }
    public void setArc(Arc arc) {
        this.arc = arc; }
    Arc arc;
    @JsonProperty("ckb")
    public Ckb getCkb() {
        return this.ckb; }
    public void setCkb(Ckb ckb) {
        this.ckb = ckb; }
    Ckb ckb;
    @JsonProperty("isl")
    public Isl getIsl() {
        return this.isl; }
    public void setIsl(Isl isl) {
        this.isl = isl; }
    Isl isl;
    @JsonProperty("heb")
    public Heb getHeb() {
        return this.heb; }
    public void setHeb(Heb heb) {
        this.heb = heb; }
    Heb heb;
    @JsonProperty("jam")
    public Jam getJam() {
        return this.jam; }
    public void setJam(Jam jam) {
        this.jam = jam; }
    Jam jam;
    @JsonProperty("nrf")
    public Nrf getNrf() {
        return this.nrf; }
    public void setNrf(Nrf nrf) {
        this.nrf = nrf; }
    Nrf nrf;
    @JsonProperty("jpn")
    public Jpn getJpn() {
        return this.jpn; }
    public void setJpn(Jpn jpn) {
        this.jpn = jpn; }
    Jpn jpn;
    @JsonProperty("kaz")
    public Kaz getKaz() {
        return this.kaz; }
    public void setKaz(Kaz kaz) {
        this.kaz = kaz; }
    Kaz kaz;
    @JsonProperty("kir")
    public Kir getKir() {
        return this.kir; }
    public void setKir(Kir kir) {
        this.kir = kir; }
    Kir kir;
    @JsonProperty("khm")
    public Khm getKhm() {
        return this.khm; }
    public void setKhm(Khm khm) {
        this.khm = khm; }
    Khm khm;
    @JsonProperty("gil")
    public Gil getGil() {
        return this.gil; }
    public void setGil(Gil gil) {
        this.gil = gil; }
    Gil gil;
    @JsonProperty("kor")
    public Kor getKor() {
        return this.kor; }
    public void setKor(Kor kor) {
        this.kor = kor; }
    Kor kor;
    @JsonProperty("lao")
    public Lao getLao() {
        return this.lao; }
    public void setLao(Lao lao) {
        this.lao = lao; }
    Lao lao;
    @JsonProperty("sin")
    public Sin getSin() {
        return this.sin; }
    public void setSin(Sin sin) {
        this.sin = sin; }
    Sin sin;
    @JsonProperty("sot")
    public Sot getSot() {
        return this.sot; }
    public void setSot(Sot sot) {
        this.sot = sot; }
    Sot sot;
    @JsonProperty("lit")
    public Lit getLit() {
        return this.lit; }
    public void setLit(Lit lit) {
        this.lit = lit; }
    Lit lit;
    @JsonProperty("ltz")
    public Ltz getLtz() {
        return this.ltz; }
    public void setLtz(Ltz ltz) {
        this.ltz = ltz; }
    Ltz ltz;
    @JsonProperty("lav")
    public Lav getLav() {
        return this.lav; }
    public void setLav(Lav lav) {
        this.lav = lav; }
    Lav lav;
    @JsonProperty("ron")
    public Ron getRon() {
        return this.ron; }
    public void setRon(Ron ron) {
        this.ron = ron; }
    Ron ron;
    @JsonProperty("mlg")
    public Mlg getMlg() {
        return this.mlg; }
    public void setMlg(Mlg mlg) {
        this.mlg = mlg; }
    Mlg mlg;
    @JsonProperty("div")
    public Div getDiv() {
        return this.div; }
    public void setDiv(Div div) {
        this.div = div; }
    Div div;
    @JsonProperty("mah")
    public Mah getMah() {
        return this.mah; }
    public void setMah(Mah mah) {
        this.mah = mah; }
    Mah mah;
    @JsonProperty("mkd")
    public Mkd getMkd() {
        return this.mkd; }
    public void setMkd(Mkd mkd) {
        this.mkd = mkd; }
    Mkd mkd;
    @JsonProperty("mlt")
    public Mlt getMlt() {
        return this.mlt; }
    public void setMlt(Mlt mlt) {
        this.mlt = mlt; }
    Mlt mlt;
    @JsonProperty("mya")
    public Mya getMya() {
        return this.mya; }
    public void setMya(Mya mya) {
        this.mya = mya; }
    Mya mya;
    @JsonProperty("cnr")
    public Cnr getCnr() {
        return this.cnr; }
    public void setCnr(Cnr cnr) {
        this.cnr = cnr; }
    Cnr cnr;
    @JsonProperty("mon")
    public Mon getMon() {
        return this.mon; }
    public void setMon(Mon mon) {
        this.mon = mon; }
    Mon mon;
    @JsonProperty("cal")
    public Cal getCal() {
        return this.cal; }
    public void setCal(Cal cal) {
        this.cal = cal; }
    Cal cal;
    @JsonProperty("mfe")
    public Mfe getMfe() {
        return this.mfe; }
    public void setMfe(Mfe mfe) {
        this.mfe = mfe; }
    Mfe mfe;
    @JsonProperty("nya")
    public Nya getNya() {
        return this.nya; }
    public void setNya(Nya nya) {
        this.nya = nya; }
    Nya nya;
    @JsonProperty("afr")
    public Afr getAfr() {
        return this.afr; }
    public void setAfr(Afr afr) {
        this.afr = afr; }
    Afr afr;
    @JsonProperty("her")
    public Her getHer() {
        return this.her; }
    public void setHer(Her her) {
        this.her = her; }
    Her her;
    @JsonProperty("hgm")
    public Hgm getHgm() {
        return this.hgm; }
    public void setHgm(Hgm hgm) {
        this.hgm = hgm; }
    Hgm hgm;
    @JsonProperty("kwn")
    public Kwn getKwn() {
        return this.kwn; }
    public void setKwn(Kwn kwn) {
        this.kwn = kwn; }
    Kwn kwn;
    @JsonProperty("loz")
    public Loz getLoz() {
        return this.loz; }
    public void setLoz(Loz loz) {
        this.loz = loz; }
    Loz loz;
    @JsonProperty("ndo")
    public Ndo getNdo() {
        return this.ndo; }
    public void setNdo(Ndo ndo) {
        this.ndo = ndo; }
    Ndo ndo;
    @JsonProperty("pih")
    public Pih getPih() {
        return this.pih; }
    public void setPih(Pih pih) {
        this.pih = pih; }
    Pih pih;
    @JsonProperty("niu")
    public Niu getNiu() {
        return this.niu; }
    public void setNiu(Niu niu) {
        this.niu = niu; }
    Niu niu;
    @JsonProperty("nno")
    public Nno getNno() {
        return this.nno; }
    public void setNno(Nno nno) {
        this.nno = nno; }
    Nno nno;
    @JsonProperty("nob")
    public Nob getNob() {
        return this.nob; }
    public void setNob(Nob nob) {
        this.nob = nob; }
    Nob nob;
    @JsonProperty("smi")
    public Smi getSmi() {
        return this.smi; }
    public void setSmi(Smi smi) {
        this.smi = smi; }
    Smi smi;
    @JsonProperty("nep")
    public Nep getNep() {
        return this.nep; }
    public void setNep(Nep nep) {
        this.nep = nep; }
    Nep nep;
    @JsonProperty("nau")
    public Nau getNau() {
        return this.nau; }
    public void setNau(Nau nau) {
        this.nau = nau; }
    Nau nau;
    @JsonProperty("mri")
    public Mri getMri() {
        return this.mri; }
    public void setMri(Mri mri) {
        this.mri = mri; }
    Mri mri;
    @JsonProperty("nzs")
    public Nzs getNzs() {
        return this.nzs; }
    public void setNzs(Nzs nzs) {
        this.nzs = nzs; }
    Nzs nzs;
    @JsonProperty("urd")
    public Urd getUrd() {
        return this.urd; }
    public void setUrd(Urd urd) {
        this.urd = urd; }
    Urd urd;
    @JsonProperty("fil")
    public Fil getFil() {
        return this.fil; }
    public void setFil(Fil fil) {
        this.fil = fil; }
    Fil fil;
    @JsonProperty("pau")
    public Pau getPau() {
        return this.pau; }
    public void setPau(Pau pau) {
        this.pau = pau; }
    Pau pau;
    @JsonProperty("hmo")
    public Hmo getHmo() {
        return this.hmo; }
    public void setHmo(Hmo hmo) {
        this.hmo = hmo; }
    Hmo hmo;
    @JsonProperty("tpi")
    public Tpi getTpi() {
        return this.tpi; }
    public void setTpi(Tpi tpi) {
        this.tpi = tpi; }
    Tpi tpi;
    @JsonProperty("pol")
    public Pol getPol() {
        return this.pol; }
    public void setPol(Pol pol) {
        this.pol = pol; }
    Pol pol;
    @JsonProperty("kin")
    public Kin getKin() {
        return this.kin; }
    public void setKin(Kin kin) {
        this.kin = kin; }
    Kin kin;
    @JsonProperty("som")
    public Som getSom() {
        return this.som; }
    public void setSom(Som som) {
        this.som = som; }
    Som som;
    @JsonProperty("slv")
    public Slv getSlv() {
        return this.slv; }
    public void setSlv(Slv slv) {
        this.slv = slv; }
    Slv slv;
    @JsonProperty("ssw")
    public Ssw getSsw() {
        return this.ssw; }
    public void setSsw(Ssw ssw) {
        this.ssw = ssw; }
    Ssw ssw;
    @JsonProperty("crs")
    public Crs getCrs() {
        return this.crs; }
    public void setCrs(Crs crs) {
        this.crs = crs; }
    Crs crs;
    @JsonProperty("tha")
    public Tha getTha() {
        return this.tha; }
    public void setTha(Tha tha) {
        this.tha = tha; }
    Tha tha;
    @JsonProperty("tgk")
    public Tgk getTgk() {
        return this.tgk; }
    public void setTgk(Tgk tgk) {
        this.tgk = tgk; }
    Tgk tgk;
    @JsonProperty("tkl")
    public Tkl getTkl() {
        return this.tkl; }
    public void setTkl(Tkl tkl) {
        this.tkl = tkl; }
    Tkl tkl;
    @JsonProperty("tet")
    public Tet getTet() {
        return this.tet; }
    public void setTet(Tet tet) {
        this.tet = tet; }
    Tet tet;
    @JsonProperty("ton")
    public Ton getTon() {
        return this.ton; }
    public void setTon(Ton ton) {
        this.ton = ton; }
    Ton ton;
    @JsonProperty("tvl")
    public Tvl getTvl() {
        return this.tvl; }
    public void setTvl(Tvl tvl) {
        this.tvl = tvl; }
    Tvl tvl;
    @JsonProperty("ukr")
    public Ukr getUkr() {
        return this.ukr; }
    public void setUkr(Ukr ukr) {
        this.ukr = ukr; }
    Ukr ukr;
    @JsonProperty("uzb")
    public Uzb getUzb() {
        return this.uzb; }
    public void setUzb(Uzb uzb) {
        this.uzb = uzb; }
    Uzb uzb;
    @JsonProperty("lat")
    public Lat getLat() {
        return this.lat; }
    public void setLat(Lat lat) {
        this.lat = lat; }
    Lat lat;
    @JsonProperty("vie")
    public Vie getVie() {
        return this.vie; }
    public void setVie(Vie vie) {
        this.vie = vie; }
    Vie vie;
    @JsonProperty("bis")
    public Bis getBis() {
        return this.bis; }
    public void setBis(Bis bis) {
        this.bis = bis; }
    Bis bis;
    @JsonProperty("nbl")
    public Nbl getNbl() {
        return this.nbl; }
    public void setNbl(Nbl nbl) {
        this.nbl = nbl; }
    Nbl nbl;
    @JsonProperty("nso")
    public Nso getNso() {
        return this.nso; }
    public void setNso(Nso nso) {
        this.nso = nso; }
    Nso nso;
    @JsonProperty("tso")
    public Tso getTso() {
        return this.tso; }
    public void setTso(Tso tso) {
        this.tso = tso; }
    Tso tso;
    @JsonProperty("ven")
    public Ven getVen() {
        return this.ven; }
    public void setVen(Ven ven) {
        this.ven = ven; }
    Ven ven;
    @JsonProperty("xho")
    public Xho getXho() {
        return this.xho; }
    public void setXho(Xho xho) {
        this.xho = xho; }
    Xho xho;
    @JsonProperty("zul")
    public Zul getZul() {
        return this.zul; }
    public void setZul(Zul zul) {
        this.zul = zul; }
    Zul zul;
    @JsonProperty("bwg")
    public Bwg getBwg() {
        return this.bwg; }
    public void setBwg(Bwg bwg) {
        this.bwg = bwg; }
    Bwg bwg;
    @JsonProperty("kck")
    public Kck getKck() {
        return this.kck; }
    public void setKck(Kck kck) {
        this.kck = kck; }
    Kck kck;
    @JsonProperty("khi")
    public Khi getKhi() {
        return this.khi; }
    public void setKhi(Khi khi) {
        this.khi = khi; }
    Khi khi;
    @JsonProperty("ndc")
    public Ndc getNdc() {
        return this.ndc; }
    public void setNdc(Ndc ndc) {
        this.ndc = ndc; }
    Ndc ndc;
    @JsonProperty("nde")
    public Nde getNde() {
        return this.nde; }
    public void setNde(Nde nde) {
        this.nde = nde; }
    Nde nde;
    @JsonProperty("sna")
    public Sna getSna() {
        return this.sna; }
    public void setSna(Sna sna) {
        this.sna = sna; }
    Sna sna;
    @JsonProperty("toi")
    public Toi getToi() {
        return this.toi; }
    public void setToi(Toi toi) {
        this.toi = toi; }
    Toi toi;
    @JsonProperty("zib")
    public Zib getZib() {
        return this.zib; }
    public void setZib(Zib zib) {
        this.zib = zib; }
    Zib zib;
}

class AWG{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class AFN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class AOA{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class XCD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class EUR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ALL{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class AED{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ARS{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class AMD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class USD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class AUD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class AZN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BIF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class XOF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BDT{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BGN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BHD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BSD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BAM{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class GBP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SHP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BYN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BZD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BMD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BOB{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BRL{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BBD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BND{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SGD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BTN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class INR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class BWP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class XAF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CAD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CHF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CLP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CNY{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CDF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CKD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class NZD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class COP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KMF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CVE{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CRC{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CUC{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CUP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ANG{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KYD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class CZK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class DJF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class DKK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class DOP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class DZD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class EGP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ERN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MAD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MRU{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ETB{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class FJD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class FKP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class FOK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class GEL{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class GGP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class GHS{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class GIP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class GNF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class GMD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class GTQ{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class GYD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class HKD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class HNL{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class HRK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class HTG{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class HUF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class IDR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class IMP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class IRR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class IQD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ISK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ILS{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class JMD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class JEP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class JOD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class JPY{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KZT{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KES{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KGS{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KHR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KID{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KRW{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KWD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class LAK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class LBP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class LRD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class LYD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class LKR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class LSL{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ZAR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MOP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MDL{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MGA{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MVR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MXN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MKD2 {
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MMK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MNT{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MZN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MUR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MWK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class MYR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class NAD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class XPF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class NGN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class NIO{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class NOK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class NPR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class OMR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class PKR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class PAB{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class PEN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class PHP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class PGK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class PLN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class KPW{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class PYG{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class QAR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class RON2 {
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class RUB{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class RWF{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SAR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SDG{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SBD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SLL{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SOS{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class RSD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SSP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class STN{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SRD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SEK{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SZL{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SCR{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class SYP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class THB{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class TJS{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class TMT{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class TOP{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class TTD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class TND{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class TRY{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class TVD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class TWD{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class TZS{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class UGX{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class UAH{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class UYU{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class UZS{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class VES{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class VND{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class VUV{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class WST{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class YER{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ZMW{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class ZWB{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
}

class Per{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}

class Cym{
    @JsonProperty("official")
    public String getOfficial() {
        return this.official; }
    public void setOfficial(String official) {
        this.official = official; }
    String official;
    @JsonProperty("common")
    public String getCommon() {
        return this.common; }
    public void setCommon(String common) {
        this.common = common; }
    String common;
}


