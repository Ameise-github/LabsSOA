package WebService;

import database.Database;
import database.PublicationsDB;
import org.apache.commons.cli.*;
import org.hibernate.SessionFactory;

import javax.xml.ws.Endpoint;

public class PublicationsWsdlService {
    public static final String OPTION_SERVICE_URL = "s";
    public static final String OPTION_DB_URL = "d";
    public static final String OPTION_DB_USERNAME = "u";
    public static final String OPTION_DB_PASSWORD = "p";

    public static CommandLine parseArgs(String[] args) {
        Options opts = new Options();

        Option wsdlUrl = new Option(OPTION_SERVICE_URL, true, "URL-address of WSDL-service");
        wsdlUrl.setRequired(true);
        opts.addOption(wsdlUrl);

        Option dbUrl = new Option(OPTION_DB_URL, true, "URL-address for Data Base");
        dbUrl.setRequired(true);
        opts.addOption(dbUrl);

        Option dbUsername = new Option(OPTION_DB_USERNAME, true, "DB username");
        dbUsername.setRequired(true);
        opts.addOption(dbUsername);

        Option dbPassword = new Option(OPTION_DB_PASSWORD, true, "DB password");
        dbPassword.setRequired(true);
        opts.addOption(dbPassword);

        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser parser = new DefaultParser();

        try {
            return parser.parse(opts, args);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            formatter.printHelp("publications_wsdl_service", opts);
            System.exit(1);
        }

        return null;
    }

    public static void main(String[] args) {
        // парсер параметров
        var cmd = parseArgs(args);

        SessionFactory sessionFactory = null;
        PublicationsDB db = null;

        try {
            sessionFactory = Database.makeSessionFactory(
                    cmd.getOptionValue(OPTION_DB_URL),
                    cmd.getOptionValue(OPTION_DB_USERNAME),
                    cmd.getOptionValue(OPTION_DB_PASSWORD)
            );
            db = new PublicationsDB(sessionFactory);

            // запускаем веб-сервис, передаваемый во втором аргументе
            Endpoint.publish(cmd.getOptionValue(OPTION_SERVICE_URL), new PublicationsImpl(db));
            System.out.println("Server run!");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}