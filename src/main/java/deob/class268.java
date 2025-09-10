package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("km")
public class class268 {

	@ObfuscatedName("km.aw")
	public ArrayList field3163 = new ArrayList();

	@ObfuscatedName("km.at")
	public ArrayList field3166 = new ArrayList();

	@ObfuscatedName("km.ac")
	public ArrayList field3164 = new ArrayList();

	@ObfuscatedName("km.ap")
	public String field3165 = null;

	@ObfuscatedName("km.aq")
	public float[] field3172 = new float[4];

	@ObfuscatedName("km.ao")
	public Map field3161 = new HashMap();

	@ObfuscatedName("km.as")
	public Map field3170 = new HashMap();

	@ObfuscatedName("km.al")
	public String field3169;

	@ObfuscatedName("km.au")
	public int field3167 = 0;

	@ObfuscatedName("gf.af(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
	public static float[] method3814(JSONObject arg0, String arg1) throws JSONException {
		float[] var2 = new float[4];
		try {
			JSONArray var3 = arg0.getJSONArray(arg1);
			var2[0] = (float) var3.optDouble(0, 0.0D);
			var2[1] = (float) var3.optDouble(1, 0.0D);
			var2[2] = (float) var3.optDouble(2, 1.0D);
			var2[3] = (float) var3.optDouble(3, 1.0D);
		} catch (JSONException var5) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}
		return var2;
	}

	@ObfuscatedName("hl.aw(Ljava/lang/String;I)I")
	public static int method4101(String arg0) {
		if (arg0.equals("centre")) {
			return 1;
		} else if (arg0.equals("bottom") || arg0.equals("right")) {
			return 2;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("km.at(I)Ljava/lang/String;")
	public String method5599() {
		return this.field3169;
	}

	@ObfuscatedName("km.ac(B)I")
	public int method5608() {
		return this.field3167;
	}

	@ObfuscatedName("km.ap(B)V")
	public void method5601() {
		this.field3165 = null;
		this.field3172[0] = 0.0F;
		this.field3172[1] = 0.0F;
		this.field3172[2] = 1.0F;
		this.field3172[3] = 1.0F;
		this.field3163.clear();
		this.field3166.clear();
		this.field3164.clear();
		this.field3161.clear();
		this.field3170.clear();
	}

	@ObfuscatedName("km.aq(Lorg/json/JSONObject;ILel;I)Z")
	public boolean method5602(JSONObject arg0, int arg1, class120 arg2) {
		JSONObject var4 = arg0;
		if (arg1 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var21) {
				this.method5601();
				return false;
			}
			try {
				this.method5603(var4.getJSONArray("images"), arg2);
			} catch (Exception var20) {
				this.field3166.clear();
			}
			try {
				this.method5605(var4.getJSONArray("labels"));
			} catch (Exception var19) {
				this.field3164.clear();
			}
		} else {
			try {
				this.method5625(var4.getJSONObject("image"), arg2);
			} catch (Exception var18) {
				this.field3166.clear();
			}
			try {
				this.method5600(var4.getJSONObject("label"));
			} catch (Exception var17) {
				this.field3164.clear();
			}
		}
		try {
			this.method5607(var4.getJSONObject("behaviour"));
		} catch (Exception var16) {
			this.field3165 = null;
			this.field3172[0] = 0.0F;
			this.field3172[1] = 0.0F;
			this.field3172[2] = 1.0F;
			this.field3172[3] = 1.0F;
			this.field3163.clear();
		}
		try {
			JSONObject var11 = var4.optJSONObject("meta");
			if (var11 != null) {
				this.method5632(var4.getJSONObject("meta"));
			}
		} catch (Exception var15) {
			this.field3161.clear();
			this.field3170.clear();
		}
		if (arg1 == 2) {
			try {
				this.field3169 = var4.getString("id");
				this.field3167 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var14) {
			}
		}
		return true;
	}

	@ObfuscatedName("km.ao(Lorg/json/JSONArray;Lel;I)V")
	public void method5603(JSONArray arg0, class120 arg1) throws JSONException {
		if (arg0 == null) {
			return;
		}
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			try {
				JSONObject var4 = arg0.getJSONObject(var3);
				class258 var5 = new class258(this);
				var5.field3089 = arg1.method3354(new URL(var4.getString("src")));
				var5.field3087 = method3814(var4, "placement");
				this.field3166.add(var5);
			} catch (MalformedURLException var7) {
			}
		}
	}

