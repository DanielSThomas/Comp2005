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

/**
 *
 * @author Daniel
 */
public class Affiliation 
{


    private String name;
    private String city;
    private String country;
    
    
     public Affiliation(String new_name, String new_city, String new_country) 
     {
        name = new_name;
        city = new_city;
        country = new_country;
    }
     
       public String getAllInfo()
    {
        String _string = new String("Name: " + name + "  City: " + city + "  Country: " + country);
        return _string;
    }   
      
        
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCountry() 
    {
        return country;
    }

    public void setCountry(String country) 
    {
        this.country = country;
    }
    
}
