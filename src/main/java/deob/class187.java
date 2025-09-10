package deob;

@ObfuscatedName("hs")
public class class187 extends class541 {

	@ObfuscatedName("hs.ao")
	public static class321 field2034 = new class321(64);

	@ObfuscatedName("hs.as")
	public int[] field2027;

	@ObfuscatedName("hs.al")
	public short[] field2021;

	@ObfuscatedName("hs.au")
	public short[] field2029;

	@ObfuscatedName("hs.ai")
	public short[] field2030;

	@ObfuscatedName("hs.aa")
	public short[] field2031;

	@ObfuscatedName("hs.am")
	public int[] field2035 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("hs.an")
	public boolean field2033 = false;

	@ObfuscatedName("hs.ar")
	public int field2032 = -1;

	@ObfuscatedName("tv.af(Lpx;Lpx;I)V")
	public static void method9535(class413 arg0, class413 arg1) {
		Statics.field2024 = arg0;
		Statics.field2025 = arg1;
		Statics.field2023 = Statics.field2024.method7702(3);
	}

	@ObfuscatedName("uc.aw(II)Lhs;")
	public static class187 method9659(int arg0) {
		class187 var1 = (class187) field2034.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		} else if (Statics.field2024 == null) {
			return null;
		} else {
			byte[] var2 = Statics.field2024.method7692(3, arg0);
			class187 var3 = new class187();
			if (var2 != null) {
				var3.method3923(new class591(var2));
			}
			field2034.method6454(var3, (long) arg0);
			return var3;
		}
	}

	@ObfuscatedName("kv.at(I)V")
	public static void method5907() {
		Statics.field2024 = null;
		Statics.field2025 = null;
		Statics.field2023 = 0;
	}

	@ObfuscatedName("hs.ac(Lwb;I)V")
	public void method3923(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method3922(arg0, var2);
		}
	}

	@ObfuscatedName("hs.ap(Lwb;IB)V")
	public void method3922(class591 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2032 = arg0.method10339();
		} else if (arg1 == 2) {
			int var3 = arg0.method10339();
			this.field2027 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2027[var4] = arg0.method10341();
			}
		} else if (arg1 == 3) {
			this.field2033 = true;
		} else if (arg1 == 40) {
			int var5 = arg0.method10339();
			this.field2021 = new short[var5];
			this.field2029 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field2021[var6] = (short) arg0.method10341();
				this.field2029[var6] = (short) arg0.method10341();
			}
		} else if (arg1 == 41) {
			int var7 = arg0.method10339();
			this.field2030 = new short[var7];
			this.field2031 = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field2030[var8] = (short) arg0.method10341();
				this.field2031[var8] = (short) arg0.method10341();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.field2035[arg1 - 60] = arg0.method10341();
		}
	}

	@ObfuscatedName("hs.aq(III)Z")
	public boolean method3925(int arg0, int arg1) {
		if (arg1 == 1) {
			return this.field2032 == arg0 + 7;
		} else {
			return this.field2032 == arg0;
		}
	}

	@ObfuscatedName("hs.ao(B)Z")
	public boolean method3926() {
		if (this.field2027 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field2027.length; var2++) {
			if (!Statics.field2025.method7694(this.field2027[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("hs.as(I)Liu;")
	public class220 method3930() {
		if (this.field2027 == null) {
			return null;
		}
		class220[] var1 = new class220[this.field2027.length];
		for (int var2 = 0; var2 < this.field2027.length; var2++) {
			var1[var2] = class220.method4529(Statics.field2025, this.field2027[var2], 0);
		}
		class220 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class220(var1, var1.length);
		}
		if (this.field2021 != null) {
			for (int var4 = 0; var4 < this.field2021.length; var4++) {
				var3.method4543(this.field2021[var4], this.field2029[var4]);
			}
		}
		if (this.field2030 != null) {
			for (int var5 = 0; var5 < this.field2030.length; var5++) {
				var3.method4548(this.field2030[var5], this.field2031[var5]);
			}
		}
		return var3;
	}

	@ObfuscatedName("hs.al(B)Z")
	public boolean method3928() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.field2035[var2] != -1 && !Statics.field2025.method7694(this.field2035[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("hs.au(B)Liu;")
	public class220 method3931() {
		class220[] var1 = new class220[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.field2035[var3] != -1) {
				var1[var2++] = class220.method4529(Statics.field2025, this.field2035[var3], 0);
			}
		}
		class220 var4 = new class220(var1, var2);
		if (this.field2021 != null) {
			for (int var5 = 0; var5 < this.field2021.length; var5++) {
				var4.method4543(this.field2021[var5], this.field2029[var5]);
			}
		}
		if (this.field2030 != null) {
			for (int var6 = 0; var6 < this.field2030.length; var6++) {
				var4.method4548(this.field2030[var6], this.field2031[var6]);
			}
		}
		return var4;
	}
}
