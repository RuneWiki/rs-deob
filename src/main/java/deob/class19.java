package deob;

@ObfuscatedName("s")
public final class class19 {

	@ObfuscatedName("s.c")
	public int field255;

	@ObfuscatedName("s.d")
	public int field256;

	@ObfuscatedName("s.e")
	public class20 field257 = new class20(1024);

	@ObfuscatedName("s.f")
	public class42 field258 = new class42();

	public class19(int arg0) {
		field255 = arg0;
		field256 = arg0;
	}

	@ObfuscatedName("s.a(J)Ldb;")
	public class30 method99(long arg0) {
		class30 var3 = (class30) field257.method102(arg0);
		if (var3 != null) {
			field258.method225(var3);
		}

		return var3;
	}

	@ObfuscatedName("s.a(JILdb;)V")
	public void method100(long arg0, class30 arg1) {
		if (field256 == 0) {
			class30 var4 = field258.method226();
			var4.method104();
			var4.method116();
		} else {
			field256--;
		}

		field257.method103(arg1, arg0);
		field258.method225(arg1);
	}

	@ObfuscatedName("s.a()V")
	public void method101() {
		while (true) {
			class30 var1 = field258.method226();
			if (var1 == null) {
				field256 = field255;
				return;
			}

			var1.method104();
			var1.method116();
		}
	}
}
