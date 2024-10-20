package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ts")
public class class505 implements class504 {

    @ObfuscatedName("ts.aw")
    public JSONObject field5135;

    public class505(JSONObject arg0) {
        this.field5135 = arg0;
    }

    public class505(String arg0) throws UnsupportedEncodingException {
        this.method8625(arg0);
    }

    public class505(byte[] arg0) throws UnsupportedEncodingException {
        this.method8615(arg0);
    }

    @ObfuscatedName("ts.ap(I)Ltz;")
    public class503 method8610() {
        return class503.field5133;
    }

    @ObfuscatedName("ts.au([BB)V")
    public void method8615(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method8625(var2);
    }

    @ObfuscatedName("ts.an(Ljava/lang/String;I)V")
    public void method8625(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field5135 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field5135 = new JSONObject();
                this.field5135.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("ts.ao(I)Lorg/json/JSONObject;")
    public JSONObject method8618() {
        return this.field5135;
    }

    @ObfuscatedName("ts.aw(B)[B")
    public byte[] method8609() throws UnsupportedEncodingException {
        return this.field5135 == null ? new byte[0] : this.field5135.toString().getBytes("UTF-8");
    }
}
