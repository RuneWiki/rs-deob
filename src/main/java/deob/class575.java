package deob;

@ObfuscatedName("wv")
public class class575 implements class431 {

	@ObfuscatedName("wv.af")
	public static final class575 field5821 = new class575(0, 0, Integer.class, new class571());

	@ObfuscatedName("wv.aw")
	public static final class575 field5817 = new class575(3, 1, Long.class, new class574());

	@ObfuscatedName("wv.at")
	public static final class575 field5825 = new class575(1, 2, String.class, new class576());

	@ObfuscatedName("wv.ac")
	public static final class575 field5819 = new class575(2, 5, class520.class, new class572());

	@ObfuscatedName("wv.ap")
	public final int field5820;

	@ObfuscatedName("wv.aq")
	public final int field5816;

	@ObfuscatedName("wv.ao")
	public final Class field5822;

	@ObfuscatedName("wv.as")
	public final class570 field5823;

	@ObfuscatedName("wv.at(I)[Lwv;")
	public static class575[] method10175() {
		return new class575[] { field5817, field5825, field5819, field5821 };
	}

	public class575(int arg0, int arg1, Class arg2, class570 arg3) {
		this.field5820 = arg0;
		this.field5816 = arg1;
		this.field5822 = arg2;
		this.field5823 = arg3;
	}

	@ObfuscatedName("wv.ac(Ljava/lang/Class;I)Lwv;")
	public static class575 method10166(Class arg0) {
		class575[] var1 = method10175();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class575 var3 = var1[var2];
			if (var3.field5822 == arg0) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("wv.ap(Ljava/lang/Object;Lwb;B)V")
	public static void method10167(Object arg0, class591 arg1) {
		class570 var2 = Statics.method10176(arg0.getClass());
		var2.method10144(arg0, arg1);
	}

	@ObfuscatedName("wv.af(I)I")
	public int method34() {
		return this.field5816;
	}

	@ObfuscatedName("wv.ao(Lwb;I)Ljava/lang/Object;")
	public Object method10173(class591 arg0) {
		return this.field5823.method10146(arg0);
	}
}
