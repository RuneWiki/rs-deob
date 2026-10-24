package deob;

@ObfuscatedName("v")
public class class22 {

	@ObfuscatedName("v.a")
	public long field339;

	@ObfuscatedName("v.b")
	public class22 field340;

	@ObfuscatedName("v.c")
	public class22 field341;

	@ObfuscatedName("v.a()V")
	public void method120() {
		if (field341 != null) {
			field341.field340 = field340;
			field340.field341 = field341;
			field340 = null;
			field341 = null;
		}
	}
}
