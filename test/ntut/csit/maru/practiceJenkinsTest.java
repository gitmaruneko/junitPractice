package ntut.csit.maru;


import static org.junit.Assert.*;


import org.junit.Test;



public class practiceJenkinsTest {
    
    practiceJenkins tObj = new practiceJenkins();
  
   @Test public void testAdd_twoPositive_() {
        int tResult = tObj.Add(3, 5);    
        assertEquals(8, tResult);        
     }
   
   @Test public void testAdd_onePositiveOneNegative_() {
       int tResult = tObj.Add(3, -5);    
       assertEquals(-2, tResult);        
    }
   
   @Test public void testSub_twoPositive_() {
       int tResult = tObj.Sub(5, 3);    
       assertEquals(2, tResult);        
    }
  
  @Test public void testSub_onePositiveOneNegative_() {
      int tResult = tObj.Sub(3, -5);    
      assertEquals(8, tResult);        
   }
  
  @Test public void testSub_twoNumEqual_() {
      int tResult = tObj.Sub(-5, -5);    
      assertEquals(1, tResult);        
   }
}
