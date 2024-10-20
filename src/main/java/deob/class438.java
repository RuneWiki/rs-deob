package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("qv")
public class class438 implements class437 {

    @ObfuscatedName("qv.an")
    public JSONObject field4709;

    public class438(JSONObject arg0) {
        this.field4709 = arg0;
    }

    public class438(String arg0) throws UnsupportedEncodingException {
        this.method7613(arg0);
    }

    public class438(byte[] arg0) throws UnsupportedEncodingException {
        this.method7606(arg0);
    }

    @ObfuscatedName("qv.af(I)Lqz;")
    public class436 method7604() {
        return class436.field4704;
    }

    @ObfuscatedName("qv.au([BI)V")
    public void method7606(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7613(var2);
    }

    @ObfuscatedName("qv.ab(Ljava/lang/String;B)V")
    public void method7613(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4709 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4709 = new JSONObject();
                this.field4709.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("qv.aq(I)Lorg/json/JSONObject;")
    public JSONObject method7608() {
        return this.field4709;
    }

    @ObfuscatedName("qv.an(I)[B")
    public byte[] method7602() throws UnsupportedEncodingException {
        return this.field4709 == null ? new byte[0] : this.field4709.toString().getBytes("UTF-8");
    }
}
