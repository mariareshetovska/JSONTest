import classes.Application;

import classes.ChildCompanies;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import readjson.ReadJsonFile;

import java.util.List;

public class TestCompany {

        ReadJsonFile jSon = new ReadJsonFile();

    @Test
    public void validCompany() {
        ChildCompanies ebay = new ChildCompanies("Ebay Address", "TA", "123456");
        Assert.assertTrue(jSon.readFromJSON().getManufacturers().getChildCompanies().contains(ebay));

    }

    @Test
    public void inValidCompany() {
        ChildCompanies olx = new ChildCompanies("Olx Address", "TA", "123456");
        Assert.assertFalse(jSon.readFromJSON().getManufacturers().getChildCompanies().contains(olx));

    }
}
