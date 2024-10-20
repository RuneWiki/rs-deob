package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ha")
public class class210 extends class215 {

    @ObfuscatedName("ha.f")
    public SoftReference field2493;

    public class210(Object arg0, int arg1) {
        super(arg1);
        this.field2493 = new SoftReference(arg0);
    }

    @ObfuscatedName("ha.f()Ljava/lang/Object;")
    public Object method3691() {
        return this.field2493.get();
    }

    @ObfuscatedName("ha.h()Z")
    public boolean method3693() {
        return true;
    }
}
