package deob;

@ObfuscatedName("bb")
public final class class28 extends class23 {

	@ObfuscatedName("bb.f")
	public class63 field367;

	@ObfuscatedName("bb.g")
	public int field368;

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
	public boolean field375 = false;

	public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field367 = class63.field914[arg0];
		field369 = arg2;
		field370 = arg4;
		field371 = arg3;
		field372 = arg6;
		field368 = arg1 + arg5;
		field375 = false;
	}

	@ObfuscatedName("bb.a(II)V")
	public final void method118(int arg0) {
		field374 += arg0;
		while (field374 > field367.field917.field905[field373]) {
			field374 -= field367.field917.field905[field373] + 1;
			field373++;
			if (field373 >= field367.field917.field902 && (field373 < 0 || field373 >= field367.field917.field902)) {
				field373 = 0;
				field375 = true;
			}
		}
	}

	@ObfuscatedName("bb.a(I)Leb;")
	public final class31 method108() {
		class31 var1 = field367.method322();
		class31 var2 = new class31(!field367.field918, false, var1, true);
		if (!field375) {
			var2.method126();
			var2.method127(field367.field917.field903[field373]);
			var2.field435 = null;
			var2.field434 = null;
		}

		if (field367.field921 != 128 || field367.field922 != 128) {
			var2.method135(field367.field921, field367.field921, field367.field922);
		}

		if (field367.field923 != 0) {
			if (field367.field923 == 90) {
				var2.method130();
			}

			if (field367.field923 == 180) {
				var2.method130();
				var2.method130();
			}

			if (field367.field923 == 270) {
				var2.method130();
				var2.method130();
				var2.method130();
			}
		}

		var2.method136(field367.field924 + 64, field367.field925 + 850, -30, -50, -30, true);
		return var2;
	}
}
