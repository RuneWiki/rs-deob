package deob;

@ObfuscatedName("nc")
public class class66 {

	@ObfuscatedName("nc.b")
	public static int field955;

	@ObfuscatedName("nc.c")
	public static class66[] field956;

	@ObfuscatedName("nc.d")
	public int field957;

	@ObfuscatedName("nc.e")
	public int field958;

	@ObfuscatedName("nc.f")
	public int field959 = -1;

	@ObfuscatedName("nc.g")
	public class65 field960;

	@ObfuscatedName("nc.h")
	public boolean field961 = false;

	@ObfuscatedName("nc.i")
	public int[] field962 = new int[6];

	@ObfuscatedName("nc.j")
	public int[] field963 = new int[6];

	@ObfuscatedName("nc.k")
	public int field964 = 128;

	@ObfuscatedName("nc.l")
	public int field965 = 128;

	@ObfuscatedName("nc.m")
	public int field966;

	@ObfuscatedName("nc.n")
	public int field967;

	@ObfuscatedName("nc.o")
	public int field968;

	@ObfuscatedName("nc.p")
	public static class20 field969 = new class20(30);

	@ObfuscatedName("nc.a(Lyb;B)V")
	public static void method371(class51 arg0) {
		class39 var1 = new class39(arg0.method295("spotanim.dat", null));
		field955 = var1.method233();
		if (field956 == null) {
			field956 = new class66[field955];
		}

		for (int var2 = 0; var2 < field955; var2++) {
			if (field956[var2] == null) {
				field956[var2] = new class66();
			}

			field956[var2].field957 = var2;
			field956[var2].method372(var1);
		}
	}

	@ObfuscatedName("nc.a(ZLmb;)V")
	public void method372(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field958 = arg0.method233();
			} else if (var2 == 2) {
				field959 = arg0.method233();
				if (class65.field943 != null) {
					field960 = class65.field943[field959];
				}
			} else if (var2 == 3) {
				field961 = true;
			} else if (var2 == 4) {
				field964 = arg0.method233();
			} else if (var2 == 5) {
				field965 = arg0.method233();
			} else if (var2 == 6) {
				field966 = arg0.method233();
			} else if (var2 == 7) {
				field967 = arg0.method231();
			} else if (var2 == 8) {
				field968 = arg0.method231();
			} else if (var2 >= 40 && var2 < 50) {
				field962[var2 - 40] = arg0.method233();
			} else if (var2 >= 50 && var2 < 60) {
				field963[var2 - 50] = arg0.method233();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("nc.a()Lfb;")
	public class32 method373() {
		class32 var1 = (class32) field969.method113(field957);
		if (var1 != null) {
			return var1;
		}

		class32 var2 = class32.method135(field958);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field962[0] != 0) {
				var2.method149(field962[var3], field963[var3]);
			}
		}

		field969.method114(field957, var2);
		return var2;
	}
}
