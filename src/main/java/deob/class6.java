package deob;

@ObfuscatedName("f")
public class class6 {

	@ObfuscatedName("f.b")
	public static class6[] field66;

	@ObfuscatedName("f.c")
	public int field67;

	@ObfuscatedName("f.d")
	public int[] field68;

	@ObfuscatedName("f.e")
	public int[][] field69;

	@ObfuscatedName("f.a(BLub;)V")
	public static void method47(class47 arg0) {
		class37 var1 = new class37(arg0.method250("base_head.dat", null));
		class37 var2 = new class37(arg0.method250("base_type.dat", null));
		class37 var3 = new class37(arg0.method250("base_label.dat", null));
		int var4 = var1.method211();
		int var5 = var1.method211();
		field66 = new class6[var5 + 1];
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = var1.method211();
			int var8 = var1.method209();
			int[] var9 = new int[var8];
			int[][] var10 = new int[var8][];
			for (int var11 = 0; var11 < var8; var11++) {
				var9[var11] = var2.method209();
				int var12 = var3.method209();
				var10[var11] = new int[var12];
				for (int var13 = 0; var13 < var12; var13++) {
					var10[var11][var13] = var3.method209();
				}
			}

			field66[var7] = new class6();
			field66[var7].field67 = var8;
			field66[var7].field68 = var9;
			field66[var7].field69 = var10;
		}
	}
}
