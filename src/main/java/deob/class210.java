package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hd")
public class class210 extends class215 {

    @ObfuscatedName("hd.f")
    public SoftReference field2503;

    public class210(Object arg0, int arg1) {
        super(arg1);
        this.field2503 = new SoftReference(arg0);
    }

    @ObfuscatedName("hd.f()Ljava/lang/Object;")
    public Object method3702() {
        return this.field2503.get();
    }

    @ObfuscatedName("hd.l()Z")
    public boolean method3703() {
        return true;
    }
}
