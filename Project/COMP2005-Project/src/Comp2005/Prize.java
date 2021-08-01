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
package Comp2005;
import java.util.ArrayList;
/**
 *
 * @author Daniel
 */

public class Prize 
{

    private int year;
    private String category;
    private int share;
    private String motivation;
    private ArrayList<Affiliation> affiliations;
    
      public Prize(int new_year, String new_category, int new_share, String new_motivation, ArrayList<Affiliation> new_affiliations) 
    {
        year = new_year;
        category = new_category;
        share = new_share;
        motivation = new_motivation;
        affiliations = new_affiliations;
    }
      
      
        public int getYear() 
    {
        return year;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public String getCategory() 
    {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

    public int getShare() 
    {
        return share;
    }

    public void setShare(int share) 
    {
        this.share = share;
    }

    public String getMotivation() 
    {
        return motivation;
    }

    public void setMotivation(String motivation) 
    {
        this.motivation = motivation;
    }
    
        public ArrayList<Affiliation> getAffiliations()
    {
        return affiliations;
    }
    
     public void setReviews(ArrayList<Affiliation>  affiliations) 
    {
        this.affiliations = affiliations;
    }
            
}
