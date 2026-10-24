package deob;

@ObfuscatedName("e")
public class class5 {

	@ObfuscatedName("e.a")
	public static class5[] field57;

	@ObfuscatedName("e.b")
	public int field58;

	@ObfuscatedName("e.c")
	public int[] field59;

	@ObfuscatedName("e.d")
	public int[][] field60;

	@ObfuscatedName("e.a(BLtb;)V")
	public static void method33(class46 arg0) {
		class36 var1 = new class36(arg0.method225(null, "base_head.dat"));
		class36 var2 = new class36(arg0.method225(null, "base_type.dat"));
		class36 var3 = new class36(arg0.method225(null, "base_label.dat"));
		int var4 = var1.method187();
		int var5 = var1.method187();
		field57 = new class5[var5 + 1];
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = var1.method187();
			int var8 = var1.method185();
			int[] var9 = new int[var8];
			int[][] var10 = new int[var8][];
			for (int var11 = 0; var11 < var8; var11++) {
				var9[var11] = var2.method185();
				int var12 = var3.method185();
				var10[var11] = new int[var12];
				for (int var13 = 0; var13 < var12; var13++) {
					var10[var11][var13] = var3.method185();
				}
			}

			field57[var7] = new class5();
			field57[var7].field58 = var8;
			field57[var7].field59 = var9;
			field57[var7].field60 = var10;
		}
	}
}
