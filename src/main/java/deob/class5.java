package deob;

@ObfuscatedName("e")
public class class5 {

	@ObfuscatedName("e.f")
	public static boolean field58;

	@ObfuscatedName("e.g")
	public static class37 field59 = null;

	@ObfuscatedName("e.h")
	public static class37 field60 = null;

	@ObfuscatedName("e.i")
	public static long field61;

	@ObfuscatedName("e.j")
	public static long field62;

	@ObfuscatedName("e.k")
	public static int field63;

	@ObfuscatedName("e.l")
	public static int field64;

	@ObfuscatedName("e.m")
	public static int field65;

	@ObfuscatedName("e.a(I)V")
	public static final synchronized void method34() {
		field59 = class37.method196(1);
		field62 = System.currentTimeMillis();
		field58 = true;
	}

	@ObfuscatedName("e.a(ZI)V")
	public static final synchronized void method35(boolean arg0) {
		field58 = false;

		if (arg0) {
			method37(499);
		} else {
			if (field59 != null) {
				field59.field541 = 0;
			}

			field60 = null;
		}
	}

	@ObfuscatedName("e.a(B)Lkb;")
	public static final synchronized class37 method36() {
		class37 var0 = null;
		if (field60 != null) {
			var0 = field60;
			field60 = null;
		}

		return var0;
	}

	@ObfuscatedName("e.b(ZI)V")
	public static final synchronized void method37(int arg0) {
		if (field59.field541 + arg0 >= 500) {
			class37 var1 = field59;
			field59 = class37.method196(1);
			field60 = var1;
		}
	}

	@ObfuscatedName("e.a(IIIB)V")
	public static final synchronized void method38(int arg0, int arg1, int arg2) {
		if (arg0 >= 0 && arg0 < 789 && arg2 >= 0 && arg2 < 532) {
			field63++;
			long var3 = System.currentTimeMillis();
			long var5 = (var3 - field62) / 10L;
			if (var5 > 250L) {
				var5 = 250L;
			}

			field62 = var3;
			method37(5);

			if (arg1 == 1) {
				field59.method199(1);
			} else {
				field59.method199(2);
			}

			field59.method199((int) var5);
			field59.method202((arg2 << 10) + arg0);
		}
	}

	@ObfuscatedName("e.a(IZ)V")
	public static final synchronized void method39(int arg0) {
		field63++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - field62) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}

		field62 = var1;
		method37(2);

		if (arg0 == 1) {
			field59.method199(3);
		} else {
			field59.method199(4);
		}

		field59.method199((int) var3);
	}

	@ObfuscatedName("e.a(IBI)V")
	public static final synchronized void method40(int arg0, int arg1) {
		if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
			long var2 = System.currentTimeMillis();
			if (var2 - field61 >= 50L) {
				field61 = var2;
				field63++;
				long var4 = (var2 - field62) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}

				field62 = var2;

				if (arg1 - field64 < 8 && arg1 - field64 >= -8 && arg0 - field65 < 8 && arg0 - field65 >= -8) {
					method37(3);
					field59.method199(5);
					field59.method199((int) var4);
					field59.method199((arg0 + 8 - field65 << 4) + arg1 + 8 - field64);
				} else if (arg1 - field64 < 128 && arg1 - field64 >= -128 && arg0 - field65 < 128 && arg0 - field65 >= -128) {
					method37(4);
					field59.method199(6);
					field59.method199((int) var4);
					field59.method199(arg1 + 128 - field64);
					field59.method199(arg0 + 128 - field65);
				} else {
					method37(5);
					field59.method199(7);
					field59.method199((int) var4);
					field59.method202((arg0 << 10) + arg1);
				}

				field64 = arg1;
				field65 = arg0;
			}
		}
	}

	@ObfuscatedName("e.a(BI)V")
	public static final synchronized void method41(int arg0) {
		field63++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - field62) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}

		field62 = var1;

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
		field59.method199(8);
		field59.method199((int) var3);
		field59.method199(arg0);
	}

	@ObfuscatedName("e.c(ZI)V")
	public static final synchronized void method42(int arg0) {
		field63++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - field62) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}

		field62 = var1;

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
		field59.method199(9);
		field59.method199((int) var3);
		field59.method199(arg0);
	}

	@ObfuscatedName("e.b(I)V")
	public static final synchronized void method43() {
		field63++;
		long var0 = System.currentTimeMillis();
		long var2 = (var0 - field62) / 10L;
		if (var2 > 250L) {
			var2 = 250L;
		}

		field62 = var0;
		method37(2);
		field59.method199(10);
		field59.method199((int) var2);
	}

	@ObfuscatedName("e.c(I)V")
	public static final synchronized void method44() {
		field63++;
		long var0 = System.currentTimeMillis();
		long var2 = (var0 - field62) / 10L;
		if (var2 > 250L) {
			var2 = 250L;
		}

		field62 = var0;
		method37(2);
		field59.method199(11);
		field59.method199((int) var2);
	}

	@ObfuscatedName("e.d(I)V")
	public static final synchronized void method45() {
		field63++;
		long var0 = System.currentTimeMillis();
		long var2 = (var0 - field62) / 10L;
		if (var2 > 250L) {
			var2 = 250L;
		}

		field62 = var0;
		method37(2);
		field59.method199(12);
		field59.method199((int) var2);
	}

	@ObfuscatedName("e.b(B)V")
	public static final synchronized void method46() {
		field63++;
		long var0 = System.currentTimeMillis();
		long var2 = (var0 - field62) / 10L;
		if (var2 > 250L) {
			var2 = 250L;
		}

		field62 = var0;
		method37(2);
		field59.method199(13);
		field59.method199((int) var2);
	}
}
