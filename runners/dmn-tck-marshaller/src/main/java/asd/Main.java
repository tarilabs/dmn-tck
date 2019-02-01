package asd;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;

public class Main {

    public static void main(String[] args) throws Throwable {
        TDefinitions unmarshal = JAXB.unmarshal(Main.class.getResourceAsStream("/0001-filter.dmn"), TDefinitions.class);
        System.out.println(unmarshal);
        JAXBContext jaxbContext = JAXBContext.newInstance(TDefinitions.class);
        jaxbContext.createMarshaller().marshal(unmarshal, System.out);
    }

}
