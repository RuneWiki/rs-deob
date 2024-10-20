package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hi")
public class class215 extends class220 {

    @ObfuscatedName("hi.a")
    public SoftReference field2518;

    public class215(Object arg0, int arg1) {
        super(arg1);
        this.field2518 = new SoftReference(arg0);
    }

    @ObfuscatedName("hi.a()Ljava/lang/Object;")
    public Object method3844() {
        return this.field2518.get();
    }

    @ObfuscatedName("hi.s()Z")
    public boolean method3845() {
        return true;
    }
}
