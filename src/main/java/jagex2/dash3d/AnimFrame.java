package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("JULFQTYK")
public class AnimFrame {

	@ObfuscatedName("JULFQTYK.d")
	public int field813;

	@ObfuscatedName("JULFQTYK.f")
	public int field815;

	@ObfuscatedName("JULFQTYK.e")
	public AnimBase field814;

	@ObfuscatedName("JULFQTYK.g")
	public int[] field816;

	@ObfuscatedName("JULFQTYK.h")
	public int[] field817;

	@ObfuscatedName("JULFQTYK.i")
	public int[] field818;

	@ObfuscatedName("JULFQTYK.j")
	public int[] field819;

	@ObfuscatedName("JULFQTYK.c")
	public static AnimFrame[] field812;

	@ObfuscatedName("JULFQTYK.k")
	public static boolean[] field820;

	@ObfuscatedName("JULFQTYK.a(I)V")
	public static void method261(int arg0) {
		field812 = new AnimFrame[arg0 + 1];
		field820 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field820[var1] = true;
		}
	}

	@ObfuscatedName("JULFQTYK.a([BZ)V")
	public static void method262(byte[] arg0) {
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
			AnimFrame var20 = field812[var19] = new AnimFrame();
			var20.field813 = var10.g1();
			var20.field814 = var12;
			int var21 = var7.g1();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.g1();
				if (var25 > 0) {
					if (var12.field1297[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1297[var26] == 0) {
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
					if (var12.field1297[var24] == 3) {
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

					if (var12.field1297[var24] == 5) {
						field820[var19] = false;
					}
				}
			}

			var20.field815 = var23;
			var20.field816 = new int[var23];
			var20.field817 = new int[var23];
			var20.field818 = new int[var23];
			var20.field819 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field816[var28] = var14[var28];
				var20.field817[var28] = var15[var28];
				var20.field818[var28] = var16[var28];
				var20.field819[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("JULFQTYK.a(Z)V")
	public static void method263() {
		field812 = null;
	}

	@ObfuscatedName("JULFQTYK.b(I)LJULFQTYK;")
	public static AnimFrame method264(int arg0) {
		if (field812 == null) {
			return null;
		}

		return field812[arg0];
	}

	@ObfuscatedName("JULFQTYK.a(ZI)Z")
	public static boolean method265(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
