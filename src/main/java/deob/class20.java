package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.e")
	public int field329;

	@ObfuscatedName("t.f")
	public int field330;

	@ObfuscatedName("t.g")
	public class24 field331 = new class24();

	@ObfuscatedName("t.h")
	public int field332;

	@ObfuscatedName("t.i")
	public int field333;

	@ObfuscatedName("t.j")
	public class21 field334 = new class21(1024);

	@ObfuscatedName("t.k")
	public class43 field335 = new class43();

	public class20(int arg0) {
		field332 = arg0;
		field333 = arg0;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public class24 method114(long arg0) {
		class24 var3 = (class24) field334.method117(arg0);
		if (var3 == null) {
			field329++;
		} else {
			field335.method262(var3);
			field330++;
		}

		return var3;
	}

	@ObfuscatedName("t.a(ZLx;J)V")
	public void method115(class24 arg0, long arg1) {
		if (field333 == 0) {
			class24 var4 = field335.method263();
			var4.method119();
			var4.method120();

			if (field331 == var4) {
				class24 var5 = field335.method263();
				var5.method119();
				var5.method120();
			}
		} else {
			field333--;
		}

		field334.method118(arg0, arg1);
		field335.method262(arg0);
	}

	@ObfuscatedName("t.a()V")
	public void method116() {
		while (true) {
			class24 var1 = field335.method263();
			if (var1 == null) {
				field333 = field332;
				return;
			}

			var1.method119();
			var1.method120();
		}
	}
}
