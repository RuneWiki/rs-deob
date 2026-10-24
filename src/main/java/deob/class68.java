package deob;

@ObfuscatedName("pc")
public class class68 {

	@ObfuscatedName("pc.c")
	public static int field1003;

	@ObfuscatedName("pc.d")
	public static class68[] field1004;

	@ObfuscatedName("pc.e")
	public static int field1005;

	@ObfuscatedName("pc.f")
	public static int[] field1006;

	@ObfuscatedName("pc.g")
	public String field1007;

	@ObfuscatedName("pc.h")
	public int field1008;

	@ObfuscatedName("pc.i")
	public int field1009;

	@ObfuscatedName("pc.j")
	public boolean field1010 = false;

	@ObfuscatedName("pc.k")
	public boolean field1011 = true;

	@ObfuscatedName("pc.l")
	public int field1012;

	@ObfuscatedName("pc.m")
	public boolean field1013 = false;

	@ObfuscatedName("pc.n")
	public int field1014;

	@ObfuscatedName("pc.o")
	public boolean field1015 = false;

	@ObfuscatedName("pc.p")
	public boolean field1016 = false;

	@ObfuscatedName("pc.a(ILyb;)V")
	public static void method387(class51 arg0) {
		class39 var1 = new class39(arg0.method308("varp.dat", null));
		field1005 = 0;
		field1003 = var1.method240();
		if (field1004 == null) {
			field1004 = new class68[field1003];
		}

		if (field1006 == null) {
			field1006 = new int[field1003];
		}

		for (int var2 = 0; var2 < field1003; var2++) {
			if (field1004[var2] == null) {
				field1004[var2] = new class68();
			}

			field1004[var2].method388(var1, var2);
		}

		if (var1.field620.length != var1.field621) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("pc.a(ILmb;I)V")
	public void method388(class39 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1008 = arg0.method238();
			} else if (var3 == 2) {
				field1009 = arg0.method238();
			} else if (var3 == 3) {
				field1010 = true;
				field1006[field1005++] = arg1;
			} else if (var3 == 4) {
				field1011 = false;
			} else if (var3 == 5) {
				field1012 = arg0.method240();
			} else if (var3 == 6) {
				field1013 = true;
			} else if (var3 == 7) {
				field1014 = arg0.method243();
			} else if (var3 == 8) {
				field1015 = true;
				field1016 = true;
			} else if (var3 == 10) {
				field1007 = arg0.method245();
			} else if (var3 == 11) {
				field1016 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
