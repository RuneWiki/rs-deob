package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("g")
public class AnimBase {

	@ObfuscatedName("g.a")
	public int size;

	@ObfuscatedName("g.b")
	public int[] type;

	@ObfuscatedName("g.c")
	public int[][] labels;

	public AnimBase(Packet arg0) {
		size = arg0.g1();
		type = new int[size];
		labels = new int[size][];

		for (int var2 = 0; var2 < size; var2++) {
			type[var2] = arg0.g1();
		}

		for (int var3 = 0; var3 < size; var3++) {
			int var4 = arg0.g1();
			labels[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				labels[var3][var5] = arg0.g1();
			}
		}
	}
}
