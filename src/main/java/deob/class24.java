package deob;

@ObfuscatedName("x")
public class class24 extends class23 {

	@ObfuscatedName("x.g")
	public int field268;

	@ObfuscatedName("x.h")
	public int field269;

	@ObfuscatedName("x.i")
	public int field270;

	@ObfuscatedName("x.j")
	public boolean field271 = false;

	@ObfuscatedName("x.k")
	public int field272 = 1;

	@ObfuscatedName("x.l")
	public int field273 = -1;

	@ObfuscatedName("x.m")
	public int field274 = -1;

	@ObfuscatedName("x.n")
	public int field275 = -1;

	@ObfuscatedName("x.o")
	public int field276 = -1;

	@ObfuscatedName("x.p")
	public int field277 = -1;

	@ObfuscatedName("x.q")
	public int field278 = -1;

	@ObfuscatedName("x.r")
	public int field279 = -1;

	@ObfuscatedName("x.s")
	public String field280;

	@ObfuscatedName("x.t")
	public int field281 = 100;

	@ObfuscatedName("x.u")
	public int field282;

	@ObfuscatedName("x.v")
	public int field283;

	@ObfuscatedName("x.w")
	public int field284;

	@ObfuscatedName("x.x")
	public int field285;

	@ObfuscatedName("x.y")
	public int field286 = -1000;

	@ObfuscatedName("x.z")
	public int field287;

	@ObfuscatedName("x.ab")
	public int field314;

	@ObfuscatedName("x.bb")
	public int field315;

	@ObfuscatedName("x.cb")
	public int[] field316 = new int[10];

	@ObfuscatedName("x.db")
	public int[] field317 = new int[10];

	@ObfuscatedName("x.eb")
	public boolean[] field318 = new boolean[10];

	@ObfuscatedName("x.fb")
	public int field319;

	@ObfuscatedName("x.B")
	public int field289 = -1;

	@ObfuscatedName("x.E")
	public int field292 = -1;

	@ObfuscatedName("x.H")
	public int field295 = -1;

	@ObfuscatedName("x.M")
	public int field300 = -1;

	@ObfuscatedName("x.A")
	public int field288;

	@ObfuscatedName("x.C")
	public int field290;

	@ObfuscatedName("x.D")
	public int field291;

	@ObfuscatedName("x.F")
	public int field293;

	@ObfuscatedName("x.G")
	public int field294;

	@ObfuscatedName("x.I")
	public int field296;

	@ObfuscatedName("x.J")
	public int field297;

	@ObfuscatedName("x.K")
	public int field298;

	@ObfuscatedName("x.L")
	public int field299;

	@ObfuscatedName("x.N")
	public int field301;

	@ObfuscatedName("x.O")
	public int field302;

	@ObfuscatedName("x.P")
	public int field303;

	@ObfuscatedName("x.Q")
	public int field304;

	@ObfuscatedName("x.R")
	public int field305;

	@ObfuscatedName("x.S")
	public int field306;

	@ObfuscatedName("x.T")
	public int field307;

	@ObfuscatedName("x.U")
	public int field308;

	@ObfuscatedName("x.V")
	public int field309;

	@ObfuscatedName("x.W")
	public int field310;

	@ObfuscatedName("x.X")
	public int field311;

	@ObfuscatedName("x.Y")
	public int field312;

	@ObfuscatedName("x.Z")
	public int field313;

	@ObfuscatedName("x.a(IZII)V")
	public final void method109(int arg0, boolean arg1, int arg2) {
		if (field295 != -1 && class62.field896[field295].field904 <= 1) {
			field295 = -1;
		}

		if (!arg1) {
			int var4 = arg0 - field316[0];
			int var5 = arg2 - field317[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field315 < 9) {
					field315++;
				}

				for (int var6 = field315; var6 > 0; var6--) {
					field316[var6] = field316[var6 - 1];
					field317[var6] = field317[var6 - 1];
					field318[var6] = field318[var6 - 1];
				}

				field316[0] = arg0;
				field317[0] = arg2;
				field318[0] = false;
				return;
			}
		}

		field315 = 0;
		field319 = 0;
		field316[0] = arg0;
		field317[0] = arg2;
		field268 = field316[0] * 128 + field272 * 64;
		field269 = field317[0] * 128 + field272 * 64;
	}

	@ObfuscatedName("x.a(ZII)V")
	public final void method110(boolean arg0, int arg1) {
		int var3 = field316[0];
		int var4 = field317[0];
		if (arg1 == 0) {
			var3--;
			var4++;
		}

		if (arg1 == 1) {
			var4++;
		}

		if (arg1 == 2) {
			var3++;
			var4++;
		}

		if (arg1 == 3) {
			var3--;
		}

		if (arg1 == 4) {
			var3++;
		}

		if (arg1 == 5) {
			var3--;
			var4--;
		}

		if (arg1 == 6) {
			var4--;
		}

		if (arg1 == 7) {
			var3++;
			var4--;
		}

		if (field295 != -1 && class62.field896[field295].field904 <= 1) {
			field295 = -1;
		}

		if (field315 < 9) {
			field315++;
		}

		for (int var5 = field315; var5 > 0; var5--) {
			field316[var5] = field316[var5 - 1];
			field317[var5] = field317[var5 - 1];
			field318[var5] = field318[var5 - 1];
		}

		field316[0] = var3;
		field317[0] = var4;
		field318[0] = arg0;
	}

	@ObfuscatedName("x.a(I)Z")
	public boolean method111() {
		return false;
	}
}
