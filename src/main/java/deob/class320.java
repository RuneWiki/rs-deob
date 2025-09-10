package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("mo")
public class class320 extends class323 {

	@ObfuscatedName("mo.af")
	public SoftReference field3522;

	public class320(Object arg0, int arg1) {
		super(arg1);
		this.field3522 = new SoftReference(arg0);
	}

	@ObfuscatedName("mo.af()Ljava/lang/Object;")
	public Object method6449() {
		return this.field3522.get();
	}

	@ObfuscatedName("mo.aw()Z")
	public boolean method6451() {
		return true;
	}
}
