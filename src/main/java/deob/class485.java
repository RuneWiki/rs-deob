package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("sv")
public class class485 {

	@ObfuscatedName("sv.ac")
	public final Map field5341 = new HashMap();

	@ObfuscatedName("sv.ap")
	public final Map field5342 = new HashMap();

	@ObfuscatedName("sv.aq")
	public final DecimalFormat field5338 = new DecimalFormat();

	public class485() {
		this.field5338.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("sv.af(Ljavax/net/ssl/HttpsURLConnection;I)V")
	public void method9056(HttpsURLConnection arg0) {
		Iterator var2 = this.field5341.entrySet().iterator();
		while (var2.hasNext()) {
			Entry var3 = (Entry) var2.next();
			arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
		}
	}

	@ObfuscatedName("sv.aw(I)Ljava/util/Map;")
	public Map method9057() {
		return this.field5341;
	}

	@ObfuscatedName("sv.at(Ljava/lang/String;Ljava/lang/String;B)V")
	public void method9058(String arg0, String arg1) {
		if (arg0 != null && !arg0.isEmpty()) {
			this.field5341.put(arg0, arg1 == null ? "" : arg1);
		}
	}

	@ObfuscatedName("sv.ac(Ljava/lang/String;I)V")
	public void method9059(String arg0) {
		if (arg0 != null && !arg0.isEmpty()) {
			this.field5341.remove(arg0);
		}
	}

	@ObfuscatedName("sv.ap(Lst;Ljava/lang/String;B)V")
	public void method9060(class484 arg0, String arg1) {
		String var3 = String.format("%s %s", arg0.method9052(), arg1);
		this.method9058("Authorization", var3);
	}

	@ObfuscatedName("sv.aq(Ljava/lang/String;I)V")
	public void method9067(String arg0) {
		this.method9060(class484.field5335, arg0);
	}

	@ObfuscatedName("sv.ao(Ljava/lang/String;I)V")
	public void method9061(String arg0) {
		this.method9060(class484.field5333, arg0);
	}

	@ObfuscatedName("sv.as(Luj;I)V")
	public void method9062(class532 arg0) {
		this.field5341.put("Content-Type", arg0.method9695());
	}

	@ObfuscatedName("sv.al(I)V")
	public void method9065() {
		this.field5341.remove("Content-Type");
	}

	@ObfuscatedName("sv.au(Luj;I)V")
	public void method9064(class532 arg0) {
		this.method9092(arg0, 1.0F);
	}

	@ObfuscatedName("sv.ai(Luj;FI)V")
	public void method9092(class532 arg0, float arg1) {
		this.field5342.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
		this.method9066();
	}

	@ObfuscatedName("sv.aa(I)V")
	public void method9066() {
		this.field5341.remove("Accept");
		if (!this.field5342.isEmpty()) {
			this.field5341.put("Accept", this.method9095());
		}
	}

	@ObfuscatedName("sv.am(I)Ljava/lang/String;")
	public String method9095() {
		ArrayList var1 = new ArrayList(this.field5342.entrySet());
		Collections.sort(var1, new class486(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();
		while (var3.hasNext()) {
			Entry var4 = (Entry) var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}
			var2.append(((class532) var4.getKey()).method9695());
			float var5 = (Float) var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.field5338.format((double) var5);
				var2.append(";q=").append(var6);
			}
		}
		return var2.toString();
	}
}
