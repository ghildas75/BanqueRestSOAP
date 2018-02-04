package ca.ghildas.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class ConfigSoap {

@Bean	
public SimpleJaxWsServiceExporter getJaxws() {
	
	SimpleJaxWsServiceExporter sjx= new SimpleJaxWsServiceExporter();
	sjx.setBaseAddress("http://localhost:9092/BanqSoap");
	return sjx;
}
}