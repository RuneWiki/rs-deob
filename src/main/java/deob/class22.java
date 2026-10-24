package deob;

@ObfuscatedName("v")
public class class22 {

	@ObfuscatedName("v.a")
	public long field338;

	@ObfuscatedName("v.b")
	public class22 field339;

	@ObfuscatedName("v.c")
	public class22 field340;

	@ObfuscatedName("v.a()V")
	public void method119() {
		if (field340 != null) {
			field340.field339 = field339;
			field339.field340 = field340;
			field339 = null;
			field340 = null;
		}
	}
}
