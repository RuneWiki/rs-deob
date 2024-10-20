package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("gz")
public class class198 extends class201 {

    @ObfuscatedName("gz.f")
    public SoftReference field2206;

    public class198(Object arg0, int arg1) {
        super(arg1);
        this.field2206 = new SoftReference(arg0);
    }

    @ObfuscatedName("gz.f()Ljava/lang/Object;")
    public Object method3381() {
        return this.field2206.get();
    }

    @ObfuscatedName("gz.o()Z")
    public boolean method3382() {
        return true;
    }
}
