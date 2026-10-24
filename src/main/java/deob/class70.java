package deob;

@ObfuscatedName("rc")
public class class70 {

	@ObfuscatedName("rc.a")
	public static int field1016;

	@ObfuscatedName("rc.b")
	public static class70[] field1017;

	@ObfuscatedName("rc.c")
	public static int field1018;

	@ObfuscatedName("rc.d")
	public static int[] field1019;

	@ObfuscatedName("rc.e")
	public String field1020;

	@ObfuscatedName("rc.f")
	public int field1021;

	@ObfuscatedName("rc.g")
	public int field1022;

	@ObfuscatedName("rc.h")
	public boolean field1023 = false;

	@ObfuscatedName("rc.i")
	public boolean field1024 = true;

	@ObfuscatedName("rc.j")
	public int field1025;

	@ObfuscatedName("rc.k")
	public boolean field1026 = false;

	@ObfuscatedName("rc.l")
	public int field1027;

	@ObfuscatedName("rc.m")
	public boolean field1028 = false;

	@ObfuscatedName("rc.n")
	public boolean field1029 = false;

	@ObfuscatedName("rc.a(Lyb;I)V")
	public static void method391(class51 arg0) {
		class39 var1 = new class39(arg0.method309("varp.dat", null));
		field1018 = 0;
		field1016 = var1.method241();
		if (field1017 == null) {
			field1017 = new class70[field1016];
		}

		if (field1019 == null) {
			field1019 = new int[field1016];
		}

		for (int var2 = 0; var2 < field1016; var2++) {
			if (field1017[var2] == null) {
				field1017[var2] = new class70();
			}

			field1017[var2].method392(var1, var2);
		}

		if (var1.field622.length != var1.field623) {
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
				field1021 = arg0.method239();
			} else if (var3 == 2) {
				field1022 = arg0.method239();
			} else if (var3 == 3) {
				field1023 = true;
				field1019[field1018++] = arg1;
			} else if (var3 == 4) {
				field1024 = false;
			} else if (var3 == 5) {
				field1025 = arg0.method241();
			} else if (var3 == 6) {
				field1026 = true;
			} else if (var3 == 7) {
				field1027 = arg0.method244();
			} else if (var3 == 8) {
				field1028 = true;
				field1029 = true;
			} else if (var3 == 10) {
				field1020 = arg0.method246();
			} else if (var3 == 11) {
				field1029 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
