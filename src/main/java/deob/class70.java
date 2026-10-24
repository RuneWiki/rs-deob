package deob;

@ObfuscatedName("rc")
public class class70 {

	@ObfuscatedName("rc.a")
	public static int field1020;

	@ObfuscatedName("rc.b")
	public static class70[] field1021;

	@ObfuscatedName("rc.c")
	public static int field1022;

	@ObfuscatedName("rc.d")
	public static int[] field1023;

	@ObfuscatedName("rc.e")
	public String field1024;

	@ObfuscatedName("rc.f")
	public int field1025;

	@ObfuscatedName("rc.g")
	public int field1026;

	@ObfuscatedName("rc.h")
	public boolean field1027 = false;

	@ObfuscatedName("rc.i")
	public boolean field1028 = true;

	@ObfuscatedName("rc.j")
	public int field1029;

	@ObfuscatedName("rc.k")
	public boolean field1030 = false;

	@ObfuscatedName("rc.l")
	public int field1031;

	@ObfuscatedName("rc.m")
	public int field1032;

	@ObfuscatedName("rc.n")
	public boolean field1033 = false;

	@ObfuscatedName("rc.o")
	public int field1034 = -1;

	@ObfuscatedName("rc.a(ILxb;)V")
	public static void method382(class50 arg0) {
		class38 var1 = new class38(arg0.method294("varp.dat", null));
		field1022 = 0;
		field1020 = var1.method226();
		if (field1021 == null) {
			field1021 = new class70[field1020];
		}

		if (field1023 == null) {
			field1023 = new int[field1020];
		}

		for (int var2 = 0; var2 < field1020; var2++) {
			if (field1021[var2] == null) {
				field1021[var2] = new class70();
			}

			field1021[var2].method383(var2, var1);
		}

		if (var1.field615.length != var1.field616) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(IILlb;)V")
	public void method383(int arg0, class38 arg1) {
		while (true) {
			int var3 = arg1.method224();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1025 = arg1.method224();
			} else if (var3 == 2) {
				field1026 = arg1.method224();
			} else if (var3 == 3) {
				field1027 = true;
				field1023[field1022++] = arg0;
			} else if (var3 == 4) {
				field1028 = false;
			} else if (var3 == 5) {
				field1029 = arg1.method226();
			} else if (var3 == 6) {
				field1030 = true;
			} else if (var3 == 7) {
				field1031 = arg1.method229();
			} else if (var3 == 8) {
				field1032 = 1;
				field1033 = true;
			} else if (var3 == 10) {
				field1024 = arg1.method231();
			} else if (var3 == 11) {
				field1033 = true;
			} else if (var3 == 12) {
				field1034 = arg1.method229();
			} else if (var3 == 13) {
				field1032 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
