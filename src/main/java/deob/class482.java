package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("si")
public class class482 implements class481 {

    @ObfuscatedName("si.aw")
    public JSONObject field4881;

    public class482(JSONObject arg0) {
        this.field4881 = arg0;
    }

    public class482(String arg0) throws UnsupportedEncodingException {
        this.method7957(arg0);
    }

    public class482(byte[] arg0) throws UnsupportedEncodingException {
        this.method7952(arg0);
    }

    @ObfuscatedName("si.aq(B)Lsp;")
    public class480 method7947() {
        return class480.field4880;
    }

    @ObfuscatedName("si.aa([BB)V")
    public void method7952(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7957(var2);
    }

    @ObfuscatedName("si.az(Ljava/lang/String;B)V")
    public void method7957(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4881 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4881 = new JSONObject();
                this.field4881.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("si.ao(I)Lorg/json/JSONObject;")
    public JSONObject method7953() {
        return this.field4881;
    }

    @ObfuscatedName("si.aw(I)[B")
    public byte[] method7944() throws UnsupportedEncodingException {
        return this.field4881 == null ? new byte[0] : this.field4881.toString().getBytes("UTF-8");
    }
}
