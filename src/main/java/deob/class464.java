package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("re")
public class class464 implements class463 {

    @ObfuscatedName("re.ay")
    public JSONObject field4780;

    public class464(JSONObject arg0) {
        this.field4780 = arg0;
    }

    public class464(String arg0) throws UnsupportedEncodingException {
        this.method7626(arg0);
    }

    public class464(byte[] arg0) throws UnsupportedEncodingException {
        this.method7625(arg0);
    }

    @ObfuscatedName("re.aw(I)Lrs;")
    public class462 method7620() {
        return class462.field4778;
    }

    @ObfuscatedName("re.ag([BI)V")
    public void method7625(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7626(var2);
    }

    @ObfuscatedName("re.az(Ljava/lang/String;B)V")
    public void method7626(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4780 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4780 = new JSONObject();
                this.field4780.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("re.av(B)Lorg/json/JSONObject;")
    public JSONObject method7628() {
        return this.field4780;
    }

    @ObfuscatedName("re.ay(I)[B")
    public byte[] method7619() throws UnsupportedEncodingException {
        return this.field4780 == null ? new byte[0] : this.field4780.toString().getBytes("UTF-8");
    }
}
