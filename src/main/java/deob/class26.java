package deob;

@ObfuscatedName("z")
public class class26 extends class25 {

	@ObfuscatedName("z.p")
	public int field368;

	@ObfuscatedName("z.q")
	public int field369;

	@ObfuscatedName("z.r")
	public int field370;

	@ObfuscatedName("z.s")
	public boolean field371 = false;

	@ObfuscatedName("z.t")
	public int field372 = 1;

	@ObfuscatedName("z.u")
	public int field373 = -1;

	@ObfuscatedName("z.v")
	public int field374 = -1;

	@ObfuscatedName("z.w")
	public int field375 = -1;

	@ObfuscatedName("z.x")
	public int field376 = -1;

	@ObfuscatedName("z.y")
	public int field377 = -1;

	@ObfuscatedName("z.z")
	public int field378 = -1;

	@ObfuscatedName("z.ab")
	public int field405;

	@ObfuscatedName("z.bb")
	public int field406;

	@ObfuscatedName("z.cb")
	public int field407;

	@ObfuscatedName("z.db")
	public int field408;

	@ObfuscatedName("z.eb")
	public int field409;

	@ObfuscatedName("z.fb")
	public int field410;

	@ObfuscatedName("z.gb")
	public int field411;

	@ObfuscatedName("z.hb")
	public int field412;

	@ObfuscatedName("z.ib")
	public int field413;

	@ObfuscatedName("z.jb")
	public int field414 = 200;

	@ObfuscatedName("z.kb")
	public int field415;

	@ObfuscatedName("z.lb")
	public int field416;

	@ObfuscatedName("z.mb")
	public int[] field417 = new int[10];

	@ObfuscatedName("z.nb")
	public int[] field418 = new int[10];

	@ObfuscatedName("z.ob")
	public boolean[] field419 = new boolean[10];

	@ObfuscatedName("z.pb")
	public int field420;

	@ObfuscatedName("z.qb")
	public int field421;

	@ObfuscatedName("z.A")
	public int field379 = -1;

	@ObfuscatedName("z.C")
	public int field381 = 100;

	@ObfuscatedName("z.F")
	public int[] field384 = new int[4];

	@ObfuscatedName("z.G")
	public int[] field385 = new int[4];

	@ObfuscatedName("z.H")
	public int[] field386 = new int[4];

	@ObfuscatedName("z.I")
	public int field387 = -1000;

	@ObfuscatedName("z.L")
	public int field390 = -1;

	@ObfuscatedName("z.O")
	public int field393 = -1;

	@ObfuscatedName("z.R")
	public int field396 = -1;

	@ObfuscatedName("z.W")
	public int field401 = -1;

	@ObfuscatedName("z.D")
	public int field382;

	@ObfuscatedName("z.E")
	public int field383;

	@ObfuscatedName("z.J")
	public int field388;

	@ObfuscatedName("z.K")
	public int field389;

	@ObfuscatedName("z.M")
	public int field391;

	@ObfuscatedName("z.N")
	public int field392;

	@ObfuscatedName("z.P")
	public int field394;

	@ObfuscatedName("z.Q")
	public int field395;

	@ObfuscatedName("z.S")
	public int field397;

	@ObfuscatedName("z.T")
	public int field398;

	@ObfuscatedName("z.U")
	public int field399;

	@ObfuscatedName("z.V")
	public int field400;

	@ObfuscatedName("z.X")
	public int field402;

	@ObfuscatedName("z.Y")
	public int field403;

	@ObfuscatedName("z.Z")
	public int field404;

	@ObfuscatedName("z.B")
	public String field380;

	@ObfuscatedName("z.a(ZBII)V")
	public final void method124(boolean arg0, int arg1, int arg2) {
		if (field396 != -1 && class66.field978[field396].field991 == 1) {
			field396 = -1;
		}

		if (!arg0) {
			int var4 = arg2 - field417[0];
			int var5 = arg1 - field418[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field416 < 9) {
					field416++;
				}

				for (int var6 = field416; var6 > 0; var6--) {
					field417[var6] = field417[var6 - 1];
					field418[var6] = field418[var6 - 1];
					field419[var6] = field419[var6 - 1];
				}

				field417[0] = arg2;
				field418[0] = arg1;
				field419[0] = false;
				return;
			}
		}

		field416 = 0;
		field421 = 0;
		field420 = 0;
		field417[0] = arg2;
		field418[0] = arg1;
		field368 = field417[0] * 128 + field372 * 64;
		field369 = field418[0] * 128 + field372 * 64;
	}

	@ObfuscatedName("z.a(ZIZ)V")
	public final void method125(int arg0, boolean arg1) {
		int var3 = field417[0];
		int var4 = field418[0];
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

		if (field396 != -1 && class66.field978[field396].field991 == 1) {
			field396 = -1;
		}

		if (field416 < 9) {
			field416++;
		}

		for (int var5 = field416; var5 > 0; var5--) {
			field417[var5] = field417[var5 - 1];
			field418[var5] = field418[var5 - 1];
			field419[var5] = field419[var5 - 1];
		}

		field417[0] = var3;
		field418[0] = var4;
		field419[0] = arg1;
	}

	@ObfuscatedName("z.a(I)V")
	public final void method126() {
		field416 = 0;
		field421 = 0;
	}

	@ObfuscatedName("z.b(I)Z")
	public boolean method127() {
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void method128(int arg0, int arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			if (field386[var3] <= client.field1060) {
				field384[var3] = arg1;
				field385[var3] = arg0;
				field386[var3] = client.field1060 + 70;
				return;
			}
		}
	}
}
