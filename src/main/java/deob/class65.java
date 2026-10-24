package deob;

@ObfuscatedName("mc")
public class class65 {

	@ObfuscatedName("mc.a")
	public static int field942;

	@ObfuscatedName("mc.b")
	public static class65[] field943;

	@ObfuscatedName("mc.c")
	public int field944;

	@ObfuscatedName("mc.d")
	public int[] field945;

	@ObfuscatedName("mc.e")
	public int[] field946;

	@ObfuscatedName("mc.f")
	public int[] field947;

	@ObfuscatedName("mc.g")
	public int field948 = -1;

	@ObfuscatedName("mc.h")
	public int[] field949;

	@ObfuscatedName("mc.i")
	public boolean field950 = false;

	@ObfuscatedName("mc.j")
	public int field951 = 5;

	@ObfuscatedName("mc.k")
	public int field952 = -1;

	@ObfuscatedName("mc.l")
	public int field953 = -1;

	@ObfuscatedName("mc.m")
	public int field954 = 99;

	@ObfuscatedName("mc.a(Lyb;B)V")
	public static void method368(class51 arg0) {
		class39 var1 = new class39(arg0.method295("seq.dat", null));
		field942 = var1.method233();
		if (field943 == null) {
			field943 = new class65[field942];
		}

		for (int var2 = 0; var2 < field942; var2++) {
			if (field943[var2] == null) {
				field943[var2] = new class65();
			}

			field943[var2].method370(var1);
		}
	}

	@ObfuscatedName("mc.a(II)I")
	public int method369(int arg0) {
		int var2 = field947[arg0];
		if (var2 == 0) {
			class8 var3 = class8.method60(field945[arg0]);
			if (var3 != null) {
				var2 = field947[arg0] = var3.field134;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("mc.a(ZLmb;)V")
	public void method370(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				if (field944 == 0) {
					field944 = 1;
					field945 = new int[1];
					field945[0] = -1;
					field946 = new int[1];
					field946[0] = -1;
					field947 = new int[1];
					field947[0] = -1;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field944 = arg0.method231();
				field945 = new int[field944];
				field946 = new int[field944];
				field947 = new int[field944];
				for (int var3 = 0; var3 < field944; var3++) {
					field945[var3] = arg0.method233();
					field946[var3] = arg0.method233();
					if (field946[var3] == 0xFFFF) {
						field946[var3] = -1;
					}

					field947[var3] = arg0.method233();
				}
			} else if (var2 == 2) {
				field948 = arg0.method233();
			} else if (var2 == 3) {
				int var4 = arg0.method231();
				field949 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field949[var5] = arg0.method231();
				}

				field949[var4] = 9999999;
			} else if (var2 == 4) {
				field950 = true;
			} else if (var2 == 5) {
				field951 = arg0.method231();
			} else if (var2 == 6) {
				field952 = arg0.method233();
			} else if (var2 == 7) {
				field953 = arg0.method233();
			} else if (var2 == 8) {
				field954 = arg0.method231();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
