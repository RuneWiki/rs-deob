package deob;

@ObfuscatedName("ho")
public class class203 extends class541 {

	@ObfuscatedName("ho.aw")
	public static class321 field2212 = new class321(64);

	@ObfuscatedName("ho.at")
	public int field2214 = 0;

	@ObfuscatedName("ho.ac")
	public int field2216;

	@ObfuscatedName("ho.ap")
	public int field2213;

	@ObfuscatedName("ho.aq")
	public int field2215;

	@ObfuscatedName("ho.ao")
	public int field2218;

	@ObfuscatedName("iv.af(Lpx;I)V")
	public static void method4721(class413 arg0) {
		Statics.field2217 = arg0;
	}

	@ObfuscatedName("ho.aw(II)Lho;")
	public static class203 method4140(int arg0) {
		class203 var1 = (class203) field2212.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2217.method7692(1, arg0);
		class203 var3 = new class203();
		if (var2 != null) {
			var3.method4127(new class591(var2), arg0);
		}
		var3.method4142();
		field2212.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("ho.at(S)V")
	public void method4142() {
		this.method4129(this.field2214);
	}

	@ObfuscatedName("ho.ac(Lwb;II)V")
	public void method4127(class591 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method10339();
			if (var3 == 0) {
				return;
			}
			this.method4128(arg0, var3, arg1);
		}
	}

	@ObfuscatedName("ho.ap(Lwb;IIB)V")
	public void method4128(class591 arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			this.field2214 = arg0.method10419();
		}
	}

	@ObfuscatedName("ho.aq(II)V")
	public void method4129(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (double) (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var6 < var8) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		if (var6 > var10) {
			var10 = var6;
		}
		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}
			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}
		double var18 = var12 / 6.0D;
		this.field2213 = (int) (var14 * 256.0D);
		this.field2215 = (int) (var16 * 256.0D);
		if (this.field2213 < 0) {
			this.field2213 = 0;
		} else if (this.field2213 > 255) {
			this.field2213 = 255;
		}
		if (this.field2215 < 0) {
			this.field2215 = 0;
		} else if (this.field2215 > 255) {
			this.field2215 = 255;
		}
		if (var16 > 0.5D) {
			this.field2218 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			this.field2218 = (int) (var14 * var16 * 512.0D);
		}
		if (this.field2218 < 1) {
			this.field2218 = 1;
		}
		this.field2216 = (int) ((double) this.field2218 * var18);
	}
}
