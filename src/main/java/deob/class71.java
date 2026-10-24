package deob;

@ObfuscatedName("sc")
public class class71 {

	@ObfuscatedName("sc.d")
	public static int field1029;

	@ObfuscatedName("sc.e")
	public static class71[] field1030;

	@ObfuscatedName("sc.f")
	public static int field1031;

	@ObfuscatedName("sc.g")
	public static int[] field1032;

	@ObfuscatedName("sc.h")
	public String field1033;

	@ObfuscatedName("sc.i")
	public int field1034;

	@ObfuscatedName("sc.j")
	public int field1035;

	@ObfuscatedName("sc.k")
	public boolean field1036 = false;

	@ObfuscatedName("sc.l")
	public boolean field1037 = true;

	@ObfuscatedName("sc.m")
	public int field1038;

	@ObfuscatedName("sc.n")
	public boolean field1039 = false;

	@ObfuscatedName("sc.o")
	public int field1040;

	@ObfuscatedName("sc.p")
	public int field1041;

	@ObfuscatedName("sc.q")
	public boolean field1042 = false;

	@ObfuscatedName("sc.r")
	public int field1043 = -1;

	@ObfuscatedName("sc.a(ILyb;)V")
	public static void method386(class51 arg0) {
		class39 var1 = new class39(arg0.method298("varp.dat", null));
		field1031 = 0;
		field1029 = var1.method230();
		if (field1030 == null) {
			field1030 = new class71[field1029];
		}

		if (field1032 == null) {
			field1032 = new int[field1029];
		}

		for (int var2 = 0; var2 < field1029; var2++) {
			if (field1030[var2] == null) {
				field1030[var2] = new class71();
			}

			field1030[var2].method387(var1, var2);
		}

		if (var1.field624.length != var1.field625) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("sc.a(Lmb;IZ)V")
	public void method387(class39 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method228();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1034 = arg0.method228();
			} else if (var3 == 2) {
				field1035 = arg0.method228();
			} else if (var3 == 3) {
				field1036 = true;
				field1032[field1031++] = arg1;
			} else if (var3 == 4) {
				field1037 = false;
			} else if (var3 == 5) {
				field1038 = arg0.method230();
			} else if (var3 == 6) {
				field1039 = true;
			} else if (var3 == 7) {
				field1040 = arg0.method233();
			} else if (var3 == 8) {
				field1041 = 1;
				field1042 = true;
			} else if (var3 == 10) {
				field1033 = arg0.method235();
			} else if (var3 == 11) {
				field1042 = true;
			} else if (var3 == 12) {
				field1043 = arg0.method233();
			} else if (var3 == 13) {
				field1041 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
