package deob;

@ObfuscatedName("x")
public class class24 extends class23 {

	@ObfuscatedName("x.f")
	public int field269;

	@ObfuscatedName("x.g")
	public int field270;

	@ObfuscatedName("x.h")
	public int field271;

	@ObfuscatedName("x.i")
	public boolean field272 = false;

	@ObfuscatedName("x.j")
	public int field273 = 1;

	@ObfuscatedName("x.k")
	public int field274 = -1;

	@ObfuscatedName("x.l")
	public int field275 = -1;

	@ObfuscatedName("x.m")
	public int field276 = -1;

	@ObfuscatedName("x.n")
	public int field277 = -1;

	@ObfuscatedName("x.o")
	public int field278 = -1;

	@ObfuscatedName("x.p")
	public int field279 = -1;

	@ObfuscatedName("x.q")
	public int field280 = -1;

	@ObfuscatedName("x.r")
	public String field281;

	@ObfuscatedName("x.s")
	public int field282 = 100;

	@ObfuscatedName("x.t")
	public int field283;

	@ObfuscatedName("x.u")
	public int field284;

	@ObfuscatedName("x.v")
	public int field285;

	@ObfuscatedName("x.w")
	public int field286;

	@ObfuscatedName("x.x")
	public int field287 = -1000;

	@ObfuscatedName("x.y")
	public int field288;

	@ObfuscatedName("x.z")
	public int field289;

	@ObfuscatedName("x.ab")
	public int field316;

	@ObfuscatedName("x.bb")
	public int[] field317 = new int[10];

	@ObfuscatedName("x.cb")
	public int[] field318 = new int[10];

	@ObfuscatedName("x.db")
	public boolean[] field319 = new boolean[10];

	@ObfuscatedName("x.eb")
	public int field320;

	@ObfuscatedName("x.A")
	public int field290 = -1;

	@ObfuscatedName("x.D")
	public int field293 = -1;

	@ObfuscatedName("x.G")
	public int field296 = -1;

	@ObfuscatedName("x.L")
	public int field301 = -1;

	@ObfuscatedName("x.B")
	public int field291;

	@ObfuscatedName("x.C")
	public int field292;

	@ObfuscatedName("x.E")
	public int field294;

	@ObfuscatedName("x.F")
	public int field295;

	@ObfuscatedName("x.H")
	public int field297;

	@ObfuscatedName("x.I")
	public int field298;

	@ObfuscatedName("x.J")
	public int field299;

	@ObfuscatedName("x.K")
	public int field300;

	@ObfuscatedName("x.M")
	public int field302;

	@ObfuscatedName("x.N")
	public int field303;

	@ObfuscatedName("x.O")
	public int field304;

	@ObfuscatedName("x.P")
	public int field305;

	@ObfuscatedName("x.Q")
	public int field306;

	@ObfuscatedName("x.R")
	public int field307;

	@ObfuscatedName("x.S")
	public int field308;

	@ObfuscatedName("x.T")
	public int field309;

	@ObfuscatedName("x.U")
	public int field310;

	@ObfuscatedName("x.V")
	public int field311;

	@ObfuscatedName("x.W")
	public int field312;

	@ObfuscatedName("x.X")
	public int field313;

	@ObfuscatedName("x.Y")
	public int field314;

	@ObfuscatedName("x.Z")
	public int field315;

	@ObfuscatedName("x.a(IZIZ)V")
	public final void method109(int arg0, boolean arg1, int arg2) {
		if (field296 != -1 && class62.field901[field296].field909 <= 1) {
			field296 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field317[0];
			int var5 = arg0 - field318[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field316 < 9) {
					field316++;
				}

				for (int var6 = field316; var6 > 0; var6--) {
					field317[var6] = field317[var6 - 1];
					field318[var6] = field318[var6 - 1];
					field319[var6] = field319[var6 - 1];
				}

				field317[0] = arg2;
				field318[0] = arg0;
				field319[0] = false;
				return;
			}
		}

		field316 = 0;
		field320 = 0;
		field317[0] = arg2;
		field318[0] = arg0;
		field269 = field317[0] * 128 + field273 * 64;
		field270 = field318[0] * 128 + field273 * 64;
	}

	@ObfuscatedName("x.a(IZB)V")
	public final void method110(int arg0, boolean arg1) {
		int var3 = field317[0];
		int var4 = field318[0];
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

		if (field296 != -1 && class62.field901[field296].field909 <= 1) {
			field296 = -1;
		}

		if (field316 < 9) {
			field316++;
		}

		for (int var5 = field316; var5 > 0; var5--) {
			field317[var5] = field317[var5 - 1];
			field318[var5] = field318[var5 - 1];
			field319[var5] = field319[var5 - 1];
		}

		field317[0] = var3;
		field318[0] = var4;
		field319[0] = arg1;
	}

	@ObfuscatedName("x.a(Z)Z")
	public boolean method111() {
		return false;
	}
}
