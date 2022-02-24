package WhiteBox;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class IpValidatorTest {

    @Test
    public void dummyTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("0"));
    }

    //@TODO: Create more tests
    // "1.4.5.7"
    @Test
    public void validIPv4LengthTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("IPv4",tool.validIPAddress("0.4.5.7"));
    }
    //invalid because shorter than 7 of IPv4
    @Test
    public void invalidIPv4LengthTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1.3.6"));
    }

    //invalid because starting of . of IPv4
    @Test
    public void invalidIPv4StartTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress(".1.4.5.7"));
    }
    //invalid because end of . of IPv4
    @Test
    public void invalidIPv4EndTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1.4.5.7."));
    }

    //invalid because token not equal 4 of IPv4
    @Test
    public void invalidIPv4takenTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1.2.3.4.5"));
    }
    //invalid because token first condition of IPv4: if(token.startsWith("0") && token.length()>1)
    // @ValueSource(strings={"02.3.4","0.12.3",""})
    @Test
    public void invalidIPv4takenZeroTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("02.3.4.5"));
        assertEquals("Neither",tool.validIPAddress("-00.255.255.255")); //what I missed? if(parsedInt==0 && token.charAt(0)!='0') return false;
        assertEquals("Neither",tool.validIPAddress("aaa.aaa.axy.#&a")); // what I missed? NumberFormatException nfe
    }

    @Test
    public void invalidIPv4takenZeroTest3(){

        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("0.12.a.4"));
    }
    //invalid because parsed token is negative or greater than 255
    // if(parsedInt<0 || parsedInt>255) return false;
    // @ValueSource(strings={"-1.3.4.6","1.256","1234","-1.256"})
    @Test
    public void invalidIPv4takenExtremeTest(){

        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("-1.3.4.6"));
    }
    @Test
    public void invalidIPv4takenExtremeTest2(){

        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1.256.3.4"));
    }
    @Test
    public void invalidIPv4takenExtremeTest3(){

        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("-1.256.3.4"));
    }


    //invalid because parsed token is 0 in the token but not the start
    //if(parsedInt==0 && token.charAt(0)!='0') return false;
    // @ValueSource(strings={"1.0.4.6","1.2.0.6","1.2.3.0"})
    @Test
    public void invalidIPv4takenZeroStartTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1.2.3. 0"));
    }
    @Test
    public void invalidIPv4takenZeroStartTest4(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1.2.3.a0"));
    }
    @Test
    public void invalidIPv4takenZeroStartTest2(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("01.2.0.6"));
    }
    @Test
    public void invalidIPv4takenZeroStartTest3(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1.2.a.0"));
    }

    @Test
    public void invalidIPv4takenChTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1.2.a.0"));
    }
    //valid IPv6
    @Test
    public void validIPv6lengthTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("IPv6",tool.validIPAddress("1:2:3:4:5:6:7:8"));
    }
    //invalid length IPv6 if(ip.length()<15) return false;
    @Test
    public void invalidIPv6lengthTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1:2:3:4:5:6:7"));
    }
    //invalid start :
    @Test
    public void invalidIPv6StartTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress(":2:3:4:5:6:7:8:9"));
    }
    //invalid end :
    @Test
    public void invalidIPv6EndTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1:2:3:4:5:6:7:8:"));
    }
    //if(tokens.length!=8) return false;
    @Test
    public void invalidIPv6TokenLenTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1:2:3:4:5:6:7:8:9"));
    }
    //token length == 8
    //if(token.length()>4 || token.length()==0)
    @Test
    public void invalidIPv6TokenFirstTest(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("12345:2:3:4:5:6:7:8"));
    }
    @Test
    public void invalidIPv6TokenFirstTest2(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1::2:3:4:5:6:7:8"));
    }
    @Test
    public void invalidIPv6TokenFirstTest3(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1::2:3:4:5:6:78"));
    }
    //isDigit
    @Test
    public void invalidIPv6IsDigitTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("-18:2:3:4:5:6:7:8"));
    }

    //boolean isUppercaseAF = c>=65 && c<=70;
    @Test
    public void invalidIPv6IsDigitTest2(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("20EE:FGb8:85a3:0:0:8A2E:0370:7334"));
    }
    //isLowerCaseAF = c>=97 && c<=102;
    @Test
    public void invalidIPv6IsUpperTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("2001:db8:85/3:0:0:8A2E::7334"));
    }
    @Test
    public void invalidIPv6IsLowerTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("1:z:3:4:5:6:7:8"));
    }
}
