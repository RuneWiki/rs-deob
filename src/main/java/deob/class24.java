package deob;

@ObfuscatedName("x")
public class class24 extends class23 {

	@ObfuscatedName("x.f")
	public int field265;

	@ObfuscatedName("x.g")
	public int field266;

	@ObfuscatedName("x.h")
	public int field267;

	@ObfuscatedName("x.i")
	public int field268;

	@ObfuscatedName("x.j")
	public int field269 = 1;

	@ObfuscatedName("x.k")
	public int field270 = -1;

	@ObfuscatedName("x.l")
	public int field271 = -1;

	@ObfuscatedName("x.m")
	public int field272 = -1;

	@ObfuscatedName("x.n")
	public int field273 = -1;

	@ObfuscatedName("x.o")
	public int field274 = -1;

	@ObfuscatedName("x.p")
	public int field275 = -1;

	@ObfuscatedName("x.q")
	public int field276 = -1;

	@ObfuscatedName("x.r")
	public String field277;

	@ObfuscatedName("x.s")
	public int field278 = 100;

	@ObfuscatedName("x.t")
	public int field279;

	@ObfuscatedName("x.u")
	public int field280;

	@ObfuscatedName("x.v")
	public int field281;

	@ObfuscatedName("x.w")
	public int field282;

	@ObfuscatedName("x.x")
	public int field283 = -1000;

	@ObfuscatedName("x.y")
	public int field284;

	@ObfuscatedName("x.z")
	public int field285;

	@ObfuscatedName("x.ab")
	public int field312;

	@ObfuscatedName("x.bb")
	public int[] field313 = new int[10];

	@ObfuscatedName("x.cb")
	public int[] field314 = new int[10];

	@ObfuscatedName("x.db")
	public boolean[] field315 = new boolean[10];

	@ObfuscatedName("x.eb")
	public int field316;

	@ObfuscatedName("x.A")
	public int field286 = -1;

	@ObfuscatedName("x.D")
	public int field289 = -1;

	@ObfuscatedName("x.G")
	public int field292 = -1;

	@ObfuscatedName("x.L")
	public int field297 = -1;

	@ObfuscatedName("x.B")
	public int field287;

	@ObfuscatedName("x.C")
	public int field288;

	@ObfuscatedName("x.E")
	public int field290;

	@ObfuscatedName("x.F")
	public int field291;

	@ObfuscatedName("x.H")
	public int field293;

	@ObfuscatedName("x.I")
	public int field294;

	@ObfuscatedName("x.J")
	public int field295;

	@ObfuscatedName("x.K")
	public int field296;

	@ObfuscatedName("x.M")
	public int field298;

	@ObfuscatedName("x.N")
	public int field299;

	@ObfuscatedName("x.O")
	public int field300;

	@ObfuscatedName("x.P")
	public int field301;

	@ObfuscatedName("x.Q")
	public int field302;

	@ObfuscatedName("x.R")
	public int field303;

	@ObfuscatedName("x.S")
	public int field304;

	@ObfuscatedName("x.T")
	public int field305;

	@ObfuscatedName("x.U")
	public int field306;

	@ObfuscatedName("x.V")
	public int field307;

	@ObfuscatedName("x.W")
	public int field308;

	@ObfuscatedName("x.X")
	public int field309;

	@ObfuscatedName("x.Y")
	public int field310;

	@ObfuscatedName("x.Z")
	public int field311;

	@ObfuscatedName("x.a(BII)V")
	public final void method106(int arg0, int arg1) {
		if (field292 != -1 && class59.field843[field292].field851 <= 1) {
			field292 = -1;
		}

		int var3 = arg0 - field313[0];
		int var4 = arg1 - field314[0];
		if (var3 >= -2 && var3 <= 2 && var4 >= -2 && var4 <= 2) {
			if (field312 < 9) {
				field312++;
			}

			for (int var5 = field312; var5 > 0; var5--) {
				field313[var5] = field313[var5 - 1];
				field314[var5] = field314[var5 - 1];
				field315[var5] = field315[var5 - 1];
			}

			field313[0] = arg0;
			field314[0] = arg1;
			field315[0] = false;
		} else {
			field312 = 0;
			field316 = 0;
			field313[0] = arg0;
			field314[0] = arg1;
			field265 = field313[0] * 128 + field269 * 64;
			field266 = field314[0] * 128 + field269 * 64;
		}
	}

	@ObfuscatedName("x.a(ZII)V")
	public final void method107(boolean arg0, int arg1) {
		int var3 = field313[0];
		int var4 = field314[0];
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

		if (field292 != -1 && class59.field843[field292].field851 <= 1) {
			field292 = -1;
		}

		if (field312 < 9) {
			field312++;
		}

		for (int var5 = field312; var5 > 0; var5--) {
			field313[var5] = field313[var5 - 1];
			field314[var5] = field314[var5 - 1];
			field315[var5] = field315[var5 - 1];
		}

		field313[0] = var3;
		field314[0] = var4;
		field315[0] = arg0;
	}

	@ObfuscatedName("x.b(I)Z")
	public boolean method108() {
		return false;
	}
}
