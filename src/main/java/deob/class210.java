package deob;

@ObfuscatedName("il")
public class class210 extends class541 {

	@ObfuscatedName("il.aw")
	public static class321 field2278 = new class321(64);

	@ObfuscatedName("il.at")
	public class427 field2280;

	@ObfuscatedName("by.af(Lpx;I)V")
	public static void method725(class413 arg0) {
		Statics.field2279 = arg0;
	}

	@ObfuscatedName("gz.aw(II)Lil;")
	public static class210 method3679(int arg0) {
		class210 var1 = (class210) field2278.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2279.method7692(34, arg0);
		class210 var3 = new class210();
		if (var2 != null) {
			var3.method4243(new class591(var2));
		}
		var3.method4255();
		field2278.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("ca.at(I)V")
	public static void method2198() {
		field2278.method6456();
	}

	@ObfuscatedName("il.ac(I)V")
	public void method4255() {
	}

	@ObfuscatedName("il.ap(Lwb;B)V")
	public void method4243(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4244(arg0, var2);
		}
	}

	@ObfuscatedName("il.aq(Lwb;II)V")
	public void method4244(class591 arg0, int arg1) {
		if (arg1 == 249) {
			this.field2280 = class189.method3595(arg0, this.field2280);
		}
	}

	@ObfuscatedName("il.ao(III)I")
	public int method4245(int arg0, int arg1) {
		return class189.method9753(this.field2280, arg0, arg1);
	}

	@ObfuscatedName("il.as(ILjava/lang/String;B)Ljava/lang/String;")
	public String method4246(int arg0, String arg1) {
		return class189.method7632(this.field2280, arg0, arg1);
	}
}
