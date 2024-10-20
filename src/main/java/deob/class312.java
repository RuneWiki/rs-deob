package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("lc")
public class class312 extends class315 {

    @ObfuscatedName("lc.aq")
    public SoftReference field3256;

    public class312(Object arg0, int arg1) {
        super(arg1);
        this.field3256 = new SoftReference(arg0);
    }

    @ObfuscatedName("lc.aq()Ljava/lang/Object;")
    public Object method5490() {
        return this.field3256.get();
    }

    @ObfuscatedName("lc.ad()Z")
    public boolean method5492() {
        return true;
    }
}
