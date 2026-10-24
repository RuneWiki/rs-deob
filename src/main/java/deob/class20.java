package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.c")
	public int field320;

	@ObfuscatedName("t.d")
	public int field321;

	@ObfuscatedName("t.e")
	public class24 field322 = new class24();

	@ObfuscatedName("t.f")
	public int field323;

	@ObfuscatedName("t.g")
	public int field324;

	@ObfuscatedName("t.h")
	public class21 field325 = new class21(1024);

	@ObfuscatedName("t.i")
	public class43 field326 = new class43();

	public class20(int arg0) {
		field323 = arg0;
		field324 = arg0;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public class24 method113(long arg0) {
		class24 var3 = (class24) field325.method116(arg0);
		if (var3 == null) {
			field320++;
		} else {
			field326.method255(var3);
			field321++;
		}

		return var3;
	}

	@ObfuscatedName("t.a(JZLx;)V")
	public void method114(long arg0, class24 arg1) {
		if (field324 == 0) {
			class24 var4 = field326.method256();
			var4.method118();
			var4.method119();

			if (field322 == var4) {
				class24 var5 = field326.method256();
				var5.method118();
				var5.method119();
			}
		} else {
			field324--;
		}

		field325.method117(arg0, arg1);
		field326.method255(arg1);
	}

	@ObfuscatedName("t.a()V")
	public void method115() {
		while (true) {
			class24 var1 = field326.method256();
			if (var1 == null) {
				field324 = field323;
				return;
			}

			var1.method118();
			var1.method119();
		}
	}
}
