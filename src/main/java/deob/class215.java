package deob;

@ObfuscatedName("iy")
public class class215 extends class541 {

	@ObfuscatedName("iy.as")
	public static class321 field2444 = new class321(64);

	@ObfuscatedName("iy.al")
	public int field2445 = 0;

	@ObfuscatedName("iy.au")
	public int field2446 = -1;

	@ObfuscatedName("iy.ai")
	public boolean field2440 = true;

	@ObfuscatedName("iy.aa")
	public int field2454 = -1;

	@ObfuscatedName("iy.am")
	public int field2449;

	@ObfuscatedName("iy.an")
	public int field2450;

	@ObfuscatedName("iy.ar")
	public int field2451;

	@ObfuscatedName("iy.ae")
	public int field2452;

	@ObfuscatedName("iy.ay")
	public int field2453;

	@ObfuscatedName("iy.ad")
	public int field2447;

	@ObfuscatedName("cl.af(Lpx;I)V")
	public static void method2122(class413 arg0) {
		Statics.field1978 = arg0;
	}

	@ObfuscatedName("client.aw(IB)Liy;")
	public static class215 method1260(int arg0) {
		class215 var1 = (class215) field2444.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field1978.method7692(4, arg0);
		class215 var3 = new class215();
		if (var2 != null) {
			var3.method4450(new class591(var2), arg0);
		}
		var3.method4436();
		field2444.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("iy.at(I)V")
	public void method4436() {
		if (this.field2454 != -1) {
			this.method4439(this.field2454);
			this.field2452 = this.field2449;
			this.field2453 = this.field2450;
			this.field2447 = this.field2451;
		}
		this.method4439(this.field2445);
	}

	@ObfuscatedName("iy.ac(Lwb;II)V")
	public void method4450(class591 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method10339();
			if (var3 == 0) {
				return;
			}
			this.method4435(arg0, var3, arg1);
		}
	}

	@ObfuscatedName("iy.ap(Lwb;IIB)V")
	public void method4435(class591 arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			this.field2445 = arg0.method10419();
		} else if (arg1 == 2) {
			this.field2446 = arg0.method10339();
		} else if (arg1 == 5) {
			this.field2440 = false;
		} else if (arg1 == 7) {
			this.field2454 = arg0.method10419();
		} else if (arg1 != 8 && arg1 == 9) {
			arg0.method10339();
		}
	}

	@ObfuscatedName("iy.aq(IB)V")
	public void method4439(int arg0) {
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
		this.field2449 = (int) (var18 * 256.0D);
		this.field2450 = (int) (var14 * 256.0D);
		this.field2451 = (int) (var16 * 256.0D);
		if (this.field2450 < 0) {
			this.field2450 = 0;
		} else if (this.field2450 > 255) {
			this.field2450 = 255;
		}
		if (this.field2451 < 0) {
			this.field2451 = 0;
		} else if (this.field2451 > 255) {
			this.field2451 = 255;
		}
	}
}
