package deob;

@ObfuscatedName("bb")
public final class class28 extends class23 {

	@ObfuscatedName("bb.g")
	public class63 field368;

	@ObfuscatedName("bb.h")
	public int field369;

	@ObfuscatedName("bb.i")
	public int field370;

	@ObfuscatedName("bb.j")
	public int field371;

	@ObfuscatedName("bb.k")
	public int field372;

	@ObfuscatedName("bb.l")
	public int field373;

	@ObfuscatedName("bb.m")
	public int field374;

	@ObfuscatedName("bb.n")
	public int field375;

	@ObfuscatedName("bb.o")
	public boolean field376 = false;

	public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field368 = class63.field914[arg3];
		field370 = arg6;
		field371 = arg4;
		field372 = arg5;
		field373 = arg2;
		field369 = arg0 + arg1;
		field376 = false;
	}

	@ObfuscatedName("bb.a(IZ)V")
	public final void method119(int arg0) {
		field375 += arg0;
		while (field375 > field368.field918.field905[field374]) {
			field375 -= field368.field918.field905[field374] + 1;
			field374++;
			if (field374 >= field368.field918.field902 && (field374 < 0 || field374 >= field368.field918.field902)) {
				field374 = 0;
				field376 = true;
			}
		}
	}

	@ObfuscatedName("bb.a(I)Leb;")
	public final class31 method109() {
		class31 var1 = field368.method330();
		class31 var2 = new class31(var1, false, !field368.field919, true);
		if (!field376) {
			var2.method127();
			var2.method128(field368.field918.field903[field374]);
			var2.field435 = null;
			var2.field434 = null;
		}

		if (field368.field922 != 128 || field368.field923 != 128) {
			var2.method136(field368.field922, field368.field922, field368.field923);
		}

		if (field368.field924 != 0) {
			if (field368.field924 == 90) {
				var2.method131();
			}

			if (field368.field924 == 180) {
				var2.method131();
				var2.method131();
			}

			if (field368.field924 == 270) {
				var2.method131();
				var2.method131();
				var2.method131();
			}
		}

		var2.method137(field368.field925 + 64, field368.field926 + 850, -30, -50, -30, true);
		return var2;
	}
}
