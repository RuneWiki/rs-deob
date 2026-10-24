package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SeqType;

@ObfuscatedName("LRUWCBNN")
public abstract class ClientEntity extends ModelSource {

	@ObfuscatedName("LRUWCBNN.o")
	public int field978 = 100;

	@ObfuscatedName("LRUWCBNN.s")
	public int[] field982 = new int[10];

	@ObfuscatedName("LRUWCBNN.t")
	public int[] field983 = new int[10];

	@ObfuscatedName("LRUWCBNN.u")
	public int field984 = -1;

	@ObfuscatedName("LRUWCBNN.x")
	public boolean[] field987 = new boolean[10];

	@ObfuscatedName("LRUWCBNN.y")
	public boolean field988 = false;

	@ObfuscatedName("LRUWCBNN.A")
	public int field990 = 200;

	@ObfuscatedName("LRUWCBNN.B")
	public int field991 = -1000;

	@ObfuscatedName("LRUWCBNN.G")
	public int field996 = 32;

	@ObfuscatedName("LRUWCBNN.H")
	public int field997 = 1;

	@ObfuscatedName("LRUWCBNN.P")
	public int field1005 = -1;

	@ObfuscatedName("LRUWCBNN.U")
	public int field1010 = -1;

	@ObfuscatedName("LRUWCBNN.Z")
	public int field1015 = -1;

	@ObfuscatedName("LRUWCBNN.ab")
	public int field1016 = -1;

	@ObfuscatedName("LRUWCBNN.bb")
	public int field1017 = -1;

	@ObfuscatedName("LRUWCBNN.cb")
	public int field1018 = -1;

	@ObfuscatedName("LRUWCBNN.eb")
	public int field1020 = -1;

	@ObfuscatedName("LRUWCBNN.jb")
	public int field1025 = -1;

	@ObfuscatedName("LRUWCBNN.kb")
	public int[] field1026 = new int[4];

	@ObfuscatedName("LRUWCBNN.lb")
	public int[] field1027 = new int[4];

	@ObfuscatedName("LRUWCBNN.mb")
	public int[] field1028 = new int[4];

	@ObfuscatedName("LRUWCBNN.ob")
	public int field1030 = -1;

	@ObfuscatedName("LRUWCBNN.pb")
	public int field1031 = -1;

	@ObfuscatedName("LRUWCBNN.K")
	public int field1000;

	@ObfuscatedName("LRUWCBNN.L")
	public int field1001;

	@ObfuscatedName("LRUWCBNN.M")
	public int field1002;

	@ObfuscatedName("LRUWCBNN.N")
	public int field1003;

	@ObfuscatedName("LRUWCBNN.O")
	public int field1004;

	@ObfuscatedName("LRUWCBNN.Q")
	public int field1006;

	@ObfuscatedName("LRUWCBNN.R")
	public int field1007;

	@ObfuscatedName("LRUWCBNN.S")
	public int field1008;

	@ObfuscatedName("LRUWCBNN.T")
	public int field1009;

	@ObfuscatedName("LRUWCBNN.V")
	public int field1011;

	@ObfuscatedName("LRUWCBNN.W")
	public int field1012;

	@ObfuscatedName("LRUWCBNN.X")
	public int field1013;

	@ObfuscatedName("LRUWCBNN.Y")
	public int field1014;

	@ObfuscatedName("LRUWCBNN.db")
	public int field1019;

	@ObfuscatedName("LRUWCBNN.fb")
	public int field1021;

	@ObfuscatedName("LRUWCBNN.gb")
	public int field1022;

	@ObfuscatedName("LRUWCBNN.hb")
	public int field1023;

	@ObfuscatedName("LRUWCBNN.ib")
	public int field1024;

	@ObfuscatedName("LRUWCBNN.nb")
	public int field1029;

	@ObfuscatedName("LRUWCBNN.p")
	public int field979;

	@ObfuscatedName("LRUWCBNN.q")
	public int field980;

	@ObfuscatedName("LRUWCBNN.r")
	public int field981;

	@ObfuscatedName("LRUWCBNN.v")
	public int field985;

	@ObfuscatedName("LRUWCBNN.w")
	public int field986;

	@ObfuscatedName("LRUWCBNN.z")
	public int field989;

	@ObfuscatedName("LRUWCBNN.C")
	public int field992;

	@ObfuscatedName("LRUWCBNN.D")
	public int field993;

	@ObfuscatedName("LRUWCBNN.E")
	public int field994;

	@ObfuscatedName("LRUWCBNN.F")
	public int field995;

	@ObfuscatedName("LRUWCBNN.I")
	public int field998;

	@ObfuscatedName("LRUWCBNN.J")
	public int field999;

	@ObfuscatedName("LRUWCBNN.m")
	public String field977;

	@ObfuscatedName("LRUWCBNN.a(I)V")
	public final void method350() {
		field1029 = 0;
		field1009 = 0;
	}

	@ObfuscatedName("LRUWCBNN.b(I)Z")
	public boolean method351() {
		return false;
	}

	@ObfuscatedName("LRUWCBNN.a(ZII)V")
	public final void method352(boolean arg0, int arg1) {
		int var3 = field982[0];
		int var4 = field983[0];
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

		if (field1020 != -1 && SeqType.field680[field1020].field693 == 1) {
			field1020 = -1;
		}

		if (field1029 < 9) {
			field1029++;
		}

		for (int var5 = field1029; var5 > 0; var5--) {
			field982[var5] = field982[var5 - 1];
			field983[var5] = field983[var5 - 1];
			field987[var5] = field987[var5 - 1];
		}

		field982[0] = var3;
		field983[0] = var4;
		field987[0] = arg0;
	}

	@ObfuscatedName("LRUWCBNN.a(IZII)V")
	public final void method353(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1028[var4] <= arg0) {
				field1026[var4] = arg1;
				field1027[var4] = arg2;
				field1028[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("LRUWCBNN.a(IBZI)V")
	public final void method354(int arg0, boolean arg1, int arg2) {
		if (field1020 != -1 && SeqType.field680[field1020].field693 == 1) {
			field1020 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field982[0];
			int var5 = arg0 - field983[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1029 < 9) {
					field1029++;
				}

				for (int var6 = field1029; var6 > 0; var6--) {
					field982[var6] = field982[var6 - 1];
					field983[var6] = field983[var6 - 1];
					field987[var6] = field987[var6 - 1];
				}

				field982[0] = arg2;
				field983[0] = arg0;
				field987[0] = false;
				return;
			}
		}

		field1029 = 0;
		field1009 = 0;
		field1019 = 0;
		field982[0] = arg2;
		field983[0] = arg0;
		field1006 = field982[0] * 128 + field997 * 64;
		field1007 = field983[0] * 128 + field997 * 64;
	}
}
