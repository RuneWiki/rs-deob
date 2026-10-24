package deob;

@ObfuscatedName("bb")
public final class class28 extends class23 {

	@ObfuscatedName("bb.g")
	public class63 field366;

	@ObfuscatedName("bb.h")
	public int field367;

	@ObfuscatedName("bb.i")
	public int field368;

	@ObfuscatedName("bb.j")
	public int field369;

	@ObfuscatedName("bb.k")
	public int field370;

	@ObfuscatedName("bb.l")
	public int field371;

	@ObfuscatedName("bb.m")
	public int field372;

	@ObfuscatedName("bb.n")
	public int field373;

	@ObfuscatedName("bb.o")
	public boolean field374 = false;

	public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field366 = class63.field908[arg4];
		field368 = arg3;
		field369 = arg6;
		field370 = arg0;
		field371 = arg5;
		field367 = arg1 + arg2;
		field374 = false;
	}

	@ObfuscatedName("bb.a(II)V")
	public final void method118(int arg0) {
		field373 += arg0;
		while (field373 > field366.field911.field899[field372]) {
			field373 -= field366.field911.field899[field372] + 1;
			field372++;
			if (field372 >= field366.field911.field896 && (field372 < 0 || field372 >= field366.field911.field896)) {
				field372 = 0;
				field374 = true;
			}
		}
	}

	@ObfuscatedName("bb.a(Z)Leb;")
	public final class31 method108() {
		class31 var1 = field366.method322();
		class31 var2 = new class31(var1, !field366.field912, false, true);
		if (!field374) {
			var2.method126();
			var2.method127(field366.field911.field897[field372]);
			var2.field433 = null;
			var2.field432 = null;
		}

		if (field366.field915 != 128 || field366.field916 != 128) {
			var2.method135(field366.field915, field366.field915, field366.field916);
		}

		if (field366.field917 != 0) {
			if (field366.field917 == 90) {
				var2.method130();
			}

			if (field366.field917 == 180) {
				var2.method130();
				var2.method130();
			}

			if (field366.field917 == 270) {
				var2.method130();
				var2.method130();
				var2.method130();
			}
		}

		var2.method136(field366.field918 + 64, field366.field919 + 850, -30, -50, -30, true);
		return var2;
	}
}
