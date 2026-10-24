package deob;

@ObfuscatedName("u")
public class class21 {

	@ObfuscatedName("u.a")
	public long field264;

	@ObfuscatedName("u.b")
	public class21 field265;

	@ObfuscatedName("u.c")
	public class21 field266;

	@ObfuscatedName("u.a()V")
	public void method107() {
		if (field266 != null) {
			field266.field265 = field265;
			field265.field266 = field266;
			field265 = null;
			field266 = null;
		}
	}
}
