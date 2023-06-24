package com.driver.services.Transformer;

import com.driver.model.Country;
import com.driver.model.CountryName;

public class CountryTransformer {
    public static Country convertnameToEntity(String countryName) throws Exception {
        Country country = new Country();
        if(countryName.equalsIgnoreCase(CountryName.AUS.toString())){
            country.setCountryName(CountryName.AUS);
            country.setCode(CountryName.AUS.toCode());
        }
        else if(countryName.equalsIgnoreCase(CountryName.IND.toString())){
            country.setCountryName(CountryName.IND);
            country.setCode(CountryName.IND.toCode());
        }
        else if(countryName.equalsIgnoreCase(CountryName.CHI.toString())){
            country.setCountryName(CountryName.CHI);
            country.setCode(CountryName.CHI.toCode());
        }
        else if(countryName.equalsIgnoreCase(CountryName.JPN.toString())){
            country.setCountryName(CountryName.JPN);
            country.setCode(CountryName.JPN.toCode());
        }
        else if(countryName.equalsIgnoreCase(CountryName.USA.toString())){
            country.setCountryName(CountryName.USA);
            country.setCode(CountryName.USA.toCode());
        }
        else{
            throw new Exception("Country not found");
        }
        return country;
    }

    public static CountryName getCountryByCode(String code) {
        if(code=="001"){
            return CountryName.IND;
        }
        if(code=="002"){
            return CountryName.USA;
        }
        if(code=="003"){
            return CountryName.AUS;
        }
        if(code=="004"){
            return CountryName.CHI;
        }
        else{
            return CountryName.JPN;
        }
    }
}
