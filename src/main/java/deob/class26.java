package deob;

@ObfuscatedName("z")
public class class26 extends class25 {

	@ObfuscatedName("z.n")
	public int field359;

	@ObfuscatedName("z.o")
	public int field360;

	@ObfuscatedName("z.p")
	public int field361;

	@ObfuscatedName("z.q")
	public boolean field362 = false;

	@ObfuscatedName("z.r")
	public int field363 = 1;

	@ObfuscatedName("z.s")
	public int field364 = -1;

	@ObfuscatedName("z.t")
	public int field365 = -1;

	@ObfuscatedName("z.u")
	public int field366 = -1;

	@ObfuscatedName("z.v")
	public int field367 = -1;

	@ObfuscatedName("z.w")
	public int field368 = -1;

	@ObfuscatedName("z.x")
	public int field369 = -1;

	@ObfuscatedName("z.y")
	public int field370 = -1;

	@ObfuscatedName("z.z")
	public String field371;

	@ObfuscatedName("z.ab")
	public int field398;

	@ObfuscatedName("z.bb")
	public int field399;

	@ObfuscatedName("z.cb")
	public int field400;

	@ObfuscatedName("z.db")
	public int field401;

	@ObfuscatedName("z.eb")
	public int field402;

	@ObfuscatedName("z.fb")
	public int field403;

	@ObfuscatedName("z.gb")
	public int field404;

	@ObfuscatedName("z.hb")
	public int field405;

	@ObfuscatedName("z.ib")
	public int field406;

	@ObfuscatedName("z.jb")
	public int[] field407 = new int[10];

	@ObfuscatedName("z.kb")
	public int[] field408 = new int[10];

	@ObfuscatedName("z.lb")
	public boolean[] field409 = new boolean[10];

	@ObfuscatedName("z.mb")
	public int field410;

	@ObfuscatedName("z.A")
	public int field372 = 100;

	@ObfuscatedName("z.F")
	public int field377 = -1000;

	@ObfuscatedName("z.I")
	public int field380 = -1;

	@ObfuscatedName("z.L")
	public int field383 = -1;

	@ObfuscatedName("z.O")
	public int field386 = -1;

	@ObfuscatedName("z.T")
	public int field391 = -1;

	@ObfuscatedName("z.B")
	public int field373;

	@ObfuscatedName("z.C")
	public int field374;

	@ObfuscatedName("z.D")
	public int field375;

	@ObfuscatedName("z.E")
	public int field376;

	@ObfuscatedName("z.G")
	public int field378;

	@ObfuscatedName("z.H")
	public int field379;

	@ObfuscatedName("z.J")
	public int field381;

	@ObfuscatedName("z.K")
	public int field382;

	@ObfuscatedName("z.M")
	public int field384;

	@ObfuscatedName("z.N")
	public int field385;

	@ObfuscatedName("z.P")
	public int field387;

	@ObfuscatedName("z.Q")
	public int field388;

	@ObfuscatedName("z.R")
	public int field389;

	@ObfuscatedName("z.S")
	public int field390;

	@ObfuscatedName("z.U")
	public int field392;

	@ObfuscatedName("z.V")
	public int field393;

	@ObfuscatedName("z.W")
	public int field394;

	@ObfuscatedName("z.X")
	public int field395;

	@ObfuscatedName("z.Y")
	public int field396;

	@ObfuscatedName("z.Z")
	public int field397;

	@ObfuscatedName("z.a(IIZB)V")
	public final void method122(int arg0, int arg1, boolean arg2) {
		if (field386 != -1 && class65.field946[field386].field954 <= 1) {
			field386 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field407[0];
			int var5 = arg1 - field408[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field406 < 9) {
					field406++;
				}

				for (int var6 = field406; var6 > 0; var6--) {
					field407[var6] = field407[var6 - 1];
					field408[var6] = field408[var6 - 1];
					field409[var6] = field409[var6 - 1];
				}

				field407[0] = arg0;
				field408[0] = arg1;
				field409[0] = false;
				return;
			}
		}

		field406 = 0;
		field410 = 0;
		field407[0] = arg0;
		field408[0] = arg1;
		field359 = field407[0] * 128 + field363 * 64;
		field360 = field408[0] * 128 + field363 * 64;
	}

	@ObfuscatedName("z.a(IZB)V")
	public final void method123(int arg0, boolean arg1) {
		int var3 = field407[0];
		int var4 = field408[0];
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

		if (field386 != -1 && class65.field946[field386].field954 <= 1) {
			field386 = -1;
		}

		if (field406 < 9) {
			field406++;
		}

		for (int var5 = field406; var5 > 0; var5--) {
			field407[var5] = field407[var5 - 1];
			field408[var5] = field408[var5 - 1];
			field409[var5] = field409[var5 - 1];
		}

		field407[0] = var3;
		field408[0] = var4;
		field409[0] = arg1;
	}

	@ObfuscatedName("z.a(I)Z")
	public boolean method124() {
		return false;
	}
}
