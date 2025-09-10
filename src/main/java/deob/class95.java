package deob;

@ObfuscatedName("dl")
public class class95 {

	@ObfuscatedName("dl.af")
	public int field1321;

	@ObfuscatedName("dl.aw")
	public int field1318;

	@ObfuscatedName("dl.at")
	public class110 field1316;

	@ObfuscatedName("dl.ac")
	public static class116 field1317 = new class116();

	@ObfuscatedName("dl.ap")
	public final class117[] field1314 = new class117[10];

	@ObfuscatedName("dl.aq")
	public int field1315;

	@ObfuscatedName("dl.ao")
	public int field1320;

	public class95(class591 arg0, int arg1, class110 arg2) {
		this.field1318 = arg1;
		this.field1316 = arg2;
		if (arg1 == 0) {
			this.method2937(arg0);
		} else if (arg1 == 1) {
			arg2.method3260(arg0);
		} else {
			throw new RuntimeException("Invalid fileId for SFX");
		}
	}

	@ObfuscatedName("dl.af(Lwb;)V")
	public void method2937(class591 arg0) {
		this.field1321 = 22050;
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method10339();
			if (var3 != 0) {
				arg0.field5920--;
				this.field1314[var2] = new class117();
				this.field1314[var2].method3339(arg0);
			}
		}
		this.field1315 = arg0.method10341();
		this.field1320 = arg0.method10341();
	}

	@ObfuscatedName("dl.aw(Lpx;II)Ldl;")
	public static class95 method2928(class413 arg0, int arg1, int arg2) {
		class110 var3 = new class110(field1317);
		byte[] var4 = arg0.method7692(arg1, arg2);
		if (var4 == null) {
			return null;
		}
		class591 var5 = new class591(var4);
		if (arg2 == 1) {
			if (var4.length < 4) {
				return null;
			}
			int var6 = var5.method10345();
			var3.method3262(var4, 4);
			var5.field5920 = var6 + 4;
		} else if (arg2 == 0) {
			var5 = new class591(var4);
		} else {
			return null;
		}
		return new class95(var5, arg2, var3);
	}

	@ObfuscatedName("dl.at(Z)Ldv;")
	public class96 method2935(boolean arg0) {
		short[] var2 = this.method2933(arg0);
		return new class96(this.field1321, var2, this.field1321 * this.field1315 / 1000, this.field1321 * this.field1320 / 1000, false, arg0);
	}

	@ObfuscatedName("dl.ac()Ldv;")
	public class96 method2930() {
		return this.field1318 == 0 ? this.method2935(false) : this.field1316.method3259();
	}

	@ObfuscatedName("dl.ap(Z)Ldv;")
	public class96 method2945(boolean arg0) {
		return this.field1318 == 0 ? this.method2935(arg0) : this.field1316.method3259();
	}

	@ObfuscatedName("dl.aq()I")
	public final int method2929() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field1314[var2] != null && this.field1314[var2].field1532 / 20 < var1) {
				var1 = this.field1314[var2].field1532 / 20;
			}
		}
		if (this.field1315 < this.field1320 && this.field1315 / 20 < var1) {
			var1 = this.field1315 / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field1314[var3] != null) {
				this.field1314[var3].field1532 -= var1 * 20;
			}
		}
		if (this.field1315 < this.field1320) {
			this.field1315 -= var1 * 20;
			this.field1320 -= var1 * 20;
		}
		return var1;
	}

	@ObfuscatedName("dl.ao(Z)[S")
	public final short[] method2933(boolean arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field1314[var3] != null && this.field1314[var3].field1541 + this.field1314[var3].field1532 > var2) {
				var2 = this.field1314[var3].field1541 + this.field1314[var3].field1532;
			}
		}
		if (var2 == 0) {
			return new short[0];
		}
		int var4 = this.field1321 * var2 / 1000;
		short[] var5 = new short[var4];
		for (int var6 = 0; var6 < 10; var6++) {
			if (this.field1314[var6] != null) {
				int var7 = this.field1314[var6].field1541 * this.field1321 / 1000;
				int var8 = this.field1314[var6].field1532 * this.field1321 / 1000;
				int[] var9 = this.field1314[var6].method3337(var7, this.field1314[var6].field1541, this.field1321);
				if (arg0) {
					for (int var10 = 0; var10 < var7; var10++) {
						int var11 = (var9[var10] >> 8) + var5[var8 + var10];
						int var12 = class337.method9399(-128, 127, var11);
						var5[var8 + var10] = (short) var12;
					}
				} else {
					for (int var13 = 0; var13 < var7; var13++) {
						int var14 = var9[var13] + var5[var8 + var13];
						int var15 = class337.method9399(-32768, 32767, var14);
						var5[var8 + var13] = (short) var15;
					}
				}
			}
		}
		return var5;
	}
}
