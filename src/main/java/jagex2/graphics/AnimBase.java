package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("KVCQPLIW")
public class AnimBase {

	@ObfuscatedName("KVCQPLIW.b")
	public int length;

	@ObfuscatedName("KVCQPLIW.c")
	public int[] types;

	@ObfuscatedName("KVCQPLIW.d")
	public int[][] labels;

	public AnimBase(Packet arg0) {
		length = arg0.g1();
		types = new int[length];
		labels = new int[length][];

		for (int var2 = 0; var2 < length; var2++) {
			types[var2] = arg0.g1();
		}

		for (int var3 = 0; var3 < length; var3++) {
			int var4 = arg0.g1();
			labels[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				labels[var3][var5] = arg0.g1();
			}
		}
	}
}
