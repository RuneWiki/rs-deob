package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("v")
public class Linkable {

	@ObfuscatedName("v.b")
	public long field336;

	@ObfuscatedName("v.c")
	public Linkable field337;

	@ObfuscatedName("v.d")
	public Linkable field338;

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
