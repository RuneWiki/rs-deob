package deob;

@ObfuscatedName("rc")
public class class70 {

	@ObfuscatedName("rc.b")
	public static int field1017;

	@ObfuscatedName("rc.c")
	public static class70[] field1018;

	@ObfuscatedName("rc.d")
	public static int field1019;

	@ObfuscatedName("rc.e")
	public static int[] field1020;

	@ObfuscatedName("rc.f")
	public String field1021;

	@ObfuscatedName("rc.g")
	public int field1022;

	@ObfuscatedName("rc.h")
	public int field1023;

	@ObfuscatedName("rc.i")
	public boolean field1024 = false;

	@ObfuscatedName("rc.j")
	public boolean field1025 = true;

	@ObfuscatedName("rc.k")
	public int field1026;

	@ObfuscatedName("rc.l")
	public boolean field1027 = false;

	@ObfuscatedName("rc.m")
	public int field1028;

	@ObfuscatedName("rc.n")
	public boolean field1029 = false;

	@ObfuscatedName("rc.o")
	public boolean field1030 = false;

	@ObfuscatedName("rc.a(Lyb;Z)V")
	public static void method391(class51 arg0) {
		class39 var1 = new class39(arg0.method309("varp.dat", null));
		field1019 = 0;
		field1017 = var1.method241();
		if (field1018 == null) {
			field1018 = new class70[field1017];
		}

		if (field1020 == null) {
			field1020 = new int[field1017];
		}

		for (int var2 = 0; var2 < field1017; var2++) {
			if (field1018[var2] == null) {
				field1018[var2] = new class70();
			}

			field1018[var2].method392(var2, var1);
		}

		if (var1.field623.length != var1.field624) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(IILmb;)V")
	public void method392(int arg0, class39 arg1) {
		while (true) {
			int var3 = arg1.method239();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1022 = arg1.method239();
			} else if (var3 == 2) {
				field1023 = arg1.method239();
			} else if (var3 == 3) {
				field1024 = true;
				field1020[field1019++] = arg0;
			} else if (var3 == 4) {
				field1025 = false;
			} else if (var3 == 5) {
				field1026 = arg1.method241();
			} else if (var3 == 6) {
				field1027 = true;
			} else if (var3 == 7) {
				field1028 = arg1.method244();
			} else if (var3 == 8) {
				field1029 = true;
				field1030 = true;
			} else if (var3 == 10) {
				field1021 = arg1.method246();
			} else if (var3 == 11) {
				field1030 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
