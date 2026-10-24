package deob;

@ObfuscatedName("e")
public class class5 {

	@ObfuscatedName("e.d")
	public static boolean field58;

	@ObfuscatedName("e.e")
	public static class37 field59 = null;

	@ObfuscatedName("e.f")
	public static class37 field60 = null;

	@ObfuscatedName("e.g")
	public static long field61;

	@ObfuscatedName("e.h")
	public static int field62;

	@ObfuscatedName("e.i")
	public static int field63;

	@ObfuscatedName("e.a(I)V")
	public static final void method33() {
		field59 = class37.method190(1);
		field61 = System.currentTimeMillis();
		field58 = true;
	}

	@ObfuscatedName("e.b(I)V")
	public static final void method34() {
		field58 = false;
	}

	@ObfuscatedName("e.c(I)Lkb;")
	public static final class37 method35() {
		class37 var0 = null;
		if (field60 != null) {
			var0 = field60;
			field60 = null;
		}

		return var0;
	}

	@ObfuscatedName("e.a(IBI)V")
	public static final void method36(int arg0, int arg1) {
		if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
			int var2 = method45();
			method46(5);
			field59.method193(1);
			field59.method193(var2);
			field59.method195((arg0 << 10) + arg1);
		}
	}

	@ObfuscatedName("e.a(Z)V")
	public static final void method37() {
		int var0 = method45();
		method46(2);
		field59.method193(3);
		field59.method193(var0);
	}

	@ObfuscatedName("e.a(ZII)V")
	public static final void method38(int arg0, int arg1) {
		if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
			int var2 = method45();
			if (field62 - arg1 < 8 && field62 - arg1 >= -8 && field63 - arg0 < 8 && field63 - arg0 >= -8) {
				method46(3);
				field59.method193(5);
				field59.method193(var2);
				field59.method193((field63 + 8 - arg0 << 4) + field62 + 8 - arg1);
			} else if (field62 - arg1 < 128 && field62 - arg1 >= -128 && field63 - arg0 < 128 && field63 - arg0 >= -128) {
				method46(4);
				field59.method193(6);
				field59.method193(var2);
				field59.method193(field62 + 128 - arg1);
				field59.method193(field63 + 128 - arg0);
			} else {
				method46(5);
				field59.method193(7);
				field59.method193(var2);
				field59.method195((arg0 << 10) + arg1);
			}
		}
	}

	@ObfuscatedName("e.a(IZ)V")
	public static final void method39(int arg0) {
		int var1 = method45();

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

		method46(3);
		field59.method193(8);
		field59.method193(var1);
		field59.method193(arg0);
	}

	@ObfuscatedName("e.a(BI)V")
	public static final void method40(int arg0) {
		int var1 = method45();

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

		method46(3);
		field59.method193(9);
		field59.method193(var1);
		field59.method193(arg0);
	}

	@ObfuscatedName("e.b(Z)V")
	public static final void method41() {
		int var0 = method45();
		method46(2);
		field59.method193(10);
		field59.method193(var0);
	}

	@ObfuscatedName("e.a(B)V")
	public static final void method42() {
		int var0 = method45();
		method46(2);
		field59.method193(11);
		field59.method193(var0);
	}

	@ObfuscatedName("e.d(I)V")
	public static final void method43() {
		int var0 = method45();
		method46(2);
		field59.method193(12);
		field59.method193(var0);
	}

	@ObfuscatedName("e.b(B)V")
	public static final void method44() {
		int var0 = method45();
		method46(2);
		field59.method193(13);
		field59.method193(var0);
	}

	@ObfuscatedName("e.e(I)I")
	public static final int method45() {
		long var0 = System.currentTimeMillis();
		long var2 = (var0 - field61) / 10L;
		if (var2 > 250L) {
			var2 = 250L;
		}

		field61 = var0;
		return (int) var2;
	}

	@ObfuscatedName("e.a(II)V")
	public static final void method46(int arg0) {
		if (field59.field537 + arg0 >= 500) {
			class37 var1 = field59;
			field59 = class37.method190(1);
			field60 = var1;
		}
	}
}
