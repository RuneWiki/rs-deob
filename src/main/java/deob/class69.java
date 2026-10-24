package deob;

@ObfuscatedName("qc")
public class class69 {

	@ObfuscatedName("qc.b")
	public static int field1030;

	@ObfuscatedName("qc.c")
	public static class69[] field1031;

	@ObfuscatedName("qc.d")
	public String field1032;

	@ObfuscatedName("qc.e")
	public int field1033;

	@ObfuscatedName("qc.f")
	public int field1034;

	@ObfuscatedName("qc.g")
	public int field1035;

	@ObfuscatedName("qc.h")
	public boolean field1036 = false;

	@ObfuscatedName("qc.i")
	public int field1037 = -1;

	@ObfuscatedName("qc.j")
	public int field1038;

	@ObfuscatedName("qc.a(ILxb;)V")
	public static void method387(class50 arg0) {
		class38 var1 = new class38(arg0.method299("varbit.dat", null));
		field1030 = var1.method231();
		if (field1031 == null) {
			field1031 = new class69[field1030];
		}

		for (int var2 = 0; var2 < field1030; var2++) {
			if (field1031[var2] == null) {
				field1031[var2] = new class69();
			}

			field1031[var2].method388(var1, var2);

			if (field1031[var2].field1036) {
				class70.field1040[field1031[var2].field1033].field1052 = true;
			}
		}

		if (var1.field620.length != var1.field621) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(Llb;II)V")
	public void method388(class38 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method229();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1033 = arg0.method231();
				field1034 = arg0.method229();
				field1035 = arg0.method229();
			} else if (var3 == 10) {
				field1032 = arg0.method236();
			} else if (var3 == 2) {
				field1036 = true;
			} else if (var3 == 3) {
				field1037 = arg0.method234();
			} else if (var3 == 4) {
				field1038 = arg0.method234();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
