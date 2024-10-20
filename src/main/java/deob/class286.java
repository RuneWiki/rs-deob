package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("kz")
public class class286 extends class289 {

    @ObfuscatedName("kz.at")
    public SoftReference field3075;

    public class286(Object arg0, int arg1) {
        super(arg1);
        this.field3075 = new SoftReference(arg0);
    }

    @ObfuscatedName("kz.at()Ljava/lang/Object;")
    public Object method5114() {
        return this.field3075.get();
    }

    @ObfuscatedName("kz.an()Z")
    public boolean method5113() {
        return true;
    }
}
