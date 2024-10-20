package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("sx")
public class class483 implements class482 {

    @ObfuscatedName("sx.ah")
    public JSONObject field4912;

    public class483(JSONObject arg0) {
        this.field4912 = arg0;
    }

    public class483(String arg0) throws UnsupportedEncodingException {
        this.method7814(arg0);
    }

    public class483(byte[] arg0) throws UnsupportedEncodingException {
        this.method7813(arg0);
    }

    @ObfuscatedName("sx.az(I)Lsv;")
    public class481 method7808() {
        return class481.field4906;
    }

    @ObfuscatedName("sx.aw([BI)V")
    public void method7813(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7814(var2);
    }

    @ObfuscatedName("sx.ad(Ljava/lang/String;I)V")
    public void method7814(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4912 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4912 = new JSONObject();
                this.field4912.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("sx.al(B)Lorg/json/JSONObject;")
    public JSONObject method7816() {
        return this.field4912;
    }

    @ObfuscatedName("sx.ah(B)[B")
    public byte[] method7807() throws UnsupportedEncodingException {
        return this.field4912 == null ? new byte[0] : this.field4912.toString().getBytes("UTF-8");
    }
}
