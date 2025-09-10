package deob;

@ObfuscatedName("gt")
public class class178 extends class541 {

	@ObfuscatedName("gt.aw")
	public static class321 field1960 = new class321(64);

	@ObfuscatedName("gt.at")
	public int field1962 = 0;

	@ObfuscatedName("un.af(Lpx;I)V")
	public static void method9661(class413 arg0) {
		Statics.field1961 = arg0;
	}

	@ObfuscatedName("cf.aw(II)Lgt;")
	public static class178 method1954(int arg0) {
		class178 var1 = (class178) field1960.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field1961.method7692(5, arg0);
		class178 var3 = new class178();
		if (var2 != null) {
			var3.method3847(new class591(var2));
		}
		field1960.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("gt.at(Lwb;I)V")
	public void method3847(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method3857(arg0, var2);
		}
	}

	@ObfuscatedName("gt.ac(Lwb;IB)V")
	public void method3857(class591 arg0, int arg1) {
		if (arg1 == 2) {
			this.field1962 = arg0.method10341();
		}
	}
}
