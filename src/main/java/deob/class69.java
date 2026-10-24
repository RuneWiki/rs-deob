package deob;

@ObfuscatedName("qc")
public class class69 {

	@ObfuscatedName("qc.c")
	public static int field1009;

	@ObfuscatedName("qc.d")
	public static class69[] field1010;

	@ObfuscatedName("qc.e")
	public int field1011;

	@ObfuscatedName("qc.f")
	public int field1012;

	@ObfuscatedName("qc.g")
	public int field1013 = -1;

	@ObfuscatedName("qc.h")
	public class67 field1014;

	@ObfuscatedName("qc.i")
	public int[] field1015 = new int[6];

	@ObfuscatedName("qc.j")
	public int[] field1016 = new int[6];

	@ObfuscatedName("qc.k")
	public int field1017 = 128;

	@ObfuscatedName("qc.l")
	public int field1018 = 128;

	@ObfuscatedName("qc.m")
	public int field1019;

	@ObfuscatedName("qc.n")
	public int field1020;

	@ObfuscatedName("qc.o")
	public int field1021;

	@ObfuscatedName("qc.p")
	public static class19 field1022 = new class19(30);

	@ObfuscatedName("qc.a(ILyb;)V")
	public static void method381(class51 arg0) {
		class39 var1 = new class39(arg0.method298("spotanim.dat", null));
		field1009 = var1.method230();
		if (field1010 == null) {
			field1010 = new class69[field1009];
		}

		for (int var2 = 0; var2 < field1009; var2++) {
			if (field1010[var2] == null) {
				field1010[var2] = new class69();
			}

			field1010[var2].field1011 = var2;
			field1010[var2].method382(var1);
		}
	}

	@ObfuscatedName("qc.a(BLmb;)V")
	public void method382(class39 arg0) {
		while (true) {
			int var2 = arg0.method228();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1012 = arg0.method230();
			} else if (var2 == 2) {
				field1013 = arg0.method230();
				if (class67.field991 != null) {
					field1014 = class67.field991[field1013];
				}
			} else if (var2 == 4) {
				field1017 = arg0.method230();
			} else if (var2 == 5) {
				field1018 = arg0.method230();
			} else if (var2 == 6) {
				field1019 = arg0.method230();
			} else if (var2 == 7) {
				field1020 = arg0.method228();
			} else if (var2 == 8) {
				field1021 = arg0.method228();
			} else if (var2 >= 40 && var2 < 50) {
				field1015[var2 - 40] = arg0.method230();
			} else if (var2 >= 50 && var2 < 60) {
				field1016[var2 - 50] = arg0.method230();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("qc.a()Leb;")
	public class31 method383() {
		class31 var1 = (class31) field1022.method101(field1011);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = class31.method125(field1012);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1015[0] != 0) {
				var2.method139(field1015[var3], field1016[var3]);
			}
		}

		field1022.method102(var2, field1011);
		return var2;
	}
}
