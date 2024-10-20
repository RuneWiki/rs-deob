package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ef")
public class class150 extends class148 {

    @ObfuscatedName("ef.m")
    public SoftReference field1944;

    public class150(Object arg0, int arg1) {
        super(arg1);
        this.field1944 = new SoftReference(arg0);
    }

    @ObfuscatedName("ef.m()Ljava/lang/Object;")
    public Object method3019() {
        return this.field1944.get();
    }

    @ObfuscatedName("ef.f()Z")
    public boolean method3018() {
        return true;
    }
}
