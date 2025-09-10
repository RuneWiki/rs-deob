package deob;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfuscatedName("kd")
public class class266 {

	@ObfuscatedName("kd.ap")
	public static final class266 field3134 = new class266();

	@ObfuscatedName("kd.aq")
	public final int field3149 = 1;

	@ObfuscatedName("kd.ao")
	public final int field3144 = 2;

	@ObfuscatedName("kd.as")
	public String field3152 = "";

	@ObfuscatedName("kd.al")
	public String field3141 = "";

	@ObfuscatedName("kd.au")
	public String field3142 = "";

	@ObfuscatedName("kd.ai")
	public String field3143 = "";

	@ObfuscatedName("kd.aa")
	public long field3138 = -1L;

	@ObfuscatedName("kd.am")
	public class15 field3145;

	@ObfuscatedName("kd.an")
	public class19 field3146;

	@ObfuscatedName("kd.ar")
	public int field3147 = 1;

	@ObfuscatedName("kd.ae")
	public int field3139 = 0;

	@ObfuscatedName("kd.ay")
	public String field3148;

	@ObfuscatedName("kd.ad")
	public boolean field3150;

	@ObfuscatedName("jv.af(B)Lkd;")
	public static class266 method5521() {
		return field3134;
	}

	@ObfuscatedName("kd.aw(ILjava/lang/String;I)V")
	public void method5565(int arg0, String arg1) {
		this.field3139 = arg0;
		this.field3148 = arg1;
	}

	@ObfuscatedName("kd.at(ZB)V")
	public void method5587(boolean arg0) {
		this.field3150 = arg0;
		this.field3145 = new class15("crmsession", 1, 1);
	}

	@ObfuscatedName("kd.ac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
	public void method5567(String arg0, String arg1, String arg2) {
		if (this.field3147 == 2) {
			return;
		}
		this.field3152 = arg0;
		this.field3141 = arg1;
		this.field3142 = arg2;
		if (!this.field3152.endsWith("/")) {
			this.field3152 = this.field3152 + "/";
		}
		if (this.field3141.equals("")) {
			return;
		}
		String var4 = this.field3152;
		String var5 = var4 + "session/open/" + this.field3141;
		if (this.field3142.equals("")) {
		}
		String var6 = var5 + "?userHash=" + this.field3142;
		try {
			this.field3146 = this.method5573(var6);
			this.field3138 = class335.method3987();
		} catch (IOException var8) {
			this.field3146 = null;
			this.field3141 = "";
			this.field3142 = "";
		}
	}

	@ObfuscatedName("kd.ap(I)V")
	public void method5568() {
		if (this.field3146 != null || (this.field3143.isEmpty() || this.field3147 != 1)) {
			return;
		}
		long var1 = class335.method3987();
		long var3 = var1 - this.field3138;
		String var5 = this.field3152;
		String var6 = var5 + "session/close/" + this.field3141 + "/" + this.field3143;
		String var7;
		if (this.field3142.isEmpty()) {
			var7 = var6 + "?sessionDuration=" + var3;
		} else {
			var7 = var6 + "?userHash=" + this.field3142 + "&sessionDuration=" + var3;
		}
		try {
			this.field3146 = this.method5573(var7);
		} catch (IOException var9) {
			this.field3147 = 1;
		}
	}

	@ObfuscatedName("kd.aq(I)V")
	public void method5569() {
		if (this.field3145 != null) {
			this.field3145.method172();
		}
	}

	@ObfuscatedName("kd.ao(B)V")
	public void method5570() {
		if (this.field3143.isEmpty()) {
			return;
		}
		String var1 = "";
		switch(this.field3139) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
		}
		if (this.field3148.isEmpty()) {
			return;
		}
		String var2 = this.field3152;
		String var3 = var2 + var1 + "/" + this.field3141 + "/" + this.field3143 + "/" + this.field3148 + "?userHash=" + this.field3142;
		try {
			this.field3146 = this.method5573(var3);
		} catch (IOException var5) {
			this.field3147 = 1;
		}
		this.field3147 = 1;
		this.field3139 = 0;
	}

	@ObfuscatedName("kd.as(I)V")
	public void method5571() {
		if (this.field3146 == null || !this.field3146.method272()) {
			return;
		}
		if (this.field3146.method272() && this.field3146.method275().method296() == 200 && this.field3143.isEmpty()) {
			String var1 = this.field3146.method275().method303();
			if (var1.isEmpty()) {
				return;
			}
			this.field3143 = var1;
		}
		if (this.field3139 != 0) {
			this.method5570();
		}
	}

	@ObfuscatedName("kd.al(Ljava/lang/String;I)Z")
	public boolean method5595(String arg0) {
		this.method5565(2, arg0);
		return true;
	}

	@ObfuscatedName("kd.au(Ljava/lang/String;I)Lag;")
	public class19 method5573(String arg0) throws IOException {
		URL var2 = new URL(arg0);
		class11 var3 = new class11(var2, class10.field35, this.field3150);
		try {
			JSONObject var4 = new JSONObject();
			var3.method82(new class534(var4));
		} catch (Exception var6) {
		}
		return this.field3145.method177(var3);
	}
}
