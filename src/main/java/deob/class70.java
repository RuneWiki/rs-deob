package deob;

@ObfuscatedName("rc")
public class class70 {

	@ObfuscatedName("rc.b")
	public static int field1018;

	@ObfuscatedName("rc.c")
	public static class70[] field1019;

	@ObfuscatedName("rc.d")
	public static int field1020;

	@ObfuscatedName("rc.e")
	public static int[] field1021;

	@ObfuscatedName("rc.f")
	public String field1022;

	@ObfuscatedName("rc.g")
	public int field1023;

	@ObfuscatedName("rc.h")
	public int field1024;

	@ObfuscatedName("rc.i")
	public boolean field1025 = false;

	@ObfuscatedName("rc.j")
	public boolean field1026 = true;

	@ObfuscatedName("rc.k")
	public int field1027;

	@ObfuscatedName("rc.l")
	public boolean field1028 = false;

	@ObfuscatedName("rc.m")
	public int field1029;

	@ObfuscatedName("rc.n")
	public boolean field1030 = false;

	@ObfuscatedName("rc.o")
	public boolean field1031 = false;

	@ObfuscatedName("rc.a(ZLyb;)V")
	public static void method391(class51 arg0) {
		class39 var1 = new class39(arg0.method309("varp.dat", null));
		field1020 = 0;
		field1018 = var1.method241();
		if (field1019 == null) {
			field1019 = new class70[field1018];
		}

		if (field1021 == null) {
			field1021 = new int[field1018];
		}

		for (int var2 = 0; var2 < field1018; var2++) {
			if (field1019[var2] == null) {
				field1019[var2] = new class70();
			}

			field1019[var2].method392(var1, var2);
		}

		if (var1.field623.length != var1.field624) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(Lmb;II)V")
	public void method392(class39 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method239();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1023 = arg0.method239();
			} else if (var3 == 2) {
				field1024 = arg0.method239();
			} else if (var3 == 3) {
				field1025 = true;
				field1021[field1020++] = arg1;
			} else if (var3 == 4) {
				field1026 = false;
			} else if (var3 == 5) {
				field1027 = arg0.method241();
			} else if (var3 == 6) {
				field1028 = true;
			} else if (var3 == 7) {
				field1029 = arg0.method244();
			} else if (var3 == 8) {
				field1030 = true;
				field1031 = true;
			} else if (var3 == 10) {
				field1022 = arg0.method246();
			} else if (var3 == 11) {
				field1031 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
