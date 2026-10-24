package deob;

@ObfuscatedName("f")
public class class6 {

	@ObfuscatedName("f.a")
	public static class6[] field64;

	@ObfuscatedName("f.b")
	public int field65;

	@ObfuscatedName("f.c")
	public int[] field66;

	@ObfuscatedName("f.d")
	public int[][] field67;

	@ObfuscatedName("f.a(ILub;)V")
	public static void method47(class47 arg0) {
		class37 var1 = new class37(arg0.method242(null, "base_head.dat"));
		class37 var2 = new class37(arg0.method242(null, "base_type.dat"));
		class37 var3 = new class37(arg0.method242(null, "base_label.dat"));
		int var4 = var1.method203();
		int var5 = var1.method203();
		field64 = new class6[var5 + 1];
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = var1.method203();
			int var8 = var1.method201();
			int[] var9 = new int[var8];
			int[][] var10 = new int[var8][];
			for (int var11 = 0; var11 < var8; var11++) {
				var9[var11] = var2.method201();
				int var12 = var3.method201();
				var10[var11] = new int[var12];
				for (int var13 = 0; var13 < var12; var13++) {
					var10[var11][var13] = var3.method201();
				}
			}

			field64[var7] = new class6();
			field64[var7].field65 = var8;
			field64[var7].field66 = var9;
			field64[var7].field67 = var10;
		}
	}
}
