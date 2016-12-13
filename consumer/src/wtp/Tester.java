package wtp;
public class Tester {
  public static void main(String [] args) throws Exception {
    // Make a service
    MathUtilityService service = new MathUtilityServiceLocator();

    // Now use the service to get a stub which implements the SDI.
    MathUtility port = service.getMathUtility();

    // Make the actual call
    //Address address = new Address(...);
   int x= port.addIntegers(6, 7);
    System.out.println(x);
  }
}