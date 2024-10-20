package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ei")
public class class151 extends class149 {

    @ObfuscatedName("ei.u")
    public SoftReference field1962;

    public class151(Object arg0, int arg1) {
        super(arg1);
        this.field1962 = new SoftReference(arg0);
    }

    @ObfuscatedName("ei.u()Ljava/lang/Object;")
    public Object method3095() {
        return this.field1962.get();
    }

    @ObfuscatedName("ei.f()Z")
    public boolean method3099() {
        return true;
    }
}
