package deob;

@ObfuscatedName("e")
public class class5 {

	@ObfuscatedName("e.f")
	public static boolean field60;

	@ObfuscatedName("e.g")
	public static class37 field61 = null;

	@ObfuscatedName("e.h")
	public static class37 field62 = null;

	@ObfuscatedName("e.i")
	public static long field63;

	@ObfuscatedName("e.j")
	public static int field64;

	@ObfuscatedName("e.k")
	public static long field65;

	@ObfuscatedName("e.l")
	public static int field66;

	@ObfuscatedName("e.m")
	public static int field67;

	@ObfuscatedName("e.a(I)V")
	public static final synchronized void method34() {
		field61 = class37.method203(1);
		field62 = null;
		field63 = System.currentTimeMillis();
		field60 = true;
	}

	@ObfuscatedName("e.b(I)V")
	public static final synchronized void method35() {
		field60 = false;
		field61 = null;
		field62 = null;
	}

	@ObfuscatedName("e.c(I)Lkb;")
	public static final synchronized class37 method36() {
		class37 var0 = null;
		if (field62 != null && field60) {
			var0 = field62;
		}

		field62 = null;
		return var0;
	}

	@ObfuscatedName("e.a(B)Lkb;")
	public static final synchronized class37 method37() {
		class37 var0 = null;
		if (field61 != null && field61.field543 > 0 && field60) {
			var0 = field61;
		}

		method35();
		return var0;
	}

	@ObfuscatedName("e.a(II)V")
	public static final synchronized void method38(int arg0) {
		if (field61.field543 + arg0 >= 500) {
			class37 var1 = field61;
			field61 = class37.method203(1);
			field62 = var1;
		}
	}

	@ObfuscatedName("e.a(IIIZ)V")
	public static final synchronized void method39(int arg0, int arg1, int arg2) {
		if (field60 && (arg2 >= 0 && arg2 < 789 && arg1 >= 0 && arg1 < 532)) {
			field64++;
			long var3 = System.currentTimeMillis();
			long var5 = (var3 - field63) / 10L;
			if (var5 > 250L) {
				var5 = 250L;
			}

			field63 = var3;
			method38(5);

			if (arg0 == 1) {
				field61.method206(1);
			} else {
				field61.method206(2);
			}

			field61.method206((int) var5);
			field61.method209((arg1 << 10) + arg2);
		}
	}

	@ObfuscatedName("e.a(BI)V")
	public static final synchronized void method40(int arg0) {
		if (field60) {
			field64++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field63) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field63 = var1;
			method38(2);

			if (arg0 == 1) {
				field61.method206(3);
			} else {
				field61.method206(4);
			}

			field61.method206((int) var3);
		}
	}

	@ObfuscatedName("e.a(III)V")
	public static final synchronized void method41(int arg0, int arg1) {
		if (field60 && (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532)) {
			long var2 = System.currentTimeMillis();
			if (var2 - field65 >= 50L) {
				field65 = var2;
				field64++;
				long var4 = (var2 - field63) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}

				field63 = var2;

				if (arg0 - field66 < 8 && arg0 - field66 >= -8 && arg1 - field67 < 8 && arg1 - field67 >= -8) {
					method38(3);
					field61.method206(5);
					field61.method206((int) var4);
					field61.method206((arg1 + 8 - field67 << 4) + arg0 + 8 - field66);
				} else if (arg0 - field66 < 128 && arg0 - field66 >= -128 && arg1 - field67 < 128 && arg1 - field67 >= -128) {
					method38(4);
					field61.method206(6);
					field61.method206((int) var4);
					field61.method206(arg0 + 128 - field66);
					field61.method206(arg1 + 128 - field67);
				} else {
					method38(5);
					field61.method206(7);
					field61.method206((int) var4);
					field61.method209((arg1 << 10) + arg0);
				}

				field66 = arg0;
				field67 = arg1;
			}
		}
	}

	@ObfuscatedName("e.b(II)V")
	public static final synchronized void method42(int arg0) {
		if (field60) {
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

			method38(3);
			field61.method206(8);
			field61.method206((int) var3);
			field61.method206(arg0);
		}
	}

	@ObfuscatedName("e.c(II)V")
	public static final synchronized void method43(int arg0) {
		if (field60) {
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

			method38(3);
			field61.method206(9);
			field61.method206((int) var3);
			field61.method206(arg0);
		}
	}

	@ObfuscatedName("e.d(I)V")
	public static final synchronized void method44() {
		if (field60) {
			field64++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field63) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field63 = var0;
			method38(2);
			field61.method206(10);
			field61.method206((int) var2);
		}
	}

	@ObfuscatedName("e.b(B)V")
	public static final synchronized void method45() {
		if (field60) {
			field64++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field63) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field63 = var0;
			method38(2);
			field61.method206(11);
			field61.method206((int) var2);
		}
	}

	@ObfuscatedName("e.e(I)V")
	public static final synchronized void method46() {
		if (field60) {
			field64++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field63) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field63 = var0;
			method38(2);
			field61.method206(12);
			field61.method206((int) var2);
		}
	}

	@ObfuscatedName("e.f(I)V")
	public static final synchronized void method47() {
		if (field60) {
			field64++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field63) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field63 = var0;
			method38(2);
			field61.method206(13);
			field61.method206((int) var2);
		}
	}
}
