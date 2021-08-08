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
public class MainIT {
    
    public MainIT() 
    {
    }
    
    @Before
    public void setUp() throws IOException, InterruptedException 
    {          
             
    }
    
    @After
    public void tearDown() throws IOException 
    {     
                       
    }

    @Test
    public void testLoadJSONDataLength() throws Exception //Loads, formats and tests the data by checking it has the correct amount of laureates
    {       
              
        System.out.println("TestLoadJSONDataLength---------------");
                  
        String filePath = "src\\Comp2005\\laureate-sampledata.json";
        String formatedFilePath = "src\\Comp2005\\formated-laureate-data.json";
        int expResult = 26;
        
        Path path = Paths.get(formatedFilePath); // Delete the old formated laureate data
        if( Files.deleteIfExists(path))
        {
             System.out.println("Deleted old formated data.");
        }
        
        Main.formatJsonToString(filePath,formatedFilePath);
       
        Laureates result = Main.loadJSONData(formatedFilePath);
        
        System.out.println("Testing Length");
        
        assertEquals(expResult, result.getLaureates().size());    
        
        System.out.println("Test Passed");
        
        System.out.println("Length = " + result.getLaureates().size() + "  Expected length = " + expResult);
        
    }  
    
}
