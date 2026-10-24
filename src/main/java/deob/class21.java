package deob;

@ObfuscatedName("u")
public class class21 {

	@ObfuscatedName("u.b")
	public long field263;

	@ObfuscatedName("u.c")
	public class21 field264;

	@ObfuscatedName("u.d")
	public class21 field265;

	@ObfuscatedName("u.a()V")
	public void method107() {
		if (field265 != null) {
			field265.field264 = field264;
			field264.field265 = field265;
			field264 = null;
			field265 = null;
		}
	}
}
