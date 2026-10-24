package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.c")
	public int field327;

	@ObfuscatedName("t.d")
	public int field328;

	@ObfuscatedName("t.e")
	public class24 field329 = new class24();

	@ObfuscatedName("t.f")
	public int field330;

	@ObfuscatedName("t.g")
	public int field331;

	@ObfuscatedName("t.h")
	public class21 field332 = new class21(1024);

	@ObfuscatedName("t.i")
	public class43 field333 = new class43();

	public class20(int arg0) {
		field330 = arg0;
		field331 = arg0;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public class24 method114(long arg0) {
		class24 var3 = (class24) field332.method117(arg0);
		if (var3 == null) {
			field327++;
		} else {
			field333.method262(var3);
			field328++;
		}

		return var3;
	}

	@ObfuscatedName("t.a(ILx;J)V")
	public void method115(class24 arg0, long arg1) {
		if (field331 == 0) {
			class24 var4 = field333.method263();
			var4.method119();
			var4.method120();

			if (field329 == var4) {
				class24 var5 = field333.method263();
				var5.method119();
				var5.method120();
			}
		} else {
			field331--;
		}

		field332.method118(arg0, arg1);
		field333.method262(arg0);
	}

	@ObfuscatedName("t.a()V")
	public void method116() {
		while (true) {
			class24 var1 = field333.method263();
			if (var1 == null) {
				field331 = field330;
				return;
			}

			var1.method119();
			var1.method120();
		}
	}
}
