package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("pi")
public class class420 implements class419 {

    @ObfuscatedName("pi.c")
    public JSONObject field4605;

    public class420(String arg0) throws UnsupportedEncodingException {
        this.method7146(arg0);
    }

    public class420(byte[] arg0) throws UnsupportedEncodingException {
        this.method7139(arg0);
    }

    @ObfuscatedName("pi.c([BI)V")
    public void method7139(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7146(var2);
    }

    @ObfuscatedName("pi.x(Ljava/lang/String;I)V")
    public void method7146(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4605 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4605 = new JSONObject();
                this.field4605.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("pi.h(I)Lorg/json/JSONObject;")
    public JSONObject method7140() {
        return this.field4605;
    }

    @ObfuscatedName("pi.a(B)[B")
    public byte[] method7138() throws UnsupportedEncodingException {
        return this.field4605 == null ? new byte[0] : this.field4605.toString().getBytes("UTF-8");
    }
}
