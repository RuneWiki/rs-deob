package deob;

@ObfuscatedName("rc")
public class class70 {

	@ObfuscatedName("rc.b")
	public static int field1039;

	@ObfuscatedName("rc.c")
	public static class70[] field1040;

	@ObfuscatedName("rc.d")
	public static int field1041;

	@ObfuscatedName("rc.e")
	public static int[] field1042;

	@ObfuscatedName("rc.f")
	public String field1043;

	@ObfuscatedName("rc.g")
	public int field1044;

	@ObfuscatedName("rc.h")
	public int field1045;

	@ObfuscatedName("rc.i")
	public boolean field1046 = false;

	@ObfuscatedName("rc.j")
	public boolean field1047 = true;

	@ObfuscatedName("rc.k")
	public int field1048;

	@ObfuscatedName("rc.l")
	public boolean field1049 = false;

	@ObfuscatedName("rc.m")
	public int field1050;

	@ObfuscatedName("rc.n")
	public int field1051;

	@ObfuscatedName("rc.o")
	public boolean field1052 = false;

	@ObfuscatedName("rc.p")
	public int field1053 = -1;

	@ObfuscatedName("rc.a(Lxb;Z)V")
	public static void method389(class50 arg0) {
		class38 var1 = new class38(arg0.method299("varp.dat", null));
		field1041 = 0;
		field1039 = var1.method231();
		if (field1040 == null) {
			field1040 = new class70[field1039];
		}

		if (field1042 == null) {
			field1042 = new int[field1039];
		}

		for (int var2 = 0; var2 < field1039; var2++) {
			if (field1040[var2] == null) {
				field1040[var2] = new class70();
			}

			field1040[var2].method390(var1, var2);
		}

		if (var1.field621.length != var1.field622) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(ZLlb;I)V")
	public void method390(class38 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method229();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1044 = arg0.method229();
			} else if (var3 == 2) {
				field1045 = arg0.method229();
			} else if (var3 == 3) {
				field1046 = true;
				field1042[field1041++] = arg1;
			} else if (var3 == 4) {
				field1047 = false;
			} else if (var3 == 5) {
				field1048 = arg0.method231();
			} else if (var3 == 6) {
				field1049 = true;
			} else if (var3 == 7) {
				field1050 = arg0.method234();
			} else if (var3 == 8) {
				field1051 = 1;
				field1052 = true;
			} else if (var3 == 10) {
				field1043 = arg0.method236();
			} else if (var3 == 11) {
				field1052 = true;
			} else if (var3 == 12) {
				field1053 = arg0.method234();
			} else if (var3 == 13) {
				field1051 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
