package deob;

@ObfuscatedName("f")
public class class6 {

	@ObfuscatedName("f.a")
	public int field130;

	@ObfuscatedName("f.b")
	public int[] field131;

	@ObfuscatedName("f.c")
	public int[][] field132;

	public class6(class38 arg0) {
		field130 = arg0.method224();
		field131 = new int[field130];
		field132 = new int[field130][];

		for (int var2 = 0; var2 < field130; var2++) {
			field131[var2] = arg0.method224();
		}

		for (int var3 = 0; var3 < field130; var3++) {
			int var4 = arg0.method224();
			field132[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field132[var3][var5] = arg0.method224();
			}
		}
	}
}
