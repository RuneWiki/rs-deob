package deob;

@ObfuscatedName("qc")
public class class69 {

	@ObfuscatedName("qc.b")
	public static int field1029;

	@ObfuscatedName("qc.c")
	public static class69[] field1030;

	@ObfuscatedName("qc.d")
	public String field1031;

	@ObfuscatedName("qc.e")
	public int field1032;

	@ObfuscatedName("qc.f")
	public int field1033;

	@ObfuscatedName("qc.g")
	public int field1034;

	@ObfuscatedName("qc.h")
	public boolean field1035 = false;

	@ObfuscatedName("qc.i")
	public int field1036 = -1;

	@ObfuscatedName("qc.j")
	public int field1037;

	@ObfuscatedName("qc.a(ZLxb;)V")
	public static void method387(class50 arg0) {
		class38 var1 = new class38(arg0.method299("varbit.dat", null));
		field1029 = var1.method231();
		if (field1030 == null) {
			field1030 = new class69[field1029];
		}

		for (int var2 = 0; var2 < field1029; var2++) {
			if (field1030[var2] == null) {
				field1030[var2] = new class69();
			}

			field1030[var2].method388(var2, var1);

			if (field1030[var2].field1035) {
				class70.field1039[field1030[var2].field1032].field1051 = true;
			}
		}

		if (var1.field620.length != var1.field621) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(ILlb;I)V")
	public void method388(int arg0, class38 arg1) {
		while (true) {
			int var3 = arg1.method229();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1032 = arg1.method231();
				field1033 = arg1.method229();
				field1034 = arg1.method229();
			} else if (var3 == 10) {
				field1031 = arg1.method236();
			} else if (var3 == 2) {
				field1035 = true;
			} else if (var3 == 3) {
				field1036 = arg1.method234();
			} else if (var3 == 4) {
				field1037 = arg1.method234();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
