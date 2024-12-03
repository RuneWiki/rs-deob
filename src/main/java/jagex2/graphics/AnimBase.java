package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;

public class AnimBase {

	@ObfuscatedName("KVCQPLIW.a")
	public int _flowObfuscator1 = -588;

	@ObfuscatedName("KVCQPLIW.b")
	public int length;

	@ObfuscatedName("KVCQPLIW.c")
	public int[] types;

	@ObfuscatedName("KVCQPLIW.d")
	public int[][] labels;

	public AnimBase(int arg0, Packet arg1) {
		this.length = arg1.g1();
		this.types = new int[this.length];
		this.labels = new int[this.length][];
		if (arg0 != 0) {
			this._flowObfuscator1 = 203;
		}
		for (int var3 = 0; var3 < this.length; var3++) {
			this.types[var3] = arg1.g1();
		}
		for (int var4 = 0; var4 < this.length; var4++) {
			int var5 = arg1.g1();
			this.labels[var4] = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.labels[var4][var6] = arg1.g1();
			}
		}
	}
}
