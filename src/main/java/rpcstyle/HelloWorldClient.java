package rpcstyle;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:7779/ws/hello?wsdl");
        QName qName = new QName("http://rpcstyle/","HelloWorldImplService");
        Service service = Service.create(url,qName);
        HelloWorld helloWorld = service.getPort(HelloWorld.class);
        System.out.println(helloWorld.getHelloWorldAsString("javatpoint rpc"));
    }
}
