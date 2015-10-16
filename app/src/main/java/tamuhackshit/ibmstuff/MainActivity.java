package tamuhackshit.ibmstuff;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.language_translation.v2.model.IdentifiableLanguage;
import com.ibm.watson.developer_cloud.machine_translation.v1.model.Language;
import com.ibm.watson.developer_cloud.language_translation.v2.model.TranslationResult;

import java.net.URL;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private static Button butt;
    private static TextView tt;
    private static EditText eddy;
    private static TextView tt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt = (Button)findViewById(R.id.button);
        tt = (TextView)findViewById(R.id.Word);
        eddy = (EditText)findViewById(R.id.editText);
        tt2 = (TextView)findViewById(R.id.textView2);

        new Test().execute();
    }


    public class Test extends AsyncTask<String, String, String>{
       // List<IdentifiableLanguage> ar;
        //IdentifiableLanguage idy;
        //TranslationResult result;
        //LanguageTranslation service;

        private WatsonStuff.MyLanguage lang;

        @Override
        protected String doInBackground(String... args) {

            String TRANSLATION_USERNAME = "89b3ac0b-ea02-46ea-bdff-c7a149bf4ef2";
            String TRANSLATION_PASSWORD = "xjv1zdOs3Zlu";
            //LanguageTranslation service = new LanguageTranslation();
            //service.setUsernameAndPassword(TRANSLATION_USERNAME,TRANSLATION_PASSWORD);

            //TranslationResult result = service.translate("hello", "en", "es");

//            WatsonStuff.test();
            LanguageTranslation service = WatsonStuff.languageTranslation();
            lang = WatsonStuff.randomLanguage();
            String code = lang.getCode();
            TranslationResult result = service.translate("Hello", "en", "ku");//lang.getCode());
            return "";
        }

        protected void onPostExecute(){
            LanguageTranslation service = WatsonStuff.languageTranslation();
            TranslationResult result = service.translate("Balls", "en", lang.getCode());
            tt.setText(result.toString());
            final String name = lang.getName();

            butt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(name.equals(eddy.getText())) {
                        tt2.setText("Correct");
                    }
                    else{
                        tt2.setText("False");
                    }
                }
            });
        }


    }
}
