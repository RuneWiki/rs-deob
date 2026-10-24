package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("h")
public class AnimFrame {

	@ObfuscatedName("h.c")
	public static AnimFrame[] field140;

	@ObfuscatedName("h.d")
	public int field141;

	@ObfuscatedName("h.e")
	public AnimBase field142;

	@ObfuscatedName("h.f")
	public int field143;

	@ObfuscatedName("h.g")
	public int[] field144;

	@ObfuscatedName("h.h")
	public int[] field145;

	@ObfuscatedName("h.i")
	public int[] field146;

	@ObfuscatedName("h.j")
	public int[] field147;

	@ObfuscatedName("h.a(I)V")
	public static void method58(int arg0) {
		field140 = new AnimFrame[arg0 + 1];
	}

	@ObfuscatedName("h.a(I[B)V")
	public static void method59(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.field621 = arg0.length - 8;
		int var2 = var1.method240();
		int var3 = var1.method240();
		int var4 = var1.method240();
		int var5 = var1.method240();
		int var6 = 0;
		Packet var7 = new Packet(arg0);
		var7.field621 = var6;
		var6 += var2 + 2;
		Packet var8 = new Packet(arg0);
		var8.field621 = var6;
		var6 += var3;
		Packet var9 = new Packet(arg0);
		var9.field621 = var6;
		var6 += var4;
		Packet var10 = new Packet(arg0);
		var10.field621 = var6;
		var6 += var5;
		Packet var11 = new Packet(arg0);
		var11.field621 = var6;
		AnimBase var12 = new AnimBase(var11);
		int var13 = var7.method240();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method240();
			AnimFrame var20 = field140[var19] = new AnimFrame();
			var20.field141 = var10.method238();
			var20.field142 = var12;
			int var21 = var7.method238();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method238();
				if (var25 > 0) {
					if (var12.field138[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field138[var26] == 0) {
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
					if (var12.field138[var14[var23]] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method251();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method251();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method251();
					}

					var22 = var24;
					var23++;
				}
			}

			var20.field143 = var23;
			var20.field144 = new int[var23];
			var20.field145 = new int[var23];
			var20.field146 = new int[var23];
			var20.field147 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field144[var28] = var14[var28];
				var20.field145[var28] = var15[var28];
				var20.field146[var28] = var16[var28];
				var20.field147[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("h.a(B)V")
	public static void method60() {
		field140 = null;
	}

	@ObfuscatedName("h.a(II)Lh;")
	public static AnimFrame method61(int arg0) {
		if (field140 == null) {
			return null;
		}

		return field140[arg0];
	}
}
