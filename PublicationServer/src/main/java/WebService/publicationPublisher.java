package WebService;

import javax.xml.ws.Endpoint;

public class publicationPublisher {
    public static void main(String[] args) {
        // запускаем веб-сервер на порту 1986
        // и по адресу, указанному в первом аргументе,
        // запускаем веб-сервис, передаваемый во втором аргументе
       try{
           Endpoint.publish("http://0.0.0.0:1986/PublicationService", new publicationImpl());
           System.out.println("Server run!");
       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }

    }
}
//http://192.168.0.126:1986/PublicationService?wsdl