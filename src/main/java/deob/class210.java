package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hn")
public class class210 extends class215 {

    @ObfuscatedName("hn.c")
    public SoftReference field2473;

    public class210(Object arg0, int arg1) {
        super(arg1);
        this.field2473 = new SoftReference(arg0);
    }

    @ObfuscatedName("hn.c()Ljava/lang/Object;")
    public Object method3612() {
        return this.field2473.get();
    }

    @ObfuscatedName("hn.q()Z")
    public boolean method3613() {
        return true;
    }
}
