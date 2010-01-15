package com.k1kuch1.android.atgwt;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/** Open at Google Wireless Transcoder
 * @author tkskkc
 * 
 * PC向けページをGWT(Google Wireless Transcoder)で携帯電話向けに変換する。
 * PC向けページを開いた状態で「ページを共有」メニューから「atGWT」を選択してください。
 * 
 * PC page convert them for mobile phones. Using GWT (Google Wireless Transcoder).
 * PC-page open for the "shared page" menu "atGWT" Please select.
 */
public class AtGWT extends Activity {
    static String GWT_URL = "http://www.google.com/gwt/x?u=";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String targetUrl = getIntent().getExtras().getString("android.intent.extra.TEXT");
        if (targetUrl != null) {
            Uri uri = Uri.parse(GWT_URL + Uri.encode(targetUrl));
        	Intent send_intent = new Intent(Intent.ACTION_VIEW, uri);
        	
        	startActivity(send_intent);
        }
    }
}