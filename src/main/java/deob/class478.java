package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("si")
public class class478 implements class477 {

    @ObfuscatedName("si.al")
    public JSONObject field4822;

    public class478(JSONObject arg0) {
        this.field4822 = arg0;
    }

    public class478(String arg0) throws UnsupportedEncodingException {
        this.method7726(arg0);
    }

    public class478(byte[] arg0) throws UnsupportedEncodingException {
        this.method7725(arg0);
    }

    @ObfuscatedName("si.ac(B)Lst;")
    public class476 method7722() {
        return class476.field4819;
    }

    @ObfuscatedName("si.am([BI)V")
    public void method7725(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7726(var2);
    }

    @ObfuscatedName("si.av(Ljava/lang/String;I)V")
    public void method7726(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4822 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4822 = new JSONObject();
                this.field4822.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("si.ag(S)Lorg/json/JSONObject;")
    public JSONObject method7727() {
        return this.field4822;
    }

    @ObfuscatedName("si.al(B)[B")
    public byte[] method7718() throws UnsupportedEncodingException {
        return this.field4822 == null ? new byte[0] : this.field4822.toString().getBytes("UTF-8");
    }
}
