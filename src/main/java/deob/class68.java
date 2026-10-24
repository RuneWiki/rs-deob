package deob;

@ObfuscatedName("pc")
public class class68 {

	@ObfuscatedName("pc.a")
	public static int field996;

	@ObfuscatedName("pc.b")
	public static class68[] field997;

	@ObfuscatedName("pc.c")
	public int field998;

	@ObfuscatedName("pc.d")
	public int field999;

	@ObfuscatedName("pc.e")
	public int field1000 = -1;

	@ObfuscatedName("pc.f")
	public class66 field1001;

	@ObfuscatedName("pc.g")
	public int[] field1002 = new int[6];

	@ObfuscatedName("pc.h")
	public int[] field1003 = new int[6];

	@ObfuscatedName("pc.i")
	public int field1004 = 128;

	@ObfuscatedName("pc.j")
	public int field1005 = 128;

	@ObfuscatedName("pc.k")
	public int field1006;

	@ObfuscatedName("pc.l")
	public int field1007;

	@ObfuscatedName("pc.m")
	public int field1008;

	@ObfuscatedName("pc.n")
	public static class20 field1009 = new class20(30);

	@ObfuscatedName("pc.a(Lyb;I)V")
	public static void method386(class51 arg0) {
		class39 var1 = new class39(arg0.method309("spotanim.dat", null));
		field996 = var1.method241();
		if (field997 == null) {
			field997 = new class68[field996];
		}

		for (int var2 = 0; var2 < field996; var2++) {
			if (field997[var2] == null) {
				field997[var2] = new class68();
			}

			field997[var2].field998 = var2;
			field997[var2].method387(var1);
		}
	}

	@ObfuscatedName("pc.a(Lmb;B)V")
	public void method387(class39 arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field999 = arg0.method241();
			} else if (var2 == 2) {
				field1000 = arg0.method241();
				if (class66.field978 != null) {
					field1001 = class66.field978[field1000];
				}
			} else if (var2 == 4) {
				field1004 = arg0.method241();
			} else if (var2 == 5) {
				field1005 = arg0.method241();
			} else if (var2 == 6) {
				field1006 = arg0.method241();
			} else if (var2 == 7) {
				field1007 = arg0.method239();
			} else if (var2 == 8) {
				field1008 = arg0.method239();
			} else if (var2 >= 40 && var2 < 50) {
				field1002[var2 - 40] = arg0.method241();
			} else if (var2 >= 50 && var2 < 60) {
				field1003[var2 - 50] = arg0.method241();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("pc.a()Lfb;")
	public class32 method388() {
		class32 var1 = (class32) field1009.method115(field998);
		if (var1 != null) {
			return var1;
		}

		class32 var2 = class32.method139(field999);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1002[0] != 0) {
				var2.method153(field1002[var3], field1003[var3]);
			}
		}

		field1009.method116(field998, var2);
		return var2;
	}
}
