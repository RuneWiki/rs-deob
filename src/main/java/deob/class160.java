package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("fk")
public class class160 extends class158 {

    @ObfuscatedName("fk.f")
    public SoftReference field1983;

    public class160(Object arg0, int arg1) {
        super(arg1);
        this.field1983 = new SoftReference(arg0);
    }

    @ObfuscatedName("fk.f()Ljava/lang/Object;")
    public Object method3119() {
        return this.field1983.get();
    }

    @ObfuscatedName("fk.i()Z")
    public boolean method3117() {
        return true;
    }
}
