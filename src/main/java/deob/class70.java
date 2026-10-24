package deob;

@ObfuscatedName("rc")
public class class70 {

	@ObfuscatedName("rc.b")
	public static int field1027;

	@ObfuscatedName("rc.c")
	public static class70[] field1028;

	@ObfuscatedName("rc.d")
	public static int field1029;

	@ObfuscatedName("rc.e")
	public static int[] field1030;

	@ObfuscatedName("rc.f")
	public String field1031;

	@ObfuscatedName("rc.g")
	public int field1032;

	@ObfuscatedName("rc.h")
	public int field1033;

	@ObfuscatedName("rc.i")
	public boolean field1034 = false;

	@ObfuscatedName("rc.j")
	public boolean field1035 = true;

	@ObfuscatedName("rc.k")
	public int field1036;

	@ObfuscatedName("rc.l")
	public boolean field1037 = false;

	@ObfuscatedName("rc.m")
	public int field1038;

	@ObfuscatedName("rc.n")
	public int field1039;

	@ObfuscatedName("rc.o")
	public boolean field1040 = false;

	@ObfuscatedName("rc.p")
	public int field1041 = -1;

	@ObfuscatedName("rc.a(Lxb;I)V")
	public static void method383(class50 arg0) {
		class38 var1 = new class38(arg0.method295("varp.dat", null));
		field1029 = 0;
		field1027 = var1.method227();
		if (field1028 == null) {
			field1028 = new class70[field1027];
		}

		if (field1030 == null) {
			field1030 = new int[field1027];
		}

		for (int var2 = 0; var2 < field1027; var2++) {
			if (field1028[var2] == null) {
				field1028[var2] = new class70();
			}

			field1028[var2].method384(var2, var1);
		}

		if (var1.field616.length != var1.field617) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(ILlb;I)V")
	public void method384(int arg0, class38 arg1) {
		while (true) {
			int var3 = arg1.method225();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1032 = arg1.method225();
			} else if (var3 == 2) {
				field1033 = arg1.method225();
			} else if (var3 == 3) {
				field1034 = true;
				field1030[field1029++] = arg0;
			} else if (var3 == 4) {
				field1035 = false;
			} else if (var3 == 5) {
				field1036 = arg1.method227();
			} else if (var3 == 6) {
				field1037 = true;
			} else if (var3 == 7) {
				field1038 = arg1.method230();
			} else if (var3 == 8) {
				field1039 = 1;
				field1040 = true;
			} else if (var3 == 10) {
				field1031 = arg1.method232();
			} else if (var3 == 11) {
				field1040 = true;
			} else if (var3 == 12) {
				field1041 = arg1.method230();
			} else if (var3 == 13) {
				field1039 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
