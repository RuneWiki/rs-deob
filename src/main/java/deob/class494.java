package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("sv")
public class class494 implements class493 {

    @ObfuscatedName("sv.al")
    public JSONObject field5015;

    public class494(JSONObject arg0) {
        this.field5015 = arg0;
    }

    public class494(String arg0) throws UnsupportedEncodingException {
        this.method8147(arg0);
    }

    public class494(byte[] arg0) throws UnsupportedEncodingException {
        this.method8153(arg0);
    }

    @ObfuscatedName("sv.ak(B)Lsd;")
    public class492 method8141() {
        return class492.field5014;
    }

    @ObfuscatedName("sv.ac([BB)V")
    public void method8153(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method8147(var2);
    }

    @ObfuscatedName("sv.ao(Ljava/lang/String;I)V")
    public void method8147(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field5015 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field5015 = new JSONObject();
                this.field5015.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("sv.ah(I)Lorg/json/JSONObject;")
    public JSONObject method8150() {
        return this.field5015;
    }

    @ObfuscatedName("sv.al(B)[B")
    public byte[] method8140() throws UnsupportedEncodingException {
        return this.field5015 == null ? new byte[0] : this.field5015.toString().getBytes("UTF-8");
    }
}
