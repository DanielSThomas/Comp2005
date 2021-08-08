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
        
        mockPrize01.add(new Prize(2019,"medicine",1,"for their discoveries of how to name stuff.",mockAffiliation01));
        
        Laureate mockLaureate01 = new Laureate(01,"Dean","Smith","1967-01-12","0000-00-00","USA","US","Somewhere",null,null,null,"male",mockPrize01);
        
        
        //Mock laureate 02
        
        ArrayList<Affiliation> mockAffiliation02 = new ArrayList<Affiliation>();
        
        mockAffiliation02.add(new Affiliation("Another University","Nowhere","United Kingdom"));
        
        mockAffiliation02.add(new Affiliation("A New University","Someplace","United Kingdom"));
        
        ArrayList<Prize> mockPrize02 = new ArrayList<Prize>();
        
        mockPrize02.add(new Prize(2019,"physics",2,"for their discoveries in physics.",mockAffiliation02));
        
        Laureate mockLaureate02 = new Laureate(01,"Dean","Smith","1967-01-12","0000-00-00","USA","US","Somewhere",null,null,null,"male",mockPrize02);
        
 
        //Adding the laureates to the parrent laureates object
        
        ArrayList<Laureate> mockLaureatesArray = new ArrayList<Laureate>();
        
        mockLaureatesArray.add(mockLaureate01);
        
        mockLaureatesArray.add(mockLaureate02);
  
        mockLaureates = new Laureates(mockLaureatesArray);
        
    }
    
    @After
    public void tearDown() 
    {
        
    }
 
    @Test
    public void testReadMockObjects() throws Exception 
    {
      System.out.println("TestReadMockObjects---------------"); 
      
      Main.printLaureates(mockLaureates);
        
    }
    
    @Test
    public void testReadMockObjectsWithNullVariables() throws Exception 
    {
              
      System.out.println("TestReadMockObjectsWithNullVariables---------------"); 
      
      //Creating Mock object with null vars
        ArrayList<Affiliation> mockAffiliationNull = new ArrayList<Affiliation>();
        
        mockAffiliationNull.add(new Affiliation(null,null,null));
                 
        ArrayList<Prize> mockPrizeNull = new ArrayList<Prize>();
        
        mockPrizeNull.add(new Prize(0,null,0,null,mockAffiliationNull));
        
        Laureate mockLaureateNull = new Laureate(0,null,null,null,null,null,null,null,null,null,null,null,mockPrizeNull);
        
        ArrayList<Laureate> mockLaureatesArray = new ArrayList<Laureate>();
        
        mockLaureatesArray.add(mockLaureateNull);
 
        mockLaureates = new Laureates(mockLaureatesArray);
      
        
      Main.printLaureates(mockLaureates);
        
    }
    
    @Test
    public void testReadMockObjectsWithNullPrizeObject() throws Exception 
    {
              
      System.out.println("TestReadMockObjectsWithMissingObjects---------------"); 
            
      //Creating Mock object with null Prizes array
      
        ArrayList<Prize> mockPrizeNull = new ArrayList<Prize>();
      
        Laureate mockLaureateNull = new Laureate(0,null,null,null,null,null,null,null,null,null,null,null,mockPrizeNull);
        
        ArrayList<Laureate> mockLaureatesArray = new ArrayList<Laureate>();
        
        mockLaureatesArray.add(mockLaureateNull);
 
        mockLaureates = new Laureates(mockLaureatesArray);
      
      Main.printLaureates(mockLaureates);
        
    }
    
    @Test
    public void testReadMockObjectsWithNullAfffiliationObjects() throws Exception 
    {
              
      System.out.println("TestReadMockObjectsWithMissingObjects---------------"); 
            
      //Creating Mock object with null affiliation array
      
        ArrayList<Affiliation> mockAffiliationNull = new ArrayList<Affiliation>();
      
        ArrayList<Prize> mockPrizeNull = new ArrayList<Prize>();
        
        mockPrizeNull.add(new Prize(0,null,0,null,mockAffiliationNull));
      
        Laureate mockLaureateNull = new Laureate(0,null,null,null,null,null,null,null,null,null,null,null,mockPrizeNull);
        
        ArrayList<Laureate> mockLaureatesArray = new ArrayList<Laureate>();
        
        mockLaureatesArray.add(mockLaureateNull);
 
        mockLaureates = new Laureates(mockLaureatesArray);
      
      Main.printLaureates(mockLaureates);
        
    }


    @Test
    public void testReturnLaureatesOnCountryFieldAndYear() 
    {
        
        
        
    }
    
}
