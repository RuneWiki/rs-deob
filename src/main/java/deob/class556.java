package deob;

import java.util.HashMap;

@ObfuscatedName("vc")
public class class556 {

	@ObfuscatedName("vc.af")
	public class413 field5739;

	@ObfuscatedName("vc.aw")
	public class413 field5740;

	@ObfuscatedName("vc.at")
	public HashMap field5741;

	public class556(class413 arg0, class413 arg1) {
		this.field5739 = arg0;
		this.field5740 = arg1;
		this.field5741 = new HashMap();
	}

	@ObfuscatedName("vc.af([Lvf;I)Ljava/util/HashMap;")
	public HashMap method10022(class557[] arg0) {
		HashMap var2 = new HashMap();
		class557[] var3 = arg0;
		for (int var4 = 0; var4 < var3.length; var4++) {
			class557 var5 = var3[var4];
			if (this.field5741.containsKey(var5)) {
				var2.put(var5, this.field5741.get(var5));
			} else {
				class413 var6 = this.field5739;
				class413 var7 = this.field5740;
				String var8 = var5.field5754;
				class462 var9;
				if (var6.method7710(var8, "")) {
					int var10 = var6.method7715(var8);
					int var11 = var6.method7709(var10, "");
					class462 var12;
					if (class607.method10276(var6, var10, var11)) {
						byte[] var13 = var7.method7692(var10, var11);
						class462 var14;
						if (var13 == null) {
							var14 = null;
						} else {
							class462 var15 = new class462(var13, Statics.field1764, Statics.field2083, Statics.field3069, Statics.field5391, Statics.field5415, Statics.field26);
							class607.method7573();
							var14 = var15;
						}
						var12 = var14;
					} else {
						var12 = null;
					}
					var9 = var12;
				} else {
					var9 = null;
				}
				if (var9 != null) {
					this.field5741.put(var5, var9);
					var2.put(var5, var9);
				}
			}
		}
		return var2;
	}
}
