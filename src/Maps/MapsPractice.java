package Maps;

import java.util.ArrayList;
import java.util.Map;

public class MapsPractice {
    public static void main(String[] args) {
        Map<String, String> params = Map.of( //
                "period-ending", "2022-01", //
                "num-months", "12", //
                "area-definition", "TA2019", //
                "include-aggregates", "false", //
                "statistics", "mean", //
                "dwelling-type", "BoardingHouse", //
                "num-bedrooms", "2");

        ArrayList<String> ar = new ArrayList<>();   // Variable scope notes****

// ?period-ending=2022-01&num-months=3&area-definition=TA2019&include-aggregates=false

        for (Map.Entry<String, String> param : params.entrySet()) {
            String pa = param.getKey() + "=" + param.getValue();
            ar.add(pa);
        }
        String queryParams = String.join("&", ar);
    }
}