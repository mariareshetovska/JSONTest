package readjson;

import classes.Application;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class ReadJsonFile {
    public Application readFromJSON() {
        ObjectMapper mapper = new ObjectMapper();
        Application application = null;
        try {

            File json = new File("src\\main\\resources\\test.json");
            application  = mapper.readValue(json, Application.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return application;
    }
}



