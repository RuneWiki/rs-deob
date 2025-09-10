package deob;

@ObfuscatedName("ms")
public class class335 {

	public class335() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("hf.af(I)J")
	public static final synchronized long method3987() {
		long var0 = System.currentTimeMillis();
		if (var0 < Statics.field3840) {
			Statics.field3839 += Statics.field3840 - var0;
		}
		Statics.field3840 = var0;
		return Statics.field3839 + var0;
	}
}
