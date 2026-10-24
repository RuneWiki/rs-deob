package deob;

@ObfuscatedName("x")
public class class24 extends class23 {

	@ObfuscatedName("x.h")
	public int field270;

	@ObfuscatedName("x.i")
	public int field271;

	@ObfuscatedName("x.j")
	public int field272;

	@ObfuscatedName("x.k")
	public boolean field273 = false;

	@ObfuscatedName("x.l")
	public int field274 = 1;

	@ObfuscatedName("x.m")
	public int field275 = -1;

	@ObfuscatedName("x.n")
	public int field276 = -1;

	@ObfuscatedName("x.o")
	public int field277 = -1;

	@ObfuscatedName("x.p")
	public int field278 = -1;

	@ObfuscatedName("x.q")
	public int field279 = -1;

	@ObfuscatedName("x.r")
	public int field280 = -1;

	@ObfuscatedName("x.s")
	public int field281 = -1;

	@ObfuscatedName("x.t")
	public String field282;

	@ObfuscatedName("x.u")
	public int field283 = 100;

	@ObfuscatedName("x.v")
	public int field284;

	@ObfuscatedName("x.w")
	public int field285;

	@ObfuscatedName("x.x")
	public int field286;

	@ObfuscatedName("x.y")
	public int field287;

	@ObfuscatedName("x.z")
	public int field288 = -1000;

	@ObfuscatedName("x.ab")
	public int field315;

	@ObfuscatedName("x.bb")
	public int field316;

	@ObfuscatedName("x.cb")
	public int field317;

	@ObfuscatedName("x.db")
	public int[] field318 = new int[10];

	@ObfuscatedName("x.eb")
	public int[] field319 = new int[10];

	@ObfuscatedName("x.fb")
	public boolean[] field320 = new boolean[10];

	@ObfuscatedName("x.gb")
	public int field321;

	@ObfuscatedName("x.C")
	public int field291 = -1;

	@ObfuscatedName("x.F")
	public int field294 = -1;

	@ObfuscatedName("x.I")
	public int field297 = -1;

	@ObfuscatedName("x.N")
	public int field302 = -1;

	@ObfuscatedName("x.A")
	public int field289;

	@ObfuscatedName("x.B")
	public int field290;

	@ObfuscatedName("x.D")
	public int field292;

	@ObfuscatedName("x.E")
	public int field293;

	@ObfuscatedName("x.G")
	public int field295;

	@ObfuscatedName("x.H")
	public int field296;

	@ObfuscatedName("x.J")
	public int field298;

	@ObfuscatedName("x.K")
	public int field299;

	@ObfuscatedName("x.L")
	public int field300;

	@ObfuscatedName("x.M")
	public int field301;

	@ObfuscatedName("x.O")
	public int field303;

	@ObfuscatedName("x.P")
	public int field304;

	@ObfuscatedName("x.Q")
	public int field305;

	@ObfuscatedName("x.R")
	public int field306;

	@ObfuscatedName("x.S")
	public int field307;

	@ObfuscatedName("x.T")
	public int field308;

	@ObfuscatedName("x.U")
	public int field309;

	@ObfuscatedName("x.V")
	public int field310;

	@ObfuscatedName("x.W")
	public int field311;

	@ObfuscatedName("x.X")
	public int field312;

	@ObfuscatedName("x.Y")
	public int field313;

	@ObfuscatedName("x.Z")
	public int field314;

	@ObfuscatedName("x.a(IIZI)V")
	public final void method110(int arg0, boolean arg1, int arg2) {
		if (field297 != -1 && class62.field901[field297].field909 <= 1) {
			field297 = -1;
		}

		if (!arg1) {
			int var4 = arg0 - field318[0];
			int var5 = arg2 - field319[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field317 < 9) {
					field317++;
				}

				for (int var6 = field317; var6 > 0; var6--) {
					field318[var6] = field318[var6 - 1];
					field319[var6] = field319[var6 - 1];
					field320[var6] = field320[var6 - 1];
				}

				field318[0] = arg0;
				field319[0] = arg2;
				field320[0] = false;
				return;
			}
		}

		field317 = 0;
		field321 = 0;
		field318[0] = arg0;
		field319[0] = arg2;
		field270 = field318[0] * 128 + field274 * 64;
		field271 = field319[0] * 128 + field274 * 64;
	}

	@ObfuscatedName("x.a(IZI)V")
	public final void method111(int arg0, boolean arg1) {
		int var3 = field318[0];
		int var4 = field319[0];
		if (arg0 == 0) {
			var3--;
			var4++;
		}

		if (arg0 == 1) {
			var4++;
		}

		if (arg0 == 2) {
			var3++;
			var4++;
		}

		if (arg0 == 3) {
			var3--;
		}

		if (arg0 == 4) {
			var3++;
		}

		if (arg0 == 5) {
			var3--;
			var4--;
		}

		if (arg0 == 6) {
			var4--;
		}

		if (arg0 == 7) {
			var3++;
			var4--;
		}

		if (field297 != -1 && class62.field901[field297].field909 <= 1) {
			field297 = -1;
		}

		if (field317 < 9) {
			field317++;
		}

		for (int var5 = field317; var5 > 0; var5--) {
			field318[var5] = field318[var5 - 1];
			field319[var5] = field319[var5 - 1];
			field320[var5] = field320[var5 - 1];
		}

		field318[0] = var3;
		field319[0] = var4;
		field320[0] = arg1;
	}

	@ObfuscatedName("x.b(I)Z")
	public boolean method112() {
		return false;
	}
}
