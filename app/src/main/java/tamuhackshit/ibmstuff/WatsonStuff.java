package tamuhackshit.ibmstuff;

import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.language_translation.v2.model.TranslationResult;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Chris on 10/10/2015.
 */
public class WatsonStuff {

    // Information
    private static final String TRANSLATION_USERNAME = "89b3ac0b-ea02-46ea-bdff-c7a149bf4ef2";
    private static final String TRANSLATION_PASSWORD = "xjv1zdOs3Zlu";

    public static class MyLanguage {
        String code;
        String name;
        public MyLanguage(String code, String name) {
            this.code = code;
            this.name = name;
        }
        public String getCode() { return code; }
        public String getName() { return name; }
    }

    private static List<MyLanguage> langs = new ArrayList<>();

    static {
        addLanguage("af", "Afrikaans"); addLanguage("ar", "Arabic"); addLanguage("az", "Azerbaijani"); addLanguage("ba", "Bashkir"); addLanguage("be", "Belarusian"); addLanguage("bg", "Bulgarian"); addLanguage("bn", "Bengali"); addLanguage("bs", "Bosnian"); addLanguage("cs", "Czech"); addLanguage("cv", "Chuvash"); addLanguage("da", "Danish"); addLanguage("de", "German"); addLanguage("el", "Greek"); addLanguage("en", "English"); addLanguage("eo", "Esperanto"); addLanguage("es", "Spanish"); addLanguage("et", "Estonian"); addLanguage("eu", "Basque"); addLanguage("fa", "Persian"); addLanguage("fi", "Finnish"); addLanguage("fr", "French"); addLanguage("gu", "Gujarati"); addLanguage("he", "Hebrew"); addLanguage("hi", "Hindi"); addLanguage("ht", "Haitian"); addLanguage("hu", "Hungarian"); addLanguage("hy", "Armenian"); addLanguage("id", "Indonesian"); addLanguage("is", "Icelandic"); addLanguage("it", "Italian"); addLanguage("ja", "Japanese"); addLanguage("ka", "Georgian"); addLanguage("kk", "Kazakh"); addLanguage("km", "Central Khmer"); addLanguage("ko", "Korean"); addLanguage("ku", "Kurdish"); addLanguage("ky", "Kirghiz"); addLanguage("lt", "Lithuanian"); addLanguage("lv", "Latvian"); addLanguage("ml", "Malayalam"); addLanguage("mn", "Mongolian"); addLanguage("nb", "Norwegian Bokmal"); addLanguage("nl", "Dutch"); addLanguage("nn", "Norwegian Nynorsk"); addLanguage("pa", "Panjabi"); addLanguage("pl", "Polish"); addLanguage("ps", "Pushto"); addLanguage("pt", "Portuguese"); addLanguage("ro", "Romanian"); addLanguage("ru", "Russian"); addLanguage("sk", "Slovakian"); addLanguage("so", "Somali"); addLanguage("sq", "Albanian"); addLanguage("sv", "Swedish"); addLanguage("ta", "Tamil"); addLanguage("te", "Telugu"); addLanguage("tr", "Turkish"); addLanguage("uk", "Ukrainian"); addLanguage("ur", "Urdu"); addLanguage("vi", "Vietnamese"); addLanguage("zh", "Chinese"); addLanguage("zh-TW", "Traditional Chinese");
    }

    static void addLanguage(String code, String name) {
        langs.add(new MyLanguage(code, name));
    }

    public static MyLanguage randomLanguage() {
        return langs.get((int) (Math.random() * langs.size()));
    }

    public static LanguageTranslation languageTranslation() {
        LanguageTranslation service = new LanguageTranslation();
        service.setUsernameAndPassword(TRANSLATION_USERNAME,TRANSLATION_PASSWORD);
        return service;
    }

}
