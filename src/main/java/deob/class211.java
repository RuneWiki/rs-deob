package deob;

@ObfuscatedName("ia")
public class class211 extends class541 {

	@ObfuscatedName("ia.al")
	public static class321 field2291 = new class321(64);

	@ObfuscatedName("ia.au")
	public static class321 field2286 = new class321(64);

	@ObfuscatedName("ia.ai")
	public static class321 field2287 = new class321(20);

	@ObfuscatedName("ia.aa")
	public int field2282 = -1;

	@ObfuscatedName("ia.am")
	public int field2289 = 16777215;

	@ObfuscatedName("ia.an")
	public int field2290 = 70;

	@ObfuscatedName("ia.ar")
	public int field2284 = -1;

	@ObfuscatedName("ia.ae")
	public int field2292 = -1;

	@ObfuscatedName("ia.ay")
	public int field2300 = -1;

	@ObfuscatedName("ia.ad")
	public int field2294 = -1;

	@ObfuscatedName("ia.ag")
	public int field2295 = 0;

	@ObfuscatedName("ia.av")
	public int field2296 = 0;

	@ObfuscatedName("ia.ah")
	public int field2293 = -1;

	@ObfuscatedName("ia.ab")
	public String field2281 = "";

	@ObfuscatedName("ia.ax")
	public int field2299 = -1;

	@ObfuscatedName("ia.ak")
	public int field2298 = 0;

	@ObfuscatedName("ia.aj")
	public int[] field2301;

	@ObfuscatedName("ia.az")
	public int field2302 = -1;

	@ObfuscatedName("ia.bt")
	public int field2285 = -1;

	@ObfuscatedName("nz.af(IB)Lia;")
	public static class211 method6536(int arg0) {
		class211 var1 = (class211) field2291.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field278.method7692(32, arg0);
		class211 var3 = new class211();
		if (var2 != null) {
			var3.method4268(new class591(var2));
		}
		field2291.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("ia.aw(Lwb;B)V")
	public void method4268(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4269(arg0, var2);
		}
	}

	@ObfuscatedName("ia.at(Lwb;IB)V")
	public void method4269(class591 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2282 = arg0.method10365();
		} else if (arg1 == 2) {
			this.field2289 = arg0.method10419();
		} else if (arg1 == 3) {
			this.field2284 = arg0.method10365();
		} else if (arg1 == 4) {
			this.field2300 = arg0.method10365();
		} else if (arg1 == 5) {
			this.field2292 = arg0.method10365();
		} else if (arg1 == 6) {
			this.field2294 = arg0.method10365();
		} else if (arg1 == 7) {
			this.field2295 = arg0.method10593();
		} else if (arg1 == 8) {
			this.field2281 = arg0.method10502();
		} else if (arg1 == 9) {
			this.field2290 = arg0.method10341();
		} else if (arg1 == 10) {
			this.field2296 = arg0.method10593();
		} else if (arg1 == 11) {
			this.field2293 = 0;
		} else if (arg1 == 12) {
			this.field2299 = arg0.method10339();
		} else if (arg1 == 13) {
			this.field2298 = arg0.method10593();
		} else if (arg1 == 14) {
			this.field2293 = arg0.method10341();
		} else if (arg1 == 17 || arg1 == 18) {
			this.field2302 = arg0.method10341();
			if (this.field2302 == 65535) {
				this.field2302 = -1;
			}
			this.field2285 = arg0.method10341();
			if (this.field2285 == 65535) {
				this.field2285 = -1;
			}
			int var3 = -1;
			if (arg1 == 18) {
				var3 = arg0.method10341();
				if (var3 == 65535) {
					var3 = -1;
				}
			}
			int var4 = arg0.method10339();
			this.field2301 = new int[var4 + 2];
			for (int var5 = 0; var5 <= var4; var5++) {
				this.field2301[var5] = arg0.method10341();
				if (this.field2301[var5] == 65535) {
					this.field2301[var5] = -1;
				}
			}
			this.field2301[var4 + 1] = var3;
		}
	}

	@ObfuscatedName("ia.ac(I)Lia;")
	public final class211 method4283() {
		int var1 = -1;
		if (this.field2302 != -1) {
			var1 = class356.method5877(this.field2302);
		} else if (this.field2285 != -1) {
			var1 = Statics.field4023[this.field2285];
		}
		int var2;
		if (var1 >= 0 && var1 < this.field2301.length - 1) {
			var2 = this.field2301[var1];
		} else {
			var2 = this.field2301[this.field2301.length - 1];
		}
		return var2 == -1 ? null : method6536(var2);
	}

	@ObfuscatedName("ia.ap(IB)Ljava/lang/String;")
	public String method4267(int arg0) {
		String var2 = this.field2281;
		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}
			var2 = var2.substring(0, var3) + class446.method5409(arg0, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ia.aq(I)Lxt;")
	public class606 method4272() {
		if (this.field2284 < 0) {
			return null;
		}
		class606 var1 = (class606) field2286.method6463((long) this.field2284);
		if (var1 != null) {
			return var1;
		}
		class606 var2 = class607.method3059(Statics.field2288, this.field2284, 0);
		if (var2 != null) {
			field2286.method6454(var2, (long) this.field2284);
		}
		return var2;
	}

	@ObfuscatedName("ia.ao(I)Lxt;")
	public class606 method4273() {
		if (this.field2292 < 0) {
			return null;
		}
		class606 var1 = (class606) field2286.method6463((long) this.field2292);
		if (var1 != null) {
			return var1;
		}
		class606 var2 = class607.method3059(Statics.field2288, this.field2292, 0);
		if (var2 != null) {
			field2286.method6454(var2, (long) this.field2292);
		}
		return var2;
	}

	@ObfuscatedName("ia.as(B)Lxt;")
	public class606 method4274() {
		if (this.field2300 < 0) {
			return null;
		}
		class606 var1 = (class606) field2286.method6463((long) this.field2300);
		if (var1 != null) {
			return var1;
		}
		class606 var2 = class607.method3059(Statics.field2288, this.field2300, 0);
		if (var2 != null) {
			field2286.method6454(var2, (long) this.field2300);
		}
		return var2;
	}

	@ObfuscatedName("ia.al(I)Lxt;")
	public class606 method4275() {
		if (this.field2294 < 0) {
			return null;
		}
		class606 var1 = (class606) field2286.method6463((long) this.field2294);
		if (var1 != null) {
			return var1;
		}
		class606 var2 = class607.method3059(Statics.field2288, this.field2294, 0);
		if (var2 != null) {
			field2286.method6454(var2, (long) this.field2294);
		}
		return var2;
	}

	@ObfuscatedName("ia.au(B)Lrv;")
	public class462 method4276() {
		if (this.field2282 == -1) {
			return null;
		}
		class462 var1 = (class462) field2287.method6463((long) this.field2282);
		if (var1 != null) {
			return var1;
		}
		class413 var2 = Statics.field2288;
		class413 var3 = Statics.field1281;
		int var4 = this.field2282;
		class462 var5;
		if (class607.method10276(var2, var4, 0)) {
			byte[] var6 = var3.method7692(var4, 0);
			class462 var7;
			if (var6 == null) {
				var7 = null;
			} else {
				class462 var8 = new class462(var6, Statics.field1764, Statics.field2083, Statics.field3069, Statics.field5391, Statics.field5415, Statics.field26);
				class607.method7573();
				var7 = var8;
			}
			var5 = var7;
		} else {
			var5 = null;
		}
		if (var5 != null) {
			field2287.method6454(var5, (long) this.field2282);
		}
		return var5;
	}
}
