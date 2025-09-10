package deob;

@ObfuscatedName("xn")
public class class607 {

	public class607() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("nu.af(Lpx;III)Lxc;")
	public static class605 method6735(class413 arg0, int arg1, int arg2) {
		return method10276(arg0, arg1, arg2) ? method8274() : null;
	}

	@ObfuscatedName("rs.aw(Lpx;III)[Lxt;")
	public static class606[] method8744(class413 arg0, int arg1, int arg2) {
		return method10276(arg0, arg1, arg2) ? method9444() : null;
	}

	@ObfuscatedName("di.at(Lpx;III)Lxt;")
	public static class606 method3059(class413 arg0, int arg1, int arg2) {
		if (!method10276(arg0, arg1, arg2)) {
			return null;
		}
		class606 var3 = new class606();
		var3.field6023 = Statics.field6026;
		var3.field6025 = Statics.field5848;
		var3.field6022 = Statics.field1764[0];
		var3.field6024 = Statics.field2083[0];
		var3.field6020 = Statics.field3069[0];
		var3.field6021 = Statics.field5391[0];
		int var4 = var3.field6021 * var3.field6020;
		byte[] var5 = Statics.field26[0];
		var3.field6019 = new int[var4];
		for (int var6 = 0; var6 < var4; var6++) {
			var3.field6019[var6] = Statics.field5415[var5[var6] & 0xFF];
		}
		method7573();
		return var3;
	}

	@ObfuscatedName("ga.ac(Lpx;Ljava/lang/String;Ljava/lang/String;I)[Lxc;")
	public static class605[] method3781(class413 arg0, String arg1, String arg2) {
		if (!arg0.method7710(arg1, arg2)) {
			return null;
		}
		int var3 = arg0.method7715(arg1);
		int var4 = arg0.method7709(var3, arg2);
		class605[] var5;
		if (method10276(arg0, var3, var4)) {
			class605[] var6 = new class605[Statics.field6027];
			for (int var7 = 0; var7 < Statics.field6027; var7++) {
				class605 var8 = var6[var7] = new class605();
				var8.field6006 = Statics.field6026;
				var8.field6009 = Statics.field5848;
				var8.field6010 = Statics.field1764[var7];
				var8.field6012 = Statics.field2083[var7];
				var8.field6008 = Statics.field3069[var7];
				var8.field6011 = Statics.field5391[var7];
				var8.field6007 = Statics.field5415;
				var8.field6013 = Statics.field26[var7];
			}
			method7573();
			var5 = var6;
		} else {
			var5 = null;
		}
		return var5;
	}

	@ObfuscatedName("ce.ap(Lpx;Ljava/lang/String;Ljava/lang/String;I)Lxc;")
	public static class605 method2059(class413 arg0, String arg1, String arg2) {
		if (arg0.method7710(arg1, arg2)) {
			int var3 = arg0.method7715(arg1);
			int var4 = arg0.method7709(var3, arg2);
			return method6735(arg0, var3, var4);
		} else {
			return null;
		}
	}

	@ObfuscatedName("tp.aq(Lpx;Ljava/lang/String;Ljava/lang/String;B)[Lxt;")
	public static class606[] method9230(class413 arg0, String arg1, String arg2) {
		if (arg0.method7710(arg1, arg2)) {
			int var3 = arg0.method7715(arg1);
			int var4 = arg0.method7709(var3, arg2);
			return method8744(arg0, var3, var4);
		} else {
			return null;
		}
	}

	@ObfuscatedName("rt.ao(B)Lxc;")
	public static class605 method8274() {
		class605 var0 = new class605();
		var0.field6006 = Statics.field6026;
		var0.field6009 = Statics.field5848;
		var0.field6010 = Statics.field1764[0];
		var0.field6012 = Statics.field2083[0];
		var0.field6008 = Statics.field3069[0];
		var0.field6011 = Statics.field5391[0];
		var0.field6007 = Statics.field5415;
		var0.field6013 = Statics.field26[0];
		method7573();
		return var0;
	}

