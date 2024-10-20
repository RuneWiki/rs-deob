package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hc")
public class class210 extends class215 {

    @ObfuscatedName("hc.v")
    public SoftReference field2471;

    public class210(Object arg0, int arg1) {
        super(arg1);
        this.field2471 = new SoftReference(arg0);
    }

    @ObfuscatedName("hc.v()Ljava/lang/Object;")
    public Object method3652() {
        return this.field2471.get();
    }

    @ObfuscatedName("hc.s()Z")
    public boolean method3653() {
        return true;
    }
}
