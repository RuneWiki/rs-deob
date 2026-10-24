package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("VPIFXIOD")
public class AnimBase {

	@ObfuscatedName("VPIFXIOD.a")
	public int field1296;

	@ObfuscatedName("VPIFXIOD.b")
	public int[] field1297;

	@ObfuscatedName("VPIFXIOD.c")
	public int[][] field1298;

	public AnimBase(Packet arg0) {
		field1296 = arg0.g1();
		field1297 = new int[field1296];
		field1298 = new int[field1296][];

		for (int var2 = 0; var2 < field1296; var2++) {
			field1297[var2] = arg0.g1();
		}

		for (int var3 = 0; var3 < field1296; var3++) {
			int var4 = arg0.g1();
			field1298[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1298[var3][var5] = arg0.g1();
			}
		}
	}
}
