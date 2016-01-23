package google.alldata;

import org.testng.annotations.DataProvider;

/**
 * Created by Shuvashish on 1/18/2016.
 */
public class GetDataToSearch {

    @DataProvider(name="data")
    public static Object[][] getData(){

        Object[][] data= new Object[3][1];

        data[0][0]="dhaka";
        data[1][0]="new york";
        data[2][0]="london";

        return data;

    }
}
