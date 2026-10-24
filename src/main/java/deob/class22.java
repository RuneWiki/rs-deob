package deob;

@ObfuscatedName("v")
public class class22 {

	@ObfuscatedName("v.a")
	public long field336;

	@ObfuscatedName("v.b")
	public class22 field337;

	@ObfuscatedName("v.c")
	public class22 field338;

	@ObfuscatedName("v.a()V")
	public void method119() {
		if (field338 != null) {
			field338.field337 = field337;
			field337.field338 = field338;
			field337 = null;
			field338 = null;
		}
	}
}
