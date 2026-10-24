package deob;

@ObfuscatedName("bb")
public final class class28 extends class23 {

	@ObfuscatedName("bb.f")
	public class60 field363;

	@ObfuscatedName("bb.g")
	public int field364;

	@ObfuscatedName("bb.h")
	public int field365;

	@ObfuscatedName("bb.i")
	public int field366;

	@ObfuscatedName("bb.j")
	public int field367;

	@ObfuscatedName("bb.k")
	public int field368;

	@ObfuscatedName("bb.l")
	public int field369;

	@ObfuscatedName("bb.m")
	public int field370;

	@ObfuscatedName("bb.n")
	public boolean field371 = false;

	public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field363 = class60.field856[arg4];
		field365 = arg6;
		field366 = arg2;
		field367 = arg0;
		field368 = arg1;
		field364 = arg3 + arg5;
		field371 = false;
	}

	@ObfuscatedName("bb.a(IZ)V")
	public final void method115(int arg0) {
		field370 += arg0;
		while (field370 > field363.field859.field847[field369]) {
			field370 -= field363.field859.field847[field369] + 1;
			field369++;
			if (field369 >= field363.field859.field844) {
				field369 = 0;
				field371 = true;
			}
		}
	}

	@ObfuscatedName("bb.a(I)Leb;")
	public final class31 method105() {
		class31 var1 = field363.method299();
		class31 var2 = new class31(true, var1, true, false, !field363.field860);
		if (!field371) {
			var2.method122();
			var2.method123(field363.field859.field845[field369]);
			var2.field430 = null;
			var2.field429 = null;
		}

		var2.method132(64, 850, -30, -50, -30, true);
		return var2;
	}
}
