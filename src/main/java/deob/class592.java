package deob;

@ObfuscatedName("wt")
public class class592 {

	@ObfuscatedName("wt.af")
	public int[] field5922 = new int[8];

	@ObfuscatedName("wt.aw")
	public short[] field5923 = new short[8];

	public class592(class196 arg0) {
		int var2 = 0;
		if (arg0.method4035()) {
			var2 = arg0.method4036().length;
			System.arraycopy(arg0.method4036(), 0, this.field5922, 0, var2);
			System.arraycopy(arg0.method4034(), 0, this.field5923, 0, var2);
		}
		for (int var3 = var2; var3 < 8; var3++) {
			this.field5922[var3] = -1;
			this.field5923[var3] = -1;
		}
	}

	@ObfuscatedName("wt.af(I)[I")
	public int[] method10602() {
		return this.field5922;
	}

	@ObfuscatedName("wt.aw(I)[S")
	public short[] method10603() {
		return this.field5923;
	}

	@ObfuscatedName("wt.at(IISI)V")
	public void method10604(int arg0, int arg1, short arg2) {
		this.field5922[arg0] = arg1;
		this.field5923[arg0] = arg2;
	}

	@ObfuscatedName("wt.ac([I[SB)V")
	public void method10601(int[] arg0, short[] arg1) {
		this.field5922 = arg0;
		this.field5923 = arg1;
	}
}
