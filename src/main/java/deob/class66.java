package deob;

@ObfuscatedName("nc")
public class class66 {

	@ObfuscatedName("nc.c")
	public static int field978;

	@ObfuscatedName("nc.d")
	public static class66[] field979;

	@ObfuscatedName("nc.e")
	public int field980;

	@ObfuscatedName("nc.f")
	public int[] field981;

	@ObfuscatedName("nc.g")
	public int[] field982;

	@ObfuscatedName("nc.h")
	public int[] field983;

	@ObfuscatedName("nc.i")
	public int field984 = -1;

	@ObfuscatedName("nc.j")
	public int[] field985;

	@ObfuscatedName("nc.k")
	public boolean field986 = false;

	@ObfuscatedName("nc.l")
	public int field987 = 5;

	@ObfuscatedName("nc.m")
	public int field988 = -1;

	@ObfuscatedName("nc.n")
	public int field989 = -1;

	@ObfuscatedName("nc.o")
	public int field990 = 99;

	@ObfuscatedName("nc.p")
	public int field991 = -1;

	@ObfuscatedName("nc.q")
	public int field992 = -1;

	@ObfuscatedName("nc.r")
	public int field993;

	@ObfuscatedName("nc.a(Lyb;Z)V")
	public static void method383(class51 arg0) {
		class39 var1 = new class39(arg0.method309("seq.dat", null));
		field978 = var1.method241();
		if (field979 == null) {
			field979 = new class66[field978];
		}

		for (int var2 = 0; var2 < field978; var2++) {
			if (field979[var2] == null) {
				field979[var2] = new class66();
			}

			field979[var2].method385(var1);
		}
	}

	@ObfuscatedName("nc.a(IZ)I")
	public int method384(int arg0) {
		int var2 = field983[arg0];
		if (var2 == 0) {
			class8 var3 = class8.method61(field981[arg0]);
			if (var3 != null) {
				var2 = field983[arg0] = var3.field143;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("nc.a(ILmb;)V")
	public void method385(class39 arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				if (field980 == 0) {
					field980 = 1;
					field981 = new int[1];
					field981[0] = -1;
					field982 = new int[1];
					field982[0] = -1;
					field983 = new int[1];
					field983[0] = -1;
				}

				if (field991 == -1) {
					if (field985 == null) {
						field991 = 0;
					} else {
						field991 = 2;
					}
				}

				if (field992 == -1) {
					if (field985 != null) {
						field992 = 2;
						return;
					}

					field992 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field980 = arg0.method239();
				field981 = new int[field980];
				field982 = new int[field980];
				field983 = new int[field980];
				for (int var3 = 0; var3 < field980; var3++) {
					field981[var3] = arg0.method241();
					field982[var3] = arg0.method241();
					if (field982[var3] == 0xFFFF) {
						field982[var3] = -1;
					}

					field983[var3] = arg0.method241();
				}
			} else if (var2 == 2) {
				field984 = arg0.method241();
			} else if (var2 == 3) {
				int var4 = arg0.method239();
				field985 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field985[var5] = arg0.method239();
				}

				field985[var4] = 9999999;
			} else if (var2 == 4) {
				field986 = true;
			} else if (var2 == 5) {
				field987 = arg0.method239();
			} else if (var2 == 6) {
				field988 = arg0.method241();
			} else if (var2 == 7) {
				field989 = arg0.method241();
			} else if (var2 == 8) {
				field990 = arg0.method239();
			} else if (var2 == 9) {
				field991 = arg0.method239();
			} else if (var2 == 10) {
				field992 = arg0.method239();
			} else if (var2 == 11) {
				field993 = arg0.method239();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
