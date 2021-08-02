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

import java.io.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Daniel
 */
public class Main 
{
    
    static String filePath = "src\\Comp2005\\laureate-data.json";
    
    public static void main(String[] args) throws FileNotFoundException
    {
            
        Laureates laureates;
                         
        FormatJsonToString(filePath);
                 
        laureates = loadJSONData(filePath); 
              
        System.out.print(laureates.getLaureates().get(0).getAllInfo()); 
                         
    }
    
    
    
    
    private static void FormatJsonToString(String filePath) //Recreate the json file to fix error with gson reading null affiliations as arrays instead of null object.
    {
        String jsonString = "";
 
        try        
        {
            //Todo Check if file already exists
            jsonString = new String ( Files.readAllBytes( Paths.get(filePath) ) );
            
            jsonString = jsonString.replaceAll("\\[\\[\\]\\]", "\\[\\]"); //Gson doesn't like [[]] format for some reason. It's still valid Json so not sure what is wrong ?
                                 
            FileWriter writer = new FileWriter("src\\Comp2005\\formated-laureate-data.json");
            
            writer.write(jsonString);
            
            writer.close();
                     
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
 
        
    }
    
       
    
    public static Laureates loadJSONData(String filePath) throws FileNotFoundException
    {
        
  
        
        GsonBuilder builder = new GsonBuilder(); 
                          
        Gson gson = builder.create(); 
              
        
            Laureates laureates = gson.fromJson(new FileReader("src\\Comp2005\\formated-laureate-data.json"), Laureates.class);
            
             
            
            System.out.println(laureates.getLaureates());
        
        return laureates;
    
        
    }
      
}
