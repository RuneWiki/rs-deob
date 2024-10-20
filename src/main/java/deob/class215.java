package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hi")
public class class215 extends class220 {

    @ObfuscatedName("hi.n")
    public SoftReference field2508;

    public class215(Object arg0, int arg1) {
        super(arg1);
        this.field2508 = new SoftReference(arg0);
    }

    @ObfuscatedName("hi.n()Ljava/lang/Object;")
    public Object method3861() {
        return this.field2508.get();
    }

    @ObfuscatedName("hi.h()Z")
    public boolean method3866() {
        return true;
    }
}
