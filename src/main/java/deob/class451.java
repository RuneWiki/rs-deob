package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("rr")
public class class451 implements class450 {

    @ObfuscatedName("rr.an")
    public JSONObject field4722;

    public class451(JSONObject arg0) {
        this.field4722 = arg0;
    }

    public class451(String arg0) throws UnsupportedEncodingException {
        this.method7527(arg0);
    }

    public class451(byte[] arg0) throws UnsupportedEncodingException {
        this.method7528(arg0);
    }

    @ObfuscatedName("rr.at(I)Lro;")
    public class449 method7523() {
        return class449.field4718;
    }

    @ObfuscatedName("rr.ab([BI)V")
    public void method7528(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7527(var2);
    }

    @ObfuscatedName("rr.ak(Ljava/lang/String;I)V")
    public void method7527(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4722 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4722 = new JSONObject();
                this.field4722.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("rr.ae(S)Lorg/json/JSONObject;")
    public JSONObject method7529() {
        return this.field4722;
    }

    @ObfuscatedName("rr.an(I)[B")
    public byte[] method7522() throws UnsupportedEncodingException {
        return this.field4722 == null ? new byte[0] : this.field4722.toString().getBytes("UTF-8");
    }
}
