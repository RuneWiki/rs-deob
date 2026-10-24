package deob;

@ObfuscatedName("qc")
public class class69 {

	@ObfuscatedName("qc.b")
	public static int field1010;

	@ObfuscatedName("qc.c")
	public static class69[] field1011;

	@ObfuscatedName("qc.d")
	public String field1012;

	@ObfuscatedName("qc.e")
	public int field1013;

	@ObfuscatedName("qc.f")
	public int field1014;

	@ObfuscatedName("qc.g")
	public int field1015;

	@ObfuscatedName("qc.a(Lyb;I)V")
	public static void method389(class51 arg0) {
		class39 var1 = new class39(arg0.method309("varbit.dat", null));
		field1010 = var1.method241();
		if (field1011 == null) {
			field1011 = new class69[field1010];
		}

		for (int var2 = 0; var2 < field1010; var2++) {
			if (field1011[var2] == null) {
				field1011[var2] = new class69();
			}

			field1011[var2].method390(var1, var2);
		}

		if (var1.field622.length != var1.field623) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(Lmb;II)V")
	public void method390(class39 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method239();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1013 = arg0.method241();
				field1014 = arg0.method239();
				field1015 = arg0.method239();
			} else if (var3 == 10) {
				field1012 = arg0.method246();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
