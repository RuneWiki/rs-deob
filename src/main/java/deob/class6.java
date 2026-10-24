package deob;

@ObfuscatedName("f")
public class class6 {

	@ObfuscatedName("f.d")
	public static boolean field122;

	@ObfuscatedName("f.e")
	public static class39 field123 = null;

	@ObfuscatedName("f.f")
	public static class39 field124 = null;

	@ObfuscatedName("f.g")
	public static long field125;

	@ObfuscatedName("f.h")
	public static int field126;

	@ObfuscatedName("f.i")
	public static long field127;

	@ObfuscatedName("f.j")
	public static int field128;

	@ObfuscatedName("f.k")
	public static int field129;

	@ObfuscatedName("f.a(Z)V")
	public static final synchronized void method43() {
		field123 = class39.method218(1);
		field124 = null;
		field125 = System.currentTimeMillis();
		field122 = true;
	}

	@ObfuscatedName("f.a(I)V")
	public static final synchronized void method44() {
		field122 = false;
		field123 = null;
		field124 = null;
	}

	@ObfuscatedName("f.b(I)Lmb;")
	public static final synchronized class39 method45() {
		class39 var0 = null;
		if (field124 != null && field122) {
			var0 = field124;
		}

		field124 = null;
		return var0;
	}

	@ObfuscatedName("f.a(B)Lmb;")
	public static final synchronized class39 method46() {
		class39 var0 = null;
		if (field123 != null && field123.field611 > 0 && field122) {
			var0 = field123;
		}

		method44();
		return var0;
	}

	@ObfuscatedName("f.a(IZ)V")
	public static final synchronized void method47(int arg0) {
		if (field123.field611 + arg0 >= 500) {
			class39 var1 = field123;
			field123 = class39.method218(1);
			field124 = var1;
		}
	}

	@ObfuscatedName("f.a(IIII)V")
	public static final synchronized void method48(int arg0, int arg1, int arg2) {
		if (field122 && (arg0 >= 0 && arg0 < 789 && arg2 >= 0 && arg2 < 532)) {
			field126++;
			long var3 = System.currentTimeMillis();
			long var5 = (var3 - field125) / 10L;
			if (var5 > 250L) {
				var5 = 250L;
			}

			field125 = var3;
			method47(5);

			if (arg1 == 1) {
				field123.method221(1);
			} else {
				field123.method221(2);
			}

			field123.method221((int) var5);
			field123.method224((arg2 << 10) + arg0);
		}
	}

	@ObfuscatedName("f.a(ZI)V")
	public static final synchronized void method49(int arg0) {
		if (field122) {
			field126++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field125) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field125 = var1;
			method47(2);

			if (arg0 == 1) {
				field123.method221(3);
			} else {
				field123.method221(4);
			}

			field123.method221((int) var3);
		}
	}

	@ObfuscatedName("f.a(IIZ)V")
	public static final synchronized void method50(int arg0, int arg1) {
		if (field122 && (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532)) {
			long var2 = System.currentTimeMillis();
			if (var2 - field127 >= 50L) {
				field127 = var2;
				field126++;
				long var4 = (var2 - field125) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}

				field125 = var2;

				if (arg1 - field128 < 8 && arg1 - field128 >= -8 && arg0 - field129 < 8 && arg0 - field129 >= -8) {
					method47(3);
					field123.method221(5);
					field123.method221((int) var4);
					field123.method221((arg0 + 8 - field129 << 4) + arg1 + 8 - field128);
				} else if (arg1 - field128 < 128 && arg1 - field128 >= -128 && arg0 - field129 < 128 && arg0 - field129 >= -128) {
					method47(4);
					field123.method221(6);
					field123.method221((int) var4);
					field123.method221(arg1 + 128 - field128);
					field123.method221(arg0 + 128 - field129);
				} else {
					method47(5);
					field123.method221(7);
					field123.method221((int) var4);
					field123.method224((arg0 << 10) + arg1);
				}

				field128 = arg1;
				field129 = arg0;
			}
		}
	}

	@ObfuscatedName("f.a(IB)V")
	public static final synchronized void method51(int arg0) {
		if (field122) {
			field126++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field125) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field125 = var1;

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

			method47(3);
			field123.method221(8);
			field123.method221((int) var3);
			field123.method221(arg0);
		}
	}

	@ObfuscatedName("f.b(ZI)V")
	public static final synchronized void method52(int arg0) {
		if (field122) {
			field126++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field125) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field125 = var1;

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

			method47(3);
			field123.method221(9);
			field123.method221((int) var3);
			field123.method221(arg0);
		}
	}

	@ObfuscatedName("f.b(B)V")
	public static final synchronized void method53() {
		if (field122) {
			field126++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field125) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field125 = var0;
			method47(2);
			field123.method221(10);
			field123.method221((int) var2);
		}
	}

	@ObfuscatedName("f.c(I)V")
	public static final synchronized void method54() {
		if (field122) {
			field126++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field125) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field125 = var0;
			method47(2);
			field123.method221(11);
			field123.method221((int) var2);
		}
	}

	@ObfuscatedName("f.b(Z)V")
	public static final synchronized void method55() {
		if (field122) {
			field126++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field125) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field125 = var0;
			method47(2);
			field123.method221(12);
			field123.method221((int) var2);
		}
	}

	@ObfuscatedName("f.d(I)V")
	public static final synchronized void method56() {
		if (field122) {
			field126++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field125) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field125 = var0;
			method47(2);
			field123.method221(13);
			field123.method221((int) var2);
		}
	}
}
