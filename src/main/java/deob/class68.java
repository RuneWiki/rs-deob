package deob;

@ObfuscatedName("pc")
public class class68 {

	@ObfuscatedName("pc.c")
	public static int field1000;

	@ObfuscatedName("pc.d")
	public static class68[] field1001;

	@ObfuscatedName("pc.e")
	public int field1002;

	@ObfuscatedName("pc.f")
	public int field1003;

	@ObfuscatedName("pc.g")
	public int field1004 = -1;

	@ObfuscatedName("pc.h")
	public class66 field1005;

	@ObfuscatedName("pc.i")
	public int[] field1006 = new int[6];

	@ObfuscatedName("pc.j")
	public int[] field1007 = new int[6];

	@ObfuscatedName("pc.k")
	public int field1008 = 128;

	@ObfuscatedName("pc.l")
	public int field1009 = 128;

	@ObfuscatedName("pc.m")
	public int field1010;

	@ObfuscatedName("pc.n")
	public int field1011;

	@ObfuscatedName("pc.o")
	public int field1012;

	@ObfuscatedName("pc.p")
	public static class19 field1013 = new class19(30);

	@ObfuscatedName("pc.a(ILxb;)V")
	public static void method377(class50 arg0) {
		class38 var1 = new class38(arg0.method294("spotanim.dat", null));
		field1000 = var1.method226();
		if (field1001 == null) {
			field1001 = new class68[field1000];
		}

		for (int var2 = 0; var2 < field1000; var2++) {
			if (field1001[var2] == null) {
				field1001[var2] = new class68();
			}

			field1001[var2].field1002 = var2;
			field1001[var2].method378(var1);
		}
	}

	@ObfuscatedName("pc.a(Llb;I)V")
	public void method378(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1003 = arg0.method226();
			} else if (var2 == 2) {
				field1004 = arg0.method226();
				if (class66.field982 != null) {
					field1005 = class66.field982[field1004];
				}
			} else if (var2 == 4) {
				field1008 = arg0.method226();
			} else if (var2 == 5) {
				field1009 = arg0.method226();
			} else if (var2 == 6) {
				field1010 = arg0.method226();
			} else if (var2 == 7) {
				field1011 = arg0.method224();
			} else if (var2 == 8) {
				field1012 = arg0.method224();
			} else if (var2 >= 40 && var2 < 50) {
				field1006[var2 - 40] = arg0.method226();
			} else if (var2 >= 50 && var2 < 60) {
				field1007[var2 - 50] = arg0.method226();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("pc.a()Leb;")
	public class31 method379() {
		class31 var1 = (class31) field1013.method101(field1002);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = class31.method125(field1003);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1006[0] != 0) {
				var2.method139(field1006[var3], field1007[var3]);
			}
		}

		field1013.method102(field1002, var2);
		return var2;
	}
}
