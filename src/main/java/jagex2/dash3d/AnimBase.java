package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("f")
public class AnimBase {

	@ObfuscatedName("f.a")
	public static AnimBase[] list;

	@ObfuscatedName("f.b")
	public int length;

	@ObfuscatedName("f.c")
	public int[] type;

	@ObfuscatedName("f.d")
	public int[][] labels;

	@ObfuscatedName("f.a(ZLub;)V")
	public static void unpack(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("base_head.dat", null));
		Packet var2 = new Packet(arg0.read("base_type.dat", null));
		Packet var3 = new Packet(arg0.read("base_label.dat", null));
		int var4 = var1.g2();
		int var5 = var1.g2();
		list = new AnimBase[var5 + 1];
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = var1.g2();
			int var8 = var1.g1();
			int[] var9 = new int[var8];
			int[][] var10 = new int[var8][];
			for (int var11 = 0; var11 < var8; var11++) {
				var9[var11] = var2.g1();
				int var12 = var3.g1();
				var10[var11] = new int[var12];
				for (int var13 = 0; var13 < var12; var13++) {
					var10[var11][var13] = var3.g1();
				}
			}

			list[var7] = new AnimBase();
			list[var7].length = var8;
			list[var7].type = var9;
			list[var7].labels = var10;
		}
	}
}
