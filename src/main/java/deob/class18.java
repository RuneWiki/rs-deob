package deob;

@ObfuscatedName("r")
public final class class18 {

	@ObfuscatedName("r.b")
	public int field246;

	@ObfuscatedName("r.c")
	public int field247;

	@ObfuscatedName("r.d")
	public class19 field248 = new class19(1024);

	@ObfuscatedName("r.e")
	public class41 field249 = new class41();

	public class18(int arg0) {
		field246 = arg0;
		field247 = arg0;
	}

	@ObfuscatedName("r.a(J)Lcb;")
	public class29 method84(long arg0) {
		class29 var3 = (class29) field248.method87(arg0);
		if (var3 != null) {
			field249.method208(var3);
		}

		return var3;
	}

	@ObfuscatedName("r.a(Lcb;JB)V")
	public void method85(class29 arg0, long arg1) {
		if (field247 == 0) {
			class29 var4 = field249.method209();
			var4.method89();
			var4.method102();
		} else {
			field247--;
		}

		field248.method88(arg1, arg0);
		field249.method208(arg0);
	}

	@ObfuscatedName("r.a()V")
	public void method86() {
		while (true) {
			class29 var1 = field249.method209();
			if (var1 == null) {
				field247 = field246;
				return;
			}

			var1.method89();
			var1.method102();
		}
	}
}
