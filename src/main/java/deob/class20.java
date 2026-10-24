package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.a")
	public int field329;

	@ObfuscatedName("t.b")
	public int field330;

	@ObfuscatedName("t.c")
	public class24 field331 = new class24();

	@ObfuscatedName("t.d")
	public int field332;

	@ObfuscatedName("t.e")
	public int field333;

	@ObfuscatedName("t.f")
	public class21 field334 = new class21(1024);

	@ObfuscatedName("t.g")
	public class43 field335 = new class43();

	public class20(int arg0) {
		field332 = arg0;
		field333 = arg0;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public class24 method115(long arg0) {
		class24 var3 = (class24) field334.method118(arg0);
		if (var3 == null) {
			field329++;
		} else {
			field335.method263(var3);
			field330++;
		}

		return var3;
	}

	@ObfuscatedName("t.a(ZJLx;)V")
	public void method116(long arg0, class24 arg1) {
		if (field333 == 0) {
			class24 var4 = field335.method264();
			var4.method120();
			var4.method121();

			if (field331 == var4) {
				class24 var5 = field335.method264();
				var5.method120();
				var5.method121();
			}
		} else {
			field333--;
		}

		field334.method119(arg0, arg1);
		field335.method263(arg1);
	}

	@ObfuscatedName("t.a()V")
	public void method117() {
		while (true) {
			class24 var1 = field335.method264();
			if (var1 == null) {
				field333 = field332;
				return;
			}

			var1.method120();
			var1.method121();
		}
	}
}
