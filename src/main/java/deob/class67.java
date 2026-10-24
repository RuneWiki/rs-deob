package deob;

@ObfuscatedName("oc")
public class class67 {

	@ObfuscatedName("oc.c")
	public static int field990;

	@ObfuscatedName("oc.d")
	public static class67[] field991;

	@ObfuscatedName("oc.e")
	public int field992;

	@ObfuscatedName("oc.f")
	public int[] field993;

	@ObfuscatedName("oc.g")
	public int[] field994;

	@ObfuscatedName("oc.h")
	public int[] field995;

	@ObfuscatedName("oc.i")
	public int field996 = -1;

	@ObfuscatedName("oc.j")
	public int[] field997;

	@ObfuscatedName("oc.k")
	public boolean field998 = false;

	@ObfuscatedName("oc.l")
	public int field999 = 5;

	@ObfuscatedName("oc.m")
	public int field1000 = -1;

	@ObfuscatedName("oc.n")
	public int field1001 = -1;

	@ObfuscatedName("oc.o")
	public int field1002 = 99;

	@ObfuscatedName("oc.p")
	public int field1003 = -1;

	@ObfuscatedName("oc.q")
	public int field1004 = -1;

	@ObfuscatedName("oc.r")
	public int field1005;

	@ObfuscatedName("oc.a(ILyb;)V")
	public static void method378(class51 arg0) {
		class39 var1 = new class39(arg0.method298("seq.dat", null));
		field990 = var1.method230();
		if (field991 == null) {
			field991 = new class67[field990];
		}

		for (int var2 = 0; var2 < field990; var2++) {
			if (field991[var2] == null) {
				field991[var2] = new class67();
			}

			field991[var2].method380(var1);
		}
	}

	@ObfuscatedName("oc.a(II)I")
	public int method379(int arg0) {
		int var2 = field995[arg0];
		if (var2 == 0) {
			class7 var3 = class7.method47(field993[arg0]);
			if (var3 != null) {
				var2 = field995[arg0] = var3.field134;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("oc.a(BLmb;)V")
	public void method380(class39 arg0) {
		while (true) {
			int var2 = arg0.method228();
			if (var2 == 0) {
				if (field992 == 0) {
					field992 = 1;
					field993 = new int[1];
					field993[0] = -1;
					field994 = new int[1];
					field994[0] = -1;
					field995 = new int[1];
					field995[0] = -1;
				}

				if (field1003 == -1) {
					if (field997 == null) {
						field1003 = 0;
					} else {
						field1003 = 2;
					}
				}

				if (field1004 == -1) {
					if (field997 != null) {
						field1004 = 2;
						return;
					}

					field1004 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field992 = arg0.method228();
				field993 = new int[field992];
				field994 = new int[field992];
				field995 = new int[field992];
				for (int var3 = 0; var3 < field992; var3++) {
					field993[var3] = arg0.method230();
					field994[var3] = arg0.method230();
					if (field994[var3] == 0xFFFF) {
						field994[var3] = -1;
					}

					field995[var3] = arg0.method230();
				}
			} else if (var2 == 2) {
				field996 = arg0.method230();
			} else if (var2 == 3) {
				int var4 = arg0.method228();
				field997 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field997[var5] = arg0.method228();
				}

				field997[var4] = 9999999;
			} else if (var2 == 4) {
				field998 = true;
			} else if (var2 == 5) {
				field999 = arg0.method228();
			} else if (var2 == 6) {
				field1000 = arg0.method230();
			} else if (var2 == 7) {
				field1001 = arg0.method230();
			} else if (var2 == 8) {
				field1002 = arg0.method228();
			} else if (var2 == 9) {
				field1003 = arg0.method228();
			} else if (var2 == 10) {
				field1004 = arg0.method228();
			} else if (var2 == 11) {
				field1005 = arg0.method228();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
