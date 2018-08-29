package rpcstyle;

import javax.jws.WebService;

@WebService(endpointInterface = "rpcstyle.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS "+name;
    }
}
