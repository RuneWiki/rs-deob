package deob;

@ObfuscatedName("rc")
public class class70 {

	@ObfuscatedName("rc.b")
	public static int field1038;

	@ObfuscatedName("rc.c")
	public static class70[] field1039;

	@ObfuscatedName("rc.d")
	public static int field1040;

	@ObfuscatedName("rc.e")
	public static int[] field1041;

	@ObfuscatedName("rc.f")
	public String field1042;

	@ObfuscatedName("rc.g")
	public int field1043;

	@ObfuscatedName("rc.h")
	public int field1044;

	@ObfuscatedName("rc.i")
	public boolean field1045 = false;

	@ObfuscatedName("rc.j")
	public boolean field1046 = true;

	@ObfuscatedName("rc.k")
	public int field1047;

	@ObfuscatedName("rc.l")
	public boolean field1048 = false;

	@ObfuscatedName("rc.m")
	public int field1049;

	@ObfuscatedName("rc.n")
	public int field1050;

	@ObfuscatedName("rc.o")
	public boolean field1051 = false;

	@ObfuscatedName("rc.p")
	public int field1052 = -1;

	@ObfuscatedName("rc.a(ZLxb;)V")
	public static void method389(class50 arg0) {
		class38 var1 = new class38(arg0.method299("varp.dat", null));
		field1040 = 0;
		field1038 = var1.method231();
		if (field1039 == null) {
			field1039 = new class70[field1038];
		}

		if (field1041 == null) {
			field1041 = new int[field1038];
		}

		for (int var2 = 0; var2 < field1038; var2++) {
			if (field1039[var2] == null) {
				field1039[var2] = new class70();
			}

			field1039[var2].method390(var2, var1);
		}

		if (var1.field620.length != var1.field621) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(ILlb;I)V")
	public void method390(int arg0, class38 arg1) {
		while (true) {
			int var3 = arg1.method229();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1043 = arg1.method229();
			} else if (var3 == 2) {
				field1044 = arg1.method229();
			} else if (var3 == 3) {
				field1045 = true;
				field1041[field1040++] = arg0;
			} else if (var3 == 4) {
				field1046 = false;
			} else if (var3 == 5) {
				field1047 = arg1.method231();
			} else if (var3 == 6) {
				field1048 = true;
			} else if (var3 == 7) {
				field1049 = arg1.method234();
			} else if (var3 == 8) {
				field1050 = 1;
				field1051 = true;
			} else if (var3 == 10) {
				field1042 = arg1.method236();
			} else if (var3 == 11) {
				field1051 = true;
			} else if (var3 == 12) {
				field1052 = arg1.method234();
			} else if (var3 == 13) {
				field1050 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
