package wtp;

public class MathUtilityProxy implements wtp.MathUtility {
  private String _endpoint = null;
  private wtp.MathUtility mathUtility = null;
  
  public MathUtilityProxy() {
    _initMathUtilityProxy();
  }
  
  public MathUtilityProxy(String endpoint) {
    _endpoint = endpoint;
    _initMathUtilityProxy();
  }
  
  private void _initMathUtilityProxy() {
    try {
      mathUtility = (new wtp.MathUtilityServiceLocator()).getMathUtility();
      if (mathUtility != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mathUtility)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mathUtility)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mathUtility != null)
      ((javax.xml.rpc.Stub)mathUtility)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public wtp.MathUtility getMathUtility() {
    if (mathUtility == null)
      _initMathUtilityProxy();
    return mathUtility;
  }
  
  public int addIntegers(int firstNum, int secondNum) throws java.rmi.RemoteException{
    if (mathUtility == null)
      _initMathUtilityProxy();
    return mathUtility.addIntegers(firstNum, secondNum);
  }
  
  public int factorial(int n) throws java.rmi.RemoteException{
    if (mathUtility == null)
      _initMathUtilityProxy();
    return mathUtility.factorial(n);
  }
  
  
}