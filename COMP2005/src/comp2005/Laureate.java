/*
 * Copyright 2021 Daniel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package comp2005;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */

public class Laureate 
{

    

    
    
    private int id;
    private String firstname;
    private String surname;
    private Date born;
    private Date died;
    private String bornCountry;
    private String bornCountryCode;
    private String bornCity;
    private String diedCountry;
    private String diedCountryCode;
    private String diedCity;
    private String gender;
    private ArrayList<Prize> prizes;
       
    public Laureate(int new_id, String new_firstname, String new_surname, Date new_born, Date new_died, String new_bornCountry, String new_bornCountryCode,
           String new_bornCity, String new_diedCountry, String new_diedCountryCode, String new_diedCity, String new_gender, ArrayList<Prize> new_prizes)
    {
       id = new_id;
       firstname = new_firstname;
       surname = new_surname;
       born = new_born;
       died = new_died;
       bornCountry = new_bornCountry;
       bornCountryCode = new_bornCountryCode;
       bornCity = new_bornCity;
       diedCountry = new_diedCountry;
       diedCountryCode = new_diedCountryCode;
       diedCity = new_diedCity;
       gender = new_gender;  
       prizes = new_prizes;
       
    }
    
    public String getAllInfo()
    {
        String _string = new String("ID: " + id + " First name: " + firstname + "  Surname: " + surname + " Born: " + born +  " died: " 
        + died + " Country Born: " + bornCountry + " Country Born Code: " + bornCountryCode + " City Born: " + bornCity + " Country of Death: " + diedCountry + 
        " Country of Death Code: " + diedCountryCode + " City of Death: " + diedCity + " gender: " + gender);
         return _string;
     }
    
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getFirstname() 
    {
        return firstname;
    }

    public void setFirstname(String firstname) 
    {
        this.firstname = firstname;
    }

    public String getSurname() 
    {
        return surname;
    }

    public void setSurname(String surname) 
    {
        this.surname = surname;
    }

    public Date getBorn() 
    {
        return born;
    }

    public void setBorn(Date born) 
    {
        this.born = born;
    }

    public Date getDied() 
    {
        return died;
    }

    public void setDied(Date died) 
    {
        this.died = died;
    }

    public String getBornCountry() 
    {
        return bornCountry;
    }

    public void setBornCountry(String bornCountry) 
    {
        this.bornCountry = bornCountry;
    }

    public String getBornCountryCode() 
    {
        return bornCountryCode;
    }

    public void setBornCountryCode(String bornCountryCode) 
    {
        this.bornCountryCode = bornCountryCode;
    }

    public String getBornCity() 
    {
        return bornCity;
    }

    public void setBornCity(String bornCity) 
    {
        this.bornCity = bornCity;
    }

    public String getDiedCountry() 
    {
        return diedCountry;
    }

    public void setDiedCountry(String diedCountry) 
    {
        this.diedCountry = diedCountry;
    }

    public String getDiedCountryCode() 
    {
        return diedCountryCode;
    }

    public void setDiedCountryCode(String diedCountryCode) 
    {
        this.diedCountryCode = diedCountryCode;
    }

    public String getDiedCity() 
    {
        return diedCity;
    }

    public void setDiedCity(String diedCity) 
    {
        this.diedCity = diedCity;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }
    
    public ArrayList<Prize> getPrizes()
    {
        return prizes;
    }
    
     public void setReviews(ArrayList<Prize>  prizes) 
    {
        this.prizes = prizes;
    }
    
    
}
