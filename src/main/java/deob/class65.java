package deob;

@ObfuscatedName("mc")
public class class65 {

	@ObfuscatedName("mc.b")
	public static int field945;

	@ObfuscatedName("mc.c")
	public static class65[] field946;

	@ObfuscatedName("mc.d")
	public int field947;

	@ObfuscatedName("mc.e")
	public int[] field948;

	@ObfuscatedName("mc.f")
	public int[] field949;

	@ObfuscatedName("mc.g")
	public int[] field950;

	@ObfuscatedName("mc.h")
	public int field951 = -1;

	@ObfuscatedName("mc.i")
	public int[] field952;

	@ObfuscatedName("mc.j")
	public boolean field953 = false;

	@ObfuscatedName("mc.k")
	public int field954 = 5;

	@ObfuscatedName("mc.l")
	public int field955 = -1;

	@ObfuscatedName("mc.m")
	public int field956 = -1;

	@ObfuscatedName("mc.n")
	public int field957 = 99;

	@ObfuscatedName("mc.a(Lyb;I)V")
	public static void method372(class51 arg0) {
		class39 var1 = new class39(arg0.method299("seq.dat", null));
		field945 = var1.method233();
		if (field946 == null) {
			field946 = new class65[field945];
		}

		for (int var2 = 0; var2 < field945; var2++) {
			if (field946[var2] == null) {
				field946[var2] = new class65();
			}

			field946[var2].method374(var1);
		}
	}

	@ObfuscatedName("mc.a(ZI)I")
	public int method373(int arg0) {
		int var2 = field950[arg0];
		if (var2 == 0) {
			class8 var3 = class8.method60(field948[arg0]);
			if (var3 != null) {
				var2 = field950[arg0] = var3.field134;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("mc.a(ILmb;)V")
	public void method374(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				if (field947 == 0) {
					field947 = 1;
					field948 = new int[1];
					field948[0] = -1;
					field949 = new int[1];
					field949[0] = -1;
					field950 = new int[1];
					field950[0] = -1;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field947 = arg0.method231();
				field948 = new int[field947];
				field949 = new int[field947];
				field950 = new int[field947];
				for (int var3 = 0; var3 < field947; var3++) {
					field948[var3] = arg0.method233();
					field949[var3] = arg0.method233();
					if (field949[var3] == 0xFFFF) {
						field949[var3] = -1;
					}

					field950[var3] = arg0.method233();
				}
			} else if (var2 == 2) {
				field951 = arg0.method233();
			} else if (var2 == 3) {
				int var4 = arg0.method231();
				field952 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field952[var5] = arg0.method231();
				}

				field952[var4] = 9999999;
			} else if (var2 == 4) {
				field953 = true;
			} else if (var2 == 5) {
				field954 = arg0.method231();
			} else if (var2 == 6) {
				field955 = arg0.method233();
			} else if (var2 == 7) {
				field956 = arg0.method233();
			} else if (var2 == 8) {
				field957 = arg0.method231();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
