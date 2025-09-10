package deob;

@ObfuscatedName("ws")
public class class578 extends class541 {

	@ObfuscatedName("ws.aw")
	public static class321 field5832 = new class321(64);

	@ObfuscatedName("ws.at")
	public int[][] field5830;

	@ObfuscatedName("ws.ac")
	public Object[][] field5829;

	@ObfuscatedName("ib.af(Lpx;B)V")
	public static void method4331(class413 arg0) {
		Statics.field5356 = arg0;
	}

	@ObfuscatedName("wv.aw(IB)Lws;")
	public static class578 method10172(int arg0) {
		class578 var1 = (class578) field5832.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field5356.method7692(39, arg0);
		class578 var3 = new class578();
		if (var2 != null) {
			var3.method10193(new class591(var2));
		}
		var3.method10194();
		field5832.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("ws.at(Lwb;I)V")
	public void method10193(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method10201(arg0, var2);
		}
	}

	@ObfuscatedName("ws.ac(Lwb;IB)V")
	public void method10201(class591 arg0, int arg1) {
		if (arg1 != 1) {
			return;
		}
		int var3 = arg0.method10339();
		if (this.field5830 == null) {
			this.field5830 = new int[var3][];
		}
		for (int var4 = arg0.method10339(); var4 != 255; var4 = arg0.method10339()) {
			int var5 = var4 & 0x7F;
			boolean var6 = (var4 & 0x80) != 0;
			int[] var7 = new int[arg0.method10339()];
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] = arg0.method10355();
			}
			this.field5830[var5] = var7;
			if (var6) {
				if (this.field5829 == null) {
					this.field5829 = new Object[this.field5830.length][];
				}
				Object[][] var9 = this.field5829;
				int var11 = arg0.method10355();
				Object[] var12 = new Object[var7.length * var11];
				for (int var13 = 0; var13 < var11; var13++) {
					for (int var14 = 0; var14 < var7.length; var14++) {
						int var15 = var7.length * var13 + var14;
						class575 var16 = class573.method9167(var7[var14]);
						var12[var15] = var16.method10173(arg0);
					}
				}
				var9[var5] = var12;
			}
		}
	}

	@ObfuscatedName("ws.ap(B)V")
	public void method10194() {
	}
}
