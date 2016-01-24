package google.alldata;

import org.testng.annotations.DataProvider;

/**
 * Created by Shuvashish on 1/18/2016.
 */
public class GetDataToSearch {

    @DataProvider(name="data")
    public static Object[][] getData(){

        Object[][] data= new Object[2][2];

        data[0][0]="dhaka";
        data[0][1]="British";

        data[1][0]="new york";
        data[1][1]="English";




        return data;

    }
}
