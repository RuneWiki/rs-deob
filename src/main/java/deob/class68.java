package deob;

@ObfuscatedName("pc")
public class class68 {

	@ObfuscatedName("pc.c")
	public static int field1015;

	@ObfuscatedName("pc.d")
	public static class68[] field1016;

	@ObfuscatedName("pc.e")
	public int field1017;

	@ObfuscatedName("pc.f")
	public int field1018;

	@ObfuscatedName("pc.g")
	public int field1019 = -1;

	@ObfuscatedName("pc.h")
	public class66 field1020;

	@ObfuscatedName("pc.i")
	public int[] field1021 = new int[6];

	@ObfuscatedName("pc.j")
	public int[] field1022 = new int[6];

	@ObfuscatedName("pc.k")
	public int field1023 = 128;

	@ObfuscatedName("pc.l")
	public int field1024 = 128;

	@ObfuscatedName("pc.m")
	public int field1025;

	@ObfuscatedName("pc.n")
	public int field1026;

	@ObfuscatedName("pc.o")
	public int field1027;

	@ObfuscatedName("pc.p")
	public static class19 field1028 = new class19(30);

	@ObfuscatedName("pc.a(ILxb;)V")
	public static void method384(class50 arg0) {
		class38 var1 = new class38(arg0.method299("spotanim.dat", null));
		field1015 = var1.method231();
		if (field1016 == null) {
			field1016 = new class68[field1015];
		}

		for (int var2 = 0; var2 < field1015; var2++) {
			if (field1016[var2] == null) {
				field1016[var2] = new class68();
			}

			field1016[var2].field1017 = var2;
			field1016[var2].method385(var1);
		}
	}

	@ObfuscatedName("pc.a(Llb;I)V")
	public void method385(class38 arg0) {
		while (true) {
			int var2 = arg0.method229();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1018 = arg0.method231();
			} else if (var2 == 2) {
				field1019 = arg0.method231();
				if (class66.field996 != null) {
					field1020 = class66.field996[field1019];
				}
			} else if (var2 == 4) {
				field1023 = arg0.method231();
			} else if (var2 == 5) {
				field1024 = arg0.method231();
			} else if (var2 == 6) {
				field1025 = arg0.method231();
			} else if (var2 == 7) {
				field1026 = arg0.method229();
			} else if (var2 == 8) {
				field1027 = arg0.method229();
			} else if (var2 >= 40 && var2 < 50) {
				field1021[var2 - 40] = arg0.method231();
			} else if (var2 >= 50 && var2 < 60) {
				field1022[var2 - 50] = arg0.method231();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("pc.a()Leb;")
	public class31 method386() {
		class31 var1 = (class31) field1028.method101(field1017);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = class31.method126(field1018);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1021[0] != 0) {
				var2.method140(field1021[var3], field1022[var3]);
			}
		}

		field1028.method102(field1017, var2);
		return var2;
	}
}
