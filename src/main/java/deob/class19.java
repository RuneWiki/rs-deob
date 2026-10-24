package deob;

@ObfuscatedName("s")
public final class class19 {

	@ObfuscatedName("s.c")
	public int field259;

	@ObfuscatedName("s.d")
	public int field260;

	@ObfuscatedName("s.e")
	public class20 field261 = new class20(1024);

	@ObfuscatedName("s.f")
	public class42 field262 = new class42();

	public class19(int arg0) {
		field259 = arg0;
		field260 = arg0;
	}

	@ObfuscatedName("s.a(J)Ldb;")
	public class30 method103(long arg0) {
		class30 var3 = (class30) field261.method106(arg0);
		if (var3 != null) {
			field262.method240(var3);
		}

		return var3;
	}

	@ObfuscatedName("s.a(Ldb;JZ)V")
	public void method104(class30 arg0, long arg1) {
		if (field260 == 0) {
			class30 var4 = field262.method241();
			var4.method108();
			var4.method120();
		} else {
			field260--;
		}

		field261.method107(arg1, arg0);
		field262.method240(arg0);
	}

	@ObfuscatedName("s.a()V")
	public void method105() {
		while (true) {
			class30 var1 = field262.method241();
			if (var1 == null) {
				field260 = field259;
				return;
			}

			var1.method108();
			var1.method120();
		}
	}
}
