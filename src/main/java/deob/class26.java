package deob;

@ObfuscatedName("z")
public class class26 extends class25 {

	@ObfuscatedName("z.n")
	public int field368;

	@ObfuscatedName("z.o")
	public int field369;

	@ObfuscatedName("z.p")
	public int field370;

	@ObfuscatedName("z.q")
	public boolean field371 = false;

	@ObfuscatedName("z.r")
	public int field372 = 1;

	@ObfuscatedName("z.s")
	public int field373 = -1;

	@ObfuscatedName("z.t")
	public int field374 = -1;

	@ObfuscatedName("z.u")
	public int field375 = -1;

	@ObfuscatedName("z.v")
	public int field376 = -1;

	@ObfuscatedName("z.w")
	public int field377 = -1;

	@ObfuscatedName("z.x")
	public int field378 = -1;

	@ObfuscatedName("z.y")
	public int field379 = -1;

	@ObfuscatedName("z.z")
	public String field380;

	@ObfuscatedName("z.ab")
	public int field407;

	@ObfuscatedName("z.bb")
	public int field408;

	@ObfuscatedName("z.cb")
	public int field409;

	@ObfuscatedName("z.db")
	public int field410;

	@ObfuscatedName("z.eb")
	public int field411;

	@ObfuscatedName("z.fb")
	public int field412;

	@ObfuscatedName("z.gb")
	public int field413;

	@ObfuscatedName("z.hb")
	public int field414;

	@ObfuscatedName("z.ib")
	public int field415;

	@ObfuscatedName("z.jb")
	public int field416;

	@ObfuscatedName("z.kb")
	public int[] field417 = new int[10];

	@ObfuscatedName("z.lb")
	public int[] field418 = new int[10];

	@ObfuscatedName("z.mb")
	public boolean[] field419 = new boolean[10];

	@ObfuscatedName("z.nb")
	public int field420;

	@ObfuscatedName("z.ob")
	public int field421;

	@ObfuscatedName("z.A")
	public int field381 = 100;

	@ObfuscatedName("z.D")
	public int[] field384 = new int[4];

	@ObfuscatedName("z.E")
	public int[] field385 = new int[4];

	@ObfuscatedName("z.F")
	public int[] field386 = new int[4];

	@ObfuscatedName("z.G")
	public int field387 = -1000;

	@ObfuscatedName("z.J")
	public int field390 = -1;

	@ObfuscatedName("z.M")
	public int field393 = -1;

	@ObfuscatedName("z.P")
	public int field396 = -1;

	@ObfuscatedName("z.U")
	public int field401 = -1;

	@ObfuscatedName("z.B")
	public int field382;

	@ObfuscatedName("z.C")
	public int field383;

	@ObfuscatedName("z.H")
	public int field388;

	@ObfuscatedName("z.I")
	public int field389;

	@ObfuscatedName("z.K")
	public int field391;

	@ObfuscatedName("z.L")
	public int field392;

	@ObfuscatedName("z.N")
	public int field394;

	@ObfuscatedName("z.O")
	public int field395;

	@ObfuscatedName("z.Q")
	public int field397;

	@ObfuscatedName("z.R")
	public int field398;

	@ObfuscatedName("z.S")
	public int field399;

	@ObfuscatedName("z.T")
	public int field400;

	@ObfuscatedName("z.V")
	public int field402;

	@ObfuscatedName("z.W")
	public int field403;

	@ObfuscatedName("z.X")
	public int field404;

	@ObfuscatedName("z.Y")
	public int field405;

	@ObfuscatedName("z.Z")
	public int field406;

	@ObfuscatedName("z.a(IIIZ)V")
	public final void method123(int arg0, int arg1, boolean arg2) {
		if (field396 != -1 && class66.field978[field396].field991 == 1) {
			field396 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field417[0];
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

				field417[0] = arg0;
				field418[0] = arg1;
				field419[0] = false;
				return;
			}
		}

		field416 = 0;
		field421 = 0;
		field420 = 0;
		field417[0] = arg0;
		field418[0] = arg1;
		field368 = field417[0] * 128 + field372 * 64;
		field369 = field418[0] * 128 + field372 * 64;
	}

	@ObfuscatedName("z.a(ZII)V")
	public final void method124(boolean arg0, int arg1) {
		int var3 = field417[0];
		int var4 = field418[0];
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
		field419[0] = arg0;
	}

	@ObfuscatedName("z.a(B)V")
	public final void method125() {
		field416 = 0;
		field421 = 0;
	}

	@ObfuscatedName("z.b(B)Z")
	public boolean method126() {
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void method127(int arg0, int arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			if (field386[var3] <= client.field1259) {
				field384[var3] = arg1;
				field385[var3] = arg0;
				field386[var3] = client.field1259 + 70;
				return;
			}
		}
	}
}
