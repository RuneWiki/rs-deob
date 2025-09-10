package deob;

@ObfuscatedName("wr")
public class class580 extends class541 {

	@ObfuscatedName("wr.aw")
	public static class321 field5843 = new class321(64);

	@ObfuscatedName("wr.at")
	public Object[][] field5842;

	@ObfuscatedName("wr.ac")
	public int[][] field5841;

	@ObfuscatedName("wr.ap")
	public int field5844 = -1;

	@ObfuscatedName("rj.af(II)Lwr;")
	public static class580 method8506(int arg0) {
		class580 var1 = (class580) field5843.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field5840.method7692(38, arg0);
		class580 var3 = new class580();
		if (var2 != null) {
			var3.method10213(new class591(var2));
		}
		var3.method10216();
		field5843.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("or.aw(I)V")
	public static void method7550() {
		field5843.method6456();
	}

	@ObfuscatedName("wr.at(Lwb;I)V")
	public void method10213(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method10215(arg0, var2);
		}
	}

	@ObfuscatedName("wr.ac(IB)[Ljava/lang/Object;")
	public Object[] method10214(int arg0) {
		return this.field5842 == null ? null : this.field5842[arg0];
	}

	@ObfuscatedName("wr.ap(Lwb;II)V")
	public void method10215(class591 arg0, int arg1) {
		if (arg1 == 3) {
			int var3 = arg0.method10339();
			if (this.field5842 == null) {
				this.field5842 = new Object[var3][];
				this.field5841 = new int[var3][];
			}
			for (int var4 = arg0.method10339(); var4 != 255; var4 = arg0.method10339()) {
				int var5 = arg0.method10339();
				int[] var6 = new int[var5];
				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = arg0.method10355();
				}
				Object[][] var8 = this.field5842;
				int var10 = arg0.method10355();
				Object[] var11 = new Object[var6.length * var10];
				for (int var12 = 0; var12 < var10; var12++) {
					for (int var13 = 0; var13 < var6.length; var13++) {
						int var14 = var6.length * var12 + var13;
						class575 var15 = class573.method9167(var6[var13]);
						var11[var14] = var15.method10173(arg0);
					}
				}
				var8[var4] = var11;
				this.field5841[var4] = var6;
			}
		} else if (arg1 == 4) {
			this.field5844 = arg0.method10361();
		}
	}

	@ObfuscatedName("wr.aq(I)V")
	public void method10216() {
	}
}
