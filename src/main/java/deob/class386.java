package deob;

@ObfuscatedName("oe")
public class class386 {

	@ObfuscatedName("oe.af")
	public static final class386 field4411 = new class386("LIVE", 0);

	@ObfuscatedName("oe.aw")
	public static final class386 field4407 = new class386("BUILDLIVE", 3);

	@ObfuscatedName("oe.at")
	public static final class386 field4410 = new class386("RC", 1);

	@ObfuscatedName("oe.ac")
	public static final class386 field4409 = new class386("WIP", 2);

	@ObfuscatedName("oe.ap")
	public final String field4406;

	@ObfuscatedName("oe.aq")
	public final int field4408;

	public class386(String arg0, int arg1) {
		this.field4406 = arg0;
		this.field4408 = arg1;
	}

	@ObfuscatedName("av.af(II)Loe;")
	public static class386 method294(int arg0) {
		class386[] var1 = new class386[] { field4410, field4409, field4411, field4407 };
		class386[] var2 = var1;
		for (int var3 = 0; var3 < var2.length; var3++) {
			class386 var4 = var2[var3];
			if (var4.field4408 == arg0) {
				return var4;
			}
		}
		return null;
	}
}
