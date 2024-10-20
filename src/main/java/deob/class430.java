package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ps")
public class class430 implements class429 {

    @ObfuscatedName("ps.w")
    public JSONObject field4683;

    public class430(JSONObject arg0) {
        this.field4683 = arg0;
    }

    public class430(String arg0) throws UnsupportedEncodingException {
        this.method7410(arg0);
    }

    public class430(byte[] arg0) throws UnsupportedEncodingException {
        this.method7416(arg0);
    }

    @ObfuscatedName("ps.f(B)Lpf;")
    public class428 method7402() {
        return class428.field4681;
    }

    @ObfuscatedName("ps.i([BB)V")
    public void method7416(byte[] arg0) throws UnsupportedEncodingException {
        String var2 = new String(arg0, "UTF-8");
        this.method7410(var2);
    }

    @ObfuscatedName("ps.n(Ljava/lang/String;I)V")
    public void method7410(String arg0) throws UnsupportedEncodingException {
        try {
            if (arg0.charAt(0) == '{') {
                this.field4683 = new JSONObject(arg0);
            } else if (arg0.charAt(0) == '[') {
                JSONArray var2 = new JSONArray(arg0);
                this.field4683 = new JSONObject();
                this.field4683.put("arrayValues", (Object) var2);
            } else {
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    @ObfuscatedName("ps.l(B)Lorg/json/JSONObject;")
    public JSONObject method7411() {
        return this.field4683;
    }

    @ObfuscatedName("ps.w(B)[B")
    public byte[] method7401() throws UnsupportedEncodingException {
        return this.field4683 == null ? new byte[0] : this.field4683.toString().getBytes("UTF-8");
    }
}
