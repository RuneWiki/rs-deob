package deob;

@ObfuscatedName("u")
public class class21 {

	@ObfuscatedName("u.a")
	public long field261;

	@ObfuscatedName("u.b")
	public class21 field262;

	@ObfuscatedName("u.c")
	public class21 field263;

	@ObfuscatedName("u.a()V")
	public void method104() {
		if (field263 != null) {
			field263.field262 = field262;
			field262.field263 = field263;
			field262 = null;
			field263 = null;
		}
	}
}
