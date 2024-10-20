package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("rl")
public class class463 implements class462 {

    @ObfuscatedName("rl.ae")
    public JSONObject field4776;

    public class463(JSONObject arg0) {
        this.field4776 = arg0;
    }

    public class463(String arg0) throws UnsupportedEncodingException {
        this.method7650(arg0);
    }

    public class463(byte[] arg0) throws UnsupportedEncodingException {
        this.method7653(arg0);
    }

    @ObfuscatedName("rl.au(I)Lre;")
    public class461 method7647() {
        return class461.field4773;
    }

    @ObfuscatedName("rl.ai([BB)V")
    public void method7653(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7650(var2);
    }

    @ObfuscatedName("rl.az(Ljava/lang/String;B)V")
    public void method7650(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4776 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4776 = new JSONObject();
                this.field4776.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("rl.ap(B)Lorg/json/JSONObject;")
    public JSONObject method7652() {
        return this.field4776;
    }

    @ObfuscatedName("rl.ae(I)[B")
    public byte[] method7645() throws UnsupportedEncodingException {
        return this.field4776 == null ? new byte[0] : this.field4776.toString().getBytes("UTF-8");
    }
}
