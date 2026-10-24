package deob;

@ObfuscatedName("f")
public class class6 {

	@ObfuscatedName("f.a")
	public static class6[] field68;

	@ObfuscatedName("f.b")
	public int field69;

	@ObfuscatedName("f.c")
	public int[] field70;

	@ObfuscatedName("f.d")
	public int[][] field71;

	@ObfuscatedName("f.a(Lub;Z)V")
	public static void method48(class47 arg0) {
		class37 var1 = new class37(arg0.method257(null, "base_head.dat"));
		class37 var2 = new class37(arg0.method257(null, "base_type.dat"));
		class37 var3 = new class37(arg0.method257(null, "base_label.dat"));
		int var4 = var1.method218();
		int var5 = var1.method218();
		field68 = new class6[var5 + 1];
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = var1.method218();
			int var8 = var1.method216();
			int[] var9 = new int[var8];
			int[][] var10 = new int[var8][];
			for (int var11 = 0; var11 < var8; var11++) {
				var9[var11] = var2.method216();
				int var12 = var3.method216();
				var10[var11] = new int[var12];
				for (int var13 = 0; var13 < var12; var13++) {
					var10[var11][var13] = var3.method216();
				}
			}

			field68[var7] = new class6();
			field68[var7].field69 = var8;
			field68[var7].field70 = var9;
			field68[var7].field71 = var10;
		}
	}
}
