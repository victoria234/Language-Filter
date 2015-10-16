package tamuhackshit.ibmstuff;

import com.ibm.watson.developer_cloud.language_translation.v2.model.IdentifiableLanguage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 10/10/2015.
 */
public class GetLanguages {
    static private List<IdentifiableLanguage> ar;

    public GetLanguages(List<IdentifiableLanguage> ar)
    {
        ar = WatsonStuff.languageTranslation().getIdentifiableLanguages();
    }

    public static List<IdentifiableLanguage> getLangs()
    {
        return ar;
    }

    String seeLanguage(IdentifiableLanguage idy)
    {
        return idy.getLanguage();
    }

}
