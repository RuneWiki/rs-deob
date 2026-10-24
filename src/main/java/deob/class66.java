package deob;

@ObfuscatedName("nc")
public class class66 {

	@ObfuscatedName("nc.b")
	public static int field981;

	@ObfuscatedName("nc.c")
	public static class66[] field982;

	@ObfuscatedName("nc.d")
	public int field983;

	@ObfuscatedName("nc.e")
	public int[] field984;

	@ObfuscatedName("nc.f")
	public int[] field985;

	@ObfuscatedName("nc.g")
	public int[] field986;

	@ObfuscatedName("nc.h")
	public int field987 = -1;

	@ObfuscatedName("nc.i")
	public int[] field988;

	@ObfuscatedName("nc.j")
	public boolean field989 = false;

	@ObfuscatedName("nc.k")
	public int field990 = 5;

	@ObfuscatedName("nc.l")
	public int field991 = -1;

	@ObfuscatedName("nc.m")
	public int field992 = -1;

	@ObfuscatedName("nc.n")
	public int field993 = 99;

	@ObfuscatedName("nc.o")
	public int field994 = -1;

	@ObfuscatedName("nc.p")
	public int field995 = -1;

	@ObfuscatedName("nc.q")
	public int field996;

	@ObfuscatedName("nc.a(ILxb;)V")
	public static void method374(class50 arg0) {
		class38 var1 = new class38(arg0.method294("seq.dat", null));
		field981 = var1.method226();
		if (field982 == null) {
			field982 = new class66[field981];
		}

		for (int var2 = 0; var2 < field981; var2++) {
			if (field982[var2] == null) {
				field982[var2] = new class66();
			}

			field982[var2].method376(var1);
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int method375(int arg0) {
		int var2 = field986[arg0];
		if (var2 == 0) {
			class7 var3 = class7.method47(field984[arg0]);
			if (var3 != null) {
				var2 = field986[arg0] = var3.field134;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("nc.a(Llb;I)V")
	public void method376(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				if (field983 == 0) {
					field983 = 1;
					field984 = new int[1];
					field984[0] = -1;
					field985 = new int[1];
					field985[0] = -1;
					field986 = new int[1];
					field986[0] = -1;
				}

				if (field994 == -1) {
					if (field988 == null) {
						field994 = 0;
					} else {
						field994 = 2;
					}
				}

				if (field995 == -1) {
					if (field988 != null) {
						field995 = 2;
						return;
					}

					field995 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field983 = arg0.method224();
				field984 = new int[field983];
				field985 = new int[field983];
				field986 = new int[field983];
				for (int var3 = 0; var3 < field983; var3++) {
					field984[var3] = arg0.method226();
					field985[var3] = arg0.method226();
					if (field985[var3] == 0xFFFF) {
						field985[var3] = -1;
					}

					field986[var3] = arg0.method226();
				}
			} else if (var2 == 2) {
				field987 = arg0.method226();
			} else if (var2 == 3) {
				int var4 = arg0.method224();
				field988 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field988[var5] = arg0.method224();
				}

				field988[var4] = 9999999;
			} else if (var2 == 4) {
				field989 = true;
			} else if (var2 == 5) {
				field990 = arg0.method224();
			} else if (var2 == 6) {
				field991 = arg0.method226();
			} else if (var2 == 7) {
				field992 = arg0.method226();
			} else if (var2 == 8) {
				field993 = arg0.method224();
			} else if (var2 == 9) {
				field994 = arg0.method224();
			} else if (var2 == 10) {
				field995 = arg0.method224();
			} else if (var2 == 11) {
				field996 = arg0.method224();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
