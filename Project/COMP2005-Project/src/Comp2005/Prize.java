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
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Daniel
 */

public class Prize 
{

    private Date year;
    private String catagory;
    private int share;
    private String motivation;
   // Todo private ArrayList<affiliation> affiliations;
    
      public Prize(Date new_year, String new_catagory, int new_share, String new_motivation) 
    {
        year = new_year;
        catagory = new_catagory;
        share = new_share;
        motivation = new_motivation;
    }
      
      
        public Date getYear() 
    {
        return year;
    }

    public void setYear(Date year) 
    {
        this.year = year;
    }

    public String getCatagory() 
    {
        return catagory;
    }

    public void setCatagory(String catagory) 
    {
        this.catagory = catagory;
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
            
}
