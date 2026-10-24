package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.SeqType;

@ObfuscatedName("z")
public class PathingEntity extends Entity {

	@ObfuscatedName("z.n")
	public int field366;

	@ObfuscatedName("z.o")
	public int field367;

	@ObfuscatedName("z.p")
	public int field368;

	@ObfuscatedName("z.q")
	public boolean field369 = false;

	@ObfuscatedName("z.r")
	public int field370 = 1;

	@ObfuscatedName("z.s")
	public int field371 = -1;

	@ObfuscatedName("z.t")
	public int field372 = -1;

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
	public String field378;

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
	public int field414;

	@ObfuscatedName("z.kb")
	public int[] field415 = new int[10];

	@ObfuscatedName("z.lb")
	public int[] field416 = new int[10];

	@ObfuscatedName("z.mb")
	public boolean[] field417 = new boolean[10];

	@ObfuscatedName("z.nb")
	public int field418;

	@ObfuscatedName("z.ob")
	public int field419;

	@ObfuscatedName("z.A")
	public int field379 = 100;

	@ObfuscatedName("z.D")
	public int[] field382 = new int[4];

	@ObfuscatedName("z.E")
	public int[] field383 = new int[4];

	@ObfuscatedName("z.F")
	public int[] field384 = new int[4];

	@ObfuscatedName("z.G")
	public int field385 = -1000;

	@ObfuscatedName("z.J")
	public int field388 = -1;

	@ObfuscatedName("z.M")
	public int field391 = -1;

	@ObfuscatedName("z.P")
	public int field394 = -1;

	@ObfuscatedName("z.U")
	public int field399 = -1;

	@ObfuscatedName("z.B")
	public int field380;

	@ObfuscatedName("z.C")
	public int field381;

	@ObfuscatedName("z.H")
	public int field386;

	@ObfuscatedName("z.I")
	public int field387;

	@ObfuscatedName("z.K")
	public int field389;

	@ObfuscatedName("z.L")
	public int field390;

	@ObfuscatedName("z.N")
	public int field392;

	@ObfuscatedName("z.O")
	public int field393;

	@ObfuscatedName("z.Q")
	public int field395;

	@ObfuscatedName("z.R")
	public int field396;

	@ObfuscatedName("z.S")
	public int field397;

	@ObfuscatedName("z.T")
	public int field398;

	@ObfuscatedName("z.V")
	public int field400;

	@ObfuscatedName("z.W")
	public int field401;

	@ObfuscatedName("z.X")
	public int field402;

	@ObfuscatedName("z.Y")
	public int field403;

	@ObfuscatedName("z.Z")
	public int field404;

	@ObfuscatedName("z.a(ZIII)V")
	public final void method123(boolean arg0, int arg1, int arg2) {
		if (field394 != -1 && SeqType.field973[field394].field986 == 1) {
			field394 = -1;
		}

		if (!arg0) {
			int var4 = arg1 - field415[0];
			int var5 = arg2 - field416[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field414 < 9) {
					field414++;
				}

				for (int var6 = field414; var6 > 0; var6--) {
					field415[var6] = field415[var6 - 1];
					field416[var6] = field416[var6 - 1];
					field417[var6] = field417[var6 - 1];
				}

				field415[0] = arg1;
				field416[0] = arg2;
				field417[0] = false;
				return;
			}
		}

		field414 = 0;
		field419 = 0;
		field418 = 0;
		field415[0] = arg1;
		field416[0] = arg2;
		field366 = field415[0] * 128 + field370 * 64;
		field367 = field416[0] * 128 + field370 * 64;
	}

	@ObfuscatedName("z.a(IZZ)V")
	public final void method124(int arg0, boolean arg1) {
		int var3 = field415[0];
		int var4 = field416[0];
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

		if (field394 != -1 && SeqType.field973[field394].field986 == 1) {
			field394 = -1;
		}

		if (field414 < 9) {
			field414++;
		}

		for (int var5 = field414; var5 > 0; var5--) {
			field415[var5] = field415[var5 - 1];
			field416[var5] = field416[var5 - 1];
			field417[var5] = field417[var5 - 1];
		}

		field415[0] = var3;
		field416[0] = var4;
		field417[0] = arg1;
	}

	@ObfuscatedName("z.b(I)V")
	public final void method125() {
		field414 = 0;
		field419 = 0;
	}

	@ObfuscatedName("z.a(B)Z")
	public boolean method126() {
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void method127(int arg0, int arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			if (field384[var3] <= Client.field1385) {
				field382[var3] = arg1;
				field383[var3] = arg0;
				field384[var3] = Client.field1385 + 70;
				return;
			}
		}
	}
}
