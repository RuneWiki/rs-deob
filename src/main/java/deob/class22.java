package deob;

@ObfuscatedName("v")
public class class22 {

	@ObfuscatedName("v.b")
	public long field338;

	@ObfuscatedName("v.c")
	public class22 field339;

	@ObfuscatedName("v.d")
	public class22 field340;

	@ObfuscatedName("v.a()V")
	public void method120() {
		if (field340 != null) {
			field340.field339 = field339;
			field339.field340 = field340;
			field339 = null;
			field340 = null;
		}
	}
}
