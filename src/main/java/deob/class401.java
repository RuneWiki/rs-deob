package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("oh")
public class class401 implements class400 {

    @ObfuscatedName("oh.l")
    public JSONObject field4440;

    public class401(String arg0) throws UnsupportedEncodingException {
        this.method6372(arg0);
    }

    public class401(byte[] arg0) throws UnsupportedEncodingException {
        this.method6366(arg0);
    }

    @ObfuscatedName("oh.l([BI)V")
    public void method6366(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method6372(var2);
    }

    @ObfuscatedName("oh.k(Ljava/lang/String;B)V")
    public void method6372(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4440 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4440 = new JSONObject();
                this.field4440.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("oh.a(I)Lorg/json/JSONObject;")
    public JSONObject method6367() {
        return this.field4440;
    }

    @ObfuscatedName("oh.o(I)[B")
    public byte[] method6363() throws UnsupportedEncodingException {
        return this.field4440 == null ? new byte[0] : this.field4440.toString().getBytes("UTF-8");
    }
}
