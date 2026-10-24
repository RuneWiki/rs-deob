package deob;

@ObfuscatedName("nc")
public class class66 {

	@ObfuscatedName("nc.c")
	public static int field984;

	@ObfuscatedName("nc.d")
	public static class66[] field985;

	@ObfuscatedName("nc.e")
	public int field986;

	@ObfuscatedName("nc.f")
	public int[] field987;

	@ObfuscatedName("nc.g")
	public int[] field988;

	@ObfuscatedName("nc.h")
	public int[] field989;

	@ObfuscatedName("nc.i")
	public int field990 = -1;

	@ObfuscatedName("nc.j")
	public int[] field991;

	@ObfuscatedName("nc.k")
	public boolean field992 = false;

	@ObfuscatedName("nc.l")
	public int field993 = 5;

	@ObfuscatedName("nc.m")
	public int field994 = -1;

	@ObfuscatedName("nc.n")
	public int field995 = -1;

	@ObfuscatedName("nc.o")
	public int field996 = 99;

	@ObfuscatedName("nc.p")
	public int field997 = -1;

	@ObfuscatedName("nc.q")
	public int field998 = -1;

	@ObfuscatedName("nc.r")
	public int field999;

	@ObfuscatedName("nc.s")
	public int field1000;

	@ObfuscatedName("nc.a(Lxb;I)V")
	public static void method375(class50 arg0) {
		class38 var1 = new class38(arg0.method295("seq.dat", null));
		field984 = var1.method227();
		if (field985 == null) {
			field985 = new class66[field984];
		}

		for (int var2 = 0; var2 < field984; var2++) {
			if (field985[var2] == null) {
				field985[var2] = new class66();
			}

			field985[var2].method377(var1);
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int method376(int arg0) {
		int var2 = field989[arg0];
		if (var2 == 0) {
			class7 var3 = class7.method47(field987[arg0]);
			if (var3 != null) {
				var2 = field989[arg0] = var3.field134;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("nc.a(Llb;B)V")
	public void method377(class38 arg0) {
		while (true) {
			int var2 = arg0.method225();
			if (var2 == 0) {
				if (field986 == 0) {
					field986 = 1;
					field987 = new int[1];
					field987[0] = -1;
					field988 = new int[1];
					field988[0] = -1;
					field989 = new int[1];
					field989[0] = -1;
				}

				if (field997 == -1) {
					if (field991 == null) {
						field997 = 0;
					} else {
						field997 = 2;
					}
				}

				if (field998 == -1) {
					if (field991 != null) {
						field998 = 2;
						return;
					}

					field998 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field986 = arg0.method225();
				field987 = new int[field986];
				field988 = new int[field986];
				field989 = new int[field986];
				for (int var3 = 0; var3 < field986; var3++) {
					field987[var3] = arg0.method227();
					field988[var3] = arg0.method227();
					if (field988[var3] == 0xFFFF) {
						field988[var3] = -1;
					}

					field989[var3] = arg0.method227();
				}
			} else if (var2 == 2) {
				field990 = arg0.method227();
			} else if (var2 == 3) {
				int var4 = arg0.method225();
				field991 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field991[var5] = arg0.method225();
				}

				field991[var4] = 9999999;
			} else if (var2 == 4) {
				field992 = true;
			} else if (var2 == 5) {
				field993 = arg0.method225();
			} else if (var2 == 6) {
				field994 = arg0.method227();
			} else if (var2 == 7) {
				field995 = arg0.method227();
			} else if (var2 == 8) {
				field996 = arg0.method225();
			} else if (var2 == 9) {
				field997 = arg0.method225();
			} else if (var2 == 10) {
				field998 = arg0.method225();
			} else if (var2 == 11) {
				field999 = arg0.method225();
			} else if (var2 == 12) {
				field1000 = arg0.method230();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
