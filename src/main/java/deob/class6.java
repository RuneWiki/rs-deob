package deob;

@ObfuscatedName("f")
public class class6 {

	@ObfuscatedName("f.f")
	public static boolean field129;

	@ObfuscatedName("f.g")
	public static class39 field130 = null;

	@ObfuscatedName("f.h")
	public static class39 field131 = null;

	@ObfuscatedName("f.i")
	public static long field132;

	@ObfuscatedName("f.j")
	public static int field133;

	@ObfuscatedName("f.k")
	public static long field134;

	@ObfuscatedName("f.l")
	public static int field135;

	@ObfuscatedName("f.m")
	public static int field136;

	@ObfuscatedName("f.a(B)V")
	public static final synchronized void method44() {
		field130 = class39.method225(1);
		field131 = null;
		field132 = System.currentTimeMillis();
		field129 = true;
	}

	@ObfuscatedName("f.a(I)V")
	public static final synchronized void method45() {
		field129 = false;
		field130 = null;
		field131 = null;
	}

	@ObfuscatedName("f.b(I)Lmb;")
	public static final synchronized class39 method46() {
		class39 var0 = null;
		if (field131 != null && field129) {
			var0 = field131;
		}

		field131 = null;
		return var0;
	}

	@ObfuscatedName("f.a(Z)Lmb;")
	public static final synchronized class39 method47() {
		class39 var0 = null;
		if (field130 != null && field130.field621 > 0 && field129) {
			var0 = field130;
		}

		method45();
		return var0;
	}

	@ObfuscatedName("f.a(II)V")
	public static final synchronized void method48(int arg0) {
		if (field130.field621 + arg0 >= 500) {
			class39 var1 = field130;
			field130 = class39.method225(1);
			field131 = var1;
		}
	}

	@ObfuscatedName("f.a(IIII)V")
	public static final synchronized void method49(int arg0, int arg1, int arg2) {
		if (field129 && (arg2 >= 0 && arg2 < 789 && arg0 >= 0 && arg0 < 532)) {
			field133++;
			long var3 = System.currentTimeMillis();
			long var5 = (var3 - field132) / 10L;
			if (var5 > 250L) {
				var5 = 250L;
			}

			field132 = var3;
			method48(5);

			if (arg1 == 1) {
				field130.method228(1);
			} else {
				field130.method228(2);
			}

			field130.method228((int) var5);
			field130.method231((arg0 << 10) + arg2);
		}
	}

	@ObfuscatedName("f.a(IZ)V")
	public static final synchronized void method50(int arg0) {
		if (field129) {
			field133++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field132) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field132 = var1;
			method48(2);

			if (arg0 == 1) {
				field130.method228(3);
			} else {
				field130.method228(4);
			}

			field130.method228((int) var3);
		}
	}

	@ObfuscatedName("f.a(IIB)V")
	public static final synchronized void method51(int arg0, int arg1) {
		if (field129 && (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532)) {
			long var2 = System.currentTimeMillis();
			if (var2 - field134 >= 50L) {
				field134 = var2;
				field133++;
				long var4 = (var2 - field132) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}

				field132 = var2;

				if (arg0 - field135 < 8 && arg0 - field135 >= -8 && arg1 - field136 < 8 && arg1 - field136 >= -8) {
					method48(3);
					field130.method228(5);
					field130.method228((int) var4);
					field130.method228((arg1 + 8 - field136 << 4) + arg0 + 8 - field135);
				} else if (arg0 - field135 < 128 && arg0 - field135 >= -128 && arg1 - field136 < 128 && arg1 - field136 >= -128) {
					method48(4);
					field130.method228(6);
					field130.method228((int) var4);
					field130.method228(arg0 + 128 - field135);
					field130.method228(arg1 + 128 - field136);
				} else {
					method48(5);
					field130.method228(7);
					field130.method228((int) var4);
					field130.method231((arg1 << 10) + arg0);
				}

				field135 = arg0;
				field136 = arg1;
			}
		}
	}

	@ObfuscatedName("f.b(II)V")
	public static final synchronized void method52(int arg0) {
		if (field129) {
			field133++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field132) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field132 = var1;

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
			field130.method228(8);
			field130.method228((int) var3);
			field130.method228(arg0);
		}
	}

	@ObfuscatedName("f.a(BI)V")
	public static final synchronized void method53(int arg0) {
		if (field129) {
			field133++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - field132) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			field132 = var1;

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
			field130.method228(9);
			field130.method228((int) var3);
			field130.method228(arg0);
		}
	}

	@ObfuscatedName("f.c(I)V")
	public static final synchronized void method54() {
		if (field129) {
			field133++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field132) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field132 = var0;
			method48(2);
			field130.method228(10);
			field130.method228((int) var2);
		}
	}

	@ObfuscatedName("f.d(I)V")
	public static final synchronized void method55() {
		if (field129) {
			field133++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field132) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field132 = var0;
			method48(2);
			field130.method228(11);
			field130.method228((int) var2);
		}
	}

	@ObfuscatedName("f.b(B)V")
	public static final synchronized void method56() {
		if (field129) {
			field133++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field132) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field132 = var0;
			method48(2);
			field130.method228(12);
			field130.method228((int) var2);
		}
	}

	@ObfuscatedName("f.b(Z)V")
	public static final synchronized void method57() {
		if (field129) {
			field133++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - field132) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			field132 = var0;
			method48(2);
			field130.method228(13);
			field130.method228((int) var2);
		}
	}
}
