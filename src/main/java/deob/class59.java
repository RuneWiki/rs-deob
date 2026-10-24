package deob;

@ObfuscatedName("gc")
public class class59 {

	@ObfuscatedName("gc.d")
	public static int field835;

	@ObfuscatedName("gc.e")
	public static class59[] field836;

	@ObfuscatedName("gc.f")
	public int field837;

	@ObfuscatedName("gc.g")
	public int field838;

	@ObfuscatedName("gc.h")
	public class58 field839;

	@ObfuscatedName("gc.i")
	public boolean field840 = false;

	@ObfuscatedName("gc.j")
	public int[] field841 = new int[6];

	@ObfuscatedName("gc.k")
	public int[] field842 = new int[6];

	@ObfuscatedName("gc.l")
	public static class18 field843 = new class18(30);

	@ObfuscatedName("gc.a(Ltb;I)V")
	public static void method281(class46 arg0) {
		class36 var1 = new class36(arg0.method225(null, "spotanim.dat"));
		field835 = var1.method187();
		if (field836 == null) {
			field836 = new class59[field835];
		}

		for (int var2 = 0; var2 < field835; var2++) {
			if (field836[var2] == null) {
				field836[var2] = new class59();
			}

			field836[var2].field837 = var2;
			field836[var2].method282(var1);
		}
	}

	@ObfuscatedName("gc.a(BLjb;)V")
	public void method282(class36 arg0) {
		while (true) {
			int var2 = arg0.method185();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field838 = arg0.method187();
			} else if (var2 == 2) {
				field839 = class58.field823[arg0.method187()];
			} else if (var2 == 3) {
				field840 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field841[var2 - 40] = arg0.method187();
			} else if (var2 >= 50 && var2 < 60) {
				field842[var2 - 50] = arg0.method187();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("gc.a()Ldb;")
	public class30 method283() {
		class30 var1 = (class30) field843.method84(field837);
		if (var1 != null) {
			return var1;
		}

		class30 var2 = new class30(field838);
		for (int var3 = 0; var3 < 6; var3++) {
			if (field841[0] != 0) {
				var2.method115(field841[var3], field842[var3]);
			}
		}

		field843.method85(var2, field837);
		return var2;
	}
}
