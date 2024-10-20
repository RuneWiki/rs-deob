package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("fe")
public class class160 extends class158 {

    @ObfuscatedName("fe.h")
    public SoftReference field1986;

    public class160(Object arg0, int arg1) {
        super(arg1);
        this.field1986 = new SoftReference(arg0);
    }

    @ObfuscatedName("fe.h()Ljava/lang/Object;")
    public Object method3157() {
        return this.field1986.get();
    }

    @ObfuscatedName("fe.v()Z")
    public boolean method3158() {
        return true;
    }
}
