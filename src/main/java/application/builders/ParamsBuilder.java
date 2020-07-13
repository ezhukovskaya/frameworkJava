package application.builders;

import java.util.HashMap;
import java.util.Map;

public class ParamsBuilder {

    protected final String AMP = "&";
    private final Map<String, String> BUILDER = new HashMap<>();


    public void addParams(String key, String value){
        this.BUILDER.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder params = new StringBuilder();
        for (Map.Entry<String, String> item : this.BUILDER.entrySet()) {
            params.append(item.getKey()).append(item.getValue()).append(AMP);
        }
        return params.toString();
    }
}
