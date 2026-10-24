package deob;

@ObfuscatedName("g")
public class class7 {

	@ObfuscatedName("g.b")
	public int field139;

	@ObfuscatedName("g.c")
	public int[] field140;

	@ObfuscatedName("g.d")
	public int[][] field141;

	public class7(class39 arg0) {
		field139 = arg0.method238();
		field140 = new int[field139];
		field141 = new int[field139][];

		for (int var2 = 0; var2 < field139; var2++) {
			field140[var2] = arg0.method238();
		}

		for (int var3 = 0; var3 < field139; var3++) {
			int var4 = arg0.method238();
			field141[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field141[var3][var5] = arg0.method238();
			}
		}
	}
}
