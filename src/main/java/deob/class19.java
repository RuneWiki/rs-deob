package deob;

@ObfuscatedName("s")
public final class class19 {

	@ObfuscatedName("s.d")
	public int field258;

	@ObfuscatedName("s.e")
	public int field259;

	@ObfuscatedName("s.f")
	public class20 field260 = new class20(1024);

	@ObfuscatedName("s.g")
	public class42 field261 = new class42();

	public class19(int arg0) {
		field258 = arg0;
		field259 = arg0;
	}

	@ObfuscatedName("s.a(J)Ldb;")
	public class30 method102(long arg0) {
		class30 var3 = (class30) field260.method105(arg0);
		if (var3 != null) {
			field261.method233(var3);
		}

		return var3;
	}

	@ObfuscatedName("s.a(JILdb;)V")
	public void method103(long arg0, class30 arg1) {
		if (field259 == 0) {
			class30 var4 = field261.method234();
			var4.method107();
			var4.method119();
		} else {
			field259--;
		}

		field260.method106(arg0, arg1);
		field261.method233(arg1);
	}

	@ObfuscatedName("s.a()V")
	public void method104() {
		while (true) {
			class30 var1 = field261.method234();
			if (var1 == null) {
				field259 = field258;
				return;
			}

			var1.method107();
			var1.method119();
		}
	}
}
