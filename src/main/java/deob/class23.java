package deob;

@ObfuscatedName("w")
public class class23 extends class22 {

	@ObfuscatedName("w.g")
	public int field256;

	@ObfuscatedName("w.h")
	public int field257;

	@ObfuscatedName("w.i")
	public int field258;

	@ObfuscatedName("w.j")
	public int field259;

	@ObfuscatedName("w.k")
	public int field260 = 1;

	@ObfuscatedName("w.l")
	public int field261 = -1;

	@ObfuscatedName("w.m")
	public int field262 = -1;

	@ObfuscatedName("w.n")
	public int field263 = -1;

	@ObfuscatedName("w.o")
	public int field264 = -1;

	@ObfuscatedName("w.p")
	public int field265 = -1;

	@ObfuscatedName("w.q")
	public int field266 = -1;

	@ObfuscatedName("w.r")
	public String field267;

	@ObfuscatedName("w.s")
	public int field268 = 100;

	@ObfuscatedName("w.t")
	public int field269;

	@ObfuscatedName("w.u")
	public int field270;

	@ObfuscatedName("w.v")
	public int field271;

	@ObfuscatedName("w.w")
	public int field272;

	@ObfuscatedName("w.x")
	public int field273 = -1000;

	@ObfuscatedName("w.y")
	public int field274;

	@ObfuscatedName("w.z")
	public int field275;

	@ObfuscatedName("w.ab")
	public int field302;

	@ObfuscatedName("w.bb")
	public int[] field303 = new int[10];

	@ObfuscatedName("w.cb")
	public int[] field304 = new int[10];

	@ObfuscatedName("w.db")
	public int field305;

	@ObfuscatedName("w.A")
	public int field276 = -1;

	@ObfuscatedName("w.D")
	public int field279 = -1;

	@ObfuscatedName("w.G")
	public int field282 = -1;

	@ObfuscatedName("w.L")
	public int field287 = -1;

	@ObfuscatedName("w.X")
	public boolean field299 = false;

	@ObfuscatedName("w.B")
	public int field277;

	@ObfuscatedName("w.C")
	public int field278;

	@ObfuscatedName("w.E")
	public int field280;

	@ObfuscatedName("w.F")
	public int field281;

	@ObfuscatedName("w.H")
	public int field283;

	@ObfuscatedName("w.I")
	public int field284;

	@ObfuscatedName("w.J")
	public int field285;

	@ObfuscatedName("w.K")
	public int field286;

	@ObfuscatedName("w.M")
	public int field288;

	@ObfuscatedName("w.N")
	public int field289;

	@ObfuscatedName("w.O")
	public int field290;

	@ObfuscatedName("w.P")
	public int field291;

	@ObfuscatedName("w.Q")
	public int field292;

	@ObfuscatedName("w.R")
	public int field293;

	@ObfuscatedName("w.S")
	public int field294;

	@ObfuscatedName("w.T")
	public int field295;

	@ObfuscatedName("w.U")
	public int field296;

	@ObfuscatedName("w.V")
	public int field297;

	@ObfuscatedName("w.W")
	public int field298;

	@ObfuscatedName("w.Y")
	public int field300;

	@ObfuscatedName("w.Z")
	public int field301;

	@ObfuscatedName("w.a(III)V")
	public final void method91(int arg0, int arg1) {
		if (field303[0] != arg0 || field304[0] != arg1) {
			if (field282 != -1 && class58.field823[field282].field831 <= 1) {
				field282 = -1;
			}

			if (field302 < 9) {
				field302++;
				for (int var3 = field302; var3 > 0; var3--) {
					field303[var3] = field303[var3 - 1];
					field304[var3] = field304[var3 - 1];
				}
			} else {
				for (int var4 = 8; var4 > 0; var4--) {
					field303[var4] = field303[var4 - 1];
					field304[var4] = field304[var4 - 1];
				}
			}

			field303[0] = arg0;
			field304[0] = arg1;
		}
	}

	@ObfuscatedName("w.a(ZII)V")
	public final void method92(int arg0, int arg1) {
		if (arg1 != 0 || arg0 != 0) {
			int var3 = field303[0] + arg1;
			int var4 = field304[0] + arg0;

			if (field282 != -1 && class58.field823[field282].field831 <= 1) {
				field282 = -1;
			}

			if (field302 < 9) {
				field302++;
				for (int var5 = field302; var5 > 0; var5--) {
					field303[var5] = field303[var5 - 1];
					field304[var5] = field304[var5 - 1];
				}
			} else {
				for (int var6 = 8; var6 > 0; var6--) {
					field303[var6] = field303[var6 - 1];
					field304[var6] = field304[var6 - 1];
				}
			}

			field303[0] = var3;
			field304[0] = var4;
		}
	}
}
