package deob;

import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("uq")
public class class534 implements class533 {

	@ObfuscatedName("uq.aw")
	public JSONObject field5559;

	public class534(JSONObject arg0) {
		this.field5559 = arg0;
	}

	public class534(String arg0) throws UnsupportedEncodingException {
		this.method9707(arg0);
	}

	public class534(byte[] arg0) throws UnsupportedEncodingException {
		this.method9716(arg0);
	}

	@ObfuscatedName("uq.af(B)Luj;")
	public class532 method9706() {
		return class532.field5556;
	}

	@ObfuscatedName("uq.ao([BI)V")
	public void method9716(byte[] arg0) throws UnsupportedEncodingException {
		String var2 = new String(arg0, "UTF-8");
		this.method9707(var2);
	}

	@ObfuscatedName("uq.as(Ljava/lang/String;I)V")
	public void method9707(String arg0) throws UnsupportedEncodingException {
		try {
			if (arg0.charAt(0) == '{') {
				this.field5559 = new JSONObject(arg0);
			} else if (arg0.charAt(0) == '[') {
				JSONArray var2 = new JSONArray(arg0);
				this.field5559 = new JSONObject();
				this.field5559.put("arrayValues", (Object) var2);
			} else {
				throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
			}
		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	@ObfuscatedName("uq.al(I)Lorg/json/JSONObject;")
	public JSONObject method9709() {
		return this.field5559;
	}

	@ObfuscatedName("uq.aw(I)[B")
	public byte[] method9702() throws UnsupportedEncodingException {
		return this.field5559 == null ? new byte[0] : this.field5559.toString().getBytes("UTF-8");
	}
}
