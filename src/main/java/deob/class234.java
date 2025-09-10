package deob;

@ObfuscatedName("iz")
public abstract class class234 extends class540 {

	@ObfuscatedName("iz.ez")
	public int field2802 = 1000;

	@ObfuscatedName("iz.fr(IIIIIIIIIJIIZ)V")
	public void method4871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, long arg9, int arg10, int arg11, boolean arg12) {
		class242 var15 = this.method1847();
		if (var15 != null) {
			this.field2802 = var15.field2802;
			var15.method5160(this.method2157());
			var15.method5147(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5 - arg8, arg9);
			var15.method5160(class225.field2628);
		}
	}

	@ObfuscatedName("iz.jo(ILrj;IIIJ)V")
	public void method5054(int arg0, class455 arg1, int arg2, int arg3, int arg4, long arg5) {
		class242 var8 = this.method1847();
		if (var8 != null) {
			this.field2802 = var8.field2802;
			var8.method5160(this.method2157());
			var8.method5054(arg0, arg1, arg2, arg3, arg4, arg5);
			var8.method5160(class225.field2628);
		}
	}

	@ObfuscatedName("iz.at(I)Ljn;")
	public class242 method1847() {
		return null;
	}

	@ObfuscatedName("iz.ay(B)Lid;")
	public class225 method2157() {
		return class225.field2628;
	}
}
