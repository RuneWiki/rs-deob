package deob;

@ObfuscatedName("qc")
public class class69 {

	@ObfuscatedName("qc.b")
	public static int field1018;

	@ObfuscatedName("qc.c")
	public static class69[] field1019;

	@ObfuscatedName("qc.d")
	public String field1020;

	@ObfuscatedName("qc.e")
	public int field1021;

	@ObfuscatedName("qc.f")
	public int field1022;

	@ObfuscatedName("qc.g")
	public int field1023;

	@ObfuscatedName("qc.h")
	public boolean field1024 = false;

	@ObfuscatedName("qc.i")
	public int field1025 = -1;

	@ObfuscatedName("qc.j")
	public int field1026;

	@ObfuscatedName("qc.a(Lxb;I)V")
	public static void method381(class50 arg0) {
		class38 var1 = new class38(arg0.method295("varbit.dat", null));
		field1018 = var1.method227();
		if (field1019 == null) {
			field1019 = new class69[field1018];
		}

		for (int var2 = 0; var2 < field1018; var2++) {
			if (field1019[var2] == null) {
				field1019[var2] = new class69();
			}

			field1019[var2].method382(var2, var1);

			if (field1019[var2].field1024) {
				class70.field1028[field1019[var2].field1021].field1040 = true;
			}
		}

		if (var1.field616.length != var1.field617) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(ILlb;I)V")
	public void method382(int arg0, class38 arg1) {
		while (true) {
			int var3 = arg1.method225();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1021 = arg1.method227();
				field1022 = arg1.method225();
				field1023 = arg1.method225();
			} else if (var3 == 10) {
				field1020 = arg1.method232();
			} else if (var3 == 2) {
				field1024 = true;
			} else if (var3 == 3) {
				field1025 = arg1.method230();
			} else if (var3 == 4) {
				field1026 = arg1.method230();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
