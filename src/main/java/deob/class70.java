package deob;

@ObfuscatedName("rc")
public class class70 {

	@ObfuscatedName("rc.d")
	public static int field1023;

	@ObfuscatedName("rc.e")
	public static class70[] field1024;

	@ObfuscatedName("rc.f")
	public String field1025;

	@ObfuscatedName("rc.g")
	public int field1026;

	@ObfuscatedName("rc.h")
	public int field1027;

	@ObfuscatedName("rc.i")
	public int field1028;

	@ObfuscatedName("rc.a(ILyb;)V")
	public static void method384(class51 arg0) {
		class39 var1 = new class39(arg0.method298("varbit.dat", null));
		field1023 = var1.method230();
		if (field1024 == null) {
			field1024 = new class70[field1023];
		}

		for (int var2 = 0; var2 < field1023; var2++) {
			if (field1024[var2] == null) {
				field1024[var2] = new class70();
			}

			field1024[var2].method385(var1, var2);
		}

		if (var1.field624.length != var1.field625) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("rc.a(Lmb;IZ)V")
	public void method385(class39 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method228();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1026 = arg0.method230();
				field1027 = arg0.method228();
				field1028 = arg0.method228();
			} else if (var3 == 10) {
				field1025 = arg0.method235();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
