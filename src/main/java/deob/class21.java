package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("ah")
public class class21 {

	@ObfuscatedName("ah.af")
	public final int field86;

	@ObfuscatedName("ah.aw")
	public final String field84;

	@ObfuscatedName("ah.at")
	public final Map field85;

	@ObfuscatedName("ah.ac")
	public final String field87;

	public class21(HttpURLConnection arg0) throws IOException {
		this.field86 = arg0.getResponseCode();
		this.field84 = arg0.getResponseMessage();
		this.field85 = arg0.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field86 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);
			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}
			var3.close();
		}
		this.field87 = var2.toString();
	}

	public class21(String arg0) {
		this.field86 = 400;
		this.field84 = arg0;
		this.field85 = null;
		this.field87 = "";
	}

	@ObfuscatedName("ah.af(I)I")
	public int method296() {
		return this.field86;
	}

	@ObfuscatedName("ah.aw(B)Ljava/lang/String;")
	public String method297() {
		return this.field84;
	}

	@ObfuscatedName("ah.at(I)Ljava/util/Map;")
	public Map method295() {
		return this.field85;
	}

	@ObfuscatedName("ah.ac(I)Ljava/lang/String;")
	public String method303() {
		return this.field87;
	}
}
