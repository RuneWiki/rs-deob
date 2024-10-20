package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("td")
public class class496 implements class495 {

    @ObfuscatedName("td.ay")
    public JSONObject field5031;

    public class496(JSONObject arg0) {
        this.field5031 = arg0;
    }

    public class496(String arg0) throws UnsupportedEncodingException {
        this.method8181(arg0);
    }

    public class496(byte[] arg0) throws UnsupportedEncodingException {
        this.method8179(arg0);
    }

    @ObfuscatedName("td.ab(I)Lsw;")
    public class494 method8173() {
        return class494.field5027;
    }

    @ObfuscatedName("td.am([BI)V")
    public void method8179(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method8181(var2);
    }

    @ObfuscatedName("td.ac(Ljava/lang/String;B)V")
    public void method8181(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field5031 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field5031 = new JSONObject();
                this.field5031.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("td.ae(B)Lorg/json/JSONObject;")
    public JSONObject method8182() {
        return this.field5031;
    }

    @ObfuscatedName("td.ay(I)[B")
    public byte[] method8177() throws UnsupportedEncodingException {
        return this.field5031 == null ? new byte[0] : this.field5031.toString().getBytes("UTF-8");
    }
}
