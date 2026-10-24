package deob;

@ObfuscatedName("nc")
public class class66 {

	@ObfuscatedName("nc.c")
	public static int field958;

	@ObfuscatedName("nc.d")
	public static class66[] field959;

	@ObfuscatedName("nc.e")
	public int field960;

	@ObfuscatedName("nc.f")
	public int field961;

	@ObfuscatedName("nc.g")
	public int field962 = -1;

	@ObfuscatedName("nc.h")
	public class65 field963;

	@ObfuscatedName("nc.i")
	public boolean field964 = false;

	@ObfuscatedName("nc.j")
	public int[] field965 = new int[6];

	@ObfuscatedName("nc.k")
	public int[] field966 = new int[6];

	@ObfuscatedName("nc.l")
	public int field967 = 128;

	@ObfuscatedName("nc.m")
	public int field968 = 128;

	@ObfuscatedName("nc.n")
	public int field969;

	@ObfuscatedName("nc.o")
	public int field970;

	@ObfuscatedName("nc.p")
	public int field971;

	@ObfuscatedName("nc.q")
	public static class20 field972 = new class20(30);

	@ObfuscatedName("nc.a(Lyb;I)V")
	public static void method375(class51 arg0) {
		class39 var1 = new class39(arg0.method299("spotanim.dat", null));
		field958 = var1.method233();
		if (field959 == null) {
			field959 = new class66[field958];
		}

		for (int var2 = 0; var2 < field958; var2++) {
			if (field959[var2] == null) {
				field959[var2] = new class66();
			}

			field959[var2].field960 = var2;
			field959[var2].method376(var1);
		}
	}

	@ObfuscatedName("nc.a(ILmb;)V")
	public void method376(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field961 = arg0.method233();
			} else if (var2 == 2) {
				field962 = arg0.method233();
				if (class65.field946 != null) {
					field963 = class65.field946[field962];
				}
			} else if (var2 == 3) {
				field964 = true;
			} else if (var2 == 4) {
				field967 = arg0.method233();
			} else if (var2 == 5) {
				field968 = arg0.method233();
			} else if (var2 == 6) {
				field969 = arg0.method233();
			} else if (var2 == 7) {
				field970 = arg0.method231();
			} else if (var2 == 8) {
				field971 = arg0.method231();
			} else if (var2 >= 40 && var2 < 50) {
				field965[var2 - 40] = arg0.method233();
			} else if (var2 >= 50 && var2 < 60) {
				field966[var2 - 50] = arg0.method233();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("nc.a()Lfb;")
	public class32 method377() {
		class32 var1 = (class32) field972.method113(field960);
		if (var1 != null) {
			return var1;
		}

		class32 var2 = class32.method135(field961);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field965[0] != 0) {
				var2.method149(field965[var3], field966[var3]);
			}
		}

		field972.method114(var2, field960);
		return var2;
	}
}
