package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("qg")
public class class434 implements class433 {

    @ObfuscatedName("qg.al")
    public JSONObject field4644;

    public class434(JSONObject arg0) {
        this.field4644 = arg0;
    }

    public class434(String arg0) throws UnsupportedEncodingException {
        this.method7313(arg0);
    }

    public class434(byte[] arg0) throws UnsupportedEncodingException {
        this.method7312(arg0);
    }

    @ObfuscatedName("qg.aj(B)Lqn;")
    public class432 method7306() {
        return class432.field4640;
    }

    @ObfuscatedName("qg.ap([BB)V")
    public void method7312(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7313(var2);
    }

    @ObfuscatedName("qg.ar(Ljava/lang/String;S)V")
    public void method7313(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4644 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4644 = new JSONObject();
                this.field4644.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("qg.ak(I)Lorg/json/JSONObject;")
    public JSONObject method7314() {
        return this.field4644;
    }

    @ObfuscatedName("qg.al(B)[B")
    public byte[] method7305() throws UnsupportedEncodingException {
        return this.field4644 == null ? new byte[0] : this.field4644.toString().getBytes("UTF-8");
    }
}
