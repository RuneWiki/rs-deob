package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("fj")
public class class160 extends class158 {

    @ObfuscatedName("fj.f")
    public SoftReference field1988;

    public class160(Object arg0, int arg1) {
        super(arg1);
        this.field1988 = new SoftReference(arg0);
    }

    @ObfuscatedName("fj.f()Ljava/lang/Object;")
    public Object method3171() {
        return this.field1988.get();
    }

    @ObfuscatedName("fj.b()Z")
    public boolean method3173() {
        return true;
    }
}
