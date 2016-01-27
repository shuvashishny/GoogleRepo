package google.alldata;

import org.testng.annotations.DataProvider;

/**
 * Created by Shuvashish on 1/18/2016.
 */
public class GetDataToSearch {

    @DataProvider(name="data")
    public static Object[][] getData(){

        Object[][] data= new Object[2][2];

        data[0][0]="Dhaka";
        data[0][1]="Dhaka Stock Exchange";

        data[1][0]="New York";
        data[1][1]="New York State Education Department";




        return data;

    }
}
