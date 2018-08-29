package documentstyle;

import rpcstyle.HelloWorld;

import javax.jws.WebService;

@WebService(endpointInterface = "documentstyle.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS document style "+name;
    }
}
