package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("pf")
public class class423 implements class422 {

    @ObfuscatedName("pf.v")
    public JSONObject field4659;

    public class423(String arg0) throws UnsupportedEncodingException {
        this.method7206(arg0);
    }

    public class423(byte[] arg0) throws UnsupportedEncodingException {
        this.method7212(arg0);
    }

    @ObfuscatedName("pf.v([BI)V")
    public void method7212(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7206(var2);
    }

    @ObfuscatedName("pf.x(Ljava/lang/String;I)V")
    public void method7206(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4659 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4659 = new JSONObject();
                this.field4659.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("pf.m(I)Lorg/json/JSONObject;")
    public JSONObject method7207() {
        return this.field4659;
    }

    @ObfuscatedName("pf.h(B)[B")
    public byte[] method7203() throws UnsupportedEncodingException {
        return this.field4659 == null ? new byte[0] : this.field4659.toString().getBytes("UTF-8");
    }
}
