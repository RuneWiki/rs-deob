package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfuscatedName("jo")
public class class257 {

	@ObfuscatedName("jo.au")
	public class266 field3085;

	@ObfuscatedName("jo.ai")
	public class268 field3077;

	@ObfuscatedName("jo.aa")
	public int field3078 = -1;

	@ObfuscatedName("jo.am")
	public String field3082;

	@ObfuscatedName("jo.an")
	public String field3079;

	@ObfuscatedName("jo.ar")
	public String field3081;

	@ObfuscatedName("jo.ae")
	public class122 field3083;

	@ObfuscatedName("jo.ay")
	public int field3070 = 0;

	public class257() {
	}

	public class257(class257 arg0) {
		if (arg0 != null) {
			this.field3085 = arg0.field3085;
			this.field3077 = arg0.field3077;
			this.field3078 = arg0.field3078;
			this.field3082 = arg0.field3082;
			this.field3079 = arg0.field3079;
			this.field3081 = arg0.field3081;
			this.field3083 = null;
			this.field3070 = arg0.field3070;
		}
	}

	@ObfuscatedName("jo.af(I)Lkd;")
	public class266 method5432() {
		return this.field3085;
	}

	@ObfuscatedName("jo.aw(Ljava/lang/String;Ljava/lang/String;Lel;I)Z")
	public boolean method5488(String arg0, String arg1, class120 arg2) {
		if (arg0 == null || arg0.isEmpty()) {
			return false;
		} else if (arg2 == null) {
			return false;
		} else {
			this.method5451();
			try {
				this.field3082 = arg0;
				this.field3083 = arg2.method3354(new URL(this.field3082));
				this.field3078 = 0;
			} catch (MalformedURLException var5) {
				this.method5451();
				this.field3078 = 4;
				return false;
			}
			if (!arg1.isEmpty()) {
				this.field3081 = arg1;
			}
			return true;
		}
	}

	@ObfuscatedName("jo.at(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public void method5434(String arg0, String arg1, String arg2) {
		this.field3085 = class266.method5521();
		this.field3079 = arg0;
		this.field3085.method5567(this.field3079, arg1, arg2);
	}

	@ObfuscatedName("jo.ac(Lel;S)V")
	public void method5435(class120 arg0) {
		switch(this.field3078) {
			case 0:
				this.method5446(arg0);
				break;
			case 1:
				this.method5447();
				break;
			default:
				return;
		}
	}

	@ObfuscatedName("jo.ap(B)I")
	public int method5469() {
		return this.field3078;
	}

	@ObfuscatedName("jo.aq(B)Z")
	public boolean method5437() {
		return this.field3077 != null;
	}

	@ObfuscatedName("jo.ao(Ljava/lang/String;I)I")
	public int method5444(String arg0) {
		return this.field3077.field3161.containsKey(arg0) ? (Integer) this.field3077.field3161.get(arg0) : -1;
	}

	@ObfuscatedName("jo.as(Ljava/lang/String;I)Ljava/lang/String;")
	public String method5489(String arg0) {
		return (String) (this.field3077.field3170.containsKey(arg0) ? this.field3077.field3170.get(arg0) : null);
	}

	@ObfuscatedName("jo.al(B)Ljava/util/ArrayList;")
	public ArrayList method5440() {
		return this.field3077.field3166;
	}

	@ObfuscatedName("jo.au(B)Ljava/util/ArrayList;")
	public ArrayList method5433() {
		return this.field3077.field3164;
	}

	@ObfuscatedName("jo.ai(I)Ljava/util/ArrayList;")
	public ArrayList method5436() {
		return this.field3077.field3163;
	}

	@ObfuscatedName("jo.aa(B)Ljava/lang/String;")
	public String method5443() {
		return this.field3077.field3165;
	}

	@ObfuscatedName("jo.am(B)[F")
	public float[] method5460() {
		return this.field3077.field3172;
	}

	@ObfuscatedName("jo.an(I)Ljava/lang/String;")
	public String method5441() {
		return this.field3077.method5599();
	}

	@ObfuscatedName("jo.ar(I)V")
	public void method5451() {
		this.field3083 = null;
	}

	@ObfuscatedName("jo.ae(Lel;I)V")
	public void method5446(class120 arg0) {
		if (this.field3083 == null || !this.field3083.method3382()) {
			return;
		}
		byte[] var2 = this.field3083.method3383();
		if (var2 == null) {
			this.method5451();
			this.field3078 = 4;
			return;
		}
		try {
			class534 var3 = new class534(var2);
			JSONObject var4 = var3.method9709();
			if (var4 == null) {
				return;
			}
			try {
				this.field3070 = var4.getInt("version");
			} catch (Exception var9) {
				this.method5451();
				this.field3078 = 6;
				return;
			}
			if (this.field3070 < 2) {
				if (!this.field3077.method5602(var4, this.field3070, arg0)) {
					this.field3078 = 6;
				}
			} else if (this.field3070 == 2) {
				class270 var6 = class270.field3181;
				var6.method5649(var4, this.field3070, arg0);
				this.field3077 = var6.method5651(this.field3081);
				if (this.field3077 == null) {
					this.field3078 = 7;
				} else {
					this.method5447();
					this.field3078 = 1;
				}
			}
		} catch (UnsupportedEncodingException var10) {
			this.method5451();
			this.field3078 = 6;
			return;
		}
		if (this.field3077 != null) {
			this.field3078 = this.field3077.field3166.isEmpty() ? 2 : 1;
		}
		this.field3083 = null;
	}

	@ObfuscatedName("jo.ay(I)V")
	public void method5447() {
		Iterator var1 = this.field3077.field3166.iterator();
		class258 var2;
		do {
			if (!var1.hasNext()) {
				Iterator var3 = this.field3077.field3166.iterator();
				while (var3.hasNext()) {
					class258 var4 = (class258) var3.next();
					if (var4.field3089 != null) {
						byte[] var5 = var4.field3089.method3383();
						if (var5 != null && var5.length > 0) {
							this.field3078 = 2;
							return;
						}
					}
				}
				this.method5451();
				this.field3078 = 5;
				return;
			}
			var2 = (class258) var1.next();
		} while (var2.field3089 == null || var2.field3089.method3382());
	}

	@ObfuscatedName("jo.ad(Ljava/lang/String;Lel;I)Z")
	public boolean method5448(String arg0, class120 arg1) {
		try {
			JSONObject var3 = (new class534(arg0.getBytes())).method9709();
			try {
				this.field3070 = var3.getInt("version");
			} catch (Exception var6) {
				this.method5451();
				this.field3078 = 6;
				return false;
			}
			if (!this.field3077.method5602(var3, this.field3070, arg1)) {
				this.field3078 = 6;
			}
			this.field3078 = this.field3077.field3166.isEmpty() ? 2 : 1;
		} catch (UnsupportedEncodingException var7) {
			this.field3078 = 6;
		}
		return this.field3078 < 3;
	}
}
