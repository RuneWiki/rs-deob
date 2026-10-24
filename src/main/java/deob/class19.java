package deob;

@ObfuscatedName("s")
public final class class19 {

	@ObfuscatedName("s.c")
	public int field257;

	@ObfuscatedName("s.d")
	public int field258;

	@ObfuscatedName("s.e")
	public class20 field259 = new class20(1024);

	@ObfuscatedName("s.f")
	public class42 field260 = new class42();

	public class19(int arg0) {
		field257 = arg0;
		field258 = arg0;
	}

	@ObfuscatedName("s.a(J)Ldb;")
	public class30 method102(long arg0) {
		class30 var3 = (class30) field259.method105(arg0);
		if (var3 != null) {
			field260.method233(var3);
		}

		return var3;
	}

	@ObfuscatedName("s.a(ILdb;J)V")
	public void method103(class30 arg0, long arg1) {
		if (field258 == 0) {
			class30 var4 = field260.method234();
			var4.method107();
			var4.method119();
		} else {
			field258--;
		}

		field259.method106(arg0, arg1);
		field260.method233(arg0);
	}

	@ObfuscatedName("s.a()V")
	public void method104() {
		while (true) {
			class30 var1 = field260.method234();
			if (var1 == null) {
				field258 = field257;
				return;
			}

			var1.method107();
			var1.method119();
		}
	}
}