	@ObfuscatedName("km.as(Lorg/json/JSONObject;Lel;I)V")
	public void method5625(JSONObject arg0, class120 arg1) throws JSONException {
		try {
			class258 var3 = new class258(this);
			var3.field3089 = arg1.method3354(new URL(arg0.getString("src")));
			var3.field3087 = method3814(arg0, "placement");
			this.field3166.add(var3);
		} catch (MalformedURLException var5) {
		}
	}

	@ObfuscatedName("km.al(Lorg/json/JSONArray;I)V")
	public void method5605(JSONArray arg0) throws JSONException {
		if (arg0 == null) {
			return;
		}
		for (int var2 = 0; var2 < arg0.length(); var2++) {
			JSONObject var3 = arg0.getJSONObject(var2);
			class269 var4 = new class269(this);
			var4.field3174 = var3.getString("text");
			var4.field3176 = method4101(var3.getString("align_x"));
			var4.field3177 = method4101(var3.getString("align_y"));
			var4.field3178 = var3.getInt("font");
			var4.field3179 = method3814(var3, "placement");
			this.field3164.add(var4);
		}
	}

	@ObfuscatedName("km.au(Lorg/json/JSONObject;B)V")
	public void method5600(JSONObject arg0) throws JSONException {
		class269 var2 = new class269(this);
		var2.field3174 = arg0.optString("text");
		var2.field3176 = method4101(arg0.optString("align_x"));
		var2.field3177 = method4101(arg0.optString("align_y"));
		var2.field3178 = arg0.optInt("font");
		var2.field3179 = method3814(arg0, "placement");
		this.field3164.add(var2);
	}

	@ObfuscatedName("km.ai(Lorg/json/JSONObject;I)V")
	public void method5607(JSONObject arg0) throws JSONException {
		if (arg0 == null) {
			return;
		}
		this.field3172 = method3814(arg0, "clickbounds");
		this.field3165 = arg0.getString("endpoint");
		String[] var2 = JSONObject.getNames(arg0);
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
				try {
					int var4 = arg0.getInt(var2[var3]);
					this.field3163.add(new class256(this, var2[var3], var4));
				} catch (Exception var9) {
					try {
						String var6 = arg0.getString(var2[var3]);
						if (var6.equals("true")) {
							this.field3163.add(new class256(this, var2[var3], 1));
						} else if (var6.equals("false")) {
							this.field3163.add(new class256(this, var2[var3], 0));
						} else {
							this.field3163.add(new class265(this, var2[var3], var6));
						}
					} catch (Exception var8) {
					}
				}
			}
		}
	}

	@ObfuscatedName("km.aa(Lorg/json/JSONObject;I)V")
	public void method5632(JSONObject arg0) throws JSONException {
		String[] var2 = JSONObject.getNames(arg0);
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			try {
				int var4 = arg0.optInt(var2[var3]);
				this.field3161.put(var2[var3], var4);
			} catch (Exception var9) {
				try {
					String var6 = arg0.optString(var2[var3]);
					if (var6.equals("true")) {
						this.field3161.put(var2[var3], 1);
					} else if (var6.equals("false")) {
						this.field3161.put(var2[var3], 0);
					} else {
						this.field3170.put(var2[var3], var6);
					}
				} catch (Exception var8) {
				}
			}
		}
	}
}
