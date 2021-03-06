package denominator.model.rdata;

import static denominator.model.ResourceRecordSets.cert;

import org.testng.annotations.Test;

@Test
public class CERTDataTest {

    public void testGoodRecord() {
    	cert("www.denominator.io.", "12345 1 1 B33F");
    }    
    
    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = ".*record must have exactly four parts.*")
    public void testMissingParts() {
    	cert("www.denominator.io.", "12345 1 1");
    }

}
