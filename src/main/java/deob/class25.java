package deob;

@ObfuscatedName("y")
public class class25 extends class24 {

	@ObfuscatedName("y.o")
	public int field360;

	@ObfuscatedName("y.p")
	public int field361;

	@ObfuscatedName("y.q")
	public int field362;

	@ObfuscatedName("y.r")
	public boolean field363 = false;

	@ObfuscatedName("y.s")
	public int field364 = 1;

	@ObfuscatedName("y.t")
	public int field365 = -1;

	@ObfuscatedName("y.u")
	public int field366 = -1;

	@ObfuscatedName("y.v")
	public int field367 = -1;

	@ObfuscatedName("y.w")
	public int field368 = -1;

	@ObfuscatedName("y.x")
	public int field369 = -1;

	@ObfuscatedName("y.y")
	public int field370 = -1;

	@ObfuscatedName("y.z")
	public int field371 = -1;

	@ObfuscatedName("y.ab")
	public int field398;

	@ObfuscatedName("y.bb")
	public int field399;

	@ObfuscatedName("y.cb")
	public int field400;

	@ObfuscatedName("y.db")
	public int field401;

	@ObfuscatedName("y.eb")
	public int field402;

	@ObfuscatedName("y.fb")
	public int field403;

	@ObfuscatedName("y.gb")
	public int field404;

	@ObfuscatedName("y.hb")
	public int field405;

	@ObfuscatedName("y.ib")
	public int field406 = 200;

	@ObfuscatedName("y.jb")
	public int field407;

	@ObfuscatedName("y.kb")
	public int field408 = 32;

	@ObfuscatedName("y.lb")
	public int field409;

	@ObfuscatedName("y.mb")
	public int[] field410 = new int[10];

	@ObfuscatedName("y.nb")
	public int[] field411 = new int[10];

	@ObfuscatedName("y.ob")
	public boolean[] field412 = new boolean[10];

	@ObfuscatedName("y.pb")
	public int field413;

	@ObfuscatedName("y.qb")
	public int field414;

	@ObfuscatedName("y.B")
	public int field373 = 100;

	@ObfuscatedName("y.E")
	public int[] field376 = new int[4];

	@ObfuscatedName("y.F")
	public int[] field377 = new int[4];

	@ObfuscatedName("y.G")
	public int[] field378 = new int[4];

	@ObfuscatedName("y.H")
	public int field379 = -1000;

	@ObfuscatedName("y.K")
	public int field382 = -1;

	@ObfuscatedName("y.N")
	public int field385 = -1;

	@ObfuscatedName("y.Q")
	public int field388 = -1;

	@ObfuscatedName("y.V")
	public int field393 = -1;

	@ObfuscatedName("y.C")
	public int field374;

	@ObfuscatedName("y.D")
	public int field375;

	@ObfuscatedName("y.I")
	public int field380;

	@ObfuscatedName("y.J")
	public int field381;

	@ObfuscatedName("y.L")
	public int field383;

	@ObfuscatedName("y.M")
	public int field384;

	@ObfuscatedName("y.O")
	public int field386;

	@ObfuscatedName("y.P")
	public int field387;

	@ObfuscatedName("y.R")
	public int field389;

	@ObfuscatedName("y.S")
	public int field390;

	@ObfuscatedName("y.T")
	public int field391;

	@ObfuscatedName("y.U")
	public int field392;

	@ObfuscatedName("y.W")
	public int field394;

	@ObfuscatedName("y.X")
	public int field395;

	@ObfuscatedName("y.Y")
	public int field396;

	@ObfuscatedName("y.Z")
	public int field397;

	@ObfuscatedName("y.A")
	public String field372;

	@ObfuscatedName("y.a(IBZI)V")
	public final void method110(int arg0, boolean arg1, int arg2) {
		if (field388 != -1 && class66.field996[field388].field1009 == 1) {
			field388 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field410[0];
			int var5 = arg0 - field411[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field409 < 9) {
					field409++;
				}

				for (int var6 = field409; var6 > 0; var6--) {
					field410[var6] = field410[var6 - 1];
					field411[var6] = field411[var6 - 1];
					field412[var6] = field412[var6 - 1];
				}

				field410[0] = arg2;
				field411[0] = arg0;
				field412[0] = false;
				return;
			}
		}

		field409 = 0;
		field414 = 0;
		field413 = 0;
		field410[0] = arg2;
		field411[0] = arg0;
		field360 = field410[0] * 128 + field364 * 64;
		field361 = field411[0] * 128 + field364 * 64;
	}

	@ObfuscatedName("y.a(ZII)V")
	public final void method111(boolean arg0, int arg1) {
		int var3 = field410[0];
		int var4 = field411[0];
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

		if (field388 != -1 && class66.field996[field388].field1009 == 1) {
			field388 = -1;
		}

		if (field409 < 9) {
			field409++;
		}

		for (int var5 = field409; var5 > 0; var5--) {
			field410[var5] = field410[var5 - 1];
			field411[var5] = field411[var5 - 1];
			field412[var5] = field412[var5 - 1];
		}

		field410[0] = var3;
		field411[0] = var4;
		field412[0] = arg0;
	}

	@ObfuscatedName("y.b(I)V")
	public final void method112() {
		field409 = 0;
		field414 = 0;
	}

	@ObfuscatedName("y.a(B)Z")
	public boolean method113() {
		return false;
	}

	@ObfuscatedName("y.a(ZIII)V")
	public final void method114(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field378[var4] <= arg1) {
				field376[var4] = arg2;
				field377[var4] = arg0;
				field378[var4] = arg1 + 70;
				return;
			}
		}
	}
}
