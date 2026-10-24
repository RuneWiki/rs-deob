package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("SQHJOGRT")
public class AnimFrame {

	@ObfuscatedName("SQHJOGRT.c")
	public int id;

	@ObfuscatedName("SQHJOGRT.e")
	public int length;

	@ObfuscatedName("SQHJOGRT.d")
	public AnimBase base;

	@ObfuscatedName("SQHJOGRT.f")
	public int[] groups;

	@ObfuscatedName("SQHJOGRT.g")
	public int[] x;

	@ObfuscatedName("SQHJOGRT.h")
	public int[] y;

	@ObfuscatedName("SQHJOGRT.i")
	public int[] z;

	@ObfuscatedName("SQHJOGRT.b")
	public static AnimFrame[] instances;

	@ObfuscatedName("SQHJOGRT.j")
	public static boolean[] hasAlpha;

	@ObfuscatedName("SQHJOGRT.a(I)V")
	public static void init(int arg0) {
		instances = new AnimFrame[arg0 + 1];
		hasAlpha = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			hasAlpha[var1] = true;
		}
	}

	@ObfuscatedName("SQHJOGRT.a([BZ)V")
	public static void unpack(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = arg0.length - 8;
		int var2 = var1.g2();
		int var3 = var1.g2();
		int var4 = var1.g2();
		int var5 = var1.g2();
		int var6 = 0;
		Packet var7 = new Packet(arg0);
		var7.pos = var6;
		var6 += var2 + 2;
		Packet var8 = new Packet(arg0);
		var8.pos = var6;
		var6 += var3;
		Packet var9 = new Packet(arg0);
		var9.pos = var6;
		var6 += var4;
		Packet var10 = new Packet(arg0);
		var10.pos = var6;
		var6 += var5;
		Packet var11 = new Packet(arg0);
		var11.pos = var6;
		AnimBase var12 = new AnimBase(var11);
		int var13 = var7.g2();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.g2();
			AnimFrame var20 = instances[var19] = new AnimFrame();
			var20.id = var10.g1();
			var20.base = var12;
			int var21 = var7.g1();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.g1();
				if (var25 > 0) {
					if (var12.types[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.types[var26] == 0) {
								var14[var23] = var26;
								var15[var23] = 0;
								var16[var23] = 0;
								var17[var23] = 0;
								var23++;
								break;
							}
						}
					}

					var14[var23] = var24;
					short var27 = 0;
					if (var12.types[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.gsmart();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.gsmart();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.gsmart();
					}

					var22 = var24;
					var23++;

					if (var12.types[var24] == 5) {
						hasAlpha[var19] = false;
					}
				}
			}

			var20.length = var23;
			var20.groups = new int[var23];
			var20.x = new int[var23];
			var20.y = new int[var23];
			var20.z = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.groups[var28] = var14[var28];
				var20.x[var28] = var15[var28];
				var20.y[var28] = var16[var28];
				var20.z[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("SQHJOGRT.b(I)V")
	public static void unload() {
		instances = null;
	}

	@ObfuscatedName("SQHJOGRT.a(II)LSQHJOGRT;")
	public static AnimFrame get(int arg0) {
		if (instances == null) {
			return null;
		}

		return instances[arg0];
	}

	@ObfuscatedName("SQHJOGRT.a(IZ)Z")
	public static boolean isNull(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
