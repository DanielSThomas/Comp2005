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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class MainIT 
{
    
    String filePath = "src\\Comp2005\\laureate-sampledata.json";
    String formatedFilePath = "src\\Comp2005\\formated-laureate-data.json";
    Path path = Paths.get(formatedFilePath);
    Laureates laureates;
    
    public MainIT() 
    {
    }
    
    @Before
    public void setUp() throws IOException 
    {          
       
        Main.formatJsonToString(filePath,formatedFilePath);
       
        laureates = Main.loadJSONData(formatedFilePath);
 
    }
    
    @After
    public void tearDown() 
    {     
                       
    }

    @Test
    public void testLoadJSONDataLength() throws Exception 
    {  
               
        System.out.println("*TestLoadJSONDataLength*");
               
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        int expResult = 26;
           
        System.out.println("Testing Length");
        
        assertEquals(expResult, laureates.getLaureates().size());    
                
        System.out.println("Length = " + laureates.getLaureates().size() + "  Expected length = " + expResult);
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Test Passed");
        
        System.out.println("");
        
    }  
    
     @Test
    public void testReturnLaureatesOnCountryFieldAndYear() throws FileNotFoundException 
    {
        
        System.out.println("*TestReturnLaureatesOnCountryFieldAndYear*");
        
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        
        Laureates outputLaureates;
        
        String country = "";
        
        String field = "";
        
        int year = 0;
        
        
        
        
        int[] Stage01ExpectedResultIDs = new int[]{974,975}; 
        
        country = "switzerland";
        
        field = "physics";
                
        year = 2019;
        
        System.out.println("Stage 1 of Test:   Country  = " + country  + "  Field = " + field + "  Year = " + year);
        
        outputLaureates = Main.returnLaureatesOnCountryFieldAndYear(laureates, country, field, year);       
        
        for (int i = 0; i < Stage01ExpectedResultIDs.length; i++) 
        {
            assertEquals(Stage01ExpectedResultIDs[i],outputLaureates.getLaureates().get(i).getId());
            
            System.out.println("Passed Stage 1 " + (i+1) + "/" + Stage01ExpectedResultIDs.length + " Expected ID = " + Stage01ExpectedResultIDs[i] + " Output ID = " + outputLaureates.getLaureates().get(i).getId());
                            
        }
        
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Test Passed");
        
        System.out.println("");
        
        
    }   
        
        
    @Test
    public void testReturnLaureatesOnShareFieldAndYear() 
    {
        System.out.println("*TestReturnLaureatesOnShareFieldAndYear*");
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Laureates outputLaureates;           
        
        String field = "";
        
        int year = 0;
          
        int[] Stage01ExpectedResultIDs = new int[]{976,977,978};            
        
        field = "chemistry";
                
        year = 2019;
        
        System.out.println("Stage 1 of Test:   Field = " + field  + "   Year = " + year );
        
        outputLaureates = Main.returnLaureatesOnShareFieldAndYear(laureates, field, year);       
        
        for (int i = 0; i < Stage01ExpectedResultIDs.length; i++) 
        {
            assertEquals(Stage01ExpectedResultIDs[i],outputLaureates.getLaureates().get(i).getId());
            
            System.out.println("Passed Stage 1 " + (i+1) + "/" + Stage01ExpectedResultIDs.length + " Expected ID = " + Stage01ExpectedResultIDs[i] + " Output ID = " + outputLaureates.getLaureates().get(i).getId());
                            
        }          
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Test Passed");
        
        System.out.println("");
        
    }
    
    
    @Test
    public void testReturnLaureatesOnUniversityAndGender() 
    {
        
        System.out.println("*TestReturnLaureatesOnUniversityAndGender*");
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Laureates outputLaureates;           
        
        String university = "";
        
        String gender = "";
           
        
        int[] Stage01ExpectedResultIDs = new int[]{990,992};            
        
        university = "University of California";
                
        gender = "female";
        
        System.out.println("Stage 1 of Test:   University = " + university + "   Gender = " + gender );
        
        outputLaureates = Main.returnLaureatesOnUniversityAndGender(laureates, university, gender);       
        
        for (int i = 0; i < Stage01ExpectedResultIDs.length; i++) 
        {
            assertEquals(Stage01ExpectedResultIDs[i],outputLaureates.getLaureates().get(i).getId());
            
            System.out.println("Passed Stage 1 " + (i+1) + "/" + Stage01ExpectedResultIDs.length + " Expected ID = " + Stage01ExpectedResultIDs[i] + " Output ID = " + outputLaureates.getLaureates().get(i).getId());
                            
        }          
        
         System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Test Passed");
        
        System.out.println("");
        
    }
    
     @Test
    public void testReturnLaureatesOnCountryAndAlive() 
    {
        
        System.out.println("*TestReturnLaureatesOnCountryAndAlive*");
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Laureates outputLaureates;           
        
        String country = "";
             
        int[] Stage01ExpectedResultIDs = new int[]{971,977,986,988};            
        
        country = "united kingdom";
                
        
         System.out.println("Stage 1 of Test:   Country = " + country);
        
        outputLaureates = Main.returnLaureatesOnCountryAndAlive(laureates, country);       
        
        for (int i = 0; i < Stage01ExpectedResultIDs.length; i++) 
        {
            assertEquals(Stage01ExpectedResultIDs[i],outputLaureates.getLaureates().get(i).getId());
            
            System.out.println("Passed Stage 1 " + (i+1) + "/" + Stage01ExpectedResultIDs.length + " Expected ID = " + Stage01ExpectedResultIDs[i] + " Output ID = " + outputLaureates.getLaureates().get(i).getId());
                            
        }         
        
         System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Test Passed");
        
        System.out.println("");
        
    }
        
        
    
    
}
