package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("sv")
public class class475 implements class474 {

    @ObfuscatedName("sv.ah")
    public JSONObject field4814;

    public class475(JSONObject arg0) {
        this.field4814 = arg0;
    }

    public class475(String arg0) throws UnsupportedEncodingException {
        this.method7796(arg0);
    }

    public class475(byte[] arg0) throws UnsupportedEncodingException {
        this.method7795(arg0);
    }

    @ObfuscatedName("sv.at(B)Lsi;")
    public class473 method7788() {
        return class473.field4811;
    }

    @ObfuscatedName("sv.aa([BI)V")
    public void method7795(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7796(var2);
    }

    @ObfuscatedName("sv.ac(Ljava/lang/String;I)V")
    public void method7796(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4814 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4814 = new JSONObject();
                this.field4814.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("sv.al(B)Lorg/json/JSONObject;")
    public JSONObject method7794() {
        return this.field4814;
    }

    @ObfuscatedName("sv.ah(B)[B")
    public byte[] method7789() throws UnsupportedEncodingException {
        return this.field4814 == null ? new byte[0] : this.field4814.toString().getBytes("UTF-8");
    }
}
