package deob;

@ObfuscatedName("e")
public class class5 {

	@ObfuscatedName("e.e")
	public static boolean field59;

	@ObfuscatedName("e.f")
	public static class37 field60 = null;

	@ObfuscatedName("e.g")
	public static class37 field61 = null;

	@ObfuscatedName("e.h")
	public static long field62;

	@ObfuscatedName("e.i")
	public static long field63;

	@ObfuscatedName("e.j")
	public static int field64;

	@ObfuscatedName("e.k")
	public static int field65;

	@ObfuscatedName("e.l")
	public static int field66;

	@ObfuscatedName("e.a(I)V")
	public static final synchronized void method34() {
		field60 = class37.method196(1);
		field63 = System.currentTimeMillis();
		field59 = true;
	}

	@ObfuscatedName("e.a(ZZ)V")
	public static final synchronized void method35(boolean arg0) {
		field59 = false;

		if (arg0) {
			method37(499);
		} else {
			if (field60 != null) {
				field60.field542 = 0;
			}

			field61 = null;
		}
	}

	@ObfuscatedName("e.a(Z)Lkb;")
	public static final synchronized class37 method36() {
		class37 var0 = null;
		if (field61 != null) {
			var0 = field61;
			field61 = null;
		}

		return var0;
	}

	@ObfuscatedName("e.a(BI)V")
	public static final synchronized void method37(int arg0) {
		if (field60.field542 + arg0 >= 500) {
			class37 var1 = field60;
			field60 = class37.method196(1);
			field61 = var1;
		}
	}

	@ObfuscatedName("e.a(IIII)V")
	public static final synchronized void method38(int arg0, int arg1, int arg2) {
		if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
			field64++;
			long var3 = System.currentTimeMillis();
			long var5 = (var3 - field63) / 10L;
			if (var5 > 250L) {
				var5 = 250L;
			}

			field63 = var3;
			method37(5);

			if (arg2 == 1) {
				field60.method199(1);
			} else {
				field60.method199(2);
			}

			field60.method199((int) var5);
			field60.method202((arg0 << 10) + arg1);
		}
	}

	@ObfuscatedName("e.a(IZ)V")
	public static final synchronized void method39(int arg0) {
		field64++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - field63) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}

		field63 = var1;
		method37(2);

		if (arg0 == 1) {
			field60.method199(3);
		} else {
			field60.method199(4);
		}

		field60.method199((int) var3);
	}

	@ObfuscatedName("e.a(III)V")
	public static final synchronized void method40(int arg0, int arg1) {
		if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
			long var2 = System.currentTimeMillis();
			if (var2 - field62 >= 50L) {
				field62 = var2;
				field64++;
				long var4 = (var2 - field63) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}

				field63 = var2;

				if (arg1 - field65 < 8 && arg1 - field65 >= -8 && arg0 - field66 < 8 && arg0 - field66 >= -8) {
					method37(3);
					field60.method199(5);
					field60.method199((int) var4);
					field60.method199((arg0 + 8 - field66 << 4) + arg1 + 8 - field65);
				} else if (arg1 - field65 < 128 && arg1 - field65 >= -128 && arg0 - field66 < 128 && arg0 - field66 >= -128) {
					method37(4);
					field60.method199(6);
					field60.method199((int) var4);
					field60.method199(arg1 + 128 - field65);
					field60.method199(arg0 + 128 - field66);
				} else {
					method37(5);
					field60.method199(7);
					field60.method199((int) var4);
					field60.method202((arg0 << 10) + arg1);
				}

				field65 = arg1;
				field66 = arg0;
			}
		}
	}

	@ObfuscatedName("e.a(ZI)V")
	public static final synchronized void method41(int arg0) {
		field64++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - field63) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}

		field63 = var1;

		if (arg0 == 1000) {
			arg0 = 11;
		}

		if (arg0 == 1001) {
			arg0 = 12;
		}

		if (arg0 == 1002) {
			arg0 = 14;
		}

		if (arg0 == 1003) {
			arg0 = 15;
		}

		if (arg0 >= 1008) {
			arg0 -= 992;
		}

		method37(3);
		field60.method199(8);
		field60.method199((int) var3);
		field60.method199(arg0);
	}

	@ObfuscatedName("e.a(IB)V")
	public static final synchronized void method42(int arg0) {
		field64++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - field63) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}

		field63 = var1;

		if (arg0 == 1000) {
			arg0 = 11;
		}

		if (arg0 == 1001) {
			arg0 = 12;
		}

		if (arg0 == 1002) {
			arg0 = 14;
		}

		if (arg0 == 1003) {
			arg0 = 15;
		}

		if (arg0 >= 1008) {
			arg0 -= 992;
		}

		method37(3);
		field60.method199(9);
		field60.method199((int) var3);
		field60.method199(arg0);
	}

	@ObfuscatedName("e.b(I)V")
	public static final synchronized void method43() {
		field64++;
		long var0 = System.currentTimeMillis();
		long var2 = (var0 - field63) / 10L;
		if (var2 > 250L) {
			var2 = 250L;
		}

		field63 = var0;
		method37(2);
		field60.method199(10);
		field60.method199((int) var2);
	}

	@ObfuscatedName("e.c(I)V")
	public static final synchronized void method44() {
		field64++;
		long var0 = System.currentTimeMillis();
		long var2 = (var0 - field63) / 10L;
		if (var2 > 250L) {
			var2 = 250L;
		}

		field63 = var0;
		method37(2);
		field60.method199(11);
		field60.method199((int) var2);
	}

	@ObfuscatedName("e.d(I)V")
	public static final synchronized void method45() {
		field64++;
		long var0 = System.currentTimeMillis();
		long var2 = (var0 - field63) / 10L;
		if (var2 > 250L) {
			var2 = 250L;
		}

		field63 = var0;
		method37(2);
		field60.method199(12);
		field60.method199((int) var2);
	}

	@ObfuscatedName("e.e(I)V")
	public static final synchronized void method46() {
		field64++;
		long var0 = System.currentTimeMillis();
		long var2 = (var0 - field63) / 10L;
		if (var2 > 250L) {
			var2 = 250L;
		}

		field63 = var0;
		method37(2);
		field60.method199(13);
		field60.method199((int) var2);
	}
}
