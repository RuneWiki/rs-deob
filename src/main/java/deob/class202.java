package deob;

@ObfuscatedName("hn")
public class class202 extends class541 {

	@ObfuscatedName("hn.at")
	public static class321 field2195 = new class321(64);

	@ObfuscatedName("hn.ac")
	public static class321 field2197 = new class321(30);

	@ObfuscatedName("hn.ap")
	public int field2206;

	@ObfuscatedName("hn.aq")
	public int field2198;

	@ObfuscatedName("hn.ao")
	public int field2199 = -1;

	@ObfuscatedName("hn.as")
	public short[] field2200;

	@ObfuscatedName("hn.al")
	public short[] field2201;

	@ObfuscatedName("hn.au")
	public short[] field2202;

	@ObfuscatedName("hn.ai")
	public short[] field2203;

	@ObfuscatedName("hn.aa")
	public int field2194 = 128;

	@ObfuscatedName("hn.am")
	public int field2205 = 128;

	@ObfuscatedName("hn.an")
	public int field2210 = 0;

	@ObfuscatedName("hn.ar")
	public int field2207 = 0;

	@ObfuscatedName("hn.ae")
	public int field2208 = 0;

	@ObfuscatedName("fa.af(Lpx;Lpx;B)V")
	public static void method3518(class413 arg0, class413 arg1) {
		Statics.field2204 = arg0;
		Statics.field2193 = arg1;
	}

	@ObfuscatedName("qy.aw(IB)Lhn;")
	public static class202 method8008(int arg0) {
		class202 var1 = (class202) field2195.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2204.method7692(13, arg0);
		class202 var3 = new class202();
		var3.field2206 = arg0;
		if (var2 != null) {
			var3.method4120(new class591(var2));
		}
		field2195.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("fm.at(B)V")
	public static void method3643() {
		field2195.method6456();
		field2197.method6456();
	}

	@ObfuscatedName("hn.ac(Lwb;B)V")
	public void method4120(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4105(arg0, var2);
		}
	}

	@ObfuscatedName("hn.ap(Lwb;II)V")
	public void method4105(class591 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2198 = arg0.method10341();
		} else if (arg1 == 2) {
			this.field2199 = arg0.method10341();
		} else if (arg1 == 4) {
			this.field2194 = arg0.method10341();
		} else if (arg1 == 5) {
			this.field2205 = arg0.method10341();
		} else if (arg1 == 6) {
			this.field2210 = arg0.method10341();
		} else if (arg1 == 7) {
			this.field2207 = arg0.method10339();
		} else if (arg1 == 8) {
			this.field2208 = arg0.method10339();
		} else if (arg1 == 40) {
			int var3 = arg0.method10339();
			this.field2200 = new short[var3];
			this.field2201 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2200[var4] = (short) arg0.method10341();
				this.field2201[var4] = (short) arg0.method10341();
			}
		} else if (arg1 == 41) {
			int var5 = arg0.method10339();
			this.field2202 = new short[var5];
			this.field2203 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field2202[var6] = (short) arg0.method10341();
				this.field2203[var6] = (short) arg0.method10341();
			}
		}
	}

	@ObfuscatedName("hn.aq(IB)Ljn;")
	public final class242 method4106(int arg0) {
		class242 var2 = this.method4104();
		if (var2 == null) {
			return null;
		}
		class242 var3;
		if (this.field2199 == -1 || arg0 == -1) {
			var3 = var2.method5255(true);
		} else {
			var3 = class216.method3858(this.field2199).method4463(var2, arg0);
		}
		if (this.field2194 != 128 || this.field2205 != 128) {
			var3.method5144(this.field2194, this.field2205, this.field2194);
		}
		if (this.field2210 != 0) {
			if (this.field2210 == 90) {
				var3.method5213();
			}
			if (this.field2210 == 180) {
				var3.method5213();
				var3.method5213();
			}
			if (this.field2210 == 270) {
				var3.method5213();
				var3.method5213();
				var3.method5213();
			}
		}
		return var3;
	}

	@ObfuscatedName("hn.ao(B)Ljn;")
	public final class242 method4104() {
		class242 var1 = (class242) field2197.method6463((long) this.field2206);
		if (var1 == null) {
			class220 var2 = class220.method4529(Statics.field2193, this.field2198, 0);
			if (var2 == null) {
				return null;
			}
			if (this.field2200 != null) {
				for (int var3 = 0; var3 < this.field2200.length; var3++) {
					var2.method4543(this.field2200[var3], this.field2201[var3]);
				}
			}
			if (this.field2202 != null) {
				for (int var4 = 0; var4 < this.field2202.length; var4++) {
					var2.method4548(this.field2202[var4], this.field2203[var4]);
				}
			}
			var1 = var2.method4553(this.field2207 + 64, this.field2208 + 850, -30, -50, -30);
			field2197.method6454(var1, (long) this.field2206);
		}
		return var1;
	}
}
