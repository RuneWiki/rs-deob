package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;

public class AnimFrame {

	@ObfuscatedName("SQHJOGRT.a")
	public static int _flowObfuscator1 = -715;

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
	public static void unpack(byte[] arg0, boolean arg1) {
		Packet var2 = new Packet(arg0, 891);
		var2.pos = arg0.length - 8;
		int var3 = var2.g2();
		int var4 = var2.g2();
		int var5 = var2.g2();
		int var6 = var2.g2();
		byte var7 = 0;
		Packet var8 = new Packet(arg0, 891);
		var8.pos = var7;
		int var9 = var3 + 2 + var7;
		Packet var10 = new Packet(arg0, 891);
		var10.pos = var9;
		int var11 = var4 + var9;
		Packet var12 = new Packet(arg0, 891);
		var12.pos = var11;
		int var13 = var5 + var11;
		Packet var14 = new Packet(arg0, 891);
		var14.pos = var13;
		int var15 = var6 + var13;
		Packet var16 = new Packet(arg0, 891);
		var16.pos = var15;
		if (arg1) {
			for (int var17 = 1; var17 > 0; var17++) {
			}
		}
		AnimBase var18 = new AnimBase(0, var16);
		int var19 = var8.g2();
		int[] var20 = new int[500];
		int[] var21 = new int[500];
		int[] var22 = new int[500];
		int[] var23 = new int[500];
		for (int var24 = 0; var24 < var19; var24++) {
			int var25 = var8.g2();
			AnimFrame var26 = instances[var25] = new AnimFrame();
			var26.id = var14.g1();
			var26.base = var18;
			int var27 = var8.g1();
			int var28 = -1;
			int var29 = 0;
			for (int var30 = 0; var30 < var27; var30++) {
				int var32 = var10.g1();
				if (var32 > 0) {
					if (var18.types[var30] != 0) {
						for (int var33 = var30 - 1; var33 > var28; var33--) {
							if (var18.types[var33] == 0) {
								var20[var29] = var33;
								var21[var29] = 0;
								var22[var29] = 0;
								var23[var29] = 0;
								var29++;
								break;
							}
						}
					}
					var20[var29] = var30;
					short var34 = 0;
					if (var18.types[var30] == 3) {
						var34 = 128;
					}
					if ((var32 & 0x1) == 0) {
						var21[var29] = var34;
					} else {
						var21[var29] = var12.gsmart();
					}
					if ((var32 & 0x2) == 0) {
						var22[var29] = var34;
					} else {
						var22[var29] = var12.gsmart();
					}
					if ((var32 & 0x4) == 0) {
						var23[var29] = var34;
					} else {
						var23[var29] = var12.gsmart();
					}
					var28 = var30;
					var29++;
					if (var18.types[var30] == 5) {
						hasAlpha[var25] = false;
					}
				}
			}
			var26.length = var29;
			var26.groups = new int[var29];
			var26.x = new int[var29];
			var26.y = new int[var29];
			var26.z = new int[var29];
			for (int var31 = 0; var31 < var29; var31++) {
				var26.groups[var31] = var20[var31];
				var26.x[var31] = var21[var31];
				var26.y[var31] = var22[var31];
				var26.z[var31] = var23[var31];
			}
		}
	}

	@ObfuscatedName("SQHJOGRT.b(I)V")
	public static void unload(int arg0) {
		while (arg0 >= 0) {
			_flowObfuscator1 = 90;
		}
		instances = null;
	}

	@ObfuscatedName("SQHJOGRT.a(II)LSQHJOGRT;")
	public static AnimFrame get(int arg0, int arg1) {
		if (arg0 != 9) {
			throw new NullPointerException();
		}
		return instances == null ? null : instances[arg1];
	}

	@ObfuscatedName("SQHJOGRT.a(IZ)Z")
	public static boolean isNull(int arg0, boolean arg1) {
		if (arg1) {
			_flowObfuscator1 = -79;
		}
		return arg0 == -1;
	}
}
