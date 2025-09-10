package deob;

@ObfuscatedName("im")
public class class209 extends class541 {

	@ObfuscatedName("im.aw")
	public static class321 field2271 = new class321(64);

	@ObfuscatedName("im.at")
	public char field2272;

	@ObfuscatedName("im.ac")
	public int field2274;

	@ObfuscatedName("im.ap")
	public String field2270;

	@ObfuscatedName("im.aq")
	public boolean field2275 = true;

	@ObfuscatedName("dn.af(II)Lim;")
	public static class209 method2995(int arg0) {
		class209 var1 = (class209) field2271.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2276.method7692(11, arg0);
		class209 var3 = new class209();
		if (var2 != null) {
			var3.method4221(new class591(var2));
		}
		var3.method4220();
		field2271.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("hg.aw(I)V")
	public static void method3909() {
		field2271.method6456();
	}

	@ObfuscatedName("im.at(I)V")
	public void method4220() {
	}

	@ObfuscatedName("im.ac(Lwb;I)V")
	public void method4221(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4238(arg0, var2);
		}
	}

	@ObfuscatedName("im.ap(Lwb;II)V")
	public void method4238(class591 arg0, int arg1) {
		if (arg1 == 1) {
			byte var3 = arg0.method10340();
			int var4 = var3 & 0xFF;
			if (var4 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var4, 16));
			}
			if (var4 >= 128 && var4 < 160) {
				char var5 = class444.field5143[var4 - 128];
				if (var5 == 0) {
					var5 = '?';
				}
				var4 = var5;
			}
			char var6 = (char) var4;
			this.field2272 = var6;
		} else if (arg1 == 2) {
			this.field2274 = arg0.method10345();
		} else if (arg1 == 4) {
			this.field2275 = false;
		} else if (arg1 == 5) {
			this.field2270 = arg0.method10350();
		}
	}

	@ObfuscatedName("im.aq(I)Z")
	public boolean method4223() {
		return this.field2272 == 's';
	}
}
