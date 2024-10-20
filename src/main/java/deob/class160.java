package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("fj")
public class class160 extends class158 {

    @ObfuscatedName("fj.z")
    public SoftReference field2004;

    public class160(Object arg0, int arg1) {
        super(arg1);
        this.field2004 = new SoftReference(arg0);
    }

    @ObfuscatedName("fj.z()Ljava/lang/Object;")
    public Object method3186() {
        return this.field2004.get();
    }

    @ObfuscatedName("fj.k()Z")
    public boolean method3187() {
        return true;
    }
}
