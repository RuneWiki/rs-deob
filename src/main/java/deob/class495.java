package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("tj")
public class class495 implements class494 {

    @ObfuscatedName("tj.ad")
    public JSONObject field5046;

    public class495(JSONObject arg0) {
        this.field5046 = arg0;
    }

    public class495(String arg0) throws UnsupportedEncodingException {
        this.method8084(arg0);
    }

    public class495(byte[] arg0) throws UnsupportedEncodingException {
        this.method8095(arg0);
    }

    @ObfuscatedName("tj.aq(B)Lsb;")
    public class493 method8080() {
        return class493.field5043;
    }

    @ObfuscatedName("tj.ai([BI)V")
    public void method8095(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method8084(var2);
    }

    @ObfuscatedName("tj.ae(Ljava/lang/String;I)V")
    public void method8084(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field5046 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field5046 = new JSONObject();
                this.field5046.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("tj.au(B)Lorg/json/JSONObject;")
    public JSONObject method8085() {
        return this.field5046;
    }

    @ObfuscatedName("tj.ad(I)[B")
    public byte[] method8076() throws UnsupportedEncodingException {
        return this.field5046 == null ? new byte[0] : this.field5046.toString().getBytes("UTF-8");
    }
}
