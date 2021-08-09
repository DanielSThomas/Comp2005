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
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class MainTest 
{
   
    Laureates mockLaureates;
    
    @Before
    public void setUp() // Creating mock laureates
    {
        
        //Mock laureate 01
        
        ArrayList<Affiliation> mockAffiliation01 = new ArrayList<Affiliation>();
        
        mockAffiliation01.add(new Affiliation("Some University","Somewhere","USA"));
        
        ArrayList<Prize> mockPrize01 = new ArrayList<Prize>();
        
        mockPrize01.add(new Prize(2009,"chemistry",1,"for their discoveries of how to name stuff.",mockAffiliation01));
        
        Laureate mockLaureate01 = new Laureate(01,"Dean","Smith","1967-01-12","0000-00-00","USA","US","Somewhere",null,null,null,"male",mockPrize01);
        
        
        //Mock laureate 02
        
        ArrayList<Affiliation> mockAffiliation02 = new ArrayList<Affiliation>();
        
        mockAffiliation02.add(new Affiliation("Another University","Nowhere","United Kingdom"));
        
        mockAffiliation02.add(new Affiliation("A New University","Someplace","United Kingdom"));
        
        ArrayList<Prize> mockPrize02 = new ArrayList<Prize>();
        
        mockPrize02.add(new Prize(2010,"physics",2,"for their discoveries in physics.",mockAffiliation02));
        
        Laureate mockLaureate02 = new Laureate(02,"Anna","Thomas","1960-08-12","0000-00-00","United Kingdom","GB","Nowhere",null,null,null,"male",mockPrize02);
        
        
        //Mock laureate 03
        
        ArrayList<Affiliation> mockAffiliation03 = new ArrayList<Affiliation>();
        
        mockAffiliation03.add(new Affiliation("Another University","Nowhere","United Kingdom"));
        
        mockAffiliation03.add(new Affiliation("A New University","Someplace","United Kingdom"));
        
        ArrayList<Affiliation> mockAffiliation03a = new ArrayList<Affiliation>();
        
        mockAffiliation03a.add(new Affiliation("A New University","Someplace","United Kingdom"));
        
        ArrayList<Prize> mockPrize03 = new ArrayList<Prize>();
        
        mockPrize03.add(new Prize(2010,"physics",2,"for their discoveries in physics.",mockAffiliation03));
        
        mockPrize03.add(new Prize(2018,"physics",1,"for their further discoveries in physics.",mockAffiliation03a));
        
        Laureate mockLaureate03 = new Laureate(03,"Sean","William","1959-09-21","2020-02-06","United Kingdom","GB","Nowhere","United Kingdom","GB","Nowhere","male",mockPrize03);
        
        
        //Mock laureate 04 
        
        ArrayList<Affiliation> mockAffiliation04 = new ArrayList<Affiliation>();
                
        ArrayList<Prize> mockPrize04 = new ArrayList<Prize>();
        
        mockPrize04.add(new Prize(2020,"chemistry",1,"for their discoveries in chemistry.",mockAffiliation04));
        
        Laureate mockLaureate04 = new Laureate(04,"Hermann","Wolfgang","1989-08-10","0000-00-00","Germany","DE","Irgendwo",null,null,null,"male",mockPrize04);
        
        //Mock laureate 05
        
        ArrayList<Affiliation> mockAffiliation05 = new ArrayList<Affiliation>();
        
        mockAffiliation05.add(new Affiliation("University of chemistry","Nowhereatall","United Kingdom"));        
        
        ArrayList<Prize> mockPrize05 = new ArrayList<Prize>();
        
        mockPrize05.add(new Prize(2005,"chemistry",1,"for their discoveries in chemistry.",mockAffiliation05));
        
        Laureate mockLaureate05 = new Laureate(05,"Emma","Schelling","1930-04-19","2018-12-13","Germany","DE","Nowhereatall","United Kingdom","GB","Aplaceinuk","female",mockPrize05);
        
 
        //Adding the laureates to the parrent laureates object
        
        ArrayList<Laureate> mockLaureatesArray = new ArrayList<Laureate>();
        
        mockLaureatesArray.add(mockLaureate01);
        
        mockLaureatesArray.add(mockLaureate02);
        
        mockLaureatesArray.add(mockLaureate03);
        
        mockLaureatesArray.add(mockLaureate04);
        
        mockLaureatesArray.add(mockLaureate05);
  
        mockLaureates = new Laureates(mockLaureatesArray);
        
    }
    
    @After
    public void tearDown() 
    {
        
    }
 
    @Test
    public void testReadMockObjects()
    {
      System.out.println("*TestReadMockObjects*"); 
      
      Main.printLaureates(mockLaureates);
      
      System.out.println("Test Passed");
      
      System.out.println("");
        
    }
       
    
    @Test
    public void testReadMockObjectsWithNullPrizeObject()
    {
              
      System.out.println("*TestReadMockObjectsWithNullPrizeObjects*"); 
            
      //Creating Mock object with null Prizes array
      
        ArrayList<Prize> mockPrizeNull = new ArrayList<Prize>();
      
        Laureate mockLaureateNull = new Laureate(0,null,null,null,null,null,null,null,null,null,null,null,mockPrizeNull);
        
        ArrayList<Laureate> mockLaureatesArray = new ArrayList<Laureate>();
        
        mockLaureatesArray.add(mockLaureateNull);
 
        mockLaureates = new Laureates(mockLaureatesArray);
      
      Main.printLaureates(mockLaureates);
      
      System.out.println("Test Passed");
      
      System.out.println("");
        
    }
    
    @Test
    public void testReadMockObjectsWithNullAffiliationObjects() 
    {
              
      System.out.println("*TestReadMockObjectsWithNullAffiliationObjects*"); 
            
      //Creating Mock object with null affiliation array
      
        ArrayList<Affiliation> mockAffiliationNull = new ArrayList<Affiliation>();
      
        ArrayList<Prize> mockPrizeNull = new ArrayList<Prize>();
        
        mockPrizeNull.add(new Prize(0,null,0,null,mockAffiliationNull));
      
        Laureate mockLaureateNull = new Laureate(0,null,null,null,null,null,null,null,null,null,null,null,mockPrizeNull);
        
        ArrayList<Laureate> mockLaureatesArray = new ArrayList<Laureate>();
        
        mockLaureatesArray.add(mockLaureateNull);
 
        mockLaureates = new Laureates(mockLaureatesArray);
      
      Main.printLaureates(mockLaureates);
      
      System.out.println("Test Passed");
      
      System.out.println("");
        
    }

    
     @Test
    public void testReturnLaureatesOnCountryFieldAndYear() 
    {
        
        System.out.println("*TestReturnLaureatesOnCountryFieldAndYear*");
        
       
   
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Laureates outputLaureates;
        
        String country = "";
        
        String field = "";
        
        int year = 0;
        
        //Stage 01 General test
        
        
        int[] Stage01ExpectedResultIDs = new int[]{2,3}; 
        
        country = "united kingdom";
        
        field = "physics";
                
        year = 2010;
        
        System.out.println("Stage 1 of Test:   Country  = " + country  + "  Field = " + field + "  Year = " + year);
        
        outputLaureates = Main.returnLaureatesOnCountryFieldAndYear(mockLaureates, country, field, year);       
        
        for (int i = 0; i < Stage01ExpectedResultIDs.length; i++) 
        {
            assertEquals(Stage01ExpectedResultIDs[i],outputLaureates.getLaureates().get(i).getId());
            
            System.out.println("Passed Stage 1 " + (i+1) + "/" + Stage01ExpectedResultIDs.length + " Expected ID = " + Stage01ExpectedResultIDs[i] + " Output ID = " + outputLaureates.getLaureates().get(i).getId());
                            
        }
           
        
        //Stage 02 Testing by year
        
                
        int[] Stage02ExpectedResultIDs = new int[]{4}; 
        
        country = "germany";
        
        field = "chemistry";
                
        year = 2011;
        
        System.out.println("Stage 2 of Test:   Country  = " + country  + "  Field = " + field + "  Year = " + year);
        
        outputLaureates = Main.returnLaureatesOnCountryFieldAndYear(mockLaureates, country, field, year);       
          
         for (int i = 0; i < Stage02ExpectedResultIDs.length; i++) 
        {
            assertEquals(Stage02ExpectedResultIDs[i],outputLaureates.getLaureates().get(i).getId());
            System.out.println("Passed Stage 2 " + (i+1) + "/" + Stage02ExpectedResultIDs.length + " Expected ID = " + Stage02ExpectedResultIDs[i] + " Output ID = " + outputLaureates.getLaureates().get(i).getId());
        }

       //Stage 03 Testing by country
        
        
                
        int[] Stage03ExpectedResultIDs = new int[]{1}; 
        
        country = "usa";
        
        field = "chemistry";
                
        year = 2009;
        
        System.out.println("Stage 3 of Test:   Country  = " + country  + "  Field = " + field + "  Year = " + year);
        
        outputLaureates = Main.returnLaureatesOnCountryFieldAndYear(mockLaureates, country, field, year);       
          
         for (int i = 0; i < Stage03ExpectedResultIDs.length; i++) 
        {
            assertEquals(Stage03ExpectedResultIDs[i],outputLaureates.getLaureates().get(i).getId());
            System.out.println("Passed Stage 3 " + (i+1) + "/" + Stage03ExpectedResultIDs.length + " Expected ID = " + Stage03ExpectedResultIDs[i] + " Output ID = " + outputLaureates.getLaureates().get(i).getId());
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
        
        //Stage 01 General test
        
        
        
        int[] Stage01ExpectedResultIDs = new int[]{2,3};            
        
        field = "physics";
                
        year = 2010;
        
        System.out.println("Stage 1 of Test:   Field = " + field  + "   Year = " + year );
        
        outputLaureates = Main.returnLaureatesOnShareFieldAndYear(mockLaureates, field, year);       
        
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
        
        //Stage 01 General test
        
        int[] Stage01ExpectedResultIDs = new int[]{5};            
        
        university = "University of chemistry";
                
        gender = "female";
        
         System.out.println("Stage 1 of Test:   University = " + university + "   Gender = " + gender );
        
        outputLaureates = Main.returnLaureatesOnUniversityAndGender(mockLaureates, university, gender);       
        
        for (int i = 0; i < Stage01ExpectedResultIDs.length; i++) 
        {
            assertEquals(Stage01ExpectedResultIDs[i],outputLaureates.getLaureates().get(i).getId());
            
            System.out.println("Passed Stage 1 " + (i+1) + "/" + Stage01ExpectedResultIDs.length + " Expected ID = " + Stage01ExpectedResultIDs[i] + " Output ID = " + outputLaureates.getLaureates().get(i).getId());
                            
        }          
        
        //Stage 02 General test
        
        
        
        int[] Stage02ExpectedResultIDs = new int[]{2,3};            
        
        university = "another university";
                
        gender = "male";
        
        System.out.println("Stage 2 of Test:   University = " + university + "   Gender = "+ gender );
        
        outputLaureates = Main.returnLaureatesOnUniversityAndGender(mockLaureates, university, gender);       
        
        for (int i = 0; i < Stage02ExpectedResultIDs.length; i++) 
        {
            assertEquals(Stage02ExpectedResultIDs[i],outputLaureates.getLaureates().get(i).getId());
            
            System.out.println("Passed Stage 2 " + (i+1) + "/" + Stage02ExpectedResultIDs.length + " Expected ID = " + Stage02ExpectedResultIDs[i] + " Output ID = " + outputLaureates.getLaureates().get(i).getId());
                            
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
             
        //Stage 01 General test
        
        int[] Stage01ExpectedResultIDs = new int[]{1};            
        
        country = "usa";
                
        
        
         System.out.println("Stage 1 of Test:   Country = " + country);
        
        outputLaureates = Main.returnLaureatesOnCountryAndAlive(mockLaureates, country);       
        
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
