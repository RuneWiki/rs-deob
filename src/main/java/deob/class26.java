package deob;

@ObfuscatedName("z")
public class class26 extends class25 {

	@ObfuscatedName("z.o")
	public int field369;

	@ObfuscatedName("z.p")
	public int field370;

	@ObfuscatedName("z.q")
	public int field371;

	@ObfuscatedName("z.r")
	public boolean field372 = false;

	@ObfuscatedName("z.s")
	public int field373 = 1;

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
	public int field380 = -1;

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
	public int field415 = 200;

	@ObfuscatedName("z.jb")
	public int field416;

	@ObfuscatedName("z.kb")
	public int field417;

	@ObfuscatedName("z.lb")
	public int[] field418 = new int[10];

	@ObfuscatedName("z.mb")
	public int[] field419 = new int[10];

	@ObfuscatedName("z.nb")
	public boolean[] field420 = new boolean[10];

	@ObfuscatedName("z.ob")
	public int field421;

	@ObfuscatedName("z.pb")
	public int field422;

	@ObfuscatedName("z.B")
	public int field382 = 100;

	@ObfuscatedName("z.E")
	public int[] field385 = new int[4];

	@ObfuscatedName("z.F")
	public int[] field386 = new int[4];

	@ObfuscatedName("z.G")
	public int[] field387 = new int[4];

	@ObfuscatedName("z.H")
	public int field388 = -1000;

	@ObfuscatedName("z.K")
	public int field391 = -1;

	@ObfuscatedName("z.N")
	public int field394 = -1;

	@ObfuscatedName("z.Q")
	public int field397 = -1;

	@ObfuscatedName("z.V")
	public int field402 = -1;

	@ObfuscatedName("z.C")
	public int field383;

	@ObfuscatedName("z.D")
	public int field384;

	@ObfuscatedName("z.I")
	public int field389;

	@ObfuscatedName("z.J")
	public int field390;

	@ObfuscatedName("z.L")
	public int field392;

	@ObfuscatedName("z.M")
	public int field393;

	@ObfuscatedName("z.O")
	public int field395;

	@ObfuscatedName("z.P")
	public int field396;

	@ObfuscatedName("z.R")
	public int field398;

	@ObfuscatedName("z.S")
	public int field399;

	@ObfuscatedName("z.T")
	public int field400;

	@ObfuscatedName("z.U")
	public int field401;

	@ObfuscatedName("z.W")
	public int field403;

	@ObfuscatedName("z.X")
	public int field404;

	@ObfuscatedName("z.Y")
	public int field405;

	@ObfuscatedName("z.Z")
	public int field406;

	@ObfuscatedName("z.A")
	public String field381;

	@ObfuscatedName("z.a(IZII)V")
	public final void method124(int arg0, boolean arg1, int arg2) {
		if (field397 != -1 && class66.field979[field397].field992 == 1) {
			field397 = -1;
		}

		if (!arg1) {
			int var4 = arg0 - field418[0];
			int var5 = arg2 - field419[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field417 < 9) {
					field417++;
				}

				for (int var6 = field417; var6 > 0; var6--) {
					field418[var6] = field418[var6 - 1];
					field419[var6] = field419[var6 - 1];
					field420[var6] = field420[var6 - 1];
				}

				field418[0] = arg0;
				field419[0] = arg2;
				field420[0] = false;
				return;
			}
		}

		field417 = 0;
		field422 = 0;
		field421 = 0;
		field418[0] = arg0;
		field419[0] = arg2;
		field369 = field418[0] * 128 + field373 * 64;
		field370 = field419[0] * 128 + field373 * 64;
	}

	@ObfuscatedName("z.a(IZI)V")
	public final void method125(int arg0, boolean arg1) {
		int var3 = field418[0];
		int var4 = field419[0];
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

		if (field397 != -1 && class66.field979[field397].field992 == 1) {
			field397 = -1;
		}

		if (field417 < 9) {
			field417++;
		}

		for (int var5 = field417; var5 > 0; var5--) {
			field418[var5] = field418[var5 - 1];
			field419[var5] = field419[var5 - 1];
			field420[var5] = field420[var5 - 1];
		}

		field418[0] = var3;
		field419[0] = var4;
		field420[0] = arg1;
	}

	@ObfuscatedName("z.b(I)V")
	public final void method126() {
		field417 = 0;
		field422 = 0;
	}

	@ObfuscatedName("z.a(Z)Z")
	public boolean method127() {
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void method128(int arg0, int arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			if (field387[var3] <= client.field1446) {
				field385[var3] = arg0;
				field386[var3] = arg1;
				field387[var3] = client.field1446 + 70;
				return;
			}
		}
	}
}
