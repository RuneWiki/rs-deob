package deob;

@ObfuscatedName("g")
public class class7 {

	@ObfuscatedName("g.a")
	public int field137;

	@ObfuscatedName("g.b")
	public int[] field138;

	@ObfuscatedName("g.c")
	public int[][] field139;

	public class7(class39 arg0) {
		field137 = arg0.method238();
		field138 = new int[field137];
		field139 = new int[field137][];

		for (int var2 = 0; var2 < field137; var2++) {
			field138[var2] = arg0.method238();
		}

		for (int var3 = 0; var3 < field137; var3++) {
			int var4 = arg0.method238();
			field139[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field139[var3][var5] = arg0.method238();
			}
		}
	}
}