	@ObfuscatedName("tf.as(I)[Lxt;")
	public static class606[] method9444() {
		class606[] var0 = new class606[Statics.field6027];
		for (int var1 = 0; var1 < Statics.field6027; var1++) {
			class606 var2 = var0[var1] = new class606();
			var2.field6023 = Statics.field6026;
			var2.field6025 = Statics.field5848;
			var2.field6022 = Statics.field1764[var1];
			var2.field6024 = Statics.field2083[var1];
			var2.field6020 = Statics.field3069[var1];
			var2.field6021 = Statics.field5391[var1];
			int var3 = var2.field6021 * var2.field6020;
			byte[] var4 = Statics.field26[var1];
			var2.field6019 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				int var6 = var4[var5] & 0xFF;
				var2.field6019[var5] = Statics.field5415[var6];
			}
		}
		method7573();
		return var0;
	}

	@ObfuscatedName("wk.al(Lpx;III)Z")
	public static boolean method10276(class413 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.method7692(arg1, arg2);
		if (var3 == null) {
			return false;
		} else {
			method5597(var3);
			return true;
		}
	}

	@ObfuscatedName("sq.au(Lpx;II)Z")
	public static boolean method9130(class413 arg0, int arg1) {
		byte[] var2 = arg0.method7775(arg1);
		if (var2 == null) {
			return false;
		} else {
			method5597(var2);
			return true;
		}
	}

	@ObfuscatedName("kd.ai([BB)V")
	public static void method5597(byte[] arg0) {
		class591 var1 = new class591(arg0);
		var1.field5920 = arg0.length - 2;
		Statics.field6027 = var1.method10341();
		Statics.field1764 = new int[Statics.field6027];
		Statics.field2083 = new int[Statics.field6027];
		Statics.field3069 = new int[Statics.field6027];
		Statics.field5391 = new int[Statics.field6027];
		Statics.field26 = new byte[Statics.field6027][];
		var1.field5920 = arg0.length - 7 - Statics.field6027 * 8;
		Statics.field6026 = var1.method10341();
		Statics.field5848 = var1.method10341();
		int var2 = (var1.method10339() & 0xFF) + 1;
		for (int var3 = 0; var3 < Statics.field6027; var3++) {
			Statics.field1764[var3] = var1.method10341();
		}
		for (int var4 = 0; var4 < Statics.field6027; var4++) {
			Statics.field2083[var4] = var1.method10341();
		}
		for (int var5 = 0; var5 < Statics.field6027; var5++) {
			Statics.field3069[var5] = var1.method10341();
		}
		for (int var6 = 0; var6 < Statics.field6027; var6++) {
			Statics.field5391[var6] = var1.method10341();
		}
		var1.field5920 = arg0.length - 7 - Statics.field6027 * 8 - (var2 - 1) * 3;
		Statics.field5415 = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			Statics.field5415[var7] = var1.method10419();
			if (Statics.field5415[var7] == 0) {
				Statics.field5415[var7] = 1;
			}
		}
		var1.field5920 = 0;
		for (int var8 = 0; var8 < Statics.field6027; var8++) {
			int var9 = Statics.field3069[var8];
			int var10 = Statics.field5391[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			Statics.field26[var8] = var12;
			int var13 = var1.method10339();
			boolean var14 = (var13 & 0x1) == 1;
			boolean var15 = (var13 & 0x2) == 2;
			if (var14) {
				for (int var17 = 0; var17 < var9; var17++) {
					for (int var18 = 0; var18 < var10; var18++) {
						var12[var9 * var18 + var17] = var1.method10340();
					}
				}
			} else {
				for (int var16 = 0; var16 < var11; var16++) {
					var12[var16] = var1.method10340();
				}
			}
			if (var15) {
				var1.field5920 += var11;
			}
		}
	}

	@ObfuscatedName("oy.aa(I)V")
	public static void method7573() {
		Statics.field1764 = null;
		Statics.field2083 = null;
		Statics.field3069 = null;
		Statics.field5391 = null;
		Statics.field5415 = null;
		Statics.field26 = null;
	}
}
