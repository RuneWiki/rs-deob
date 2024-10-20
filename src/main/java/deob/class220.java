package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hc")
public class class220 extends class223 {

    @ObfuscatedName("hc.v")
    public SoftReference field2565;

    public class220(Object arg0, int arg1) {
        super(arg1);
        this.field2565 = new SoftReference(arg0);
    }

    @ObfuscatedName("hc.v()Ljava/lang/Object;")
    public Object method3938() {
        return this.field2565.get();
    }

    @ObfuscatedName("hc.n()Z")
    public boolean method3941() {
        return true;
    }
}
