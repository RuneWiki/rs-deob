package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("op")
public class class400 implements class399 {

    @ObfuscatedName("op.i")
    public JSONObject field4385;

    public class400(byte[] arg0) throws UnsupportedEncodingException {
        this.method6482(arg0);
    }

    @ObfuscatedName("op.f([BI)V")
    public void method6482(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method6483(var2);
    }

    @ObfuscatedName("op.b(Ljava/lang/String;I)V")
    public void method6483(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4385 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4385 = new JSONObject();
                this.field4385.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("op.n(I)Lorg/json/JSONObject;")
    public JSONObject method6487() {
        return this.field4385;
    }

    @ObfuscatedName("op.v(S)[B")
    public byte[] method6480() throws UnsupportedEncodingException {
        return this.field4385 == null ? new byte[0] : this.field4385.toString().getBytes("UTF-8");
    }
}
