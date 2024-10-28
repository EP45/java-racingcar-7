package racingcar.messages;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageManager {
    private static ResourceBundle messages;

    static {
        setLocale(Locale.KOREAN);
    }

    public static void setLocale(Locale locale) {
        messages = ResourceBundle.getBundle("messages", locale);
    }

    public static String getMessage(String key, Object... args) {
        String message = messages.getString(key);
        return java.text.MessageFormat.format(message, args);
    }
}
