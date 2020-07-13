package application.builders;

import application.constants.UrlConstants;

public class RequestBuilder {
    private static String createRequest(String apiMethodName, String apiMethod) {
        return String.format(UrlConstants.API_URL, "") + apiMethodName + apiMethod;
    }

    public static String createRequest(String apiMethodName, String apiMethod, String requestParameter, String value) {
        ParamsBuilder paramsBuilder = new ParamsBuilder();
        paramsBuilder.addParams(requestParameter, value);
        return createRequest(apiMethodName, apiMethod) + paramsBuilder.toString();
    }
}
