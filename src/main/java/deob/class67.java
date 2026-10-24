package deob;

@ObfuscatedName("oc")
public class class67 {

	@ObfuscatedName("oc.a")
	public static int field993;

	@ObfuscatedName("oc.b")
	public static class67[] field994;

	@ObfuscatedName("oc.c")
	public int field995;

	@ObfuscatedName("oc.d")
	public int field996;

	@ObfuscatedName("oc.e")
	public int field997 = -1;

	@ObfuscatedName("oc.f")
	public class66 field998;

	@ObfuscatedName("oc.g")
	public boolean field999 = false;

	@ObfuscatedName("oc.h")
	public int[] field1000 = new int[6];

	@ObfuscatedName("oc.i")
	public int[] field1001 = new int[6];

	@ObfuscatedName("oc.j")
	public int field1002 = 128;

	@ObfuscatedName("oc.k")
	public int field1003 = 128;

	@ObfuscatedName("oc.l")
	public int field1004;

	@ObfuscatedName("oc.m")
	public int field1005;

	@ObfuscatedName("oc.n")
	public int field1006;

	@ObfuscatedName("oc.o")
	public static class20 field1007 = new class20(30);

	@ObfuscatedName("oc.a(ILyb;)V")
	public static void method384(class51 arg0) {
		class39 var1 = new class39(arg0.method308("spotanim.dat", null));
		field993 = var1.method240();
		if (field994 == null) {
			field994 = new class67[field993];
		}

		for (int var2 = 0; var2 < field993; var2++) {
			if (field994[var2] == null) {
				field994[var2] = new class67();
			}

			field994[var2].field995 = var2;
			field994[var2].method385(var1);
		}
	}

	@ObfuscatedName("oc.a(ZLmb;)V")
	public void method385(class39 arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field996 = arg0.method240();
			} else if (var2 == 2) {
				field997 = arg0.method240();
				if (class66.field978 != null) {
					field998 = class66.field978[field997];
				}
			} else if (var2 == 3) {
				field999 = true;
			} else if (var2 == 4) {
				field1002 = arg0.method240();
			} else if (var2 == 5) {
				field1003 = arg0.method240();
			} else if (var2 == 6) {
				field1004 = arg0.method240();
			} else if (var2 == 7) {
				field1005 = arg0.method238();
			} else if (var2 == 8) {
				field1006 = arg0.method238();
			} else if (var2 >= 40 && var2 < 50) {
				field1000[var2 - 40] = arg0.method240();
			} else if (var2 >= 50 && var2 < 60) {
				field1001[var2 - 50] = arg0.method240();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("oc.a()Lfb;")
	public class32 method386() {
		class32 var1 = (class32) field1007.method114(field995);
		if (var1 != null) {
			return var1;
		}

		class32 var2 = class32.method138(field996);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1000[0] != 0) {
				var2.method152(field1000[var3], field1001[var3]);
			}
		}

		field1007.method115(var2, field995);
		return var2;
	}
}
