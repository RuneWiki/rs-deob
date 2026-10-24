package deob;

@ObfuscatedName("g")
public class class7 {

	@ObfuscatedName("g.c")
	public int field138;

	@ObfuscatedName("g.d")
	public int[] field139;

	@ObfuscatedName("g.e")
	public int[][] field140;

	public class7(class39 arg0) {
		field138 = arg0.method239();
		field139 = new int[field138];
		field140 = new int[field138][];

		for (int var2 = 0; var2 < field138; var2++) {
			field139[var2] = arg0.method239();
		}

		for (int var3 = 0; var3 < field138; var3++) {
			int var4 = arg0.method239();
			field140[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field140[var3][var5] = arg0.method239();
			}
		}
	}
}
