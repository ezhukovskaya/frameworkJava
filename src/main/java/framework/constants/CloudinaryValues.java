package framework.constants;

import application.constants.PathsConstants;
import framework.utils.PropertiesRead;

public class CloudinaryValues {
    public static final String CLOUDINARY_URL = PropertiesRead.read("cloudinaryUrl", PathsConstants.FRAMEWORK_PROPERTY);
    public static final String SCREENSHOT_PATH = PropertiesRead.read("screenshotPath", PathsConstants.FRAMEWORK_PROPERTY);
    public static final String SECURE_URL = "secure_url";
}