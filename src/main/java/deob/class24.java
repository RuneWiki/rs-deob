package deob;

@ObfuscatedName("x")
public class class24 extends class22 {

	@ObfuscatedName("x.e")
	public class24 field364;

	@ObfuscatedName("x.f")
	public class24 field365;

	@ObfuscatedName("x.b()V")
	public void method120() {
		if (field365 != null) {
			field365.field364 = field364;
			field364.field365 = field365;
			field364 = null;
			field365 = null;
		}
	}
}
