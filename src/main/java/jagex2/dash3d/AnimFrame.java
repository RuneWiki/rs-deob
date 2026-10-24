package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("g")
public class AnimFrame {

	@ObfuscatedName("g.a")
	public static AnimFrame[] list;

	@ObfuscatedName("g.b")
	public int delay;

	@ObfuscatedName("g.c")
	public AnimBase base;

	@ObfuscatedName("g.d")
	public int size;

	@ObfuscatedName("g.e")
	public int[] ti;

	@ObfuscatedName("g.f")
	public int[] tx;

	@ObfuscatedName("g.g")
	public int[] ty;

	@ObfuscatedName("g.h")
	public int[] tz;

	@ObfuscatedName("g.a(ZLub;)V")
	public static void unpack(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("frame_head.dat", null));
		Packet var2 = new Packet(arg0.read("frame_tran1.dat", null));
		Packet var3 = new Packet(arg0.read("frame_tran2.dat", null));
		Packet var4 = new Packet(arg0.read("frame_del.dat", null));
		int var5 = var1.g2();
		int var6 = var1.g2();
		list = new AnimFrame[var6 + 1];
		int[] var7 = new int[500];
		int[] var8 = new int[500];
		int[] var9 = new int[500];
		int[] var10 = new int[500];
		for (int var11 = 0; var11 < var5; var11++) {
			int var12 = var1.g2();
			AnimFrame var13 = list[var12] = new AnimFrame();
			var13.delay = var4.g1();
			int var14 = var1.g2();
			AnimBase var15 = AnimBase.list[var14];
			var13.base = var15;
			int var16 = var1.g1();
			int var17 = -1;
			int var18 = 0;
			for (int var19 = 0; var19 < var16; var19++) {
				int var20 = var2.g1();
				if (var20 > 0) {
					if (var15.type[var19] != 0) {
						for (int var21 = var19 - 1; var21 > var17; var21--) {
							if (var15.type[var21] == 0) {
								var7[var18] = var21;
								var8[var18] = 0;
								var9[var18] = 0;
								var10[var18] = 0;
								var18++;
								break;
							}
						}
					}

					var7[var18] = var19;
					short var22 = 0;
					if (var15.type[var7[var18]] == 3) {
						var22 = 128;
					}

					if ((var20 & 0x1) == 0) {
						var8[var18] = var22;
					} else {
						var8[var18] = var3.gsmarts();
					}

					if ((var20 & 0x2) == 0) {
						var9[var18] = var22;
					} else {
						var9[var18] = var3.gsmarts();
					}

					if ((var20 & 0x4) == 0) {
						var10[var18] = var22;
					} else {
						var10[var18] = var3.gsmarts();
					}

					var17 = var19;
					var18++;
				}
			}

			var13.size = var18;
			var13.ti = new int[var18];
			var13.tx = new int[var18];
			var13.ty = new int[var18];
			var13.tz = new int[var18];
			for (int var23 = 0; var23 < var18; var23++) {
				var13.ti[var23] = var7[var23];
				var13.tx[var23] = var8[var23];
				var13.ty[var23] = var9[var23];
				var13.tz[var23] = var10[var23];
			}
		}
	}
}
