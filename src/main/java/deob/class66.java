package deob;

@ObfuscatedName("nc")
public class class66 {

	@ObfuscatedName("nc.c")
	public static int field996;

	@ObfuscatedName("nc.d")
	public static class66[] field997;

	@ObfuscatedName("nc.e")
	public int field998;

	@ObfuscatedName("nc.f")
	public int[] field999;

	@ObfuscatedName("nc.g")
	public int[] field1000;

	@ObfuscatedName("nc.h")
	public int[] field1001;

	@ObfuscatedName("nc.i")
	public int field1002 = -1;

	@ObfuscatedName("nc.j")
	public int[] field1003;

	@ObfuscatedName("nc.k")
	public boolean field1004 = false;

	@ObfuscatedName("nc.l")
	public int field1005 = 5;

	@ObfuscatedName("nc.m")
	public int field1006 = -1;

	@ObfuscatedName("nc.n")
	public int field1007 = -1;

	@ObfuscatedName("nc.o")
	public int field1008 = 99;

	@ObfuscatedName("nc.p")
	public int field1009 = -1;

	@ObfuscatedName("nc.q")
	public int field1010 = -1;

	@ObfuscatedName("nc.r")
	public int field1011;

	@ObfuscatedName("nc.s")
	public int field1012;

	@ObfuscatedName("nc.a(ILxb;)V")
	public static void method381(class50 arg0) {
		class38 var1 = new class38(arg0.method299("seq.dat", null));
		field996 = var1.method231();
		if (field997 == null) {
			field997 = new class66[field996];
		}

		for (int var2 = 0; var2 < field996; var2++) {
			if (field997[var2] == null) {
				field997[var2] = new class66();
			}

			field997[var2].method383(var1);
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int method382(int arg0) {
		int var2 = field1001[arg0];
		if (var2 == 0) {
			class7 var3 = class7.method47(field999[arg0]);
			if (var3 != null) {
				var2 = field1001[arg0] = var3.field134;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("nc.a(Llb;Z)V")
	public void method383(class38 arg0) {
		while (true) {
			int var2 = arg0.method229();
			if (var2 == 0) {
				if (field998 == 0) {
					field998 = 1;
					field999 = new int[1];
					field999[0] = -1;
					field1000 = new int[1];
					field1000[0] = -1;
					field1001 = new int[1];
					field1001[0] = -1;
				}

				if (field1009 == -1) {
					if (field1003 == null) {
						field1009 = 0;
					} else {
						field1009 = 2;
					}
				}

				if (field1010 == -1) {
					if (field1003 != null) {
						field1010 = 2;
						return;
					}

					field1010 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field998 = arg0.method229();
				field999 = new int[field998];
				field1000 = new int[field998];
				field1001 = new int[field998];
				for (int var3 = 0; var3 < field998; var3++) {
					field999[var3] = arg0.method231();
					field1000[var3] = arg0.method231();
					if (field1000[var3] == 0xFFFF) {
						field1000[var3] = -1;
					}

					field1001[var3] = arg0.method231();
				}
			} else if (var2 == 2) {
				field1002 = arg0.method231();
			} else if (var2 == 3) {
				int var4 = arg0.method229();
				field1003 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1003[var5] = arg0.method229();
				}

				field1003[var4] = 9999999;
			} else if (var2 == 4) {
				field1004 = true;
			} else if (var2 == 5) {
				field1005 = arg0.method229();
			} else if (var2 == 6) {
				field1006 = arg0.method231();
			} else if (var2 == 7) {
				field1007 = arg0.method231();
			} else if (var2 == 8) {
				field1008 = arg0.method229();
			} else if (var2 == 9) {
				field1009 = arg0.method229();
			} else if (var2 == 10) {
				field1010 = arg0.method229();
			} else if (var2 == 11) {
				field1011 = arg0.method229();
			} else if (var2 == 12) {
				field1012 = arg0.method234();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
