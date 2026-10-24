package deob;

@ObfuscatedName("qc")
public class class69 {

	@ObfuscatedName("qc.b")
	public static int field1014;

	@ObfuscatedName("qc.c")
	public static class69[] field1015;

	@ObfuscatedName("qc.d")
	public String field1016;

	@ObfuscatedName("qc.e")
	public int field1017;

	@ObfuscatedName("qc.f")
	public int field1018;

	@ObfuscatedName("qc.g")
	public int field1019;

	@ObfuscatedName("qc.a(ILxb;)V")
	public static void method380(class50 arg0) {
		class38 var1 = new class38(arg0.method294("varbit.dat", null));
		field1014 = var1.method226();
		if (field1015 == null) {
			field1015 = new class69[field1014];
		}

		for (int var2 = 0; var2 < field1014; var2++) {
			if (field1015[var2] == null) {
				field1015[var2] = new class69();
			}

			field1015[var2].method381(var2, var1);
		}

		if (var1.field615.length != var1.field616) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(IILlb;)V")
	public void method381(int arg0, class38 arg1) {
		while (true) {
			int var3 = arg1.method224();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1017 = arg1.method226();
				field1018 = arg1.method224();
				field1019 = arg1.method224();
			} else if (var3 == 10) {
				field1016 = arg1.method231();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
