package WebService;

import org.apache.commons.cli.*;

import javax.xml.ws.Endpoint;

public class publicationPublisher {
    public static final String OPTION_WSDL_URL = "wsdl_url";
    public static final String OPTION_DB_URL = "db_url";

    public static CommandLine parseArgs(String[] args) {
        Options opts = new Options();

        Option wsdlUrl = new Option(OPTION_WSDL_URL, true, "URL-address of WSDL-service");
        wsdlUrl.setRequired(true);
        opts.addOption(wsdlUrl);

        Option dbUrl = new Option(OPTION_DB_URL, true, "URL-address for Data Base");
        dbUrl.setRequired(true);
        opts.addOption(dbUrl);

        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser parser = new DefaultParser();

        try {
            return parser.parse(opts, args);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            formatter.printHelp("publication_publisher", opts);
            System.exit(1);
        }

        return null;
    }

    public static void main(String[] args) {
        // парсер параметров
        var cmd = parseArgs(args);
        System.out.println(String.format("WSDL: %s", cmd.getOptionValue(OPTION_WSDL_URL)));
        System.out.println(String.format("DataBase: %s", cmd.getOptionValue(OPTION_DB_URL)));

        try {
            // запускаем веб-сервис, передаваемый во втором аргументе
            Endpoint.publish(cmd.getOptionValue(OPTION_WSDL_URL), new publicationImpl());
            System.out.println("Server run!");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}