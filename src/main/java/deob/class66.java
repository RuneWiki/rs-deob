package deob;

@ObfuscatedName("nc")
public class class66 {

	@ObfuscatedName("nc.c")
	public static int field977;

	@ObfuscatedName("nc.d")
	public static class66[] field978;

	@ObfuscatedName("nc.e")
	public int field979;

	@ObfuscatedName("nc.f")
	public int[] field980;

	@ObfuscatedName("nc.g")
	public int[] field981;

	@ObfuscatedName("nc.h")
	public int[] field982;

	@ObfuscatedName("nc.i")
	public int field983 = -1;

	@ObfuscatedName("nc.j")
	public int[] field984;

	@ObfuscatedName("nc.k")
	public boolean field985 = false;

	@ObfuscatedName("nc.l")
	public int field986 = 5;

	@ObfuscatedName("nc.m")
	public int field987 = -1;

	@ObfuscatedName("nc.n")
	public int field988 = -1;

	@ObfuscatedName("nc.o")
	public int field989 = 99;

	@ObfuscatedName("nc.p")
	public int field990 = -1;

	@ObfuscatedName("nc.q")
	public int field991 = -1;

	@ObfuscatedName("nc.r")
	public int field992;

	@ObfuscatedName("nc.a(ILyb;)V")
	public static void method381(class51 arg0) {
		class39 var1 = new class39(arg0.method308("seq.dat", null));
		field977 = var1.method240();
		if (field978 == null) {
			field978 = new class66[field977];
		}

		for (int var2 = 0; var2 < field977; var2++) {
			if (field978[var2] == null) {
				field978[var2] = new class66();
			}

			field978[var2].method383(var1);
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int method382(int arg0) {
		int var2 = field982[arg0];
		if (var2 == 0) {
			class8 var3 = class8.method61(field980[arg0]);
			if (var3 != null) {
				var2 = field982[arg0] = var3.field143;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("nc.a(ZLmb;)V")
	public void method383(class39 arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				if (field979 == 0) {
					field979 = 1;
					field980 = new int[1];
					field980[0] = -1;
					field981 = new int[1];
					field981[0] = -1;
					field982 = new int[1];
					field982[0] = -1;
				}

				if (field990 == -1) {
					if (field984 == null) {
						field990 = 0;
					} else {
						field990 = 2;
					}
				}

				if (field991 == -1) {
					if (field984 != null) {
						field991 = 2;
						return;
					}

					field991 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field979 = arg0.method238();
				field980 = new int[field979];
				field981 = new int[field979];
				field982 = new int[field979];
				for (int var3 = 0; var3 < field979; var3++) {
					field980[var3] = arg0.method240();
					field981[var3] = arg0.method240();
					if (field981[var3] == 0xFFFF) {
						field981[var3] = -1;
					}

					field982[var3] = arg0.method240();
				}
			} else if (var2 == 2) {
				field983 = arg0.method240();
			} else if (var2 == 3) {
				int var4 = arg0.method238();
				field984 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field984[var5] = arg0.method238();
				}

				field984[var4] = 9999999;
			} else if (var2 == 4) {
				field985 = true;
			} else if (var2 == 5) {
				field986 = arg0.method238();
			} else if (var2 == 6) {
				field987 = arg0.method240();
			} else if (var2 == 7) {
				field988 = arg0.method240();
			} else if (var2 == 8) {
				field989 = arg0.method238();
			} else if (var2 == 9) {
				field990 = arg0.method238();
			} else if (var2 == 10) {
				field991 = arg0.method238();
			} else if (var2 == 11) {
				field992 = arg0.method238();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
