package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.c")
	public int field330;

	@ObfuscatedName("t.d")
	public int field331;

	@ObfuscatedName("t.e")
	public class24 field332 = new class24();

	@ObfuscatedName("t.f")
	public int field333;

	@ObfuscatedName("t.g")
	public int field334;

	@ObfuscatedName("t.h")
	public class21 field335 = new class21(1024);

	@ObfuscatedName("t.i")
	public class43 field336 = new class43();

	public class20(int arg0) {
		field333 = arg0;
		field334 = arg0;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public class24 method115(long arg0) {
		class24 var3 = (class24) field335.method118(arg0);
		if (var3 == null) {
			field330++;
		} else {
			field336.method263(var3);
			field331++;
		}

		return var3;
	}

	@ObfuscatedName("t.a(IJLx;)V")
	public void method116(long arg0, class24 arg1) {
		if (field334 == 0) {
			class24 var4 = field336.method264();
			var4.method120();
			var4.method121();

			if (field332 == var4) {
				class24 var5 = field336.method264();
				var5.method120();
				var5.method121();
			}
		} else {
			field334--;
		}

		field335.method119(arg1, arg0);
		field336.method263(arg1);
	}

	@ObfuscatedName("t.a()V")
	public void method117() {
		while (true) {
			class24 var1 = field336.method264();
			if (var1 == null) {
				field334 = field333;
				return;
			}

			var1.method120();
			var1.method121();
		}
	}
}
