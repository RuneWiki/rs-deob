package deob;

@ObfuscatedName("in")
public class class230 extends class545 {

	@ObfuscatedName("in.aq")
	public int field2674;

	@ObfuscatedName("in.ao")
	public int[] field2677;

	@ObfuscatedName("in.as")
	public int[][] field2676;

	@ObfuscatedName("in.al")
	public class228 field2675;

	public class230(int arg0, byte[] arg1) {
		class591 var3 = new class591(arg1);
		this.field2674 = var3.method10339();
		this.field2677 = new int[this.field2674];
		this.field2676 = new int[this.field2674][];
		for (int var4 = 0; var4 < this.field2674; var4++) {
			this.field2677[var4] = var3.method10339();
		}
		for (int var5 = 0; var5 < this.field2674; var5++) {
			this.field2676[var5] = new int[var3.method10339()];
		}
		for (int var6 = 0; var6 < this.field2674; var6++) {
			for (int var7 = 0; var7 < this.field2676[var6].length; var7++) {
				this.field2676[var6][var7] = var3.method10339();
			}
		}
		if (var3.field5920 < var3.field5917.length) {
			int var8 = var3.method10341();
			if (var8 > 0) {
				this.field2675 = new class228(var3, var8);
			}
		}
	}

	@ObfuscatedName("in.af(B)I")
	public int method4793() {
		return this.field2674;
	}

	@ObfuscatedName("in.aw(I)Lig;")
	public class228 method4794() {
		return this.field2675;
	}
}
