package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("gf")
public class class208 extends class213 {

    @ObfuscatedName("gf.z")
    public SoftReference field2430;

    public class208(Object arg0, int arg1) {
        super(arg1);
        this.field2430 = new SoftReference(arg0);
    }

    @ObfuscatedName("gf.z()Ljava/lang/Object;")
    public Object method3628() {
        return this.field2430.get();
    }

    @ObfuscatedName("gf.w()Z")
    public boolean method3630() {
        return true;
    }
}
