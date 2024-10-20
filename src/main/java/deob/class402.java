package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("om")
public class class402 implements class401 {

    @ObfuscatedName("om.f")
    public JSONObject field4475;

    public class402(String arg0) throws UnsupportedEncodingException {
        this.method6628(arg0);
    }

    public class402(byte[] arg0) throws UnsupportedEncodingException {
        this.method6630(arg0);
    }

    @ObfuscatedName("om.n([BI)V")
    public void method6630(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method6628(var2);
    }

    @ObfuscatedName("om.k(Ljava/lang/String;I)V")
    public void method6628(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4475 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4475 = new JSONObject();
                this.field4475.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("om.w(I)Lorg/json/JSONObject;")
    public JSONObject method6629() {
        return this.field4475;
    }

    @ObfuscatedName("om.c(I)[B")
    public byte[] method6625() throws UnsupportedEncodingException {
        return this.field4475 == null ? new byte[0] : this.field4475.toString().getBytes("UTF-8");
    }
}
