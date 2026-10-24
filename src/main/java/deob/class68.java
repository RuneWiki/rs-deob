package deob;

@ObfuscatedName("pc")
public class class68 {

	@ObfuscatedName("pc.a")
	public static int field1008;

	@ObfuscatedName("pc.b")
	public static class68[] field1009;

	@ObfuscatedName("pc.c")
	public static int field1010;

	@ObfuscatedName("pc.d")
	public static int[] field1011;

	@ObfuscatedName("pc.e")
	public String field1012;

	@ObfuscatedName("pc.f")
	public int field1013;

	@ObfuscatedName("pc.g")
	public int field1014;

	@ObfuscatedName("pc.h")
	public boolean field1015 = false;

	@ObfuscatedName("pc.i")
	public boolean field1016 = true;

	@ObfuscatedName("pc.j")
	public int field1017;

	@ObfuscatedName("pc.k")
	public boolean field1018 = false;

	@ObfuscatedName("pc.l")
	public int field1019;

	@ObfuscatedName("pc.m")
	public boolean field1020 = false;

	@ObfuscatedName("pc.n")
	public boolean field1021 = false;

	@ObfuscatedName("pc.a(ILyb;)V")
	public static void method387(class51 arg0) {
		class39 var1 = new class39(arg0.method308("varp.dat", null));
		field1010 = 0;
		field1008 = var1.method240();
		if (field1009 == null) {
			field1009 = new class68[field1008];
		}

		if (field1011 == null) {
			field1011 = new int[field1008];
		}

		for (int var2 = 0; var2 < field1008; var2++) {
			if (field1009[var2] == null) {
				field1009[var2] = new class68();
			}

			field1009[var2].method388(var1, var2);
		}

		if (var1.field622.length != var1.field623) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("pc.a(BLmb;I)V")
	public void method388(class39 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1013 = arg0.method238();
			} else if (var3 == 2) {
				field1014 = arg0.method238();
			} else if (var3 == 3) {
				field1015 = true;
				field1011[field1010++] = arg1;
			} else if (var3 == 4) {
				field1016 = false;
			} else if (var3 == 5) {
				field1017 = arg0.method240();
			} else if (var3 == 6) {
				field1018 = true;
			} else if (var3 == 7) {
				field1019 = arg0.method243();
			} else if (var3 == 8) {
				field1020 = true;
				field1021 = true;
			} else if (var3 == 10) {
				field1012 = arg0.method245();
			} else if (var3 == 11) {
				field1021 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
