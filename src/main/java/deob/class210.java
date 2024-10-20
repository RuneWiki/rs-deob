package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hc")
public class class210 extends class215 {

    @ObfuscatedName("hc.g")
    public SoftReference field2504;

    public class210(Object arg0, int arg1) {
        super(arg1);
        this.field2504 = new SoftReference(arg0);
    }

    @ObfuscatedName("hc.g()Ljava/lang/Object;")
    public Object method3846() {
        return this.field2504.get();
    }

    @ObfuscatedName("hc.r()Z")
    public boolean method3845() {
        return true;
    }
}
