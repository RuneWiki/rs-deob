package deob;

@ObfuscatedName("lf")
public class class287 {

	@ObfuscatedName("lf.af")
	public static final class287 field3299 = new class287(0, 0, 4);

	@ObfuscatedName("lf.aw")
	public static final class287 field3298 = new class287(2, 1, 2);

	@ObfuscatedName("lf.at")
	public static final class287 field3300 = new class287(1, 2, 0);

	@ObfuscatedName("lf.ac")
	public final int field3301;

	@ObfuscatedName("lf.ap")
	public final int field3302;

	@ObfuscatedName("lf.aq")
	public final int field3305;

	@ObfuscatedName("lf.af(I)[Llf;")
	public static class287[] method5928() {
		return new class287[] { field3298, field3300, field3299 };
	}

	public class287(int arg0, int arg1, int arg2) {
		this.field3301 = arg0;
		this.field3302 = arg1;
		this.field3305 = arg2;
	}

	@ObfuscatedName("lf.aw(IB)Llf;")
	public static class287 method5919(int arg0) {
		class287[] var1 = method5928();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class287 var3 = var1[var2];
			if (var3.field3302 == arg0) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("lf.at(FI)Z")
	public boolean method5917(float arg0) {
		return arg0 >= (float) this.field3305;
	}
}
