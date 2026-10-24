package deob;

@ObfuscatedName("s")
public final class class19 {

	@ObfuscatedName("s.b")
	public int field257;

	@ObfuscatedName("s.c")
	public int field258;

	@ObfuscatedName("s.d")
	public class20 field259 = new class20(1024);

	@ObfuscatedName("s.e")
	public class42 field260 = new class42();

	public class19(int arg0) {
		field257 = arg0;
		field258 = arg0;
	}

	@ObfuscatedName("s.a(J)Ldb;")
	public class30 method101(long arg0) {
		class30 var3 = (class30) field259.method104(arg0);
		if (var3 != null) {
			field260.method232(var3);
		}

		return var3;
	}

	@ObfuscatedName("s.a(JLdb;B)V")
	public void method102(long arg0, class30 arg1) {
		if (field258 == 0) {
			class30 var4 = field260.method233();
			var4.method106();
			var4.method118();
		} else {
			field258--;
		}

		field259.method105(arg0, arg1);
		field260.method232(arg1);
	}

	@ObfuscatedName("s.a()V")
	public void method103() {
		while (true) {
			class30 var1 = field260.method233();
			if (var1 == null) {
				field258 = field257;
				return;
			}

			var1.method106();
			var1.method118();
		}
	}
}
