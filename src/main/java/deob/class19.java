package deob;

@ObfuscatedName("s")
public final class class19 {

	@ObfuscatedName("s.c")
	public int field321;

	@ObfuscatedName("s.d")
	public int field322;

	@ObfuscatedName("s.e")
	public class23 field323 = new class23();

	@ObfuscatedName("s.f")
	public int field324;

	@ObfuscatedName("s.g")
	public int field325;

	@ObfuscatedName("s.h")
	public class20 field326 = new class20(1024);

	@ObfuscatedName("s.i")
	public class43 field327 = new class43();

	public class19(int arg0) {
		field324 = arg0;
		field325 = arg0;
	}

	@ObfuscatedName("s.a(J)Lw;")
	public class23 method101(long arg0) {
		class23 var3 = (class23) field326.method104(arg0);
		if (var3 == null) {
			field321++;
		} else {
			field327.method252(var3);
			field322++;
		}

		return var3;
	}

	@ObfuscatedName("s.a(Lw;JZ)V")
	public void method102(class23 arg0, long arg1) {
		if (field325 == 0) {
			class23 var4 = field327.method253();
			var4.method106();
			var4.method107();

			if (field323 == var4) {
				class23 var5 = field327.method253();
				var5.method106();
				var5.method107();
			}
		} else {
			field325--;
		}

		field326.method105(arg0, arg1);
		field327.method252(arg0);
	}

	@ObfuscatedName("s.a()V")
	public void method103() {
		while (true) {
			class23 var1 = field327.method253();
			if (var1 == null) {
				field325 = field324;
				return;
			}

			var1.method106();
			var1.method107();
		}
	}
}
