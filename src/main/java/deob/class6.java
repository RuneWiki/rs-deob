package deob;

@ObfuscatedName("f")
public class class6 {

	@ObfuscatedName("f.d")
	public static boolean field131;

	@ObfuscatedName("f.e")
	public static class39 field132 = null;

	@ObfuscatedName("f.f")
	public static class39 field133 = null;

	@ObfuscatedName("f.g")
	public static long field134;

	@ObfuscatedName("f.h")
	public static int field135;

	@ObfuscatedName("f.i")
	public static long field136;

	@ObfuscatedName("f.j")
	public static int field137;

	@ObfuscatedName("f.k")
	public static int field138;

	@ObfuscatedName("f.a(I)V")
	public static final synchronized void method44() {
		field132 = class39.method226(1);
		field133 = null;
		field134 = System.currentTimeMillis();
		field131 = true;
	}

	@ObfuscatedName("f.a(Z)V")
	public static final synchronized void method45() {
		field131 = false;
		field132 = null;
		field133 = null;
	}

	@ObfuscatedName("f.b(Z)Lmb;")
	public static final synchronized class39 method46() {
		class39 var0 = null;
		if (field133 != null && field131) {
			var0 = field133;
		}

		field133 = null;
		return var0;
	}

	@ObfuscatedName("f.b(I)Lmb;")
	public static final synchronized class39 method47() {
		class39 var0 = null;
		if (field132 != null && field132.field624 > 0 && field131) {
			var0 = field132;
		}

		method45();
		return var0;
	}

	@ObfuscatedName("f.a(II)V")
	public static final synchronized void method48(int arg0) {
		if (field132.field624 + arg0 >= 500) {
			class39 var1 = field132;
			field132 = class39.method226(1);
			field133 = var1;
		}
	}

	@ObfuscatedName("f.a(IIII)V")
	public static final synchronized void method49(int arg0, int arg1, int arg2) {
		if (field131 && (arg2 >= 0 && arg2 < 789 && arg1 >= 0 && arg1 < 532)) {
			field135++;
			long var3 = System.currentTimeMillis();
			long var5 = (var3 - field134) / 10L;
			if (var5 > 250L) {
				var5 = 250L;
			}

			field134 = var3;
			method48(5);

			if (arg0 == 1) {
				field132.method229(1);
			} else {
				field132.method229(2);
			}

			field132.method229((int) var5);
			field132.method232((arg1 << 10) + arg2);
		}
	}

	@ObfuscatedName("f.b(II)V")
	public static final synchronized void method50(int arg0) {
		if (field131) {
			field135++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field134) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field134 = var1;
			method48(2);

			if (arg0 == 1) {
				field132.method229(3);
			} else {
				field132.method229(4);
			}

			field132.method229((int) var3);
		}
	}

	@ObfuscatedName("f.a(III)V")
	public static final synchronized void method51(int arg0, int arg1) {
		if (field131 && (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532)) {
			long var2 = System.currentTimeMillis();
			if (var2 - field136 >= 50L) {
				field136 = var2;
				field135++;
				long var4 = (var2 - field134) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}

				field134 = var2;

				if (arg1 - field137 < 8 && arg1 - field137 >= -8 && arg0 - field138 < 8 && arg0 - field138 >= -8) {
					method48(3);
					field132.method229(5);
					field132.method229((int) var4);
					field132.method229((arg0 + 8 - field138 << 4) + arg1 + 8 - field137);
				} else if (arg1 - field137 < 128 && arg1 - field137 >= -128 && arg0 - field138 < 128 && arg0 - field138 >= -128) {
					method48(4);
					field132.method229(6);
					field132.method229((int) var4);
					field132.method229(arg1 + 128 - field137);
					field132.method229(arg0 + 128 - field138);
				} else {
					method48(5);
					field132.method229(7);
					field132.method229((int) var4);
					field132.method232((arg0 << 10) + arg1);
				}

				field137 = arg1;
				field138 = arg0;
			}
		}
	}

	@ObfuscatedName("f.c(II)V")
	public static final synchronized void method52(int arg0) {
		if (field131) {
			field135++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field134) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field134 = var1;

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

			method48(3);
			field132.method229(8);
			field132.method229((int) var3);
			field132.method229(arg0);
		}
	}

	@ObfuscatedName("f.d(II)V")
	public static final synchronized void method53(int arg0) {
		if (field131) {
			field135++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field134) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field134 = var1;

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

			method48(3);
			field132.method229(9);
			field132.method229((int) var3);
			field132.method229(arg0);
		}
	}

	@ObfuscatedName("f.c(I)V")
	public static final synchronized void method54() {
		if (field131) {
			field135++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field134) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field134 = var0;
			method48(2);
			field132.method229(10);
			field132.method229((int) var2);
		}
	}

	@ObfuscatedName("f.d(I)V")
	public static final synchronized void method55() {
		if (field131) {
			field135++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field134) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field134 = var0;
			method48(2);
			field132.method229(11);
			field132.method229((int) var2);
		}
	}

	@ObfuscatedName("f.c(Z)V")
	public static final synchronized void method56() {
		if (field131) {
			field135++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field134) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field134 = var0;
			method48(2);
			field132.method229(12);
			field132.method229((int) var2);
		}
	}

	@ObfuscatedName("f.e(I)V")
	public static final synchronized void method57() {
		if (field131) {
			field135++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field134) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field134 = var0;
			method48(2);
			field132.method229(13);
			field132.method229((int) var2);
		}
	}
}
