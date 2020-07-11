package br.com.marcoagpegoraro.aula1;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/*")
//@RequestScoped //this make the diference
public class JAXRSConfiguration extends Application {

}
