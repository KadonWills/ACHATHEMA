/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 * @author Kadon
 */
@ManagedBean(name = "languageBean")
@SessionScoped
public class LanguageBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String localeCode = "en";

    public String english() {
        localeCode = "en";
        return FacesContext.getCurrentInstance().getExternalContext().getRequestPathInfo() + "?faces-redirect=true";
    }
    
    public String chinese() {
        localeCode = "zh";
        return FacesContext.getCurrentInstance().getExternalContext().getRequestPathInfo() + "?faces-redirect=true";
    }

    public String french() {
        localeCode = "fr";
        return FacesContext.getCurrentInstance().getExternalContext().getRequestPathInfo() + "?faces-redirect=true";
    }

    

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    /*
    private static Map<String, Object> countries;

    static {
        countries = new LinkedHashMap<String, Object>();
        countries.put("English", Locale.ENGLISH); //label, value
        countries.put("French", Locale.FRENCH);
        countries.put("Chinese", Locale.SIMPLIFIED_CHINESE);
    }

    public Map<String, Object> getCountriesInMap() {
        return countries;
    }
    //value change event listener
    public void countryLocaleCodeChanged(ActionEvent e) {

        String newLocaleValue = getLocaleCode();

        //loop country map to compare the locale code
        for (Map.Entry<String, Object> entry : countries.entrySet()) {

            if (entry.getValue().toString().equals(newLocaleValue)) {

                FacesContext.getCurrentInstance()
                        .getViewRoot().setLocale((Locale) entry.getValue());

            }
        }
    }*/

}
