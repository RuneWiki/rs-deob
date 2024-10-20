package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("tb")
public class class498 implements class497 {

    @ObfuscatedName("tb.ae")
    public JSONObject field5091;

    public class498(JSONObject arg0) {
        this.field5091 = arg0;
    }

    public class498(String arg0) throws UnsupportedEncodingException {
        this.method8320(arg0);
    }

    public class498(byte[] arg0) throws UnsupportedEncodingException {
        this.method8319(arg0);
    }

    @ObfuscatedName("tb.ac(I)Lte;")
    public class496 method8312() {
        return class496.field5088;
    }

    @ObfuscatedName("tb.at([BI)V")
    public void method8319(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method8320(var2);
    }

    @ObfuscatedName("tb.au(Ljava/lang/String;I)V")
    public void method8320(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field5091 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field5091 = new JSONObject();
                this.field5091.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("tb.ar(I)Lorg/json/JSONObject;")
    public JSONObject method8321() {
        return this.field5091;
    }

    @ObfuscatedName("tb.ae(I)[B")
    public byte[] method8311() throws UnsupportedEncodingException {
        return this.field5091 == null ? new byte[0] : this.field5091.toString().getBytes("UTF-8");
    }
}
