package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("kk")
public class class270 {

	@ObfuscatedName("kk.aw")
	public static final class270 field3181 = new class270();

	@ObfuscatedName("kk.at")
	public Map field3186 = new HashMap();

	@ObfuscatedName("kk.ac")
	public int field3184 = 0;

	@ObfuscatedName("kk.af(Lorg/json/JSONObject;ILel;I)V")
	public void method5649(JSONObject arg0, int arg1, class120 arg2) {
		this.field3186.clear();
		JSONObject var4;
		try {
			var4 = arg0;
			this.field3184 = arg1;
			arg0.getLong("lastfullsyncat");
			arg0.getLong("lastcardupdatedat");
		} catch (Exception var8) {
			return;
		}
		try {
			this.method5657(var4.getJSONArray("crmcomponents"), this.field3184, arg2);
		} catch (Exception var7) {
		}
	}

	@ObfuscatedName("kk.aw(Lorg/json/JSONArray;ILel;B)V")
	public void method5657(JSONArray arg0, int arg1, class120 arg2) throws JSONException {
		if (arg0 == null) {
			return;
		}
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			JSONObject var5 = arg0.getJSONObject(var4);
			if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
				String var6 = var5.getString("platform");
				if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
					class268 var7 = new class268();
					try {
						var7.method5602(var5, arg1, arg2);
					} catch (Exception var10) {
					}
					if (!var7.field3165.isEmpty()) {
						String var9 = var5.getString("location");
						this.field3186.put(var9, var7);
					}
				}
			}
		}
		this.field3186 = this.method5650();
		class335.method3987();
	}

	@ObfuscatedName("kk.at(I)Ljava/util/Map;")
	public Map method5650() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field3186.entrySet());
		boolean var3 = false;
		while (!var3) {
			var3 = true;
			for (int var4 = 0; var4 < var2.size() - 1; var4++) {
				if (((class268) ((Entry) var2.get(var4)).getValue()).method5608() > ((class268) ((Entry) var2.get(var4 + 1)).getValue()).method5608()) {
					Entry var5 = (Entry) var2.get(var4);
					var2.set(var4, var2.get(var4 + 1));
					var2.set(var4 + 1, var5);
					var3 = false;
				}
			}
		}
		Iterator var6 = var2.iterator();
		while (var6.hasNext()) {
			Entry var7 = (Entry) var6.next();
			var1.put(var7.getKey(), var7.getValue());
		}
		return var1;
	}

	@ObfuscatedName("kk.ac(Ljava/lang/String;I)Lkm;")
	public class268 method5651(String arg0) {
		return (class268) this.field3186.get(arg0);
	}
}
