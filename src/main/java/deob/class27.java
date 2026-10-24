package deob;

@ObfuscatedName("ab")
public final class class27 extends class22 {

	@ObfuscatedName("ab.g")
	public class59 field352;

	@ObfuscatedName("ab.h")
	public int field353;

	@ObfuscatedName("ab.i")
	public int field354;

	@ObfuscatedName("ab.j")
	public int field355;

	@ObfuscatedName("ab.k")
	public int field356;

	@ObfuscatedName("ab.l")
	public int field357;

	@ObfuscatedName("ab.m")
	public int field358;

	@ObfuscatedName("ab.n")
	public int field359;

	@ObfuscatedName("ab.o")
	public boolean field360 = false;

	public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field352 = class59.field836[arg2];
		field354 = arg3;
		field355 = arg4;
		field356 = arg5;
		field357 = arg0;
		field353 = arg1 + arg6;
		field360 = false;
	}

	@ObfuscatedName("ab.a(II)V")
	public final void method101(int arg0) {
		field359 += arg0;
		while (field359 > field352.field839.field827[field358]) {
			field359 -= field352.field839.field827[field358] + 1;
			field358++;
			if (field358 >= field352.field839.field824) {
				field358 = 0;
				field360 = true;
			}
		}
	}

	@ObfuscatedName("ab.a(I)Ldb;")
	public final class30 method90() {
		class30 var1 = field352.method283();
		class30 var2 = new class30(true, !field352.field840, var1, true, false);
		if (!field360) {
			var2.method108();
			var2.method109(field352.field839.field825[field358]);
			var2.field419 = null;
			var2.field418 = null;
		}

		var2.method118(64, 850, -30, -50, -30, true);
		return var2;
	}
}
