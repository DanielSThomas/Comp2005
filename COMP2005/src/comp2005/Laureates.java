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

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Laureates 
{
    
     private ArrayList<Laureate> laureates;
    
    public Laureates (ArrayList<Laureate> laureates) 
    {
        this.laureates = laureates;
    }
    
    
     public ArrayList<Laureate> getLaureates() 
    {
        return laureates;
    }

    public void setLaureates(ArrayList<Laureate> laureates) 
    {
        this.laureates = laureates;
    }
    
    
}
