package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("sd")
public class class479 implements class478 {

    @ObfuscatedName("sd.ap")
    public JSONObject field4851;

    public class479(JSONObject arg0) {
        this.field4851 = arg0;
    }

    public class479(String arg0) throws UnsupportedEncodingException {
        this.method7942(arg0);
    }

    public class479(byte[] arg0) throws UnsupportedEncodingException {
        this.method7945(arg0);
    }

    @ObfuscatedName("sd.am(I)Lsy;")
    public class477 method7936() {
        return class477.field4848;
    }

    @ObfuscatedName("sd.ag([BI)V")
    public void method7945(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7942(var2);
    }

    @ObfuscatedName("sd.ao(Ljava/lang/String;I)V")
    public void method7942(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4851 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4851 = new JSONObject();
                this.field4851.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("sd.ae(I)Lorg/json/JSONObject;")
    public JSONObject method7943() {
        return this.field4851;
    }

    @ObfuscatedName("sd.ap(I)[B")
    public byte[] method7935() throws UnsupportedEncodingException {
        return this.field4851 == null ? new byte[0] : this.field4851.toString().getBytes("UTF-8");
    }
}
