package deob;

@ObfuscatedName("pc")
public class class68 {

	@ObfuscatedName("pc.b")
	public static int field1004;

	@ObfuscatedName("pc.c")
	public static class68[] field1005;

	@ObfuscatedName("pc.d")
	public int field1006;

	@ObfuscatedName("pc.e")
	public int field1007;

	@ObfuscatedName("pc.f")
	public int field1008 = -1;

	@ObfuscatedName("pc.g")
	public class66 field1009;

	@ObfuscatedName("pc.h")
	public int[] field1010 = new int[6];

	@ObfuscatedName("pc.i")
	public int[] field1011 = new int[6];

	@ObfuscatedName("pc.j")
	public int field1012 = 128;

	@ObfuscatedName("pc.k")
	public int field1013 = 128;

	@ObfuscatedName("pc.l")
	public int field1014;

	@ObfuscatedName("pc.m")
	public int field1015;

	@ObfuscatedName("pc.n")
	public int field1016;

	@ObfuscatedName("pc.o")
	public static class19 field1017 = new class19(30);

	@ObfuscatedName("pc.a(Lxb;I)V")
	public static void method378(class50 arg0) {
		class38 var1 = new class38(arg0.method295("spotanim.dat", null));
		field1004 = var1.method227();
		if (field1005 == null) {
			field1005 = new class68[field1004];
		}

		for (int var2 = 0; var2 < field1004; var2++) {
			if (field1005[var2] == null) {
				field1005[var2] = new class68();
			}

			field1005[var2].field1006 = var2;
			field1005[var2].method379(var1);
		}
	}

	@ObfuscatedName("pc.a(Llb;B)V")
	public void method379(class38 arg0) {
		while (true) {
			int var2 = arg0.method225();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1007 = arg0.method227();
			} else if (var2 == 2) {
				field1008 = arg0.method227();
				if (class66.field985 != null) {
					field1009 = class66.field985[field1008];
				}
			} else if (var2 == 4) {
				field1012 = arg0.method227();
			} else if (var2 == 5) {
				field1013 = arg0.method227();
			} else if (var2 == 6) {
				field1014 = arg0.method227();
			} else if (var2 == 7) {
				field1015 = arg0.method225();
			} else if (var2 == 8) {
				field1016 = arg0.method225();
			} else if (var2 >= 40 && var2 < 50) {
				field1010[var2 - 40] = arg0.method227();
			} else if (var2 >= 50 && var2 < 60) {
				field1011[var2 - 50] = arg0.method227();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("pc.a()Leb;")
	public class31 method380() {
		class31 var1 = (class31) field1017.method101(field1006);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = class31.method125(field1007);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1010[0] != 0) {
				var2.method139(field1010[var3], field1011[var3]);
			}
		}

		field1017.method102(var2, field1006);
		return var2;
	}
}
