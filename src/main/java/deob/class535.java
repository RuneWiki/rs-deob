package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ur")
public class class535 implements class533 {

	@ObfuscatedName("ur.af")
	public final Map field5560;

	public class535(Map arg0) {
		this.field5560 = arg0;
	}

	@ObfuscatedName("ur.af(B)Luj;")
	public class532 method9706() {
		return null;
	}

	@ObfuscatedName("ur.aw(I)[B")
	public byte[] method9702() throws UnsupportedEncodingException {
		return this.method9718().getBytes("UTF-8");
	}

	@ObfuscatedName("ur.ao(I)Ljava/lang/String;")
	public String method9718() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.field5560.entrySet().iterator();
		while (var2.hasNext()) {
			Entry var3 = (Entry) var2.next();
			String var4 = URLEncoder.encode((String) var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String) var3.getValue(), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		}
		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}
}
