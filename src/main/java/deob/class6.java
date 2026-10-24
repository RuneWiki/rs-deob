package deob;

@ObfuscatedName("f")
public class class6 {

	@ObfuscatedName("f.g")
	public static boolean field130;

	@ObfuscatedName("f.h")
	public static class39 field131 = null;

	@ObfuscatedName("f.i")
	public static class39 field132 = null;

	@ObfuscatedName("f.j")
	public static long field133;

	@ObfuscatedName("f.k")
	public static int field134;

	@ObfuscatedName("f.l")
	public static long field135;

	@ObfuscatedName("f.m")
	public static int field136;

	@ObfuscatedName("f.n")
	public static int field137;

	@ObfuscatedName("f.a(I)V")
	public static final synchronized void method44() {
		field131 = class39.method226(1);
		field132 = null;
		field133 = System.currentTimeMillis();
		field130 = true;
	}

	@ObfuscatedName("f.a(B)V")
	public static final synchronized void method45() {
		field130 = false;
		field131 = null;
		field132 = null;
	}

	@ObfuscatedName("f.a(Z)Lmb;")
	public static final synchronized class39 method46() {
		class39 var0 = null;
		if (field132 != null && field130) {
			var0 = field132;
		}

		field132 = null;
		return var0;
	}

	@ObfuscatedName("f.b(I)Lmb;")
	public static final synchronized class39 method47() {
		class39 var0 = null;
		if (field131 != null && field131.field624 > 0 && field130) {
			var0 = field131;
		}

		method45();
		return var0;
	}

	@ObfuscatedName("f.a(ZI)V")
	public static final synchronized void method48(int arg0) {
		if (field131.field624 + arg0 >= 500) {
			class39 var1 = field131;
			field131 = class39.method226(1);
			field132 = var1;
		}
	}

	@ObfuscatedName("f.a(IIII)V")
	public static final synchronized void method49(int arg0, int arg1, int arg2) {
		if (field130 && (arg0 >= 0 && arg0 < 789 && arg2 >= 0 && arg2 < 532)) {
			field134++;
			long var3 = System.currentTimeMillis();
			long var5 = (var3 - field133) / 10L;
			if (var5 > 250L) {
				var5 = 250L;
			}

			field133 = var3;
			method48(5);

			if (arg1 == 1) {
				field131.method229(1);
			} else {
				field131.method229(2);
			}

			field131.method229((int) var5);
			field131.method232((arg2 << 10) + arg0);
		}
	}

	@ObfuscatedName("f.a(IB)V")
	public static final synchronized void method50(int arg0) {
		if (field130) {
			field134++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field133) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field133 = var1;
			method48(2);

			if (arg0 == 1) {
				field131.method229(3);
			} else {
				field131.method229(4);
			}

			field131.method229((int) var3);
		}
	}

	@ObfuscatedName("f.a(BII)V")
	public static final synchronized void method51(int arg0, int arg1) {
		if (field130 && (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532)) {
			long var2 = System.currentTimeMillis();
			if (var2 - field135 >= 50L) {
				field135 = var2;
				field134++;
				long var4 = (var2 - field133) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}

				field133 = var2;

				if (arg0 - field136 < 8 && arg0 - field136 >= -8 && arg1 - field137 < 8 && arg1 - field137 >= -8) {
					method48(3);
					field131.method229(5);
					field131.method229((int) var4);
					field131.method229((arg1 + 8 - field137 << 4) + arg0 + 8 - field136);
				} else if (arg0 - field136 < 128 && arg0 - field136 >= -128 && arg1 - field137 < 128 && arg1 - field137 >= -128) {
					method48(4);
					field131.method229(6);
					field131.method229((int) var4);
					field131.method229(arg0 + 128 - field136);
					field131.method229(arg1 + 128 - field137);
				} else {
					method48(5);
					field131.method229(7);
					field131.method229((int) var4);
					field131.method232((arg1 << 10) + arg0);
				}

				field136 = arg0;
				field137 = arg1;
			}
		}
	}

	@ObfuscatedName("f.a(II)V")
	public static final synchronized void method52(int arg0) {
		if (field130) {
			field134++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field133) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field133 = var1;

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
			field131.method229(8);
			field131.method229((int) var3);
			field131.method229(arg0);
		}
	}

	@ObfuscatedName("f.b(II)V")
	public static final synchronized void method53(int arg0) {
		if (field130) {
			field134++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field133) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field133 = var1;

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
			field131.method229(9);
			field131.method229((int) var3);
			field131.method229(arg0);
		}
	}

	@ObfuscatedName("f.b(B)V")
	public static final synchronized void method54() {
		if (field130) {
			field134++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field133) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field133 = var0;
			method48(2);
			field131.method229(10);
			field131.method229((int) var2);
		}
	}

	@ObfuscatedName("f.c(I)V")
	public static final synchronized void method55() {
		if (field130) {
			field134++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field133) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field133 = var0;
			method48(2);
			field131.method229(11);
			field131.method229((int) var2);
		}
	}

	@ObfuscatedName("f.c(B)V")
	public static final synchronized void method56() {
		if (field130) {
			field134++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field133) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field133 = var0;
			method48(2);
			field131.method229(12);
			field131.method229((int) var2);
		}
	}

	@ObfuscatedName("f.b(Z)V")
	public static final synchronized void method57() {
		if (field130) {
			field134++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field133) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field133 = var0;
			method48(2);
			field131.method229(13);
			field131.method229((int) var2);
		}
	}
}
