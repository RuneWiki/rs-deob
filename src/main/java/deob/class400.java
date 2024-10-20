package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("om")
public class class400 implements class399 {

    @ObfuscatedName("om.q")
    public JSONObject field4437;

    public class400(String arg0) throws UnsupportedEncodingException {
        this.method6464(arg0);
    }

    public class400(byte[] arg0) throws UnsupportedEncodingException {
        this.method6463(arg0);
    }

    @ObfuscatedName("om.w([BI)V")
    public void method6463(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method6464(var2);
    }

    @ObfuscatedName("om.y(Ljava/lang/String;I)V")
    public void method6464(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4437 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4437 = new JSONObject();
                this.field4437.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("om.i(I)Lorg/json/JSONObject;")
    public JSONObject method6465() {
        return this.field4437;
    }

    @ObfuscatedName("om.c(I)[B")
    public byte[] method6461() throws UnsupportedEncodingException {
        return this.field4437 == null ? new byte[0] : this.field4437.toString().getBytes("UTF-8");
    }
}
